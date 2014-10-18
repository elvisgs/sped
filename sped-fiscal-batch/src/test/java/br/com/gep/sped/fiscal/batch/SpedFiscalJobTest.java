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
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.batch.test.AssertFile.assertFileEquals;

@SuppressWarnings("SpringJavaAutowiringInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class SpedFiscalJobTest {

    public static final String CAMINHO_RESULTADO = "target/generated-test-sources/sped_test_result.txt";
    public static final String CAMINHO_ZIP = "target/generated-test-sources/sped_test_result.zip";
    public static final String CNPJ_ESTABELECIMENTO = "10848620000139";
    public static final String SCHEMA = "sped_fiscal";

    @Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;

    @Autowired
    private JobConfig jobConfig;

    @Value("classpath:sped_test_expected.txt")
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

    @Test
    public void comprimeArquivoGerado() throws Exception {
        JobParameters jobParameters = new SpedJobParameterBuilder()
                .setCnpjEstabelecimento(CNPJ_ESTABELECIMENTO)
                .setOutputFileName(CAMINHO_RESULTADO)
                .setCurrentSchema(SCHEMA)
                .setCompressFile(true)
                .toJobParameters();

        JobExecution jobExecution = jobLauncherTestUtils.launchJob(jobParameters);

        assertThat(jobExecution.getStatus()).isEqualTo(BatchStatus.COMPLETED);

        File zip = new File(CAMINHO_ZIP);
        assertThat(zip).exists().isFile();
        assertThat(zip.length()).isGreaterThan(0);
    }
}
