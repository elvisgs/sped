package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.contrib.batch.common.KeepOpenedItemStreamReader;
import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoC.*;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class ItemReadersBlocoCConfig {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    public ItemReader<RegC001> regC001ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC001.class);
    }

    @Bean
    public ItemStreamReader<RegC010> regC010ItemReader() {
        JdbcCursorItemReader<RegC010> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegC010.class, RegC001.class);

        return new KeepOpenedItemStreamReader<RegC010>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegC100> regC100ItemReader() {
        JdbcCursorItemReader<RegC100> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegC100.class, RegC010.class);

        return new KeepOpenedItemStreamReader<RegC100>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegC110> regC110ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC110.class, RegC100.class);
    }

    @Bean
    public ItemStreamReader<RegC111> regC111ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC111.class, RegC100.class);
    }

    @Bean
    public ItemStreamReader<RegC120> regC120ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC120.class, RegC100.class);
    }

    @Bean
    public ItemStreamReader<RegC170> regC170ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC170.class, RegC100.class);
    }

    @Bean
    public ItemStreamReader<RegC180> regC180ItemReader() {
        JdbcCursorItemReader<RegC180> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegC180.class, RegC010.class);

        return new KeepOpenedItemStreamReader<RegC180>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegC181> regC181ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC181.class, RegC180.class);
    }

    @Bean
    public ItemStreamReader<RegC185> regC185ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC185.class, RegC180.class);
    }

    @Bean
    public ItemStreamReader<RegC188> regC188ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC188.class, RegC180.class);
    }

    @Bean
    public ItemStreamReader<RegC190> regC190ItemReader() {
        JdbcCursorItemReader<RegC190> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegC190.class, RegC010.class);

        return new KeepOpenedItemStreamReader<RegC190>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegC191> regC191ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC191.class, RegC190.class);
    }

    @Bean
    public ItemStreamReader<RegC195> regC195ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC195.class, RegC190.class);
    }

    @Bean
    public ItemStreamReader<RegC198> regC198ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC198.class, RegC190.class);
    }

    @Bean
    public ItemStreamReader<RegC199> regC199ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC199.class, RegC190.class);
    }

    @Bean
    public ItemStreamReader<RegC380> regC380ItemReader() {
        JdbcCursorItemReader<RegC380> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegC380.class, RegC010.class);

        return new KeepOpenedItemStreamReader<RegC380>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegC381> regC381ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC381.class, RegC380.class);
    }

    @Bean
    public ItemStreamReader<RegC385> regC385ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC385.class, RegC380.class);
    }

    @Bean
    public ItemStreamReader<RegC395> regC395ItemReader() {
        JdbcCursorItemReader<RegC395> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegC395.class, RegC010.class);

        return new KeepOpenedItemStreamReader<RegC395>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegC396> regC396ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC396.class, RegC395.class);
    }

    @Bean
    public ItemStreamReader<RegC400> regC400ItemReader() {
        JdbcCursorItemReader<RegC400> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegC400.class, RegC010.class);

        return new KeepOpenedItemStreamReader<RegC400>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegC405> regC405ItemReader() {
        JdbcCursorItemReader<RegC405> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegC405.class, RegC400.class);

        return new KeepOpenedItemStreamReader<RegC405>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegC481> regC481ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC481.class, RegC405.class);
    }

    @Bean
    public ItemStreamReader<RegC485> regC485ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC485.class, RegC405.class);
    }

    @Bean
    public ItemStreamReader<RegC489> regC489ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC489.class, RegC400.class);
    }

    @Bean
    public ItemStreamReader<RegC490> regC490ItemReader() {
        JdbcCursorItemReader<RegC490> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegC490.class, RegC010.class);

        return new KeepOpenedItemStreamReader<RegC490>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegC491> regC491ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC491.class, RegC490.class);
    }

    @Bean
    public ItemStreamReader<RegC495> regC495ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC495.class, RegC490.class);
    }

    @Bean
    public ItemStreamReader<RegC499> regC499ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC499.class, RegC490.class);
    }

    @Bean
    public ItemStreamReader<RegC500> regC500ItemReader() {
        JdbcCursorItemReader<RegC500> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegC500.class, RegC010.class);

        return new KeepOpenedItemStreamReader<RegC500>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegC501> regC501ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC501.class, RegC500.class);
    }

    @Bean
    public ItemStreamReader<RegC505> regC505ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC505.class, RegC500.class);
    }

    @Bean
    public ItemStreamReader<RegC509> regC509ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC509.class, RegC500.class);
    }

    @Bean
    public ItemStreamReader<RegC600> regC600ItemReader() {
        JdbcCursorItemReader<RegC600> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegC600.class, RegC010.class);

        return new KeepOpenedItemStreamReader<RegC600>(itemReader);
    }

    @Bean
    public ItemStreamReader<RegC601> regC601ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC601.class, RegC600.class);
    }

    @Bean
    public ItemStreamReader<RegC605> regC605ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC605.class, RegC600.class);
    }

    @Bean
    public ItemStreamReader<RegC609> regC609ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegC609.class, RegC600.class);
    }

}
