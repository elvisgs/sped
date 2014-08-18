package br.com.gep.sped.contrib.batch.config.readers;

import br.com.gep.sped.contrib.batch.common.KeepOpenedItemStreamReader;
import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoA.*;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class ItemReadersBlocoAConfig {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    public ItemReader<RegA001> regA001ItemReader() {
        return itemReaderFactory.create(RegA001.class);
    }

    @Bean
    public ItemStreamReader<RegA010> regA010ItemReader() {
        ItemStreamReader<RegA010> itemReader = itemReaderFactory
                .create(RegA010.class, RegA001.class);

        return new KeepOpenedItemStreamReader<RegA010>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegA100> regA100ItemReader() {
        ItemStreamReader<RegA100> itemReader = itemReaderFactory
                .create(RegA100.class, RegA010.class);

        return new KeepOpenedItemStreamReader<RegA100>(itemReader);
    }

    @Bean
    public ItemReader<RegA110> regA110ItemReader() {
        ItemStreamReader<RegA110> itemReader = itemReaderFactory
                .create(RegA110.class, RegA100.class);

        return itemReader;
    }

    @Bean
    public ItemReader<RegA111> regA111ItemReader() {
        ItemStreamReader<RegA111> itemReader = itemReaderFactory
                .create(RegA111.class, RegA100.class);

        return itemReader;
    }

    @Bean
    public ItemReader<RegA120> regA120ItemReader() {
        ItemStreamReader<RegA120> itemReader = itemReaderFactory
                .create(RegA120.class, RegA100.class);

        return itemReader;
    }

    @Bean
    public ItemReader<RegA170> regA170ItemReader() {
        ItemStreamReader<RegA170> itemReader = itemReaderFactory
                .create(RegA170.class, RegA100.class);

        return itemReader;
    }
}