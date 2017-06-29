package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.contrib.marshaller.registros.blocoD.RegD501;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD501RowMapper implements RowMapper<RegD501> {

    @Override
    public RegD501 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD501 reg = new RegD501();
        reg.setId(rs.getInt("id"));
        reg.setCstPis(rs.getString("cst_pis"));
        reg.setVlItem(rs.getObject("vl_item") == null ? null : rs.getDouble("vl_item"));
        reg.setNatBcCred(rs.getString("nat_bc_cred"));
        reg.setVlBcPis(rs.getObject("vl_bc_pis") == null ? null : rs.getDouble("vl_bc_pis"));
        reg.setAliqPis(rs.getObject("aliq_pis") == null ? null : rs.getDouble("aliq_pis"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setCodCta(rs.getString("cod_cta"));
        return reg;
    }
}
