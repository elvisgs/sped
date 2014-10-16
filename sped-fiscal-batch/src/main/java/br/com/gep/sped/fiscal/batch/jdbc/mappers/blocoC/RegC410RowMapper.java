package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC410;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC410RowMapper implements RowMapper<RegC410> {

    @Override
    public RegC410 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC410 reg = new RegC410();
        reg.setId(rs.getInt("id"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        return reg;
    }
}
