package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoP;

import br.com.gep.sped.contrib.marshaller.registros.blocoP.RegP199;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegP199RowMapper implements RowMapper<RegP199> {

    @Override
    public RegP199 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegP199 reg = new RegP199();
        reg.setId(rs.getInt("id"));
        reg.setNumProc(rs.getString("num_proc"));
        reg.setIndProc(rs.getString("ind_proc"));
        return reg;
    }
}
