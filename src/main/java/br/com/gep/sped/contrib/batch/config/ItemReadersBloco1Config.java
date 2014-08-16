package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.spedcontrib.arquivo.registros.bloco1.*;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class ItemReadersBloco1Config {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    public ItemStreamReader<Reg1001> reg1001ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg1001.class);
    }

    @Bean
    public ItemStreamReader<Reg1010> reg1010ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg1010.class, Reg1001.class);
    }

    @Bean
    public ItemStreamReader<Reg1020> reg1020ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg1020.class, Reg1001.class);
    }

    @Bean
    public ItemStreamReader<Reg1100> reg1100ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg1100.class, Reg1001.class);
    }

    @Bean
    public ItemStreamReader<Reg1300> reg1300ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg1300.class, Reg1001.class);
    }

    @Bean
    public ItemStreamReader<Reg1500> reg1500ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg1500.class, Reg1001.class);
    }

    @Bean
    public ItemStreamReader<Reg1700> reg1700ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg1700.class, Reg1001.class);
    }

    @Bean
    public ItemStreamReader<Reg1800> reg1800ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg1800.class, Reg1001.class);
    }

    @Bean
    public ItemStreamReader<Reg1900> reg1900ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg1900.class);
    }
}
