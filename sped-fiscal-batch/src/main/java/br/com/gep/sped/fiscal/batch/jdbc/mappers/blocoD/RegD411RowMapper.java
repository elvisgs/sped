package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD411;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegD411RowMapper implements RowMapper<RegD411> {

    @Override
    public RegD411 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD411 reg = new RegD411();
        reg.setId(rs.getInt("id"));
        reg.setNumDocCanc(rs.getString("num_doc_canc"));
        return reg;
    }
}
