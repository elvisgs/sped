package br.com.gep.sped.contrib.batch.config.readers;

import br.com.gep.sped.contrib.batch.common.KeepOpenedItemStreamReader;
import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.spedcontrib.arquivo.registros.bloco0.*;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class ItemReadersBloco0Config {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    public ItemStreamReader<Reg0000> reg0000ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0000.class);
    }

    @Bean
    public ItemStreamReader<Reg0001> reg0001ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0001.class);
    }

    @Bean
    public ItemStreamReader<Reg0035> reg0035ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0035.class, Reg0001.class);
    }

    @Bean
    public ItemStreamReader<Reg0100> reg0100ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0100.class, Reg0001.class);
    }

    @Bean
    public ItemStreamReader<Reg0110> reg0110ItemReader() {
        // TODO: verificar porque a coluna ind_reg_cum não existe
        ItemStreamReader<Reg0110> reader = itemReaderFactory
                .createJdbcCursorItemReader(Reg0110.class, Reg0001.class);

        return new KeepOpenedItemStreamReader<Reg0110>(reader);
    }

    @Bean
    public ItemStreamReader<Reg0111> reg0111ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0111.class, Reg0110.class);
    }

    @Bean
    public ItemStreamReader<Reg0120> reg0120ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0120.class, Reg0001.class);
    }

    @Bean
    public ItemStreamReader<Reg0140> reg0140ItemReader() {
        ItemStreamReader<Reg0140> reader = itemReaderFactory.createJdbcCursorItemReader(Reg0140.class, Reg0001.class);
        return new KeepOpenedItemStreamReader<Reg0140>(reader);
    }

    @Bean
    public ItemStreamReader<Reg0145> reg0145ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0145.class, Reg0140.class);
    }

    @Bean
    public ItemStreamReader<Reg0150> reg0150ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0150.class, Reg0140.class);
    }

    @Bean
    public ItemStreamReader<Reg0190> reg0190ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0190.class, Reg0140.class);
    }

    @Bean
    public ItemStreamReader<Reg0200> reg0200ItemReader() {
        ItemStreamReader<Reg0200> reader = itemReaderFactory
                .createJdbcCursorItemReader(Reg0200.class, Reg0140.class);

        return new KeepOpenedItemStreamReader<Reg0200>(reader);
    }

    @Bean
    public ItemStreamReader<Reg0205> reg0205ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0205.class, Reg0200.class);
    }

    @Bean
    public ItemStreamReader<Reg0206> reg0206ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0206.class, Reg0200.class);
    }

    @Bean
    public ItemStreamReader<Reg0208> reg0208ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0208.class, Reg0200.class);
    }

    @Bean
    public ItemStreamReader<Reg0400> reg0400ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0400.class, Reg0140.class);
    }

    @Bean
    public ItemStreamReader<Reg0450> reg0450ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0450.class, Reg0140.class);
    }

    @Bean
    public ItemStreamReader<Reg0500> reg0500ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0500.class, Reg0001.class);
    }

    @Bean
    public ItemStreamReader<Reg0600> reg0600ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0600.class, Reg0001.class);
    }
}