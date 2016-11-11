package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.batch.common.factory.BeanIOFlatFileItemWriterFactoryBean;
import br.com.gep.sped.contrib.marshaller.writer.SpedContribWriterFactory;
import org.beanio.spring.BeanIOFlatFileItemWriter;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

import static br.com.gep.sped.batch.common.SpedJobParameterBuilder.OUTPUT_FILE_NAME_EL;

@Configuration
public class ItemWriterConfig {

    private static final String OVERRIDDEN_BY_EXPRESSION = null;

    @Bean
    @StepScope
    @Value(OUTPUT_FILE_NAME_EL)
    public BeanIOFlatFileItemWriter beanIOWriter(String outputFileName) {
        return new BeanIOFlatFileItemWriterFactoryBean()
            .setSpedWriterFactory(SpedContribWriterFactory.getInstance())
            .setOutputFile(new File(outputFileName))
            .getObject();
    }

    public BeanIOFlatFileItemWriter beanIOWriter() {
        return beanIOWriter(OVERRIDDEN_BY_EXPRESSION);
    }
}
