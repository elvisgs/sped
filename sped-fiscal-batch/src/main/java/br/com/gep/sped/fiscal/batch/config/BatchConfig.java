package br.com.gep.sped.fiscal.batch.config;

import br.com.gep.sped.batch.common.config.SpedBatchConfigurer;
import br.com.gep.sped.batch.common.jdbc.QueryPartsProvider;
import org.springframework.batch.core.configuration.annotation.BatchConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
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
}
