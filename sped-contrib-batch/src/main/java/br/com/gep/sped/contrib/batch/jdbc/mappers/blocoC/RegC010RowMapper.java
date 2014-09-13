package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC010;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC010RowMapper implements RowMapper<RegC010> {

    @Override
    public RegC010 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC010 reg = new RegC010();
        reg.setId(rs.getInt("id"));
        reg.setCnpj(rs.getString("cnpj"));
        reg.setIndEscri(rs.getString("ind_escri"));
        return reg;
    }
}
