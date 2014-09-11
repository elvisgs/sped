package br.com.gep.sped.contrib.batch;

import br.com.gep.sped.contrib.batch.config.JobConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.test.AssertFile;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@SuppressWarnings("SpringJavaAutowiringInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestInfrastructureConfig.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class SpedContribJobTest {

    public static final String CAMINHO_RESULTADO = "target/generated-test-sources/sped_test_result.txt";
    public static final String CAMINHO_ZIP = "target/generated-test-sources/sped_test_result.zip";

    @Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;

    @Autowired
    private JobConfig jobConfig;

    @Value("classpath:sped_test_expected.txt")
    private Resource esperado;

    @Before
    public void before() throws Exception {
        jobLauncherTestUtils.setJob(jobConfig.spedContribJob());
    }

    @Test
    public void jobTerminaComStatusCompletedEEscreveArquivoCorretamente() throws Exception {
        JobParameters jobParameters = new JobParametersBuilder()
                .addString("output.file.name", CAMINHO_RESULTADO)
                .addString("current.schema", "sped_contrib")
                .addString("delete.file.after.compression", String.valueOf(false))
                .toJobParameters();
        JobExecution jobExecution = jobLauncherTestUtils.launchJob(jobParameters);

        assertThat(jobExecution.getStatus(), is(BatchStatus.COMPLETED));

        Resource resultado = new FileSystemResource(CAMINHO_RESULTADO);
        AssertFile.assertFileEquals(esperado, resultado);
    }

    @Test
    public void comprimeArquivoGerado() throws Exception {
        JobParameters jobParameters = new JobParametersBuilder()
                .addString("output.file.name", CAMINHO_RESULTADO)
                .addString("current.schema", "sped_contrib")
                .toJobParameters();

        JobExecution jobExecution = jobLauncherTestUtils.launchJob(jobParameters);

        assertThat(jobExecution.getStatus(), is(BatchStatus.COMPLETED));

        File zip = new File(CAMINHO_ZIP);
        assertThat(zip.exists(), is(true));
        assertThat(zip.length() > 0, is(true));
    }
}
