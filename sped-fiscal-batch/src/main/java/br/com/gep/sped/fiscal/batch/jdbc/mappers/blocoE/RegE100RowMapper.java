package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.blocoE.RegE100;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegE100RowMapper implements RowMapper<RegE100> {

    @Override
    public RegE100 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE100 reg = new RegE100();
        reg.setId(rs.getInt("id"));
        reg.setDtIni(rs.getDate("dt_ini"));
        reg.setDtFin(rs.getDate("dt_fin"));
        return reg;
    }
}
