package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.contrib.marshaller.registros.blocoD.RegD101;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD101RowMapper implements RowMapper<RegD101> {

    @Override
    public RegD101 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD101 reg = new RegD101();
        reg.setId(rs.getInt("id"));
        reg.setIndNatFrt(rs.getString("ind_nat_frt"));
        reg.setVlItem(rs.getObject("vl_item") == null ? null : rs.getDouble("vl_item"));
        reg.setCstPis(rs.getString("cst_pis"));
        reg.setNatBcCred(rs.getString("nat_bc_cred"));
        reg.setVlBcPis(rs.getObject("vl_bc_pis") == null ? null : rs.getDouble("vl_bc_pis"));
        reg.setAliqPis(rs.getObject("aliq_pis") == null ? null : rs.getDouble("aliq_pis"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setCodCta(rs.getString("cod_cta"));
        return reg;
    }
}
