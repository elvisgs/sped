package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.bloco1.Reg1923;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reg1923RowMapper implements RowMapper<Reg1923> {

    @Override
    public Reg1923 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1923 reg = new Reg1923();
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
