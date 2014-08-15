package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.contrib.batch.common.ItemReaderFactory;
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
        return itemReaderFactory.createJdbcCursorItemReader(Reg0000.class,
                "SELECT cod_ver, tipo_escrit, ind_sit_esp, num_rec_anterior, dt_ini, dt_fin, nome, cnpj, " +
                        "uf, cod_mun, suframa, ind_nat_pj, ind_ativ " +
                "FROM @schema@.pis_0000");
    }

    @Bean
    public ItemReader<Reg0140> reg0140ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(Reg0140.class,
                "SELECT cod_est, nome, cnpj, uf, ie, cod_mun, im, suframa " +
                "FROM @schema@.pis_0140");
    }
}