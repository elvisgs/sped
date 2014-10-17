package br.com.gep.sped.fiscal.batch.config;

import br.com.gep.sped.fiscal.marshaller.writer.SpedFiscalWriterFactory;
import br.com.gep.sped.marshaller.common.Registro;
import br.com.gep.sped.marshaller.common.writer.SpedWriterFactory;
import org.beanio.spring.BeanIOFlatFileItemWriter;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import java.io.File;

import static br.com.gep.sped.batch.common.SpedJobParameterBuilder.OUTPUT_FILE_NAME_EL;

@Configuration
public class ItemWriterConfig {

    private static final String OVERRIDDEN_BY_EXPRESSION = null;

    @Bean
    @StepScope
    public <T extends Registro> BeanIOFlatFileItemWriter<T> beanIOWriter(@Value(OUTPUT_FILE_NAME_EL) String outputFileName) {
        BeanIOFlatFileItemWriter<T> writer = new BeanIOFlatFileItemWriter<>();
        SpedWriterFactory factory = SpedFiscalWriterFactory.getInstance();
        writer.setStreamFactory(factory.getStreamFactory());
        writer.setStreamName(factory.getStreamName());
        writer.setTransactional(false);
        writer.setAppendAllowed(true);
        writer.setSaveState(false);

        File file = new File(outputFileName);
        writer.setResource(new FileSystemResource(file));

        return writer;
    }

    public <T extends Registro> BeanIOFlatFileItemWriter<T> beanIOWriter() {
        return beanIOWriter(OVERRIDDEN_BY_EXPRESSION);
    }
}
