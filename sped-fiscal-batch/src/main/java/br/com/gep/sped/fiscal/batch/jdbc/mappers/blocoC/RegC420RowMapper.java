package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC420;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC420RowMapper implements RowMapper<RegC420> {

    @Override
    public RegC420 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC420 reg = new RegC420();
        reg.setId(rs.getInt("id"));
        reg.setCodTotPar(rs.getString("cod_tot_par"));
        reg.setVlrAcumTot(rs.getObject("vlr_acum_tot") == null ? null : rs.getDouble("vlr_acum_tot"));
        reg.setNrTot(rs.getString("nr_tot"));
        reg.setDescrNrTot(rs.getString("descr_nr_tot"));
        return reg;
    }
}
