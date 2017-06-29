package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM350;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegM350RowMapper implements RowMapper<RegM350> {

    @Override
    public RegM350 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM350 reg = new RegM350();
        reg.setId(rs.getInt("id"));
        reg.setVlTotFol(rs.getObject("vl_tot_fol") == null ? null : rs.getDouble("vl_tot_fol"));
        reg.setVlExcBc(rs.getObject("vl_exc_bc") == null ? null : rs.getDouble("vl_exc_bc"));
        reg.setVlTotBc(rs.getObject("vl_tot_bc") == null ? null : rs.getDouble("vl_tot_bc"));
        reg.setAliqPisFol(rs.getObject("aliq_pis_fol") == null ? null : rs.getDouble("aliq_pis_fol"));
        reg.setVlTotContFol(rs.getObject("vl_tot_cont_fol") == null ? null : rs.getDouble("vl_tot_cont_fol"));
        return reg;
    }
}
