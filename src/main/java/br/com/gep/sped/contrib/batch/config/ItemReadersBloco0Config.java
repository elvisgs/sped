package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.contrib.batch.common.ItemReaderFactory;
import br.com.gep.sped.contrib.batch.common.Selects;
import br.com.gep.spedcontrib.arquivo.registros.bloco0.Reg0000;
import br.com.gep.spedcontrib.arquivo.registros.bloco0.Reg0140;
import br.com.gep.spedcontrib.arquivo.registros.blocoA.RegA010;
import br.com.gep.spedcontrib.arquivo.registros.blocoA.RegA100;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.PreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class ItemReadersBloco0Config {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    public ItemReader<Reg0000> reg0000ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0000.class);
    }

    @Bean
    public ItemReader<Reg0140> reg0140ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0140.class);
    }
}