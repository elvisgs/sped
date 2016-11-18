package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC890;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC890RowMapper implements RowMapper<RegC890> {

    @Override
    public RegC890 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC890 reg = new RegC890();
        reg.setId(rs.getInt("id"));
        reg.setIndProc(rs.getString("ind_proc"));
        return reg;
    }
}
