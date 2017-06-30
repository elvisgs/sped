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

    @Value("classpath*:queries/fiscal-batch-*.elsql")
    private Resource[] queries;

    @Bean
    public BatchConfigurer batchConfigurer() {
        return new SpedBatchConfigurer();
    }

    @Bean
    public QueryPartsProvider queryPartsProvider() {
        return new QueryPartsProvider(queries);
    }
}
