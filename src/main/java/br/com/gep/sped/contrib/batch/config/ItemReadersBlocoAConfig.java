package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.sped.contrib.batch.common.KeepOpenedItemStreamReader;
import br.com.gep.spedcontrib.arquivo.registros.blocoA.*;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
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
        return itemReaderFactory.createJdbcCursorItemReader(RegA001.class);
    }

    @Bean
    public ItemStreamReader<RegA010> regA010ItemReader() {
        JdbcCursorItemReader<RegA010> jdbcCursorItemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegA010.class);

        return new KeepOpenedItemStreamReader<RegA010>(jdbcCursorItemReader);
    }

    @Bean
    public ItemStreamReader<RegA100> regA100ItemReader() {
        JdbcCursorItemReader<RegA100> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegA100.class, RegA010.class);

        return new KeepOpenedItemStreamReader<RegA100>(itemReader);
    }

    @Bean
    public ItemReader<RegA110> regA110ItemReader() {
        JdbcCursorItemReader<RegA110> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegA110.class, RegA100.class);

        return itemReader;
    }

    @Bean
    public ItemReader<RegA111> regA111ItemReader() {
        JdbcCursorItemReader<RegA111> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegA111.class, RegA100.class);

        return itemReader;
    }

    @Bean
    public ItemReader<RegA120> regA120ItemReader() {
        JdbcCursorItemReader<RegA120> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegA120.class, RegA100.class);

        return itemReader;
    }

    @Bean
    public ItemReader<RegA170> regA170ItemReader() {
        JdbcCursorItemReader<RegA170> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegA170.class, RegA100.class);

        return itemReader;
    }
}