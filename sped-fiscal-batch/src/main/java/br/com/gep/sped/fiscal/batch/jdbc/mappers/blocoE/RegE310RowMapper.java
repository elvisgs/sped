package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.blocoE.RegE310;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegE310RowMapper implements RowMapper<RegE310> {

    @Override
    public RegE310 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE310 reg = new RegE310();
        reg.setId(rs.getInt("id"));
        reg.setIndMovDifal(rs.getString("ind_mov_difal"));
        reg.setVlSldCredAntDifal(rs.getObject("vl_sld_cred_ant_difal") == null ? null : rs.getDouble("vl_sld_cred_ant_difal"));
        reg.setVlTotDebitosDifal(rs.getObject("vl_tot_debitos_difal") == null ? null : rs.getDouble("vl_tot_debitos_difal"));
        reg.setVlOutDebDifal(rs.getObject("vl_out_deb_difal") == null ? null : rs.getDouble("vl_out_deb_difal"));
        reg.setVlTotDebFcp(rs.getObject("vl_tot_deb_fcp") == null ? null : rs.getDouble("vl_tot_deb_fcp"));
        reg.setVlTotCreditosDifal(rs.getObject("vl_tot_creditos_difal") == null ? null : rs.getDouble("vl_tot_creditos_difal"));
        reg.setVlTotCredFcp(rs.getObject("vl_tot_cred_fcp") == null ? null : rs.getDouble("vl_tot_cred_fcp"));
        reg.setVlOutCredDifal(rs.getObject("vl_out_cred_difal") == null ? null : rs.getDouble("vl_out_cred_difal"));
        reg.setVlSldDevAntDifal(rs.getObject("vl_sld_dev_ant_difal") == null ? null : rs.getDouble("vl_sld_dev_ant_difal"));
        reg.setVlDeducoesDifal(rs.getObject("vl_deducoes_difal") == null ? null : rs.getDouble("vl_deducoes_difal"));
        reg.setVlRecol(rs.getObject("vl_recol") == null ? null : rs.getDouble("vl_recol"));
        reg.setVlSldCredTransportar(rs.getObject("vl_sld_cred_transportar") == null ? null : rs.getDouble("vl_sld_cred_transportar"));
        reg.setDebEspDifal(rs.getObject("deb_esp_difal") == null ? null : rs.getDouble("deb_esp_difal"));
        return reg;
    }
}
