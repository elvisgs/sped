package br.com.gep.sped.contrib.batch.jdbc.dao;

import br.com.gep.sped.contrib.batch.jdbc.entity.SpedExecution;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.incrementer.DataFieldMaxValueIncrementer;
import org.springframework.util.Assert;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

public class SpedExecutionDao implements InitializingBean {

    private static final String INSERT =
            "INSERT INTO BATCH_SPED_EXECUTION(ID, CNPJ, NOME, ANO, MES, ARQUIVO, JOB_EXECUTION_ID) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";

    private static final String FIND_ALL =
            "SELECT ID, CNPJ, ANO, MES, NOME, ARQUIVO, SE.JOB_EXECUTION_ID, VERSION, CREATE_TIME, " +
                    "START_TIME, END_TIME, STATUS, EXIT_CODE, EXIT_MESSAGE, LAST_UPDATED " +
            "FROM BATCH_SPED_EXECUTION SE JOIN BATCH_JOB_EXECUTION JE " +
                    "ON SE.JOB_EXECUTION_ID = JE.JOB_EXECUTION_ID";

    private static final String FIND_BY_ID = FIND_ALL + " WHERE ID = ?";

    private static final String FIND_BY_CNPJ = FIND_ALL + " WHERE CNPJ = ? ORDER BY ANO DESC, MES DESC";

    private static final String UPDATE_FILE =
            "UPDATE BATCH_SPED_EXECUTION SET ARQUIVO = ? WHERE JOB_EXECUTION_ID = ?";

    private DataSource dataSource;
    private JdbcOperations jdbcTemplate;
    private DataFieldMaxValueIncrementer incrementer;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setIncrementer(DataFieldMaxValueIncrementer incrementer) {
        this.incrementer = incrementer;
    }

    public void create(SpedExecution spedExecution) {
        validateSpedExecution(spedExecution);

        spedExecution.setId(incrementer.nextLongValue());

        Object[] parameters = new Object[] {
                spedExecution.getId(), spedExecution.getCnpj(), spedExecution.getNome(),
                spedExecution.getAno(), spedExecution.getMes(), spedExecution.getArquivo(),
                spedExecution.getJobExecution().getId()
        };
        int[] types = new int[] {
                Types.BIGINT, Types.VARCHAR, Types.VARCHAR, Types.INTEGER,
                Types.INTEGER, Types.VARCHAR, Types.BIGINT
        };

        jdbcTemplate.update(INSERT, parameters, types);
    }

    private void validateSpedExecution(SpedExecution execution) {
        Assert.notNull(execution, "spedExecution não deve ser nulo");
        Assert.hasText(execution.getCnpj(), "cnpj do SpedExecution não deve ser nulo ou vazio");
        Assert.hasText(execution.getNome(), "nome do SpedExecution não deve ser nulo ou vazio");
        Assert.state(execution.getAno() > 0, "ano do SpedExecution deve ser maior que zero");
        Assert.state(execution.getMes() > 0, "mes do SpedExecution deve ser maior que zero");
        Assert.notNull(execution.getJobExecution(), "jobExecution do SpedExecution não deve ser nulo");
        Assert.notNull(execution.getJobExecution().getId(), "id do jobExecution do SpedExecution não deve ser nulo");
    }

    public SpedExecution findById(Long id) {
        Assert.notNull(id, "id não deve ser nulo");

        return jdbcTemplate.queryForObject(FIND_BY_ID, new SpedExecutionRowMapper(), id);
    }

    public List<SpedExecution> findByCnpj(String cnpj) {
        Assert.hasText(cnpj, "cnpj não deve ser nulo ou vazio");

        return jdbcTemplate.query(FIND_BY_CNPJ, new SpedExecutionRowMapper(), cnpj);
    }

    public void updateFile(Long jobExecutionId, String file) {
        Assert.notNull(jobExecutionId, "jobExecutionId não deve ser null");
        Assert.hasText(file, "file não deve ser nulo ou vazio");

        jdbcTemplate.update(UPDATE_FILE, file, jobExecutionId);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(dataSource, "dataSource não deve ser nulo");
        Assert.notNull(incrementer, "incrementer não deve ser nulo");

        if (jdbcTemplate == null) {
            jdbcTemplate = new JdbcTemplate(dataSource);
        }
    }

    private final class SpedExecutionRowMapper implements RowMapper<SpedExecution> {

        @Override
        public SpedExecution mapRow(ResultSet rs, int rowNum) throws SQLException {
            SpedExecution spedExecution = new SpedExecution();
            spedExecution.setId(rs.getLong(1));
            spedExecution.setCnpj(rs.getString(2));
            spedExecution.setAno(rs.getInt(3));
            spedExecution.setMes(rs.getInt(4));
            spedExecution.setNome(rs.getString(5));
            spedExecution.setArquivo(rs.getString(6));

            JobExecution jobExecution = new JobExecution(rs.getLong(7));
            jobExecution.setVersion(rs.getInt(8));
            jobExecution.setCreateTime(rs.getTimestamp(9));
            jobExecution.setStartTime(rs.getTimestamp(10));
            jobExecution.setEndTime(rs.getTimestamp(11));
            jobExecution.setStatus(BatchStatus.valueOf(rs.getString(12)));
            jobExecution.setExitStatus(new ExitStatus(rs.getString(13), rs.getString(14)));
            jobExecution.setLastUpdated(rs.getTimestamp(15));

            spedExecution.setJobExecution(jobExecution);

            return spedExecution;
        }
    }
}
