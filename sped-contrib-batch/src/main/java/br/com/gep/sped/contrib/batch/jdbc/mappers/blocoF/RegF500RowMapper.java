package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.blocoF.RegF500;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegF500RowMapper implements RowMapper<RegF500> {

    @Override
    public RegF500 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegF500 reg = new RegF500();
        reg.setId(rs.getInt("id"));
        reg.setVlRecCaixa(rs.getObject("vl_rec_caixa") == null ? null : rs.getDouble("vl_rec_caixa"));
        reg.setCstPis(rs.getString("cst_pis"));
        reg.setVlDescPis(rs.getObject("vl_desc_pis") == null ? null : rs.getDouble("vl_desc_pis"));
        reg.setVlBcPis(rs.getObject("vl_bc_pis") == null ? null : rs.getDouble("vl_bc_pis"));
        reg.setAliqPis(rs.getObject("aliq_pis") == null ? null : rs.getDouble("aliq_pis"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setCstCofins(rs.getString("cst_cofins"));
        reg.setVlDescCofins(rs.getObject("vl_desc_cofins") == null ? null : rs.getDouble("vl_desc_cofins"));
        reg.setVlBcCofins(rs.getObject("vl_bc_cofins") == null ? null : rs.getDouble("vl_bc_cofins"));
        reg.setAliqCofins(rs.getObject("aliq_cofins") == null ? null : rs.getDouble("aliq_cofins"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setCfop(rs.getString("cfop"));
        reg.setCodCta(rs.getString("cod_cta"));
        reg.setInfoCompl(rs.getString("info_compl"));
        return reg;
    }
}
