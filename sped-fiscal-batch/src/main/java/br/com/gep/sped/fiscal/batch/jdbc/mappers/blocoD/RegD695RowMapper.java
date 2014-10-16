package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD695;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegD695RowMapper implements RowMapper<RegD695> {

    @Override
    public RegD695 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD695 reg = new RegD695();
        reg.setId(rs.getInt("id"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setSer(rs.getString("ser"));
        reg.setNroOrdIni(rs.getInt("nro_ord_ini"));
        reg.setNroOrdFin(rs.getInt("nro_ord_fin"));
        reg.setDtDocIni(rs.getDate("dt_doc_ini"));
        reg.setDtDocFin(rs.getDate("dt_doc_fin"));
        reg.setNomMest(rs.getString("nom_mest"));
        reg.setChvCodDig(rs.getString("chv_cod_dig"));
        return reg;
    }
}
