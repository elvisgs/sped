package br.com.gep.sped.contrib.batch.config.readers;

import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoI.*;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
@Lazy
public class ItemReadersBlocoIConfig {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    public ItemStreamReader<RegI001> regI001ItemReader() {
        return itemReaderFactory.create(RegI001.class);
    }

    @Bean
    public ItemStreamReader<RegI010> regI010ItemReader() {
        return itemReaderFactory.create(RegI010.class, RegI001.class);
    }

    @Bean
    public ItemStreamReader<RegI100> regI100ItemReader() {
        return itemReaderFactory.create(RegI100.class, RegI010.class);
    }

    @Bean
    public ItemStreamReader<RegI200> regI200ItemReader() {
        return itemReaderFactory.create(RegI200.class, RegI100.class);
    }

    @Bean
    public ItemStreamReader<RegI300> regI300ItemReader() {
        return itemReaderFactory.create(RegI300.class, RegI200.class);
    }

    @Bean
    public ItemStreamReader<RegI399> regI399ItemReader() {
        return itemReaderFactory.create(RegI399.class, RegI300.class);
    }

    @Bean
    public ItemStreamReader<RegI299> regI299ItemReader() {
        return itemReaderFactory.create(RegI299.class, RegI200.class);
    }

    @Bean
    public ItemStreamReader<RegI199> regI199ItemReader() {
        return itemReaderFactory.create(RegI199.class, RegI100.class);
    }
}
