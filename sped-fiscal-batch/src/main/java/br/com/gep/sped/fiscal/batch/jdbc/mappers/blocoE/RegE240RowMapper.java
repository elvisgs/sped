package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.blocoE.RegE240;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegE240RowMapper implements RowMapper<RegE240> {

    @Override
    public RegE240 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE240 reg = new RegE240();
        reg.setId(rs.getInt("id"));
        reg.setCodPart(rs.getString("cod_part"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setSer(rs.getString("ser"));
        reg.setSub(rs.getString("sub"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setVlAjItem(rs.getObject("vl_aj_item") == null ? null : rs.getDouble("vl_aj_item"));
        return reg;
    }
}
