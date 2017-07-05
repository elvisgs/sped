package br.com.gep.sped.fiscal.batch.jdbc.mappers.v011.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.v011.blocoE.RegE310;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component("regE310RowMapperV011")
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
        reg.setVlTotCreditosDifal(rs.getObject("vl_tot_creditos_difal") == null ? null : rs.getDouble("vl_tot_creditos_difal"));
        reg.setVlOutCredDifal(rs.getObject("vl_out_cred_difal") == null ? null : rs.getDouble("vl_out_cred_difal"));
        reg.setVlSldDevAntDifal(rs.getObject("vl_sld_dev_ant_difal") == null ? null : rs.getDouble("vl_sld_dev_ant_difal"));
        reg.setVlDeducoesDifal(rs.getObject("vl_deducoes_difal") == null ? null : rs.getDouble("vl_deducoes_difal"));
        reg.setVlRecol(rs.getObject("vl_recol") == null ? null : rs.getDouble("vl_recol"));
        reg.setVlSldCredTransportar(rs.getObject("vl_sld_cred_transportar") == null ? null : rs.getDouble("vl_sld_cred_transportar"));
        reg.setDebEspDifal(rs.getObject("deb_esp_difal") == null ? null : rs.getDouble("deb_esp_difal"));
        reg.setVlSldCredAntFcp(rs.getObject("vl_sld_cred_ant_fcp") == null ? null : rs.getDouble("vl_sld_cred_ant_fcp"));
        reg.setVlTotDebFcp(rs.getObject("vl_tot_deb_fcp") == null ? null : rs.getDouble("vl_tot_deb_fcp"));
        reg.setVlOutDebFcp(rs.getObject("vl_out_deb_fcp") == null ? null : rs.getDouble("vl_out_deb_fcp"));
        reg.setVlTotCredFcp(rs.getObject("vl_tot_cred_fcp") == null ? null : rs.getDouble("vl_tot_cred_fcp"));
        reg.setVlOutCredFcp(rs.getObject("vl_out_cred_fcp") == null ? null : rs.getDouble("vl_out_cred_fcp"));
        reg.setVlSldDevAntFcp(rs.getObject("vl_sld_dev_ant_fcp") == null ? null : rs.getDouble("vl_sld_dev_ant_fcp"));
        reg.setVlDeducoesFcp(rs.getObject("vl_deducoes_fcp") == null ? null : rs.getDouble("vl_deducoes_fcp"));
        reg.setVlRecolFcp(rs.getObject("vl_recol_fcp") == null ? null : rs.getDouble("vl_recol_fcp"));
        reg.setVlSldCredTransportarFcp(rs.getObject("vl_sld_cred_transportar_fcp") == null ? null : rs.getDouble("vl_sld_cred_transportar_fcp"));
        reg.setDebEspFcp(rs.getObject("deb_esp_fcp") == null ? null : rs.getDouble("deb_esp_fcp"));
        return reg;
    }
}
