package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.contrib.marshaller.registros.blocoD.RegD010;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegD010RowMapper implements RowMapper<RegD010> {

    @Override
    public RegD010 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD010 reg = new RegD010();
        reg.setId(rs.getInt("id"));
        reg.setCnpj(rs.getString("cnpj"));
        return reg;
    }
}
