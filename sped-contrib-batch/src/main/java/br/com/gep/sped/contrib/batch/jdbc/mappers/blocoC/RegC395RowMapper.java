package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC395;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC395RowMapper implements RowMapper<RegC395> {

    @Override
    public RegC395 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC395 reg = new RegC395();
        reg.setId(rs.getInt("id"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setCodPart(rs.getString("cod_part"));
        reg.setSer(rs.getString("ser"));
        reg.setSubSer(rs.getString("sub_ser"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setVlDoc(rs.getObject("vl_doc") == null ? null : rs.getDouble("vl_doc"));
        return reg;
    }
}
