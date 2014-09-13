package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC170;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC170RowMapper implements RowMapper<RegC170> {

    @Override
    public RegC170 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC170 reg = new RegC170();
        reg.setId(rs.getInt("id"));
        reg.setNumItem(rs.getString("num_item"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setDescrCompl(rs.getString("descr_compl"));
        reg.setQtd(rs.getObject("qtd") == null ? null : rs.getDouble("qtd"));
        reg.setUnid(rs.getString("unid"));
        reg.setVlItem(rs.getObject("vl_item") == null ? null : rs.getDouble("vl_item"));
        reg.setVlDesc(rs.getObject("vl_desc") == null ? null : rs.getDouble("vl_desc"));
        reg.setIndMov(rs.getString("ind_mov"));
        reg.setCstIcms(rs.getString("cst_icms"));
        reg.setCfop(rs.getString("cfop"));
        reg.setCodNat(rs.getString("cod_nat"));
        reg.setVlBcIcms(rs.getObject("vl_bc_icms") == null ? null : rs.getDouble("vl_bc_icms"));
        reg.setAliqIcms(rs.getObject("aliq_icms") == null ? null : rs.getDouble("aliq_icms"));
        reg.setVlIcms(rs.getObject("vl_icms") == null ? null : rs.getDouble("vl_icms"));
        reg.setVlBcIcmsSt(rs.getObject("vl_bc_icms_st") == null ? null : rs.getDouble("vl_bc_icms_st"));
        reg.setAliqSt(rs.getObject("aliq_st") == null ? null : rs.getDouble("aliq_st"));
        reg.setVlIcmsSt(rs.getObject("vl_icms_st") == null ? null : rs.getDouble("vl_icms_st"));
        reg.setIndApur(rs.getString("ind_apur"));
        reg.setCstIpi(rs.getString("cst_ipi"));
        reg.setCodEnq(rs.getString("cod_enq"));
        reg.setVlBcIpi(rs.getObject("vl_bc_ipi") == null ? null : rs.getDouble("vl_bc_ipi"));
        reg.setAliqIpi(rs.getObject("aliq_ipi") == null ? null : rs.getDouble("aliq_ipi"));
        reg.setVlIpi(rs.getObject("vl_ipi") == null ? null : rs.getDouble("vl_ipi"));
        reg.setCstPis(rs.getString("cst_pis"));
        reg.setVlBcPis(rs.getObject("vl_bc_pis") == null ? null : rs.getDouble("vl_bc_pis"));
        reg.setAliqPis(rs.getObject("aliq_pis") == null ? null : rs.getDouble("aliq_pis"));
        reg.setQuantBcPis(rs.getObject("quant_bc_pis") == null ? null : rs.getDouble("quant_bc_pis"));
        reg.setAliqPisQuant(rs.getObject("aliq_pis_quant") == null ? null : rs.getDouble("aliq_pis_quant"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setCstCofins(rs.getString("cst_cofins"));
        reg.setVlBcCofins(rs.getObject("vl_bc_cofins") == null ? null : rs.getDouble("vl_bc_cofins"));
        reg.setAliqCofins(rs.getObject("aliq_cofins") == null ? null : rs.getDouble("aliq_cofins"));
        reg.setQuantBcCofins(rs.getObject("quant_bc_cofins") == null ? null : rs.getDouble("quant_bc_cofins"));
        reg.setAliqCofinsQuant(rs.getObject("aliq_cofins_quant") == null ? null : rs.getDouble("aliq_cofins_quant"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        reg.setCodCta(rs.getString("cod_cta"));
        return reg;
    }
}
