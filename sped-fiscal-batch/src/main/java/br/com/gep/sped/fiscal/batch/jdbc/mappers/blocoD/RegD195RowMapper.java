package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD195;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegD195RowMapper implements RowMapper<RegD195> {

    @Override
    public RegD195 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD195 reg = new RegD195();
        reg.setId(rs.getInt("id"));
        reg.setCodObs(rs.getString("cod_obs"));
        reg.setTxtCompl(rs.getString("txt_compl"));
        return reg;
    }
}
