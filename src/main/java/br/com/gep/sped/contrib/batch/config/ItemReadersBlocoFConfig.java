package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.contrib.batch.common.KeepOpenedItemStreamReader;
import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoF.*;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class ItemReadersBlocoFConfig {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    public ItemStreamReader<RegF001> regF001ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegF001.class);
    }

    @Bean
    public ItemStreamReader<RegF010> regF010ItemReader() {
        ItemStreamReader<RegF010> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegF010.class, RegF001.class);

        return new KeepOpenedItemStreamReader<RegF010>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegF100> regF100ItemReader() {
        ItemStreamReader<RegF100> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegF100.class, RegF010.class);

        return new KeepOpenedItemStreamReader<RegF100>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegF111> regF111ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegF111.class, RegF100.class);
    }

    @Bean
    public ItemStreamReader<RegF120> regF120ItemReader() {
        ItemStreamReader<RegF120> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegF120.class, RegF010.class);

        return new KeepOpenedItemStreamReader<RegF120>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegF129> regF129ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegF129.class, RegF120.class);
    }

    @Bean
    public ItemStreamReader<RegF130> regF130ItemReader() {
        ItemStreamReader<RegF130> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegF130.class, RegF010.class);

        return new KeepOpenedItemStreamReader<RegF130>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegF139> regF139ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegF139.class, RegF130.class);
    }

    @Bean
    public ItemStreamReader<RegF150> regF150ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegF150.class, RegF010.class);
    }

    @Bean
    public ItemStreamReader<RegF200> regF200ItemReader() {
        ItemStreamReader<RegF200> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegF200.class, RegF010.class);

        return new KeepOpenedItemStreamReader<RegF200>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegF205> regF205ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegF205.class, RegF200.class);
    }

    @Bean
    public ItemStreamReader<RegF210> regF210ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegF210.class, RegF200.class);
    }

    @Bean
    public ItemStreamReader<RegF211> regF211ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegF211.class, RegF200.class);
    }

    @Bean
    public ItemStreamReader<RegF500> regF500ItemReader() {
        ItemStreamReader<RegF500> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegF500.class, RegF010.class);

        return new KeepOpenedItemStreamReader<RegF500>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegF509> regF509ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegF509.class, RegF500.class);
    }

    @Bean
    public ItemStreamReader<RegF510> regF510ItemReader() {
        ItemStreamReader<RegF510> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegF510.class, RegF010.class);

        return new KeepOpenedItemStreamReader<RegF510>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegF519> regF519ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegF519.class, RegF510.class);
    }

    @Bean
    public ItemStreamReader<RegF525> regF525ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegF525.class, RegF010.class);
    }

    @Bean
    public ItemStreamReader<RegF550> regF550ItemReader() {
        ItemStreamReader<RegF550> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegF550.class, RegF010.class);

        return new KeepOpenedItemStreamReader<RegF550>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegF559> regF559ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegF559.class, RegF550.class);
    }

    @Bean
    public ItemStreamReader<RegF560> regF560ItemReader() {
        ItemStreamReader<RegF560> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegF560.class, RegF010.class);

        return new KeepOpenedItemStreamReader<RegF560>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegF569> regF569ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegF569.class, RegF560.class);
    }

    @Bean
    public ItemStreamReader<RegF600> regF600ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegF600.class, RegF010.class);
    }

    @Bean
    public ItemStreamReader<RegF700> regF700ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegF700.class, RegF010.class);
    }

    @Bean
    public ItemStreamReader<RegF800> regF800ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegF800.class, RegF010.class);
    }
}
