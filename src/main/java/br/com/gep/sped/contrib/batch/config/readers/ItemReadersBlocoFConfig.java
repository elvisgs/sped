package br.com.gep.sped.contrib.batch.config.readers;

import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoF.*;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
@Lazy
public class ItemReadersBlocoFConfig {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    public ItemStreamReader<RegF001> regF001ItemReader() {
        return itemReaderFactory.create(RegF001.class);
    }

    @Bean
    public ItemStreamReader<RegF010> regF010ItemReader() {
        return itemReaderFactory.create(RegF010.class, RegF001.class);
    }

    @Bean
    public ItemStreamReader<RegF100> regF100ItemReader() {
        return itemReaderFactory.create(RegF100.class, RegF010.class);
    }

    @Bean
    public ItemStreamReader<RegF111> regF111ItemReader() {
        return itemReaderFactory.create(RegF111.class, RegF100.class);
    }

    @Bean
    public ItemStreamReader<RegF120> regF120ItemReader() {
        return itemReaderFactory.create(RegF120.class, RegF010.class);
    }

    @Bean
    public ItemStreamReader<RegF129> regF129ItemReader() {
        return itemReaderFactory.create(RegF129.class, RegF120.class);
    }

    @Bean
    public ItemStreamReader<RegF130> regF130ItemReader() {
        return itemReaderFactory.create(RegF130.class, RegF010.class);
    }

    @Bean
    public ItemStreamReader<RegF139> regF139ItemReader() {
        return itemReaderFactory.create(RegF139.class, RegF130.class);
    }

    @Bean
    public ItemStreamReader<RegF150> regF150ItemReader() {
        return itemReaderFactory.create(RegF150.class, RegF010.class);
    }

    @Bean
    public ItemStreamReader<RegF200> regF200ItemReader() {
        return itemReaderFactory.create(RegF200.class, RegF010.class);
    }

    @Bean
    public ItemStreamReader<RegF205> regF205ItemReader() {
        return itemReaderFactory.create(RegF205.class, RegF200.class);
    }

    @Bean
    public ItemStreamReader<RegF210> regF210ItemReader() {
        return itemReaderFactory.create(RegF210.class, RegF200.class);
    }

    @Bean
    public ItemStreamReader<RegF211> regF211ItemReader() {
        return itemReaderFactory.create(RegF211.class, RegF200.class);
    }

    @Bean
    public ItemStreamReader<RegF500> regF500ItemReader() {
        return itemReaderFactory.create(RegF500.class, RegF010.class);
    }

    @Bean
    public ItemStreamReader<RegF509> regF509ItemReader() {
        return itemReaderFactory.create(RegF509.class, RegF500.class);
    }

    @Bean
    public ItemStreamReader<RegF510> regF510ItemReader() {
        return itemReaderFactory.create(RegF510.class, RegF010.class);
    }

    @Bean
    public ItemStreamReader<RegF519> regF519ItemReader() {
        return itemReaderFactory.create(RegF519.class, RegF510.class);
    }

    @Bean
    public ItemStreamReader<RegF525> regF525ItemReader() {
        return itemReaderFactory.create(RegF525.class, RegF010.class);
    }

    @Bean
    public ItemStreamReader<RegF550> regF550ItemReader() {
        return itemReaderFactory.create(RegF550.class, RegF010.class);
    }

    @Bean
    public ItemStreamReader<RegF559> regF559ItemReader() {
        return itemReaderFactory.create(RegF559.class, RegF550.class);
    }

    @Bean
    public ItemStreamReader<RegF560> regF560ItemReader() {
        return itemReaderFactory.create(RegF560.class, RegF010.class);
    }

    @Bean
    public ItemStreamReader<RegF569> regF569ItemReader() {
        return itemReaderFactory.create(RegF569.class, RegF560.class);
    }

    @Bean
    public ItemStreamReader<RegF600> regF600ItemReader() {
        return itemReaderFactory.create(RegF600.class, RegF010.class);
    }

    @Bean
    public ItemStreamReader<RegF700> regF700ItemReader() {
        return itemReaderFactory.create(RegF700.class, RegF010.class);
    }

    @Bean
    public ItemStreamReader<RegF800> regF800ItemReader() {
        return itemReaderFactory.create(RegF800.class, RegF010.class);
    }
}
