package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC601;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC601RowMapper implements RowMapper<RegC601> {

    @Override
    public RegC601 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC601 reg = new RegC601();
        reg.setId(rs.getInt("id"));
        reg.setNumDocCanc(rs.getString("num_doc_canc"));
        return reg;
    }
}
