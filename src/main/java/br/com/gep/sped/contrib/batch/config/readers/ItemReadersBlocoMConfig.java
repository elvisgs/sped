package br.com.gep.sped.contrib.batch.config.readers;

import br.com.gep.sped.contrib.batch.common.KeepOpenedItemStreamReader;
import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoM.*;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class ItemReadersBlocoMConfig {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    public ItemStreamReader<RegM001> regM001ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM001.class);
    }

    @Bean
    public ItemStreamReader<RegM100> regM100ItemReader() {
        ItemStreamReader<RegM100> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegM100.class, RegM001.class);

        return new KeepOpenedItemStreamReader<RegM100>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegM105> regM105ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM105.class, RegM100.class);
    }

    @Bean
    public ItemStreamReader<RegM110> regM110ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM110.class, RegM100.class);
    }

    @Bean
    public ItemStreamReader<RegM200> regM200ItemReader() {
        ItemStreamReader<RegM200> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegM200.class, RegM001.class);

        return new KeepOpenedItemStreamReader<RegM200>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegM205> regM205ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM205.class, RegM200.class);
    }

    @Bean
    public ItemStreamReader<RegM210> regM210ItemReader() {
        ItemStreamReader<RegM210> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegM210.class, RegM200.class);

        return new KeepOpenedItemStreamReader<RegM210>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegM211> regM211ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM211.class, RegM210.class);
    }

    @Bean
    public ItemStreamReader<RegM220> regM220ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM220.class, RegM210.class);
    }

    @Bean
    public ItemStreamReader<RegM230> regM230ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM230.class, RegM210.class);
    }

    @Bean
    public ItemStreamReader<RegM300> regM300ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM300.class, RegM001.class);
    }

    @Bean
    public ItemStreamReader<RegM350> regM350ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM350.class, RegM001.class);
    }

    @Bean
    public ItemStreamReader<RegM400> regM400ItemReader() {
        ItemStreamReader<RegM400> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegM400.class, RegM001.class);

        return new KeepOpenedItemStreamReader<RegM400>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegM410> regM410ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM410.class, RegM400.class);
    }

    @Bean
    public ItemStreamReader<RegM500> regM500ItemReader() {
        ItemStreamReader<RegM500> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegM500.class, RegM001.class);

        return new KeepOpenedItemStreamReader<RegM500>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegM505> regM505ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM505.class, RegM500.class);
    }

    @Bean
    public ItemStreamReader<RegM510> regM510ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM510.class, RegM500.class);
    }

    @Bean
    public ItemStreamReader<RegM600> regM600ItemReader() {
        ItemStreamReader<RegM600> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegM600.class, RegM001.class);

        return new KeepOpenedItemStreamReader<RegM600>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegM605> regM605ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM605.class, RegM600.class);
    }

    @Bean
    public ItemStreamReader<RegM610> regM610ItemReader() {
        ItemStreamReader<RegM610> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegM610.class, RegM600.class);

        return new KeepOpenedItemStreamReader<RegM610>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegM611> regM611ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM611.class, RegM610.class);
    }

    @Bean
    public ItemStreamReader<RegM620> regM620ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM620.class, RegM610.class);
    }

    @Bean
    public ItemStreamReader<RegM630> regM630ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM630.class, RegM610.class);
    }

    @Bean
    public ItemStreamReader<RegM700> regM700ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM700.class, RegM001.class);
    }

    @Bean
    public ItemStreamReader<RegM800> regM800ItemReader() {
        ItemStreamReader<RegM800> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegM800.class, RegM001.class);

        return new KeepOpenedItemStreamReader<RegM800>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegM810> regM810ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegM810.class, RegM800.class);
    }
}
