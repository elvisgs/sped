package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.blocoF.RegF010;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegF010RowMapper implements RowMapper<RegF010> {

    @Override
    public RegF010 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegF010 reg = new RegF010();
        reg.setId(rs.getInt("id"));
        reg.setCnpj(rs.getString("cnpj"));
        return reg;
    }
}
