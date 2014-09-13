package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.blocoF.RegF559;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegF559RowMapper implements RowMapper<RegF559> {

    @Override
    public RegF559 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegF559 reg = new RegF559();
        reg.setId(rs.getInt("id"));
        reg.setNumProc(rs.getString("num_proc"));
        reg.setIndProc(rs.getString("ind_proc"));
        return reg;
    }
}
