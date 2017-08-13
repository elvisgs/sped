package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.batch.common.config.InfrastructureConfig;
import br.com.gep.sped.batch.common.config.SpedBatchConfigurer;
import br.com.gep.sped.batch.common.jdbc.dao.SpedExecutionDao;
import br.com.gep.sped.batch.common.jdbc.support.SpedExecutionDaoFactoryBean;
import org.springframework.batch.core.configuration.annotation.BatchConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BatchConfig {

    @Bean
    public BatchConfigurer batchConfigurer() {
        return new SpedBatchConfigurer();
    }

    @Bean @Lazy
    public SpedExecutionDao spedExecutionDao(InfrastructureConfig infraConfig) throws Exception {
        SpedExecutionDaoFactoryBean factory = new SpedExecutionDaoFactoryBean();
        factory.setDataSource(infraConfig.getDataSource());
        factory.afterPropertiesSet();

        return factory.getObject();
    }
}
