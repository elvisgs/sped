package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.contrib.marshaller.registros.bloco1.Reg1809;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reg1809RowMapper implements RowMapper<Reg1809> {

    @Override
    public Reg1809 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1809 reg = new Reg1809();
        reg.setId(rs.getInt("id"));
        reg.setIndProc(rs.getString("ind_proc"));
        return reg;
    }
}
