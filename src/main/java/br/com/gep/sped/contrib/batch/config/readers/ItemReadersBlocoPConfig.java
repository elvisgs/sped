package br.com.gep.sped.contrib.batch.config.readers;

import br.com.gep.sped.contrib.batch.common.KeepOpenedItemStreamReader;
import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoP.*;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class ItemReadersBlocoPConfig {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    @Lazy
    public ItemStreamReader<RegP001> regP001ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegP001.class);
    }

    @Bean
    @Lazy
    public ItemStreamReader<RegP010> regP010ItemReader() {
        ItemStreamReader<RegP010> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegP010.class, RegP001.class);

        return new KeepOpenedItemStreamReader<RegP010>(itemReader);
    }

    @Bean
    @Lazy
    public ItemStreamReader<RegP100> regP100ItemReader() {
        ItemStreamReader<RegP100> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegP100.class, RegP010.class);

        return new KeepOpenedItemStreamReader<RegP100>(itemReader);
    }

    @Bean
    @Lazy
    public ItemStreamReader<RegP110> regP110ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegP110.class, RegP100.class);
    }

    @Bean
    @Lazy
    public ItemStreamReader<RegP199> regP199ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegP199.class, RegP100.class);
    }

    @Bean
    @Lazy
    public ItemStreamReader<RegP200> regP200ItemReader() {
        ItemStreamReader<RegP200> itemReader = itemReaderFactory
                .createJdbcCursorItemReader(RegP200.class, RegP001.class);

        return new KeepOpenedItemStreamReader<RegP200>(itemReader);
    }

    @Bean
    @Lazy
    public ItemStreamReader<RegP210> regP210ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(RegP210.class, RegP200.class);
    }
}
