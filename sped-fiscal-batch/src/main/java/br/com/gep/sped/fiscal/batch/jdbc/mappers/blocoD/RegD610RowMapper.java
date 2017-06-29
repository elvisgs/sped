package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD610;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD610RowMapper implements RowMapper<RegD610> {

    @Override
    public RegD610 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD610 reg = new RegD610();
        reg.setId(rs.getInt("id"));
        reg.setCodClass(rs.getString("cod_class"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setQtd(rs.getObject("qtd") == null ? null : rs.getDouble("qtd"));
        reg.setUnid(rs.getString("unid"));
        reg.setVlItem(rs.getObject("vl_item") == null ? null : rs.getDouble("vl_item"));
        reg.setVlDesc(rs.getObject("vl_desc") == null ? null : rs.getDouble("vl_desc"));
        reg.setCstIcms(rs.getString("cst_icms"));
        reg.setCfop(rs.getString("cfop"));
        reg.setAliqIcms(rs.getObject("aliq_icms") == null ? null : rs.getDouble("aliq_icms"));
        reg.setVlBcIcms(rs.getObject("vl_bc_icms") == null ? null : rs.getDouble("vl_bc_icms"));
        reg.setVlIcms(rs.getObject("vl_icms") == null ? null : rs.getDouble("vl_icms"));
        reg.setVlBcIcmsSt(rs.getObject("vl_bc_icms_st") == null ? null : rs.getDouble("vl_bc_icms_st"));
        reg.setVlIcmsSt(rs.getObject("vl_icms_st") == null ? null : rs.getDouble("vl_icms_st"));
        reg.setVlRedBc(rs.getObject("vl_red_bc") == null ? null : rs.getDouble("vl_red_bc"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        reg.setCodCta(rs.getString("cod_cta"));
        return reg;
    }
}
