package br.com.gep.sped.contrib.batch.config.readers;

import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.spedcontrib.arquivo.registros.bloco0.*;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
@Lazy
public class ItemReadersBloco0Config {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    public ItemStreamReader<Reg0000> reg0000ItemReader() {
        return itemReaderFactory.create(Reg0000.class);
    }

    @Bean
    public ItemStreamReader<Reg0001> reg0001ItemReader() {
        return itemReaderFactory.create(Reg0001.class);
    }

    @Bean
    public ItemStreamReader<Reg0035> reg0035ItemReader() {
        return itemReaderFactory.create(Reg0035.class, Reg0001.class);
    }

    @Bean
    public ItemStreamReader<Reg0100> reg0100ItemReader() {
        return itemReaderFactory.create(Reg0100.class, Reg0001.class);
    }

    @Bean
    public ItemStreamReader<Reg0110> reg0110ItemReader() {
        // TODO: verificar porque a coluna ind_reg_cum não existe
        return itemReaderFactory.create(Reg0110.class, Reg0001.class);
    }

    @Bean
    public ItemStreamReader<Reg0111> reg0111ItemReader() {
        return itemReaderFactory.create(Reg0111.class, Reg0110.class);
    }

    @Bean
    public ItemStreamReader<Reg0120> reg0120ItemReader() {
        return itemReaderFactory.create(Reg0120.class, Reg0001.class);
    }

    @Bean
    public ItemStreamReader<Reg0140> reg0140ItemReader() {
        return itemReaderFactory.create(Reg0140.class, Reg0001.class);
    }

    @Bean
    public ItemStreamReader<Reg0145> reg0145ItemReader() {
        return itemReaderFactory.create(Reg0145.class, Reg0140.class);
    }

    @Bean
    public ItemStreamReader<Reg0150> reg0150ItemReader() {
        return itemReaderFactory.create(Reg0150.class, Reg0140.class);
    }

    @Bean
    public ItemStreamReader<Reg0190> reg0190ItemReader() {
        return itemReaderFactory.create(Reg0190.class, Reg0140.class);
    }

    @Bean
    public ItemStreamReader<Reg0200> reg0200ItemReader() {
        return itemReaderFactory.create(Reg0200.class, Reg0140.class);
    }

    @Bean
    public ItemStreamReader<Reg0205> reg0205ItemReader() {
        return itemReaderFactory.create(Reg0205.class, Reg0200.class);
    }

    @Bean
    public ItemStreamReader<Reg0206> reg0206ItemReader() {
        return itemReaderFactory.create(Reg0206.class, Reg0200.class);
    }

    @Bean
    public ItemStreamReader<Reg0208> reg0208ItemReader() {
        return itemReaderFactory.create(Reg0208.class, Reg0200.class);
    }

    @Bean
    public ItemStreamReader<Reg0400> reg0400ItemReader() {
        return itemReaderFactory.create(Reg0400.class, Reg0140.class);
    }

    @Bean
    public ItemStreamReader<Reg0450> reg0450ItemReader() {
        return itemReaderFactory.create(Reg0450.class, Reg0140.class);
    }

    @Bean
    public ItemStreamReader<Reg0500> reg0500ItemReader() {
        return itemReaderFactory.create(Reg0500.class, Reg0001.class);
    }

    @Bean
    public ItemStreamReader<Reg0600> reg0600ItemReader() {
        return itemReaderFactory.create(Reg0600.class, Reg0001.class);
    }
}