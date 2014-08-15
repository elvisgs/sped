package br.com.gep.sped.contrib.batch.config;

import br.com.gep.spedcontrib.arquivo.registros.Registro;
import br.com.gep.spedcontrib.arquivo.writer.SpedContribWriterFactory;
import org.beanio.spring.BeanIOFlatFileItemWriter;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import java.io.File;

@Configuration
public class ItemWriterConfig {

    private static final String OVERRIDDEN_BY_EXPRESSION = null;

    @Bean
    @StepScope
    public <T extends Registro> BeanIOFlatFileItemWriter<T> beanIOWriter(@Value("#{jobParameters['output.file.name']}") String outputFileName) {
        BeanIOFlatFileItemWriter<T> writer = new BeanIOFlatFileItemWriter<T>();
        writer.setStreamFactory(SpedContribWriterFactory.getInstance().getStreamFactory());
        writer.setStreamName(SpedContribWriterFactory.STREAM_NAME);
        writer.setTransactional(false);
        writer.setAppendAllowed(true);

        File file = new File(outputFileName);
        writer.setResource(new FileSystemResource(file));

        return writer;
    }

    public <T extends Registro> BeanIOFlatFileItemWriter<T> beanIOWriter() {
        return beanIOWriter(OVERRIDDEN_BY_EXPRESSION);
    }
}
