package br.com.gep.sped.contrib.batch.config.readers;

import br.com.gep.sped.contrib.batch.common.KeepOpenedItemStreamReader;
import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoD.*;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class ItemReadersBlocoDConfig {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    public ItemStreamReader<RegD001> regD001ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegD001.class);
    }

    @Bean
    public ItemStreamReader<RegD010> regD010ItemReader() {
        JdbcCursorItemReader<RegD010> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegD010.class, RegD001.class);

        return new KeepOpenedItemStreamReader<RegD010>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegD100> regD100ItemReader() {
        JdbcCursorItemReader<RegD100> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegD100.class, RegD010.class);

        return new KeepOpenedItemStreamReader<RegD100>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegD101> regD101ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegD101.class, RegD100.class);
    }

    @Bean
    public ItemStreamReader<RegD105> regD105ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegD105.class, RegD100.class);
    }

    @Bean
    public ItemStreamReader<RegD111> regD111ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegD111.class, RegD100.class);
    }

    @Bean
    public ItemStreamReader<RegD200> regD200ItemReader() {
        JdbcCursorItemReader<RegD200> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegD200.class, RegD010.class);

        return new KeepOpenedItemStreamReader<RegD200>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegD201> regD201ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegD201.class, RegD200.class);
    }

    @Bean
    public ItemStreamReader<RegD205> regD205ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegD205.class, RegD200.class);
    }

    @Bean
    public ItemStreamReader<RegD209> regD209ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegD209.class, RegD200.class);
    }

    @Bean
    public ItemStreamReader<RegD300> regD300ItemReader() {
        JdbcCursorItemReader<RegD300> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegD300.class, RegD010.class);

        return new KeepOpenedItemStreamReader<RegD300>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegD309> regD309ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegD309.class, RegD300.class);
    }

    @Bean
    public ItemStreamReader<RegD350> regD350ItemReader() {
        JdbcCursorItemReader<RegD350> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegD350.class, RegD010.class);

        return new KeepOpenedItemStreamReader<RegD350>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegD359> regD359ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegD359.class, RegD350.class);
    }

    @Bean
    public ItemStreamReader<RegD500> regD500ItemReader() {
        JdbcCursorItemReader<RegD500> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegD500.class, RegD010.class);

        return new KeepOpenedItemStreamReader<RegD500>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegD501> regD501ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegD501.class, RegD500.class);
    }

    @Bean
    public ItemStreamReader<RegD505> regD505ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegD505.class, RegD500.class);
    }

    @Bean
    public ItemStreamReader<RegD509> regD509ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegD509.class, RegD500.class);
    }

    @Bean
    public ItemStreamReader<RegD600> regD600ItemReader() {
        JdbcCursorItemReader<RegD600> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegD600.class, RegD010.class);

        return new KeepOpenedItemStreamReader<RegD600>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegD601> regD601ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegD601.class, RegD600.class);
    }

    @Bean
    public ItemStreamReader<RegD605> regD605ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegD605.class, RegD600.class);
    }

    @Bean
    public ItemStreamReader<RegD609> regD609ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegD609.class, RegD600.class);
    }
}
