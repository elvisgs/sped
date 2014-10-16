package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD697;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegD697RowMapper implements RowMapper<RegD697> {

    @Override
    public RegD697 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD697 reg = new RegD697();
        reg.setId(rs.getInt("id"));
        reg.setUf(rs.getString("uf"));
        reg.setVlBcIcmsSt(rs.getObject("vl_bc_icms_st") == null ? null : rs.getDouble("vl_bc_icms_st"));
        reg.setVlIcmsSt(rs.getObject("vl_icms_st") == null ? null : rs.getDouble("vl_icms_st"));
        return reg;
    }
}
