package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC141;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC141RowMapper implements RowMapper<RegC141> {

    @Override
    public RegC141 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC141 reg = new RegC141();
        reg.setId(rs.getInt("id"));
        reg.setNumParc(rs.getString("num_parc"));
        reg.setDtVcto(rs.getDate("dt_vcto"));
        reg.setVlParc(rs.getObject("vl_parc") == null ? null : rs.getDouble("vl_parc"));
        return reg;
    }
}
