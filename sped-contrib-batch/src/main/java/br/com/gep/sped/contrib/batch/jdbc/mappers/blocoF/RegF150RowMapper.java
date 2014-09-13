package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.blocoF.RegF150;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegF150RowMapper implements RowMapper<RegF150> {

    @Override
    public RegF150 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegF150 reg = new RegF150();
        reg.setId(rs.getInt("id"));
        reg.setNatBcCred(rs.getString("nat_bc_cred"));
        reg.setVlTotEst(rs.getObject("vl_tot_est") == null ? null : rs.getDouble("vl_tot_est"));
        reg.setEstImp(rs.getObject("est_imp") == null ? null : rs.getDouble("est_imp"));
        reg.setVlBcEst(rs.getObject("vl_bc_est") == null ? null : rs.getDouble("vl_bc_est"));
        reg.setVlBcMenEst(rs.getObject("vl_bc_men_est") == null ? null : rs.getDouble("vl_bc_men_est"));
        reg.setCstPis(rs.getString("cst_pis"));
        reg.setAliqPis(rs.getObject("aliq_pis") == null ? null : rs.getDouble("aliq_pis"));
        reg.setVlCredPis(rs.getObject("vl_cred_pis") == null ? null : rs.getDouble("vl_cred_pis"));
        reg.setCstCofins(rs.getString("cst_cofins"));
        reg.setAliqCofins(rs.getObject("aliq_cofins") == null ? null : rs.getDouble("aliq_cofins"));
        reg.setVlCredCofins(rs.getObject("vl_cred_cofins") == null ? null : rs.getDouble("vl_cred_cofins"));
        reg.setDescEst(rs.getString("desc_est"));
        reg.setCodCta(rs.getString("cod_cta"));
        return reg;
    }
}
