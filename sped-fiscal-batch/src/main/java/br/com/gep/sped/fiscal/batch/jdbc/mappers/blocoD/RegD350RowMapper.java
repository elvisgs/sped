package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD350;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegD350RowMapper implements RowMapper<RegD350> {

    @Override
    public RegD350 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD350 reg = new RegD350();
        reg.setId(rs.getInt("id"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setEcfMod(rs.getString("ecf_mod"));
        reg.setEcfFab(rs.getString("ecf_fab"));
        reg.setEcfCx(rs.getString("ecf_cx"));
        return reg;
    }
}