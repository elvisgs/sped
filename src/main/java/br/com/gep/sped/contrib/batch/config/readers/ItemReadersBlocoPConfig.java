package br.com.gep.sped.contrib.batch.config.readers;

import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoP.*;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
@Lazy
public class ItemReadersBlocoPConfig {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    public ItemStreamReader<RegP001> regP001ItemReader() {
        return itemReaderFactory.create(RegP001.class);
    }

    @Bean
    public ItemStreamReader<RegP010> regP010ItemReader() {
        return itemReaderFactory.create(RegP010.class, RegP001.class);
    }

    @Bean
    public ItemStreamReader<RegP100> regP100ItemReader() {
        return itemReaderFactory.create(RegP100.class, RegP010.class);
    }

    @Bean
    public ItemStreamReader<RegP110> regP110ItemReader() {
        return itemReaderFactory.create(RegP110.class, RegP100.class);
    }

    @Bean
    public ItemStreamReader<RegP199> regP199ItemReader() {
        return itemReaderFactory.create(RegP199.class, RegP100.class);
    }

    @Bean
    public ItemStreamReader<RegP200> regP200ItemReader() {
        return itemReaderFactory.create(RegP200.class, RegP001.class);
    }

    @Bean
    public ItemStreamReader<RegP210> regP210ItemReader() {
        return itemReaderFactory.create(RegP210.class, RegP200.class);
    }
}
