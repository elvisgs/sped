package br.com.gep.sped.contrib.batch;

import br.com.gep.sped.batch.common.SpedJobParameterBuilder;
import br.com.gep.sped.contrib.batch.config.JobConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AsyncTestConfig.class)
@DirtiesContext
public class SpedContribJobParallelTest {

    private static final String CAMINHO_RESULTADO_1 = "target/generated-test-sources/sped_test_result_1.txt";
    private static final String CAMINHO_RESULTADO_2 = "target/generated-test-sources/sped_test_result_2.txt";

    @Autowired
    private JobConfig jobConfig;

    @Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;

    @Autowired
    private JobExplorer jobExplorer;

    @Value("classpath:sped_test_expected.txt")
    private Resource esperado;

    @Test
    public void testeExecucaoParalela() throws Exception {
        JobParameters jobParameters1 = new SpedJobParameterBuilder()
                .setOutputFileName(CAMINHO_RESULTADO_1)
                .setCurrentSchema("sped_contrib")
                .setDeleteFileAfterCompression(false)
                .toJobParameters();

        JobParameters jobParameters2 = new SpedJobParameterBuilder()
                .setOutputFileName(CAMINHO_RESULTADO_2)
                .setCurrentSchema("sped_contrib")
                .setDeleteFileAfterCompression(false)
                .toJobParameters();

        jobLauncherTestUtils.setJob(jobConfig.spedContribJob());
        JobExecution jobExecution1 = jobLauncherTestUtils.launchJob(jobParameters1);

        jobLauncherTestUtils.setJob(jobConfig.spedContribJob());
        JobExecution jobExecution2 = jobLauncherTestUtils.launchJob(jobParameters2);

        while (jobExplorer.getJobExecution(jobExecution1.getId()).isRunning()
                || jobExplorer.getJobExecution(jobExecution2.getId()).isRunning()) {
            Thread.sleep(300);
        }

        assertThat(jobExecution1.getStatus()).isEqualTo(BatchStatus.COMPLETED);
        assertThat(jobExecution2.getStatus()).isEqualTo(BatchStatus.COMPLETED);
    }
}
