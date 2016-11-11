package br.com.gep.sped.contrib.batch.factory;

import br.com.gep.sped.batch.common.factory.BeanIOFlatFileItemWriterFactoryBean;
import br.com.gep.sped.batch.common.factory.ItemWriterFactory;
import br.com.gep.sped.contrib.marshaller.writer.SpedContribWriterFactory;
import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.spring.BeanIOFlatFileItemWriter;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

import static br.com.gep.sped.batch.common.SpedJobParameterBuilder.OUTPUT_FILE_NAME_EL;

@Configuration
public class BeanIOItemWriterFactory implements ItemWriterFactory {

    private static final String OVERRIDDEN_BY_EXPRESSION = null;

    @SuppressWarnings("unchecked")
    @Override
    public <R extends Registro, P extends Registro> ItemStreamWriter<R> create(Class<R> regClass, Class<P> parentRegClass) {
        return beanIOWriter();
    }

    @Override
    public <R extends Registro> ItemStreamWriter<R> create(Class<R> regClass) {
        return create(regClass, null);
    }

    @Bean
    @StepScope
    @Value(OUTPUT_FILE_NAME_EL)
    BeanIOFlatFileItemWriter beanIOWriter(String outputFileName) {
        return new BeanIOFlatFileItemWriterFactoryBean()
            .setSpedWriterFactory(SpedContribWriterFactory.getInstance())
            .setOutputFile(new File(outputFileName))
            .getObject();
    }

    BeanIOFlatFileItemWriter beanIOWriter() {
        return beanIOWriter(OVERRIDDEN_BY_EXPRESSION);
    }
}
