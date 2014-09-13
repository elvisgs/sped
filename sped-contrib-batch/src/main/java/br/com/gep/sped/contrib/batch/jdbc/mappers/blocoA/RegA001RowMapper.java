package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoA;

import br.com.gep.sped.contrib.marshaller.registros.blocoA.RegA001;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegA001RowMapper implements RowMapper<RegA001> {

    @Override
    public RegA001 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegA001 reg = new RegA001();
        reg.setId(rs.getInt("id"));
        reg.setIndMov(rs.getString("ind_mov"));
        return reg;
    }
}
