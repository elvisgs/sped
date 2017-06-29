package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.contrib.marshaller.registros.blocoD.RegD105;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD105RowMapper implements RowMapper<RegD105> {

    @Override
    public RegD105 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD105 reg = new RegD105();
        reg.setId(rs.getInt("id"));
        reg.setIndNatFrt(rs.getString("ind_nat_frt"));
        reg.setVlItem(rs.getObject("vl_item") == null ? null : rs.getDouble("vl_item"));
        reg.setCstCofins(rs.getString("cst_cofins"));
        reg.setNatBcCred(rs.getString("nat_bc_cred"));
        reg.setVlBcCofins(rs.getObject("vl_bc_cofins") == null ? null : rs.getDouble("vl_bc_cofins"));
        reg.setAliqCofins(rs.getObject("aliq_cofins") == null ? null : rs.getDouble("aliq_cofins"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        reg.setCodCta(rs.getString("cod_cta"));
        return reg;
    }
}
