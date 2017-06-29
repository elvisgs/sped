package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.blocoF.RegF205;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegF205RowMapper implements RowMapper<RegF205> {

    @Override
    public RegF205 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegF205 reg = new RegF205();
        reg.setId(rs.getInt("id"));
        reg.setVlCusIncAcumAnt(rs.getObject("vl_cus_inc_acum_ant") == null ? null : rs.getDouble("vl_cus_inc_acum_ant"));
        reg.setVlCusIncPerEsc(rs.getObject("vl_cus_inc_per_esc") == null ? null : rs.getDouble("vl_cus_inc_per_esc"));
        reg.setVlCusIncAcum(rs.getObject("vl_cus_inc_acum") == null ? null : rs.getDouble("vl_cus_inc_acum"));
        reg.setVlExcBcCusIncAcum(rs.getObject("vl_exc_bc_cus_inc_acum") == null ? null : rs.getDouble("vl_exc_bc_cus_inc_acum"));
        reg.setVlBcCusInc(rs.getObject("vl_bc_cus_inc") == null ? null : rs.getDouble("vl_bc_cus_inc"));
        reg.setCstPis(rs.getString("cst_pis"));
        reg.setAliqPis(rs.getObject("aliq_pis") == null ? null : rs.getDouble("aliq_pis"));
        reg.setVlCredPisAcum(rs.getObject("vl_cred_pis_acum") == null ? null : rs.getDouble("vl_cred_pis_acum"));
        reg.setVlCredPisDescAnt(rs.getObject("vl_cred_pis_desc_ant") == null ? null : rs.getDouble("vl_cred_pis_desc_ant"));
        reg.setVlCredPisDesc(rs.getObject("vl_cred_pis_desc") == null ? null : rs.getDouble("vl_cred_pis_desc"));
        reg.setVlCredPisDescFut(rs.getObject("vl_cred_pis_desc_fut") == null ? null : rs.getDouble("vl_cred_pis_desc_fut"));
        reg.setCstCofins(rs.getString("cst_cofins"));
        reg.setAliqCofins(rs.getObject("aliq_cofins") == null ? null : rs.getDouble("aliq_cofins"));
        reg.setVlCredCofinsAcum(rs.getObject("vl_cred_cofins_acum") == null ? null : rs.getDouble("vl_cred_cofins_acum"));
        reg.setVlCredCofinsDescAnt(rs.getObject("vl_cred_cofins_desc_ant") == null ? null : rs.getDouble("vl_cred_cofins_desc_ant"));
        reg.setVlCredCofinsDesc(rs.getObject("vl_cred_cofins_desc") == null ? null : rs.getDouble("vl_cred_cofins_desc"));
        reg.setVlCredCofinsDescFut(rs.getObject("vl_cred_cofins_desc_fut") == null ? null : rs.getDouble("vl_cred_cofins_desc_fut"));
        return reg;
    }
}
