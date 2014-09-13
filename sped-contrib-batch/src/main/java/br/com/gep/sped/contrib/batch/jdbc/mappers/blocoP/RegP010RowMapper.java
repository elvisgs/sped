package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoP;

import br.com.gep.sped.contrib.marshaller.registros.blocoP.RegP010;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegP010RowMapper implements RowMapper<RegP010> {

    @Override
    public RegP010 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegP010 reg = new RegP010();
        reg.setId(rs.getInt("id"));
        reg.setCnpj(rs.getString("cnpj"));
        return reg;
    }
}
