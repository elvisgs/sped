package br.com.gep.sped.contrib.batch.config.readers;

import br.com.gep.sped.contrib.batch.common.KeepOpenedItemStreamReader;
import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoI.*;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class ItemReadersBlocoIConfig {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    @Lazy
    public ItemStreamReader<RegI001> regI001ItemReader() {
        return itemReaderFactory.create(RegI001.class);
    }

    @Bean
    @Lazy
    public ItemStreamReader<RegI010> regI010ItemReader() {
        ItemStreamReader<RegI010> itemReader = itemReaderFactory
                .create(RegI010.class, RegI001.class);

        return new KeepOpenedItemStreamReader<RegI010>(itemReader);
    }

    @Bean
    @Lazy
    public ItemStreamReader<RegI100> regI100ItemReader() {
        ItemStreamReader<RegI100> itemReader = itemReaderFactory
                .create(RegI100.class, RegI010.class);

        return new KeepOpenedItemStreamReader<RegI100>(itemReader);
    }

    @Bean
    @Lazy
    public ItemStreamReader<RegI200> regI200ItemReader() {
        ItemStreamReader<RegI200> itemReader = itemReaderFactory
                .create(RegI200.class, RegI100.class);

        return new KeepOpenedItemStreamReader<RegI200>(itemReader);
    }

    @Bean
    @Lazy
    public ItemStreamReader<RegI300> regI300ItemReader() {
        ItemStreamReader<RegI300> itemReader = itemReaderFactory
                .create(RegI300.class, RegI200.class);

        return new KeepOpenedItemStreamReader<RegI300>(itemReader);
    }

    @Bean
    @Lazy
    public ItemStreamReader<RegI399> regI399ItemReader() {
        return itemReaderFactory.create(RegI399.class, RegI300.class);
    }

    @Bean
    @Lazy
    public ItemStreamReader<RegI299> regI299ItemReader() {
        return itemReaderFactory.create(RegI299.class, RegI200.class);
    }

    @Bean
    @Lazy
    public ItemStreamReader<RegI199> regI199ItemReader() {
        return itemReaderFactory.create(RegI199.class, RegI100.class);
    }
}
