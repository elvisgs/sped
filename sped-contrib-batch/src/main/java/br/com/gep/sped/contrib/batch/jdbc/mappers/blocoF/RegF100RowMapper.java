package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.blocoF.RegF100;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegF100RowMapper implements RowMapper<RegF100> {

    @Override
    public RegF100 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegF100 reg = new RegF100();
        reg.setId(rs.getInt("id"));
        reg.setIndOper(rs.getString("ind_oper"));
        reg.setCodPart(rs.getString("cod_part"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setDtOper(rs.getDate("dt_oper"));
        reg.setVlOper(rs.getObject("vl_oper") == null ? null : rs.getDouble("vl_oper"));
        reg.setCstPis(rs.getString("cst_pis"));
        reg.setVlBcPis(rs.getObject("vl_bc_pis") == null ? null : rs.getDouble("vl_bc_pis"));
        reg.setAliqPis(rs.getObject("aliq_pis") == null ? null : rs.getDouble("aliq_pis"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setCstCofins(rs.getString("cst_cofins"));
        reg.setVlBcCofins(rs.getObject("vl_bc_cofins") == null ? null : rs.getDouble("vl_bc_cofins"));
        reg.setAliqCofins(rs.getObject("aliq_cofins") == null ? null : rs.getDouble("aliq_cofins"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        reg.setNatBcCred(rs.getString("nat_bc_cred"));
        reg.setIndOrigCred(rs.getString("ind_orig_cred"));
        reg.setCodCta(rs.getString("cod_cta"));
        reg.setCodCcus(rs.getString("cod_ccus"));
        reg.setDescDocOper(rs.getString("desc_doc_oper"));
        return reg;
    }
}
