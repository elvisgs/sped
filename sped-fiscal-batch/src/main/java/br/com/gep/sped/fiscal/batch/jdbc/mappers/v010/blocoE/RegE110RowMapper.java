package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoE.RegE110;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegE110RowMapper implements RowMapper<RegE110> {

    @Override
    public RegE110 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE110 reg = new RegE110();
        reg.setId(rs.getInt("id"));
        reg.setVlTotDebitos(rs.getObject("vl_tot_debitos") == null ? null : rs.getDouble("vl_tot_debitos"));
        reg.setVlAjDebitos(rs.getObject("vl_aj_debitos") == null ? null : rs.getDouble("vl_aj_debitos"));
        reg.setVlTotAjDebitos(rs.getObject("vl_tot_aj_debitos") == null ? null : rs.getDouble("vl_tot_aj_debitos"));
        reg.setVlEstornosCred(rs.getObject("vl_estornos_cred") == null ? null : rs.getDouble("vl_estornos_cred"));
        reg.setVlTotCreditos(rs.getObject("vl_tot_creditos") == null ? null : rs.getDouble("vl_tot_creditos"));
        reg.setVlAjCreditos(rs.getObject("vl_aj_creditos") == null ? null : rs.getDouble("vl_aj_creditos"));
        reg.setVlTotAjCreditos(rs.getObject("vl_tot_aj_creditos") == null ? null : rs.getDouble("vl_tot_aj_creditos"));
        reg.setVlEstornosDeb(rs.getObject("vl_estornos_deb") == null ? null : rs.getDouble("vl_estornos_deb"));
        reg.setVlSldCredorAnt(rs.getObject("vl_sld_credor_ant") == null ? null : rs.getDouble("vl_sld_credor_ant"));
        reg.setVlSldApurado(rs.getObject("vl_sld_apurado") == null ? null : rs.getDouble("vl_sld_apurado"));
        reg.setVlTotDed(rs.getObject("vl_tot_ded") == null ? null : rs.getDouble("vl_tot_ded"));
        reg.setVlIcmsRecolher(rs.getObject("vl_icms_recolher") == null ? null : rs.getDouble("vl_icms_recolher"));
        reg.setVlSldCredorTransportar(rs.getObject("vl_sld_credor_transportar") == null ? null : rs.getDouble("vl_sld_credor_transportar"));
        reg.setDebEsp(rs.getObject("deb_esp") == null ? null : rs.getDouble("deb_esp"));
        return reg;
    }
}
