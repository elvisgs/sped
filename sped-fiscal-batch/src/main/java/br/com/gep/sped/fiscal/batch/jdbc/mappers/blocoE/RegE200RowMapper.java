package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.blocoE.RegE200;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegE200RowMapper implements RowMapper<RegE200> {

    @Override
    public RegE200 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE200 reg = new RegE200();
        reg.setId(rs.getInt("id"));
        reg.setUf(rs.getString("uf"));
        reg.setDtIni(rs.getDate("dt_ini"));
        reg.setDtFin(rs.getDate("dt_fin"));
        return reg;
    }
}
