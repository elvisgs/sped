package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.blocoE.RegE520;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegE520RowMapper implements RowMapper<RegE520> {

    @Override
    public RegE520 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE520 reg = new RegE520();
        reg.setId(rs.getInt("id"));
        reg.setVlSdAntIpi(rs.getObject("vl_sd_ant_ipi") == null ? null : rs.getDouble("vl_sd_ant_ipi"));
        reg.setVlDebIpi(rs.getObject("vl_deb_ipi") == null ? null : rs.getDouble("vl_deb_ipi"));
        reg.setVlCredIpi(rs.getObject("vl_cred_ipi") == null ? null : rs.getDouble("vl_cred_ipi"));
        reg.setVlOdIpi(rs.getObject("vl_od_ipi") == null ? null : rs.getDouble("vl_od_ipi"));
        reg.setVlOcIpi(rs.getObject("vl_oc_ipi") == null ? null : rs.getDouble("vl_oc_ipi"));
        reg.setVlScIpi(rs.getObject("vl_sc_ipi") == null ? null : rs.getDouble("vl_sc_ipi"));
        reg.setVlSdIpi(rs.getObject("vl_sd_ipi") == null ? null : rs.getDouble("vl_sd_ipi"));
        return reg;
    }
}
