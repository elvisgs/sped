package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoI;

import br.com.gep.sped.contrib.marshaller.registros.blocoI.RegI299;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegI299RowMapper implements RowMapper<RegI299> {

    @Override
    public RegI299 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegI299 reg = new RegI299();
        reg.setId(rs.getInt("id"));
        reg.setNumProc(rs.getString("num_proc"));
        reg.setIndProc(rs.getString("ind_proc"));
        return reg;
    }
}
