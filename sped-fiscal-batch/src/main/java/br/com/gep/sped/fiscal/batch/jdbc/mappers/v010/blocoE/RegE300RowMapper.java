package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoE.RegE300;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegE300RowMapper implements RowMapper<RegE300> {

    @Override
    public RegE300 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE300 reg = new RegE300();
        reg.setId(rs.getInt("id"));
        reg.setUf(rs.getString("uf"));
        reg.setDtIni(rs.getDate("dt_ini"));
        reg.setDtFin(rs.getDate("dt_fin"));
        return reg;
    }
}
