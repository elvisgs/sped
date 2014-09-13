package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.blocoF.RegF130;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegF130RowMapper implements RowMapper<RegF130> {

    @Override
    public RegF130 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegF130 reg = new RegF130();
        reg.setId(rs.getInt("id"));
        reg.setNatBcCred(rs.getString("nat_bc_cred"));
        reg.setIdentBemImob(rs.getString("ident_bem_imob"));
        reg.setIndOrigCred(rs.getString("ind_orig_cred"));
        reg.setIndUtilBemImob(rs.getString("ind_util_bem_imob"));
        reg.setMesOperAquis(rs.getString("mes_oper_aquis"));
        reg.setVlOperAquis(rs.getObject("vl_oper_aquis") == null ? null : rs.getDouble("vl_oper_aquis"));
        reg.setParcOperNaoBcCred(rs.getObject("parc_oper_nao_bc_cred") == null ? null : rs.getDouble("parc_oper_nao_bc_cred"));
        reg.setVlBcCred(rs.getObject("vl_bc_cred") == null ? null : rs.getDouble("vl_bc_cred"));
        reg.setIndNrParc(rs.getString("ind_nr_parc"));
        reg.setCstPis(rs.getString("cst_pis"));
        reg.setVlBcPis(rs.getObject("vl_bc_pis") == null ? null : rs.getDouble("vl_bc_pis"));
        reg.setAliqPis(rs.getObject("aliq_pis") == null ? null : rs.getDouble("aliq_pis"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setCstCofins(rs.getString("cst_cofins"));
        reg.setVlBcCofins(rs.getObject("vl_bc_cofins") == null ? null : rs.getDouble("vl_bc_cofins"));
        reg.setAliqCofins(rs.getObject("aliq_cofins") == null ? null : rs.getDouble("aliq_cofins"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        reg.setCodCta(rs.getString("cod_cta"));
        reg.setCodCcus(rs.getString("cod_ccus"));
        reg.setDescBemImob(rs.getString("desc_bem_imob"));
        return reg;
    }
}
