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
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.batch.test.AssertFile.assertFileEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestConfig.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class SpedFiscalJobTest {

    private static final String CAMINHO_RESULTADO = "target/generated-test-sources/sped_test_result.txt";
    private static final String CAMINHO_RESULTADO_VAZIO = "target/generated-test-sources/sped_vazio_result.txt";
    private static final String CAMINHO_ZIP = "target/generated-test-sources/sped_test_result.zip";
    private static final String CNPJ_ESTABELECIMENTO = "10848620000139";
    private static final String SCHEMA = "sped_fiscal";

    @Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;

    @Autowired
    private JobConfig jobConfig;

    @Value("classpath:sped_test_expected.txt")
    private Resource esperado;

    @Value("classpath:sped_vazio.txt")
    private Resource spedVazio;

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
    public void geraArquivoEstabelecimentoSemMovimentacao() throws Exception {
        JobParameters jobParameters = new SpedJobParameterBuilder()
                .setCnpjEstabelecimento("10848620000239")
                .setOutputFileName(CAMINHO_RESULTADO_VAZIO)
                .setCurrentSchema(SCHEMA)
                .setCompressFile(false)
                .toJobParameters();
        jobLauncherTestUtils.launchJob(jobParameters);

        Resource resultado = new FileSystemResource(CAMINHO_RESULTADO_VAZIO);
        assertFileEquals(spedVazio, resultado);
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
