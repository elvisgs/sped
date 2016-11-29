package br.com.gep.sped.fiscal.batch;

import br.com.gep.sped.batch.common.SpedJobParameterBuilder;
import br.com.gep.sped.fiscal.batch.config.JobConfig;
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
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.*;

@SuppressWarnings("SpringJavaAutowiringInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AsyncTestConfig.class)
@DirtiesContext
public class SpedFiscalJobParallelTest {

    private static final String CAMINHO_RESULTADO_1 = "target/generated-test-sources/sped_test_result_1.txt";
    private static final String CAMINHO_RESULTADO_2 = "target/generated-test-sources/sped_test_result_2.txt";
    private static final String CNPJ_ESTABELECIMENTO = "10848620000139";
    private static final String SPED_FISCAL = "sped_fiscal";

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
                .setCnpjEstabelecimento(CNPJ_ESTABELECIMENTO)
                .setOutputFileName(CAMINHO_RESULTADO_1)
                .setCurrentSchema(SPED_FISCAL)
                .setCompressFile(true)
                .setDeleteFileAfterCompression(false)
                .toJobParameters();

        JobParameters jobParameters2 = new SpedJobParameterBuilder()
                .setCnpjEstabelecimento(CNPJ_ESTABELECIMENTO)
                .setOutputFileName(CAMINHO_RESULTADO_2)
                .setCurrentSchema(SPED_FISCAL)
                .setCompressFile(true)
                .setDeleteFileAfterCompression(false)
                .toJobParameters();

        jobLauncherTestUtils.setJob(jobConfig.spedFiscalJob());
        JobExecution jobExecution1 = jobLauncherTestUtils.launchJob(jobParameters1);

        jobLauncherTestUtils.setJob(jobConfig.spedFiscalJob());
        JobExecution jobExecution2 = jobLauncherTestUtils.launchJob(jobParameters2);

        while (jobExplorer.getJobExecution(jobExecution1.getId()).isRunning()
                || jobExplorer.getJobExecution(jobExecution2.getId()).isRunning()) {
            Thread.sleep(300);
        }

        assertThat(jobExecution1.getStatus()).isEqualTo(BatchStatus.COMPLETED);
        assertThat(jobExecution2.getStatus()).isEqualTo(BatchStatus.COMPLETED);
    }
}
