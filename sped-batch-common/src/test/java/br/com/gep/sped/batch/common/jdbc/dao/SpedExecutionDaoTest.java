package br.com.gep.sped.batch.common.jdbc.dao;

import br.com.gep.sped.batch.common.AbstractIntegrationTest;
import br.com.gep.sped.batch.common.jdbc.entity.Layout;
import br.com.gep.sped.batch.common.jdbc.entity.SpedExecution;
import org.junit.Before;
import org.junit.Test;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobInstance;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.jdbc.JdbcTestUtils;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class SpedExecutionDaoTest extends AbstractIntegrationTest {

    @Autowired
    private SpedExecutionDao spedExecutionDao;

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private JobExecution jobExecution;

    @Before
    public void before() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
        JobInstance jobInstance = jobRepository.createJobInstance("testJob", new JobParameters());
        jobExecution = jobRepository.createJobExecution(jobInstance, new JobParameters(), null);
    }

    @Test
    public void criaSpedExecutionCorretamente() {
        SpedExecution spedExecution = criarSpedExecution();

        spedExecutionDao.create(spedExecution);

        int count = JdbcTestUtils.countRowsInTable(jdbcTemplate, "BATCH_SPED_EXECUTION");
        assertThat(count).isEqualTo(1);
    }

    @Test
    public void buscaSpedExecutionPorId() {
        SpedExecution spedExecution1 = criarSpedExecution();
        spedExecutionDao.create(spedExecution1);

        SpedExecution spedExecution2 = spedExecutionDao.findById(spedExecution1.getId());

        assertThat(spedExecution2).isNotNull();
        assertThat(spedExecution2.getJobExecution()).isNotNull();
    }

    @Test
    public void buscaSpedExecutionPorCnpj() {
        SpedExecution spedExecution1 = criarSpedExecution(1);
        SpedExecution spedExecution2 = criarSpedExecution(1);
        SpedExecution spedExecution3 = criarSpedExecution(2);
        spedExecutionDao.create(spedExecution1);
        spedExecutionDao.create(spedExecution2);
        spedExecutionDao.create(spedExecution3);

        List<SpedExecution> spedExecutions = spedExecutionDao
                .findByCnpj(spedExecution1.getCnpj(), Layout.SPED_CONTRIB);

        assertThat(spedExecutions).isNotNull();
        assertThat(spedExecutions).hasSize(2);
    }

    @Test
    public void buscaSpedExecutionPorCnpjCliente() {
        SpedExecution spedExecution1 = criarSpedExecution(1);
        SpedExecution spedExecution2 = criarSpedExecution(1);
        SpedExecution spedExecution3 = criarSpedExecution(2);
        spedExecutionDao.create(spedExecution1);
        spedExecutionDao.create(spedExecution2);
        spedExecutionDao.create(spedExecution3);

        List<SpedExecution> spedExecutions = spedExecutionDao
                .findByCliente(spedExecution1.getCnpj(), Layout.SPED_CONTRIB);

        assertThat(spedExecutions).isNotNull();
        assertThat(spedExecutions).hasSize(3);
    }

    @Test
    public void atualizaArquivoDeUmSpedExecution() {
        SpedExecution spedExecution1 = criarSpedExecution();
        spedExecutionDao.create(spedExecution1);

        spedExecutionDao.updateFile(jobExecution.getId(), "arquivoNovo.txt");

        SpedExecution spedExecution2 = spedExecutionDao.findById(spedExecution1.getId());

        assertThat(spedExecution2.getArquivo()).isEqualTo("arquivoNovo.txt");
    }

    private SpedExecution criarSpedExecution() {
        return criarSpedExecution(0);
    }

    private SpedExecution criarSpedExecution(int seq) {
        SpedExecution spedExecution = new SpedExecution();
        spedExecution.setCnpj("99999999000" + seq + "99");
        spedExecution.setNome("Teste" + seq);
        spedExecution.setAno(2014);
        spedExecution.setMes(1);
        spedExecution.setArquivo("arquivo" + seq);
        spedExecution.setLayout(Layout.SPED_CONTRIB);
        spedExecution.setJobExecution(jobExecution);
        return spedExecution;
    }
}
