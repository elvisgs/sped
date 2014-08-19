package br.com.gep.sped.contrib.batch.config.readers;

import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoA.*;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
@Lazy
public class ItemReadersBlocoAConfig {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    public ItemReader<RegA001> regA001ItemReader() {
        return itemReaderFactory.create(RegA001.class);
    }

    @Bean
    public ItemStreamReader<RegA010> regA010ItemReader() {
        return itemReaderFactory.create(RegA010.class, RegA001.class);
    }

    @Bean
    public ItemStreamReader<RegA100> regA100ItemReader() {
        return itemReaderFactory.create(RegA100.class, RegA010.class);
    }

    @Bean
    public ItemStreamReader<RegA110> regA110ItemReader() {
        return itemReaderFactory.create(RegA110.class, RegA100.class);
    }

    @Bean
    public ItemStreamReader<RegA111> regA111ItemReader() {
        return itemReaderFactory.create(RegA111.class, RegA100.class);
    }

    @Bean
    public ItemStreamReader<RegA120> regA120ItemReader() {
        return itemReaderFactory.create(RegA120.class, RegA100.class);
    }

    @Bean
    public ItemStreamReader<RegA170> regA170ItemReader() {
        return itemReaderFactory.create(RegA170.class, RegA100.class);
    }
}