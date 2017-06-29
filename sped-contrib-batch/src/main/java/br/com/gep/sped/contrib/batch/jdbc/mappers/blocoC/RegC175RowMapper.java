package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC175;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC175RowMapper implements RowMapper<RegC175> {

    @Override
    public RegC175 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC175 reg = new RegC175();
        reg.setId(rs.getInt("id"));
        reg.setCfop(rs.getString("cfop"));
        reg.setVlOper(rs.getObject("vl_oper") == null ? null : rs.getDouble("vl_oper"));
        reg.setVlDesc(rs.getObject("vl_desc") == null ? null : rs.getDouble("vl_desc"));
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
        reg.setInfoCompl(rs.getString("info_compl"));
        return reg;
    }
}
