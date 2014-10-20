package br.com.gep.sped.contrib.batch;

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
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestInfrastructureConfig.class)
public class SpedContribLauncherTest {

    public static final String CAMINHO_RESULTADO = "target/generated-test-sources/sped_test_result.txt";
    public static final String DIR_RESULTADOS = "target/generated-test-sources";

    @Autowired
    private TestInfrastructureConfig infraConfig;

    private SpedContribLauncher launcher;
    private Resource arquivoEsperado, arquivoResultado;

    @Before
    public void before() throws Exception {
        launcher = new SpedContribLauncher();
        launcher.setInfrastructureConfig(infraConfig);
        launcher.initialize();

        arquivoEsperado = new ClassPathResource("sped_test_expected.txt");
        arquivoResultado = new FileSystemResource(CAMINHO_RESULTADO);
    }

    @Test
    public void escreveArquivoCorretamente() throws Exception {
        launcher.setSchema("sped_contrib");
        launcher.setDeleteFileAfterCompression(false);

        SpedExecution execution = launcher.run(CAMINHO_RESULTADO);

        assertThat(execution).isNotNull();
        assertThat(execution.getLayout()).isEqualTo(Layout.SPED_CONTRIB);
        AssertFile.assertFileEquals(arquivoEsperado, arquivoResultado);
    }

    @Test
    public void schemaPodeSerAlteradoAposPrimeiraExecucao() throws Exception {
        launcher.setSchema("schema_inexistente");
        launcher.setDestinationDir(DIR_RESULTADOS);

        try {
            launcher.run();
            fail("Execução deveria falhar, pois schema não existe");
        }
        catch (Exception ex) {}

        launcher.setSchema("sped_contrib");
        SpedExecution execution = launcher.run();

        assertThat(execution.getJobExecution().getStatus()).isEqualTo(BatchStatus.COMPLETED);
    }

    @After
    public void after() {
        launcher.shutdown();
    }
}
