package br.com.gep.sped.batch.common;

import br.com.gep.sped.batch.common.config.InfrastructureConfig;
import br.com.gep.sped.batch.common.jdbc.QueryPartsProvider;
import br.com.gep.sped.batch.common.jdbc.dao.EstabelecimentoDao;
import br.com.gep.sped.batch.common.jdbc.dao.SpedExecutionDao;
import br.com.gep.sped.batch.common.jdbc.support.SpedExecutionDaoFactoryBean;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
@ComponentScan
@EnableBatchProcessing
public class TestConfig implements InfrastructureConfig {

    @Autowired
    private QueryPartsProvider queryPartsProvider;

    @Override
    @Bean
    public DataSource getDataSource() {
        return new EmbeddedDatabaseBuilder()
            .setType(EmbeddedDatabaseType.HSQL)
            .setName("testdb")
            .addScripts(
                "classpath:/schemas/schema-drop-hsqldb.sql",
                "classpath:org/springframework/batch/core/schema-drop-hsqldb.sql",
                "classpath:org/springframework/batch/core/schema-hsqldb.sql",
                "classpath:/schemas/schema-hsqldb.sql",
                "classpath:common-tests.sql")
            .build();
    }

    @Override
    @Bean
    public TaskExecutor getTaskExecutor() {
        return new SyncTaskExecutor();
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public SpedExecutionDao spedExecutionDao() throws Exception {
        SpedExecutionDaoFactoryBean factory = new SpedExecutionDaoFactoryBean();
        factory.setDataSource(getDataSource());
        factory.afterPropertiesSet();

        return factory.getObject();
    }

    @Bean
    public EstabelecimentoDao estabelecimentoDao() {
        EstabelecimentoDao estabelecimentoDao = new EstabelecimentoDao();
        estabelecimentoDao.setDataSource(getDataSource());
        estabelecimentoDao.setSelectQuery(queryPartsProvider.getQueryParts("Reg0000").toString());
        return estabelecimentoDao;
    }
}
