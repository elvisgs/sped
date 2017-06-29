package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoK;

import br.com.gep.sped.fiscal.marshaller.registros.blocoK.RegK100;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegK100RowMapper implements RowMapper<RegK100> {

    @Override
    public RegK100 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegK100 reg = new RegK100();
        reg.setId(rs.getInt("id"));
        reg.setDtIni(rs.getDate("dt_ini"));
        reg.setDtFin(rs.getDate("dt_fin"));
        return reg;
    }
}
