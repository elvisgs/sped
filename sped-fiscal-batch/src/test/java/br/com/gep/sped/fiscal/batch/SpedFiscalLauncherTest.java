package br.com.gep.sped.fiscal.batch;

import br.com.gep.sped.batch.common.jdbc.entity.Layout;
import br.com.gep.sped.batch.common.jdbc.entity.SpedExecution;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.test.AssertFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class SpedFiscalLauncherTest {

    public static final String CAMINHO_RESULTADO = "target/generated-test-sources/sped_test_result.txt";
    public static final String DIR_RESULTADOS = "target/generated-test-sources";
    public static final String CNPJ_ESTABELECIMENTO = "10848620000139";
    public static final String SCHEMA = "sped_fiscal";

    @Autowired
    private TestConfig infraConfig;

    @Value("classpath:sped_test_expected.txt")
    private Resource arquivoEsperado;

    @Value("file:" + CAMINHO_RESULTADO)
    private Resource arquivoResultado;

    private SpedFiscalLauncher launcher;

    @Before
    public void before() throws Exception {
        launcher = new SpedFiscalLauncher();
        launcher.setInfrastructureConfig(infraConfig);
        launcher.initialize();
    }

    @After
    public void after() {
        launcher.shutdown();
    }

    @Test
    public void escreveArquivoParaUmEstabelecimento() throws Exception {
        launcher.setSchema(SCHEMA);
        launcher.setDeleteFileAfterCompression(false);

        SpedExecution execution = launcher.run(CNPJ_ESTABELECIMENTO, CAMINHO_RESULTADO);

        assertThat(execution).isNotNull();
        assertThat(execution.getLayout()).isEqualTo(Layout.SPED_FISCAL);
        AssertFile.assertFileEquals(arquivoEsperado, arquivoResultado);
    }

    @Test
    public void escreveArquivosParaTodosEstabelecimentos() throws Exception {
        launcher.setSchema(SCHEMA);
        launcher.setDestinationDir(DIR_RESULTADOS);
        launcher.setDeleteFileAfterCompression(false);

        List<SpedExecution> executions = launcher.run();

        assertThat(executions).hasSize(2);

        File arquivo1 = new File(DIR_RESULTADOS, "10848620000139_2009_01_FISCAL.txt");
        File arquivo2 = new File(DIR_RESULTADOS, "10848620000239_2009_01_FISCAL.txt");
        assertThat(arquivo1).exists();
        assertThat(arquivo2).exists();
    }

    @Test
    public void schemaPodeSerAlteradoAposPrimeiraExecucao() throws Exception {
        launcher.setSchema("schema_inexistente");
        launcher.setDestinationDir(DIR_RESULTADOS);

        try {
            launcher.run(CNPJ_ESTABELECIMENTO);
            fail("Execução deveria falhar, pois schema não existe");
        }
        catch (Exception ex) {}

        launcher.setSchema(SCHEMA);
        SpedExecution execution = launcher.run(CNPJ_ESTABELECIMENTO);

        assertThat(execution.getJobExecution().getStatus()).isEqualTo(BatchStatus.COMPLETED);
    }

    @Test
    public void geraNomeArquivoComCnpjCompetenciaSufixo() throws Exception {
        launcher.setSchema(SCHEMA);
        launcher.setDestinationDir(DIR_RESULTADOS);
        SpedExecution execution = launcher.run(CNPJ_ESTABELECIMENTO);

        File file = new File(execution.getArquivo());
        assertThat(file.getName()).isEqualTo("10848620000139_2009_01_FISCAL.txt");
    }
}
