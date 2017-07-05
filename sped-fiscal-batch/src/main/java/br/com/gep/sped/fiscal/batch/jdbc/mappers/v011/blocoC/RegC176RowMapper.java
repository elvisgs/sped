package br.com.gep.sped.fiscal.batch.jdbc.mappers.v011.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v011.blocoC.RegC176;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component("regC176RowMapperV011")
@Lazy
public class RegC176RowMapper implements RowMapper<RegC176> {

    @Override
    public RegC176 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC176 reg = new RegC176();
        reg.setId(rs.getInt("id"));
        reg.setCodModUltE(rs.getString("cod_mod_ult_e"));
        reg.setNumDocUltE(rs.getString("num_doc_ult_e"));
        reg.setSerUltE(rs.getString("ser_ult_e"));
        reg.setDtUltE(rs.getDate("dt_ult_e"));
        reg.setCodPartUltE(rs.getString("cod_part_ult_e"));
        reg.setQuantUltE(rs.getObject("quant_ult_e") == null ? null : rs.getDouble("quant_ult_e"));
        reg.setVlUnitUltE(rs.getObject("vl_unit_ult_e") == null ? null : rs.getDouble("vl_unit_ult_e"));
        reg.setVlUnitBcSt(rs.getObject("vl_unit_bc_st") == null ? null : rs.getDouble("vl_unit_bc_st"));
        reg.setChaveNfeUltE(rs.getString("chave_nfe_ult_e"));
        reg.setNumItemUltE(rs.getString("num_item_ult_e"));
        reg.setVlUnitBcIcmsUltE(rs.getObject("vl_unit_bc_icms_ult_e") == null ? null : rs.getDouble("vl_unit_bc_icms_ult_e"));
        reg.setAliqIcmsUltE(rs.getObject("aliq_icms_ult_e") == null ? null : rs.getDouble("aliq_icms_ult_e"));
        reg.setVlUnitLimiteBcIcmsUltE(rs.getObject("vl_unit_limite_bc_icms_ult_e") == null ? null : rs.getDouble("vl_unit_limite_bc_icms_ult_e"));
        reg.setVlUnitIcmsUltE(rs.getObject("vl_unit_icms_ult_e") == null ? null : rs.getDouble("vl_unit_icms_ult_e"));
        reg.setAliqStUltE(rs.getObject("aliq_st_ult_e") == null ? null : rs.getDouble("aliq_st_ult_e"));
        reg.setVlUnitRes(rs.getObject("vl_unit_res") == null ? null : rs.getDouble("vl_unit_res"));
        reg.setCodRespRet(rs.getString("cod_resp_ret"));
        reg.setCodMotRes(rs.getString("cod_mot_res"));
        reg.setChaveNfeRet(rs.getString("chave_nfe_ret"));
        reg.setCodPartNfeRet(rs.getString("cod_part_nfe_ret"));
        reg.setSerNfeRet(rs.getString("ser_nfe_ret"));
        reg.setNumNfeRet(rs.getString("num_nfe_ret"));
        reg.setItemNfeRet(rs.getString("item_nfe_ret"));
        reg.setCodDa(rs.getString("cod_da"));
        reg.setNumDa(rs.getString("num_da"));
        return reg;
    }
}
