package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.blocoF.RegF210;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegF210RowMapper implements RowMapper<RegF210> {

    @Override
    public RegF210 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegF210 reg = new RegF210();
        reg.setId(rs.getInt("id"));
        reg.setVlCusOrc(rs.getObject("vl_cus_orc") == null ? null : rs.getDouble("vl_cus_orc"));
        reg.setVlExc(rs.getObject("vl_exc") == null ? null : rs.getDouble("vl_exc"));
        reg.setVlCusOrcAju(rs.getObject("vl_cus_orc_aju") == null ? null : rs.getDouble("vl_cus_orc_aju"));
        reg.setVlBcCred(rs.getObject("vl_bc_cred") == null ? null : rs.getDouble("vl_bc_cred"));
        reg.setCstPis(rs.getString("cst_pis"));
        reg.setAliqPis(rs.getObject("aliq_pis") == null ? null : rs.getDouble("aliq_pis"));
        reg.setVlCredPisUtil(rs.getObject("vl_cred_pis_util") == null ? null : rs.getDouble("vl_cred_pis_util"));
        reg.setCstCofins(rs.getString("cst_cofins"));
        reg.setAliqCofins(rs.getObject("aliq_cofins") == null ? null : rs.getDouble("aliq_cofins"));
        reg.setVlCredCofinsUtil(rs.getObject("vl_cred_cofins_util") == null ? null : rs.getDouble("vl_cred_cofins_util"));
        return reg;
    }
}
