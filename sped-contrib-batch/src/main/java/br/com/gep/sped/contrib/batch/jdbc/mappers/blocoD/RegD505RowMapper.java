package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.contrib.marshaller.registros.blocoD.RegD505;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD505RowMapper implements RowMapper<RegD505> {

    @Override
    public RegD505 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD505 reg = new RegD505();
        reg.setId(rs.getInt("id"));
        reg.setCstCofins(rs.getString("cst_cofins"));
        reg.setVlItem(rs.getObject("vl_item") == null ? null : rs.getDouble("vl_item"));
        reg.setNatBcCred(rs.getString("nat_bc_cred"));
        reg.setVlBcCofins(rs.getObject("vl_bc_cofins") == null ? null : rs.getDouble("vl_bc_cofins"));
        reg.setAliqCofins(rs.getObject("aliq_cofins") == null ? null : rs.getDouble("aliq_cofins"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        reg.setCodCta(rs.getString("cod_cta"));
        return reg;
    }
}
