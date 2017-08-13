package br.com.gep.sped.fiscal.batch.config;

import br.com.gep.sped.batch.common.config.InfrastructureConfig;
import br.com.gep.sped.batch.common.config.SpedBatchConfigurer;
import br.com.gep.sped.batch.common.jdbc.QueryPartsProvider;
import br.com.gep.sped.batch.common.jdbc.dao.SpedExecutionDao;
import br.com.gep.sped.batch.common.jdbc.support.SpedExecutionDaoFactoryBean;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.configuration.annotation.BatchConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class BatchConfig {

    @Bean
    public BatchConfigurer batchConfigurer() {
        return new SpedBatchConfigurer();
    }

    @Bean
    @Value("classpath:queries/queries-fiscal-base-v010.elsql")
    public QueryPartsProvider queryPartsProvider(Resource queries) {
        return new QueryPartsProvider(queries);
    }

    @Bean @Lazy
    public SpedExecutionDao spedExecutionDao(InfrastructureConfig infraConfig) throws Exception {
        SpedExecutionDaoFactoryBean factory = new SpedExecutionDaoFactoryBean();
        factory.setDataSource(infraConfig.getDataSource());
        factory.afterPropertiesSet();

        return factory.getObject();
    }
}
