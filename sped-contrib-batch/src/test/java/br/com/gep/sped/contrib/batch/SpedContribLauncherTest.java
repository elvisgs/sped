package br.com.gep.sped.contrib.batch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.AssertFile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.File;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SpedContribLauncherTest {

    public static final String CAMINHO_RESULTADO = "target/generated-test-sources/sped_test_result.txt";

    private Resource arquivoEsperado, arquivoResultado;

    @Before
    public void before() throws Exception {
        arquivoEsperado = new ClassPathResource("sped_test_expected.txt");
        arquivoResultado = new FileSystemResource(CAMINHO_RESULTADO);

        File file = new File(CAMINHO_RESULTADO);
        if (file.exists()) file.delete();
    }

    @Test
    public void escreveArquivoCorretamente() throws Exception {
        SpedContribLauncher launcher = new SpedContribLauncher();
        launcher.initialize();
        launcher.setSchema("sped_contrib");

        JobExecution execution = launcher.run(CAMINHO_RESULTADO);
        Thread.sleep(3 * 1000); // espera um tempo, pois o launcher executa assincronamente

        Assert.assertNotNull(execution.getJobId());
        AssertFile.assertFileEquals(arquivoEsperado, arquivoResultado);
    }

    @Test
    public void schemaPodeSerAlteradoAposPrimeiroExecucao() throws Exception {
        SpedContribLauncher launcher = new SpedContribLauncher();
        launcher.initialize();
        launcher.setSchema("schema_inexistente");

        JobExecution execution = launcher.run(CAMINHO_RESULTADO);
        Thread.sleep(200); // espera um tempo, pois o launcher executa assincronamente

        // jobExecution deve falhar, pois o schema não existe
        assertThat(execution.getStatus(), is(BatchStatus.FAILED));

        launcher.setSchema("sped_contrib");
        execution = launcher.run(CAMINHO_RESULTADO);
        Thread.sleep(300);

        assertThat(execution.getStatus(), is(BatchStatus.COMPLETED));
    }
}
