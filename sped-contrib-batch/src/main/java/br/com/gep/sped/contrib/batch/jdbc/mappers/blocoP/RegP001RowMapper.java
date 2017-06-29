package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoP;

import br.com.gep.sped.contrib.marshaller.registros.blocoP.RegP001;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegP001RowMapper implements RowMapper<RegP001> {

    @Override
    public RegP001 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegP001 reg = new RegP001();
        reg.setId(rs.getInt("id"));
        reg.setIndMov(rs.getString("ind_mov"));
        return reg;
    }
}
