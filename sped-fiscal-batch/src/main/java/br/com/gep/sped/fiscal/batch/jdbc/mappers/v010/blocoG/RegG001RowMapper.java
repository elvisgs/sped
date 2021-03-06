package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoG;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoG.RegG001;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegG001RowMapper implements RowMapper<RegG001> {

    @Override
    public RegG001 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegG001 reg = new RegG001();
        reg.setId(rs.getInt("id"));
        reg.setIndMov(rs.getString("ind_mov"));
        return reg;
    }
}
