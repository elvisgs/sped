package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoG;

import br.com.gep.sped.fiscal.marshaller.registros.blocoG.RegG001;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegG001RowMapper implements RowMapper<RegG001> {

    @Override
    public RegG001 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegG001 reg = new RegG001();
        reg.setId(rs.getInt("id"));
        reg.setIndMov(rs.getString("ind_mov"));
        return reg;
    }
}
