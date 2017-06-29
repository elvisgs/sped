package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC116;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC116RowMapper implements RowMapper<RegC116> {

    @Override
    public RegC116 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC116 reg = new RegC116();
        reg.setId(rs.getInt("id"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setNrSat(rs.getString("nr_sat"));
        reg.setChvCfe(rs.getString("chv_cfe"));
        reg.setNumCfe(rs.getString("num_cfe"));
        reg.setDtDoc(rs.getString("dt_doc"));
        return reg;
    }
}
