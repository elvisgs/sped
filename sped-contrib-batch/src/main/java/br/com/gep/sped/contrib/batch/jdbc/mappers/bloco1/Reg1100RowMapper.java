package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.contrib.marshaller.registros.bloco1.Reg1100;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1100RowMapper implements RowMapper<Reg1100> {

    @Override
    public Reg1100 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1100 reg = new Reg1100();
        reg.setId(rs.getInt("id"));
        reg.setPerApuCred(rs.getString("per_apu_cred"));
        reg.setOrigCred(rs.getString("orig_cred"));
        reg.setCnpjSuc(rs.getString("cnpj_suc"));
        reg.setCodCred(rs.getString("cod_cred"));
        reg.setVlCredApu(rs.getObject("vl_cred_apu") == null ? null : rs.getDouble("vl_cred_apu"));
        reg.setVlCredExtApu(rs.getObject("vl_cred_ext_apu") == null ? null : rs.getDouble("vl_cred_ext_apu"));
        reg.setVlTotCredApu(rs.getObject("vl_tot_cred_apu") == null ? null : rs.getDouble("vl_tot_cred_apu"));
        reg.setVlCredDescPaAnt(rs.getObject("vl_cred_desc_pa_ant") == null ? null : rs.getDouble("vl_cred_desc_pa_ant"));
        reg.setVlCredPerPaAnt(rs.getObject("vl_cred_per_pa_ant") == null ? null : rs.getDouble("vl_cred_per_pa_ant"));
        reg.setVlCredDcompPaAnt(rs.getObject("vl_cred_dcomp_pa_ant") == null ? null : rs.getDouble("vl_cred_dcomp_pa_ant"));
        reg.setSdCredDispEfd(rs.getObject("sd_cred_disp_efd") == null ? null : rs.getDouble("sd_cred_disp_efd"));
        reg.setVlCredDescEfd(rs.getObject("vl_cred_desc_efd") == null ? null : rs.getDouble("vl_cred_desc_efd"));
        reg.setVlCredPerEfd(rs.getObject("vl_cred_per_efd") == null ? null : rs.getDouble("vl_cred_per_efd"));
        reg.setVlCredDcompEfd(rs.getObject("vl_cred_dcomp_efd") == null ? null : rs.getDouble("vl_cred_dcomp_efd"));
        reg.setVlCredTrans(rs.getObject("vl_cred_trans") == null ? null : rs.getDouble("vl_cred_trans"));
        reg.setVlCredOut(rs.getObject("vl_cred_out") == null ? null : rs.getDouble("vl_cred_out"));
        reg.setSldCredFim(rs.getObject("sld_cred_fim") == null ? null : rs.getDouble("sld_cred_fim"));
        return reg;
    }
}
