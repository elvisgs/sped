package br.com.gep.sped.batch.common.jdbc.dao;

import br.com.gep.sped.batch.common.jdbc.entity.Layout;
import br.com.gep.sped.batch.common.jdbc.entity.SpedExecution;
import com.opengamma.elsql.ElSqlBundle;
import com.opengamma.elsql.ElSqlConfig;
import lombok.Setter;
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

    private @Setter DataSource dataSource;
    private @Setter DataFieldMaxValueIncrementer incrementer;
    private JdbcOperations jdbcTemplate;
    private ElSqlBundle sqlBundle = ElSqlBundle.of(ElSqlConfig.DEFAULT, getClass());

    public void create(SpedExecution spedExecution) {
        validateSpedExecution(spedExecution);

        spedExecution.setId(incrementer.nextLongValue());

        Object[] parameters = new Object[] {
                spedExecution.getId(), spedExecution.getCnpj(), spedExecution.getNome(),
                spedExecution.getAno(), spedExecution.getMes(), spedExecution.getArquivo(),
                spedExecution.getLayout().toString(), spedExecution.getJobExecution().getId()
        };
        int[] types = new int[] {
                Types.BIGINT, Types.VARCHAR, Types.VARCHAR,
                Types.INTEGER, Types.INTEGER, Types.VARCHAR,
                Types.VARCHAR, Types.BIGINT
        };

        jdbcTemplate.update(sqlBundle.getSql("INSERT"), parameters, types);
    }

    private void validateSpedExecution(SpedExecution execution) {
        Assert.notNull(execution, "spedExecution não deve ser nulo");
        Assert.hasText(execution.getCnpj(), "cnpj do SpedExecution não deve ser nulo ou vazio");
        Assert.hasText(execution.getNome(), "nome do SpedExecution não deve ser nulo ou vazio");
        Assert.state(execution.getAno() > 0, "ano do SpedExecution deve ser maior que zero");
        Assert.state(execution.getMes() > 0, "mes do SpedExecution deve ser maior que zero");
        Assert.notNull(execution.getLayout(), "layout do SpedExecution não deve ser nulo");
        Assert.notNull(execution.getJobExecution(), "jobExecution do SpedExecution não deve ser nulo");
        Assert.notNull(execution.getJobExecution().getId(), "id do jobExecution do SpedExecution não deve ser nulo");
    }

    public SpedExecution findById(Long id) {
        Assert.notNull(id, "id não deve ser nulo");

        return jdbcTemplate.queryForObject(sqlBundle.getSql("FIND_BY_ID"),
            new SpedExecutionRowMapper(), id);
    }

    public List<SpedExecution> findByCnpj(String cnpj, Layout layout) {
        Assert.hasText(cnpj, "cnpj não deve ser nulo ou vazio");
        Assert.notNull(layout, "layout não deve ser nulo");

        return jdbcTemplate.query(sqlBundle.getSql("FIND_BY_CNPJ"),
            new SpedExecutionRowMapper(), cnpj, layout.toString());
    }

    public List<SpedExecution> findByCliente(String cnpjCliente, Layout layout) {
        Assert.hasText(cnpjCliente, "cnpjCliente não deve ser nulo ou vazio");
        Assert.notNull(layout, "layout não deve ser nulo");

        String likeCnpj = cnpjCliente.substring(0, 8) + "%";

        return jdbcTemplate.query(sqlBundle.getSql("FIND_BY_CLIENTE"),
            new SpedExecutionRowMapper(), likeCnpj, layout.toString());
    }

    public void updateFile(Long jobExecutionId, String file) {
        Assert.notNull(jobExecutionId, "jobExecutionId não deve ser null");
        Assert.hasText(file, "file não deve ser nulo ou vazio");

        jdbcTemplate.update(sqlBundle.getSql("UPDATE_FILE"), file, jobExecutionId);
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
            spedExecution.setLayout(Layout.valueOf(rs.getString(7)));

            JobExecution jobExecution = new JobExecution(rs.getLong(8));
            jobExecution.setVersion(rs.getInt(9));
            jobExecution.setCreateTime(rs.getTimestamp(10));
            jobExecution.setStartTime(rs.getTimestamp(11));
            jobExecution.setEndTime(rs.getTimestamp(12));
            jobExecution.setStatus(BatchStatus.valueOf(rs.getString(13)));
            jobExecution.setExitStatus(new ExitStatus(rs.getString(14), rs.getString(15)));
            jobExecution.setLastUpdated(rs.getTimestamp(16));

            spedExecution.setJobExecution(jobExecution);

            return spedExecution;
        }
    }
}
