package br.com.gep.sped.contrib.batch;

import br.com.gep.sped.batch.common.SpedJobParameterBuilder;
import br.com.gep.sped.contrib.batch.config.JobConfig;
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
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.jdbc.JdbcTestUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.batch.test.AssertFile.assertFileEquals;

@SuppressWarnings("SpringJavaAutowiringInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestInfrastructureConfig.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class SpedContribJobTest {

    public static final String CAMINHO_RESULTADO = "target/generated-test-sources/sped_test_result.txt";
    public static final String CAMINHO_RESULTADO_VAZIO = "target/generated-test-sources/sped_vazio_result.txt";
    public static final String CAMINHO_ZIP = "target/generated-test-sources/sped_test_result.zip";
    public static final String SCHEMA = "sped_contrib";

    @Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;

    @Autowired
    private JobConfig jobConfig;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("classpath:sped_test_expected.txt")
    private Resource esperado;

    @Value("classpath:sped_vazio.txt")
    private Resource spedVazio;

    @Before
    public void before() throws Exception {
        jobLauncherTestUtils.setJob(jobConfig.spedContribJob());
    }

    @Test
    public void jobTerminaComStatusCompletedEEscreveArquivoCorretamente() throws Exception {
        JobParameters jobParameters = new SpedJobParameterBuilder()
                .setOutputFileName(CAMINHO_RESULTADO)
                .setCurrentSchema(SCHEMA)
                .setDeleteFileAfterCompression(false)
                .toJobParameters();
        JobExecution jobExecution = jobLauncherTestUtils.launchJob(jobParameters);

        assertThat(jobExecution.getStatus()).isEqualTo(BatchStatus.COMPLETED);

        Resource resultado = new FileSystemResource(CAMINHO_RESULTADO);
        assertFileEquals(esperado, resultado);
    }

    @Test
    public void geraArquivoEstabelecimentoSemMovimentacao() throws Exception {
        // limpa as tabelas de abertura de bloco para simular falta de movimento
        JdbcTestUtils.deleteFromTables(jdbcTemplate, tabelasAberturaBloco());

        JobParameters jobParameters = new SpedJobParameterBuilder()
                .setOutputFileName(CAMINHO_RESULTADO_VAZIO)
                .setCurrentSchema(SCHEMA)
                .setDeleteFileAfterCompression(false)
                .toJobParameters();
        jobLauncherTestUtils.launchJob(jobParameters);

        Resource resultado = new FileSystemResource(CAMINHO_RESULTADO_VAZIO);
        assertFileEquals(spedVazio, resultado);
    }

    private String[] tabelasAberturaBloco() {
        String[] regs = "0001 a001 c001 d001 f001 m001 p001 1001".split(" ");
        List<String> tabelas = new ArrayList<>();
        for (String reg : regs)
            tabelas.add(SCHEMA + ".pis_" + reg);

        return tabelas.toArray(new String[tabelas.size()]);
    }

    @Test
    public void comprimeArquivoGerado() throws Exception {
        JobParameters jobParameters = new SpedJobParameterBuilder()
                .setOutputFileName(CAMINHO_RESULTADO)
                .setCurrentSchema(SCHEMA)
                .toJobParameters();

        JobExecution jobExecution = jobLauncherTestUtils.launchJob(jobParameters);

        assertThat(jobExecution.getStatus()).isEqualTo(BatchStatus.COMPLETED);

        File zip = new File(CAMINHO_ZIP);
        assertThat(zip).exists().isFile();
        assertThat(zip.length()).isGreaterThan(0);
    }
}
