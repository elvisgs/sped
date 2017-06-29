package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.bloco1.Reg1920;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1920RowMapper implements RowMapper<Reg1920> {

    @Override
    public Reg1920 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1920 reg = new Reg1920();
        reg.setId(rs.getInt("id"));
        reg.setVlTotTransfDebitosOa(rs.getObject("vl_tot_transf_debitos_oa") == null ? null : rs.getDouble("vl_tot_transf_debitos_oa"));
        reg.setVlTotAjDebitosOa(rs.getObject("vl_tot_aj_debitos_oa") == null ? null : rs.getDouble("vl_tot_aj_debitos_oa"));
        reg.setVlEstornosCredOa(rs.getObject("vl_estornos_cred_oa") == null ? null : rs.getDouble("vl_estornos_cred_oa"));
        reg.setVlTotTransfCreditosOa(rs.getObject("vl_tot_transf_creditos_oa") == null ? null : rs.getDouble("vl_tot_transf_creditos_oa"));
        reg.setVlTotAjCreditosOa(rs.getObject("vl_tot_aj_creditos_oa") == null ? null : rs.getDouble("vl_tot_aj_creditos_oa"));
        reg.setVlEstornosDebOa(rs.getObject("vl_estornos_deb_oa") == null ? null : rs.getDouble("vl_estornos_deb_oa"));
        reg.setVlSldCredorAntOa(rs.getObject("vl_sld_credor_ant_oa") == null ? null : rs.getDouble("vl_sld_credor_ant_oa"));
        reg.setVlSldApuradoOa(rs.getObject("vl_sld_apurado_oa") == null ? null : rs.getDouble("vl_sld_apurado_oa"));
        reg.setVlTotDed(rs.getObject("vl_tot_ded") == null ? null : rs.getDouble("vl_tot_ded"));
        reg.setVlIcmsRecolherOa(rs.getObject("vl_icms_recolher_oa") == null ? null : rs.getDouble("vl_icms_recolher_oa"));
        reg.setVlSldCredorTranspOa(rs.getObject("vl_sld_credor_transp_oa") == null ? null : rs.getDouble("vl_sld_credor_transp_oa"));
        reg.setDebEspOa(rs.getObject("deb_esp_oa") == null ? null : rs.getDouble("deb_esp_oa"));
        return reg;
    }
}
