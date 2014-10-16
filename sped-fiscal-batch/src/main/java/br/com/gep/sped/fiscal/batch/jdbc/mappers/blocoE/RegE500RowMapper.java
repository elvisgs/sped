package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.blocoE.RegE500;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegE500RowMapper implements RowMapper<RegE500> {

    @Override
    public RegE500 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE500 reg = new RegE500();
        reg.setId(rs.getInt("id"));
        reg.setIndApur(rs.getString("ind_apur"));
        reg.setDtIni(rs.getDate("dt_ini"));
        reg.setDtFin(rs.getDate("dt_fin"));
        return reg;
    }
}
