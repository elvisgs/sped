package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC791;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC791RowMapper implements RowMapper<RegC791> {

    @Override
    public RegC791 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC791 reg = new RegC791();
        reg.setId(rs.getInt("id"));
        reg.setUf(rs.getString("uf"));
        reg.setVlBcIcmsSt(rs.getObject("vl_bc_icms_st") == null ? null : rs.getDouble("vl_bc_icms_st"));
        reg.setVlIcmsSt(rs.getObject("vl_icms_st") == null ? null : rs.getDouble("vl_icms_st"));
        return reg;
    }
}
