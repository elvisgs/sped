package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC700;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC700RowMapper implements RowMapper<RegC700> {

    @Override
    public RegC700 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC700 reg = new RegC700();
        reg.setId(rs.getInt("id"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setSer(rs.getString("ser"));
        reg.setNroOrdIni(rs.getString("nro_ord_ini"));
        reg.setNroOrdFin(rs.getString("nro_ord_fin"));
        reg.setDtDocIni(rs.getDate("dt_doc_ini"));
        reg.setDtDocFin(rs.getDate("dt_doc_fin"));
        reg.setNomMest(rs.getString("nom_mest"));
        reg.setChvCodDig(rs.getString("chv_cod_dig"));
        return reg;
    }
}
