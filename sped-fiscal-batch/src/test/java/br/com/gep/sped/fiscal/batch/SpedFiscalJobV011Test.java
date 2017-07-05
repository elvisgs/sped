package br.com.gep.sped.fiscal.batch;

import br.com.gep.sped.batch.common.SpedJobParameterBuilder;
import br.com.gep.sped.fiscal.batch.config.JobConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.batch.test.AssertFile.assertFileEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestConfigV011.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@ActiveProfiles("v011")
public class SpedFiscalJobV011Test {

    private static final String CAMINHO_RESULTADO = "target/generated-test-sources/sped_test_result_v011.txt";
    private static final String CNPJ_ESTABELECIMENTO = "10848620000139";
    private static final String SCHEMA = "sped_fiscal";

    @Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;

    @Autowired
    private JobConfig jobConfig;

    @Value("classpath:sped_test_expected_v011.txt")
    private Resource esperado;

    @Before
    public void before() throws Exception {
        jobLauncherTestUtils.setJob(jobConfig.spedFiscalJob());
    }

    @Test
    public void jobTerminaComStatusCompletedEEscreveArquivoCorretamente() throws Exception {
        JobParameters jobParameters = new SpedJobParameterBuilder()
            .setCnpjEstabelecimento(CNPJ_ESTABELECIMENTO)
            .setOutputFileName(CAMINHO_RESULTADO)
            .setCurrentSchema(SCHEMA)
            .setCompressFile(false)
            .toJobParameters();
        JobExecution jobExecution = jobLauncherTestUtils.launchJob(jobParameters);

        assertThat(jobExecution.getStatus()).isEqualTo(BatchStatus.COMPLETED);

        Resource resultado = new FileSystemResource(CAMINHO_RESULTADO);
        assertFileEquals(esperado, resultado);
    }
}
