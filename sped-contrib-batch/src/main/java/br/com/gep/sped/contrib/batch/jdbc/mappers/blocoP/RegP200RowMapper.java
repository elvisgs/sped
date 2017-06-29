package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoP;

import br.com.gep.sped.contrib.marshaller.registros.blocoP.RegP200;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegP200RowMapper implements RowMapper<RegP200> {

    @Override
    public RegP200 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegP200 reg = new RegP200();
        reg.setId(rs.getInt("id"));
        reg.setPerRef(rs.getString("per_ref"));
        reg.setVlTotContApu(rs.getObject("vl_tot_cont_apu") == null ? null : rs.getDouble("vl_tot_cont_apu"));
        reg.setVlTotAjReduc(rs.getObject("vl_tot_aj_reduc") == null ? null : rs.getDouble("vl_tot_aj_reduc"));
        reg.setVlTotAjAcres(rs.getObject("vl_tot_aj_acres") == null ? null : rs.getDouble("vl_tot_aj_acres"));
        reg.setVlTotContDev(rs.getObject("vl_tot_cont_dev") == null ? null : rs.getDouble("vl_tot_cont_dev"));
        reg.setCodRec(rs.getString("cod_rec"));
        return reg;
    }
}
