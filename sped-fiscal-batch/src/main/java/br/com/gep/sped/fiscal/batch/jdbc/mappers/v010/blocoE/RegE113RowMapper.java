package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoE.RegE113;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegE113RowMapper implements RowMapper<RegE113> {

    @Override
    public RegE113 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE113 reg = new RegE113();
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
