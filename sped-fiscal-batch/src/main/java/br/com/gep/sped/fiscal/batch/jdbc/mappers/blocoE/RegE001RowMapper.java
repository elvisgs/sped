package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.blocoE.RegE001;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegE001RowMapper implements RowMapper<RegE001> {

    @Override
    public RegE001 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE001 reg = new RegE001();
        reg.setId(rs.getInt("id"));
        reg.setIndMov(rs.getString("ind_mov"));
        return reg;
    }
}
