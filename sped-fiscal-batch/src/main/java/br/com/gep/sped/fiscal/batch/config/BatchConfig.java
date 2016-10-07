package br.com.gep.sped.fiscal.batch.config;

import br.com.gep.sped.batch.common.config.SpedBatchConfigurer;
import org.springframework.batch.core.configuration.annotation.BatchConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BatchConfig {

    @Bean
    public BatchConfigurer batchConfigurer() {
        return new SpedBatchConfigurer();
    }
}
