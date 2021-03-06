package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.blocoF.RegF510;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegF510RowMapper implements RowMapper<RegF510> {

    @Override
    public RegF510 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegF510 reg = new RegF510();
        reg.setId(rs.getInt("id"));
        reg.setVlRecCaixa(rs.getObject("vl_rec_caixa") == null ? null : rs.getDouble("vl_rec_caixa"));
        reg.setCstPis(rs.getString("cst_pis"));
        reg.setVlDescPis(rs.getObject("vl_desc_pis") == null ? null : rs.getDouble("vl_desc_pis"));
        reg.setQuantBcPis(rs.getObject("quant_bc_pis") == null ? null : rs.getDouble("quant_bc_pis"));
        reg.setAliqPisQuant(rs.getObject("aliq_pis_quant") == null ? null : rs.getDouble("aliq_pis_quant"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setCstCofins(rs.getString("cst_cofins"));
        reg.setVlDescCofins(rs.getObject("vl_desc_cofins") == null ? null : rs.getDouble("vl_desc_cofins"));
        reg.setQuantBcCofins(rs.getObject("quant_bc_cofins") == null ? null : rs.getDouble("quant_bc_cofins"));
        reg.setAliqCofinsQuant(rs.getObject("aliq_cofins_quant") == null ? null : rs.getDouble("aliq_cofins_quant"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setCfop(rs.getString("cfop"));
        reg.setCodCta(rs.getString("cod_cta"));
        reg.setInfoCompl(rs.getString("info_compl"));
        return reg;
    }
}
