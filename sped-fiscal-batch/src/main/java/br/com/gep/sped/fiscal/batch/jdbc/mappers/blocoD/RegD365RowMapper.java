package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD365;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegD365RowMapper implements RowMapper<RegD365> {

    @Override
    public RegD365 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD365 reg = new RegD365();
        reg.setId(rs.getInt("id"));
        reg.setCodTotPar(rs.getString("cod_tot_par"));
        reg.setVlrAcumTot(rs.getObject("vlr_acum_tot") == null ? null : rs.getDouble("vlr_acum_tot"));
        reg.setNrTot(rs.getString("nr_tot"));
        reg.setDescrNrTot(rs.getString("descr_nr_tot"));
        return reg;
    }
}
