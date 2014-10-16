package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD301;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegD301RowMapper implements RowMapper<RegD301> {

    @Override
    public RegD301 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD301 reg = new RegD301();
        reg.setId(rs.getInt("id"));
        reg.setNumDocCanc(rs.getInt("num_doc_canc"));
        return reg;
    }
}
