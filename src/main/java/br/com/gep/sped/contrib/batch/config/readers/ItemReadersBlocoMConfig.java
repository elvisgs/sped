package br.com.gep.sped.contrib.batch.config.readers;

import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoM.*;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
@Lazy
public class ItemReadersBlocoMConfig {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    public ItemStreamReader<RegM001> regM001ItemReader() {
        return itemReaderFactory.create(RegM001.class);
    }

    @Bean
    public ItemStreamReader<RegM100> regM100ItemReader() {
        return itemReaderFactory.create(RegM100.class, RegM001.class);
    }

    @Bean
    public ItemStreamReader<RegM105> regM105ItemReader() {
        return itemReaderFactory.create(RegM105.class, RegM100.class);
    }

    @Bean
    public ItemStreamReader<RegM110> regM110ItemReader() {
        return itemReaderFactory.create(RegM110.class, RegM100.class);
    }

    @Bean
    public ItemStreamReader<RegM200> regM200ItemReader() {
        return itemReaderFactory.create(RegM200.class, RegM001.class);
    }

    @Bean
    public ItemStreamReader<RegM205> regM205ItemReader() {
        return itemReaderFactory.create(RegM205.class, RegM200.class);
    }

    @Bean
    public ItemStreamReader<RegM210> regM210ItemReader() {
        return itemReaderFactory.create(RegM210.class, RegM200.class);
    }

    @Bean
    public ItemStreamReader<RegM211> regM211ItemReader() {
        return itemReaderFactory.create(RegM211.class, RegM210.class);
    }

    @Bean
    public ItemStreamReader<RegM220> regM220ItemReader() {
        return itemReaderFactory.create(RegM220.class, RegM210.class);
    }

    @Bean
    public ItemStreamReader<RegM230> regM230ItemReader() {
        return itemReaderFactory.create(RegM230.class, RegM210.class);
    }

    @Bean
    public ItemStreamReader<RegM300> regM300ItemReader() {
        return itemReaderFactory.create(RegM300.class, RegM001.class);
    }

    @Bean
    public ItemStreamReader<RegM350> regM350ItemReader() {
        return itemReaderFactory.create(RegM350.class, RegM001.class);
    }

    @Bean
    public ItemStreamReader<RegM400> regM400ItemReader() {
        return itemReaderFactory.create(RegM400.class, RegM001.class);
    }

    @Bean
    public ItemStreamReader<RegM410> regM410ItemReader() {
        return itemReaderFactory.create(RegM410.class, RegM400.class);
    }

    @Bean
    public ItemStreamReader<RegM500> regM500ItemReader() {
        return itemReaderFactory.create(RegM500.class, RegM001.class);
    }

    @Bean
    public ItemStreamReader<RegM505> regM505ItemReader() {
        return itemReaderFactory.create(RegM505.class, RegM500.class);
    }

    @Bean
    public ItemStreamReader<RegM510> regM510ItemReader() {
        return itemReaderFactory.create(RegM510.class, RegM500.class);
    }

    @Bean
    public ItemStreamReader<RegM600> regM600ItemReader() {
        return itemReaderFactory.create(RegM600.class, RegM001.class);
    }

    @Bean
    public ItemStreamReader<RegM605> regM605ItemReader() {
        return itemReaderFactory.create(RegM605.class, RegM600.class);
    }

    @Bean
    public ItemStreamReader<RegM610> regM610ItemReader() {
        return itemReaderFactory.create(RegM610.class, RegM600.class);
    }

    @Bean
    public ItemStreamReader<RegM611> regM611ItemReader() {
        return itemReaderFactory.create(RegM611.class, RegM610.class);
    }

    @Bean
    public ItemStreamReader<RegM620> regM620ItemReader() {
        return itemReaderFactory.create(RegM620.class, RegM610.class);
    }

    @Bean
    public ItemStreamReader<RegM630> regM630ItemReader() {
        return itemReaderFactory.create(RegM630.class, RegM610.class);
    }

    @Bean
    public ItemStreamReader<RegM700> regM700ItemReader() {
        return itemReaderFactory.create(RegM700.class, RegM001.class);
    }

    @Bean
    public ItemStreamReader<RegM800> regM800ItemReader() {
        return itemReaderFactory.create(RegM800.class, RegM001.class);
    }

    @Bean
    public ItemStreamReader<RegM810> regM810ItemReader() {
        return itemReaderFactory.create(RegM810.class, RegM800.class);
    }
}
