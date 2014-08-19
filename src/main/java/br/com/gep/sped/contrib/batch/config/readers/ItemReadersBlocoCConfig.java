package br.com.gep.sped.contrib.batch.config.readers;

import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoC.*;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
@Lazy
public class ItemReadersBlocoCConfig {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    public ItemStreamReader<RegC001> regC001ItemReader() {
        return itemReaderFactory.create(RegC001.class);
    }

    @Bean
    public ItemStreamReader<RegC010> regC010ItemReader() {
        return itemReaderFactory.create(RegC010.class, RegC001.class);
    }

    @Bean
    public ItemStreamReader<RegC100> regC100ItemReader() {
        return itemReaderFactory.create(RegC100.class, RegC010.class);
    }

    @Bean
    public ItemStreamReader<RegC110> regC110ItemReader() {
        return itemReaderFactory.create(RegC110.class, RegC100.class);
    }

    @Bean
    public ItemStreamReader<RegC111> regC111ItemReader() {
        return itemReaderFactory.create(RegC111.class, RegC100.class);
    }

    @Bean
    public ItemStreamReader<RegC120> regC120ItemReader() {
        return itemReaderFactory.create(RegC120.class, RegC100.class);
    }

    @Bean
    public ItemStreamReader<RegC170> regC170ItemReader() {
        return itemReaderFactory.create(RegC170.class, RegC100.class);
    }

    @Bean
    public ItemStreamReader<RegC180> regC180ItemReader() {
        return itemReaderFactory.create(RegC180.class, RegC010.class);
    }

    @Bean
    public ItemStreamReader<RegC181> regC181ItemReader() {
        return itemReaderFactory.create(RegC181.class, RegC180.class);
    }

    @Bean
    public ItemStreamReader<RegC185> regC185ItemReader() {
        return itemReaderFactory.create(RegC185.class, RegC180.class);
    }

    @Bean
    public ItemStreamReader<RegC188> regC188ItemReader() {
        return itemReaderFactory.create(RegC188.class, RegC180.class);
    }

    @Bean
    public ItemStreamReader<RegC190> regC190ItemReader() {
        return itemReaderFactory.create(RegC190.class, RegC010.class);
    }

    @Bean
    public ItemStreamReader<RegC191> regC191ItemReader() {
        return itemReaderFactory.create(RegC191.class, RegC190.class);
    }

    @Bean
    public ItemStreamReader<RegC195> regC195ItemReader() {
        return itemReaderFactory.create(RegC195.class, RegC190.class);
    }

    @Bean
    public ItemStreamReader<RegC198> regC198ItemReader() {
        return itemReaderFactory.create(RegC198.class, RegC190.class);
    }

    @Bean
    public ItemStreamReader<RegC199> regC199ItemReader() {
        return itemReaderFactory.create(RegC199.class, RegC190.class);
    }

    @Bean
    public ItemStreamReader<RegC380> regC380ItemReader() {
        return itemReaderFactory.create(RegC380.class, RegC010.class);
    }

    @Bean
    public ItemStreamReader<RegC381> regC381ItemReader() {
        return itemReaderFactory.create(RegC381.class, RegC380.class);
    }

    @Bean
    public ItemStreamReader<RegC385> regC385ItemReader() {
        return itemReaderFactory.create(RegC385.class, RegC380.class);
    }

    @Bean
    public ItemStreamReader<RegC395> regC395ItemReader() {
        return itemReaderFactory.create(RegC395.class, RegC010.class);
    }

    @Bean
    public ItemStreamReader<RegC396> regC396ItemReader() {
        return itemReaderFactory.create(RegC396.class, RegC395.class);
    }

    @Bean
    public ItemStreamReader<RegC400> regC400ItemReader() {
        return itemReaderFactory.create(RegC400.class, RegC010.class);
    }

    @Bean
    public ItemStreamReader<RegC405> regC405ItemReader() {
        return itemReaderFactory.create(RegC405.class, RegC400.class);
    }

    @Bean
    public ItemStreamReader<RegC481> regC481ItemReader() {
        return itemReaderFactory.create(RegC481.class, RegC405.class);
    }

    @Bean
    public ItemStreamReader<RegC485> regC485ItemReader() {
        return itemReaderFactory.create(RegC485.class, RegC405.class);
    }

    @Bean
    public ItemStreamReader<RegC489> regC489ItemReader() {
        return itemReaderFactory.create(RegC489.class, RegC400.class);
    }

    @Bean
    public ItemStreamReader<RegC490> regC490ItemReader() {
        return itemReaderFactory.create(RegC490.class, RegC010.class);
    }

    @Bean
    public ItemStreamReader<RegC491> regC491ItemReader() {
        return itemReaderFactory.create(RegC491.class, RegC490.class);
    }

    @Bean
    public ItemStreamReader<RegC495> regC495ItemReader() {
        return itemReaderFactory.create(RegC495.class, RegC490.class);
    }

    @Bean
    public ItemStreamReader<RegC499> regC499ItemReader() {
        return itemReaderFactory.create(RegC499.class, RegC490.class);
    }

    @Bean
    public ItemStreamReader<RegC500> regC500ItemReader() {
        return itemReaderFactory.create(RegC500.class, RegC010.class);
    }

    @Bean
    public ItemStreamReader<RegC501> regC501ItemReader() {
        return itemReaderFactory.create(RegC501.class, RegC500.class);
    }

    @Bean
    public ItemStreamReader<RegC505> regC505ItemReader() {
        return itemReaderFactory.create(RegC505.class, RegC500.class);
    }

    @Bean
    public ItemStreamReader<RegC509> regC509ItemReader() {
        return itemReaderFactory.create(RegC509.class, RegC500.class);
    }

    @Bean
    public ItemStreamReader<RegC600> regC600ItemReader() {
        return itemReaderFactory.create(RegC600.class, RegC010.class);
    }

    @Bean
    public ItemStreamReader<RegC601> regC601ItemReader() {
        return itemReaderFactory.create(RegC601.class, RegC600.class);
    }

    @Bean
    public ItemStreamReader<RegC605> regC605ItemReader() {
        return itemReaderFactory.create(RegC605.class, RegC600.class);
    }

    @Bean
    public ItemStreamReader<RegC609> regC609ItemReader() {
        return itemReaderFactory.create(RegC609.class, RegC600.class);
    }
}
