package br.com.gep.sped.contrib.batch;

import br.com.gep.sped.contrib.batch.jdbc.entity.SpedExecution;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.test.AssertFile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SpedContribLauncherTest {

    public static final String CAMINHO_RESULTADO = "target/generated-test-sources/sped_test_result.txt";
    public static final String DIR_RESULTADOS = "target/generated-test-sources";

    private SpedContribLauncher launcher;
    private Resource arquivoEsperado, arquivoResultado;

    @Before
    public void before() throws Exception {
        launcher = new SpedContribLauncher();
        launcher.initialize();

        arquivoEsperado = new ClassPathResource("sped_test_expected.txt");
        arquivoResultado = new FileSystemResource(CAMINHO_RESULTADO);
    }

    @Test
    public void escreveArquivoCorretamente() throws Exception {
        launcher.setSchema("sped_contrib");

        SpedExecution execution = launcher.run(CAMINHO_RESULTADO);
        Thread.sleep(3 * 1000); // espera um tempo, pois o launcher executa assincronamente

        Assert.assertNotNull(execution);
        AssertFile.assertFileEquals(arquivoEsperado, arquivoResultado);
    }

    @Test
    public void schemaPodeSerAlteradoAposPrimeiraExecucao() throws Exception {
        launcher.setSchema("schema_inexistente");
        launcher.setDestinationDir(DIR_RESULTADOS);

        try {
            launcher.run();

            // deve falhar, pois o schema não existe
            Assert.fail();
        }
        catch (Exception ex) {}

        launcher.setSchema("sped_contrib");
        SpedExecution execution = launcher.run();
        Thread.sleep(300);

        assertThat(execution.getJobExecution().getStatus(), is(BatchStatus.COMPLETED));
    }

    @After
    public void after() {
        launcher.shutdown();
    }
}
