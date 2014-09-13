package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoA;

import br.com.gep.sped.contrib.marshaller.registros.blocoA.RegA170;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegA170RowMapper implements RowMapper<RegA170> {

    @Override
    public RegA170 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegA170 reg = new RegA170();
        reg.setId(rs.getInt("id"));
        reg.setNumItem(rs.getString("num_item"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setDescrCompl(rs.getString("descr_compl"));
        reg.setVlItem(rs.getObject("vl_item") == null ? null : rs.getDouble("vl_item"));
        reg.setVlDesc(rs.getObject("vl_desc") == null ? null : rs.getDouble("vl_desc"));
        reg.setNatBcCred(rs.getString("nat_bc_cred"));
        reg.setIndOrigCred(rs.getString("ind_orig_cred"));
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
        return reg;
    }
}
