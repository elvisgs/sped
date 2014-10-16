package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoH;

import br.com.gep.sped.fiscal.marshaller.registros.blocoH.RegH020;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegH020RowMapper implements RowMapper<RegH020> {

    @Override
    public RegH020 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegH020 reg = new RegH020();
        reg.setId(rs.getInt("id"));
        reg.setCstIcms(rs.getString("cst_icms"));
        reg.setBlIcms(rs.getObject("bl_icms") == null ? null : rs.getDouble("bl_icms"));
        reg.setVlIcms(rs.getObject("vl_icms") == null ? null : rs.getDouble("vl_icms"));
        return reg;
    }
}
