package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.blocoE.RegE210;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegE210RowMapper implements RowMapper<RegE210> {

    @Override
    public RegE210 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE210 reg = new RegE210();
        reg.setId(rs.getInt("id"));
        reg.setIndMovSt(rs.getString("ind_mov_st"));
        reg.setVlSldCredAntSt(rs.getObject("vl_sld_cred_ant_st") == null ? null : rs.getDouble("vl_sld_cred_ant_st"));
        reg.setVlDevolSt(rs.getObject("vl_devol_st") == null ? null : rs.getDouble("vl_devol_st"));
        reg.setVlRessarcSt(rs.getObject("vl_ressarc_st") == null ? null : rs.getDouble("vl_ressarc_st"));
        reg.setVlOutCredSt(rs.getObject("vl_out_cred_st") == null ? null : rs.getDouble("vl_out_cred_st"));
        reg.setVlAjCreditosSt(rs.getObject("vl_aj_creditos_st") == null ? null : rs.getDouble("vl_aj_creditos_st"));
        reg.setVlRetencaoSt(rs.getObject("vl_retencao_st") == null ? null : rs.getDouble("vl_retencao_st"));
        reg.setVlOutDebSt(rs.getObject("vl_out_deb_st") == null ? null : rs.getDouble("vl_out_deb_st"));
        reg.setVlAjDebitosSt(rs.getObject("vl_aj_debitos_st") == null ? null : rs.getDouble("vl_aj_debitos_st"));
        reg.setVlSldDevAntSt(rs.getObject("vl_sld_dev_ant_st") == null ? null : rs.getDouble("vl_sld_dev_ant_st"));
        reg.setVlDeducoesSt(rs.getObject("vl_deducoes_st") == null ? null : rs.getDouble("vl_deducoes_st"));
        reg.setVlIcmsRecolSt(rs.getObject("vl_icms_recol_st") == null ? null : rs.getDouble("vl_icms_recol_st"));
        reg.setVlSldCredStTransportar(rs.getObject("vl_sld_cred_st_transportar") == null ? null : rs.getDouble("vl_sld_cred_st_transportar"));
        reg.setDebEspSt(rs.getObject("deb_esp_st") == null ? null : rs.getDouble("deb_esp_st"));
        return reg;
    }
}
