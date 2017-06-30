package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoH;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoH.RegH020;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
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
