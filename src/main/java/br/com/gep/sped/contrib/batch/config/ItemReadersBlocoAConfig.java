package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.contrib.batch.common.ItemReaderFactory;
import br.com.gep.sped.contrib.batch.common.KeepOpenedItemStreamReader;
import br.com.gep.sped.contrib.batch.common.ParentIdStatementSetter;
import br.com.gep.sped.contrib.batch.common.RegIdHolder;
import br.com.gep.spedcontrib.arquivo.registros.blocoA.*;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.PreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class ItemReadersBlocoAConfig {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Bean
    public ItemReader<RegA001> regA001ItemReader() {
        return itemReaderFactory.createJdbcCursorItemReader(
                RegA001.class,
                "SELECT id, ind_mov FROM @schema@.pis_a001");
    }

    @Bean
    public ItemStreamReader<RegA010> regA010ItemReader() {
        JdbcCursorItemReader<RegA010> jdbcCursorItemReader = itemReaderFactory.createJdbcCursorItemReader(
                RegA010.class,
                "SELECT id, cnpj FROM @schema@.pis_a010");

        return new KeepOpenedItemStreamReader<RegA010>(jdbcCursorItemReader);
    }

    @Bean
    public ItemStreamReader<RegA100> regA100ItemReader() {
        JdbcCursorItemReader<RegA100> itemReader = itemReaderFactory.createJdbcCursorItemReader(
                RegA100.class, RegA010.class,
                "SELECT id, ind_oper, ind_emit, cod_part, cod_sit, ser, sub, " +
                        "num_doc, chv_nfse, dt_doc, dt_exe_serv, vl_doc, ind_pgto, vl_desc, " +
                        "vl_bc_pis, vl_pis, vl_bc_cofins, vl_cofins, vl_pis_ret, vl_cofins_ret, vl_iss " +
                        "FROM @schema@.pis_a100 where id_pai = ?");

        return new KeepOpenedItemStreamReader<RegA100>(itemReader);
    }

    @Bean
    public ItemReader<RegA110> regA110ItemReader() {
        JdbcCursorItemReader<RegA110> itemReader = itemReaderFactory.createJdbcCursorItemReader(
                RegA110.class, RegA100.class,
                "SELECT id, cod_inf, txt_compl FROM @schema@.pis_a110 where id_pai = ?");

        return itemReader;
    }

    @Bean
    public ItemReader<RegA111> regA111ItemReader() {
        JdbcCursorItemReader<RegA111> itemReader = itemReaderFactory.createJdbcCursorItemReader(
                RegA111.class, RegA100.class,
                "SELECT id, num_proc, ind_proc FROM @schema@.pis_a111 where id_pai = ?");

        return itemReader;
    }

    @Bean
    public ItemReader<RegA120> regA120ItemReader() {
        JdbcCursorItemReader<RegA120> itemReader = itemReaderFactory.createJdbcCursorItemReader(
                RegA120.class, RegA100.class,
                "SELECT id, vl_tot_serv, vl_bc_pis, vl_pis_imp, dt_pag_pis, vl_bc_cofins, " +
                        "vl_cofins_imp, dt_pag_cofins, loc_exe_serv " +
                        "FROM @schema@.pis_a120 where id_pai = ?");

        return itemReader;
    }

    @Bean
    public ItemReader<RegA170> regA170ItemReader() {
        JdbcCursorItemReader<RegA170> itemReader = itemReaderFactory.createJdbcCursorItemReader(
                RegA170.class, RegA100.class,
                "SELECT id, num_item, cod_item, descr_compl, vl_item, vl_desc, nat_bc_cred, " +
                        "ind_orig_cred, cst_pis, vl_bc_pis, aliq_pis, vl_pis, cst_cofins, " +
                        "vl_bc_cofins, aliq_cofins, vl_cofins, cod_cta, cod_ccus " +
                        "FROM @schema@.pis_a170 where id_pai = ?");

        return itemReader;
    }
}