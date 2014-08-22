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
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@SuppressWarnings("SpringJavaAutowiringInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class SpedContribJobTest {

    public static final String CAMINHO_RESULTADO = "target/generated-test-sources/sped_test_result.txt";

    @Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;

    @Autowired
    private JobConfig jobConfig;

    @Value("classpath:sped_test_expected.txt")
    private Resource esperado;

    @Before
    public void before() throws Exception {
        jobLauncherTestUtils.setJob(jobConfig.spedContribJob());

        File file = new File(CAMINHO_RESULTADO);
        if (file.exists()) file.delete();
    }

    @Test
    public void jobTerminaComStatusCompletedEEscreveArquivoCorretamente() throws Exception {
        JobParameters jobParameters = new JobParametersBuilder()
                .addString("output.file.name", CAMINHO_RESULTADO)
                .addString("current.schema", "sped_contrib")
                .toJobParameters();
        JobExecution jobExecution = jobLauncherTestUtils.launchJob(jobParameters);

        assertThat(jobExecution.getStatus(), is(BatchStatus.COMPLETED));

        Resource resultado = new FileSystemResource(CAMINHO_RESULTADO);
        AssertFile.assertFileEquals(esperado, resultado);
    }
}
