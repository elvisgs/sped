package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC178;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC178RowMapper implements RowMapper<RegC178> {

    @Override
    public RegC178 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC178 reg = new RegC178();
        reg.setId(rs.getInt("id"));
        reg.setClEnq(rs.getString("cl_enq"));
        reg.setVlUnid(rs.getObject("vl_unid") == null ? null : rs.getDouble("vl_unid"));
        reg.setQuantPad(rs.getObject("quant_pad") == null ? null : rs.getDouble("quant_pad"));
        return reg;
    }
}