package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.bloco1.Reg1100;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reg1100RowMapper implements RowMapper<Reg1100> {

    @Override
    public Reg1100 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1100 reg = new Reg1100();
        reg.setId(rs.getInt("id"));
        reg.setIndDoc(rs.getString("ind_doc"));
        reg.setNroDe(rs.getString("nro_de"));
        reg.setDtDe(rs.getDate("dt_de"));
        reg.setNatExp(rs.getString("nat_exp"));
        reg.setNroRe(rs.getString("nro_re"));
        reg.setDtRe(rs.getDate("dt_re"));
        reg.setChcEmb(rs.getString("chc_emb"));
        reg.setDtChc(rs.getDate("dt_chc"));
        reg.setDtAvb(rs.getDate("dt_avb"));
        reg.setTpChc(rs.getString("tp_chc"));
        reg.setPais(rs.getString("pais"));
        return reg;
    }
}
