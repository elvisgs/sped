package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC390;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC390RowMapper implements RowMapper<RegC390> {

    @Override
    public RegC390 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC390 reg = new RegC390();
        reg.setId(rs.getInt("id"));
        reg.setCstIcms(rs.getString("cst_icms"));
        reg.setCfop(rs.getString("cfop"));
        reg.setAliqIcms(rs.getObject("aliq_icms") == null ? null : rs.getDouble("aliq_icms"));
        reg.setVlOpr(rs.getObject("vl_opr") == null ? null : rs.getDouble("vl_opr"));
        reg.setVlBcIcms(rs.getObject("vl_bc_icms") == null ? null : rs.getDouble("vl_bc_icms"));
        reg.setVlIcms(rs.getObject("vl_icms") == null ? null : rs.getDouble("vl_icms"));
        reg.setVlRedBc(rs.getObject("vl_red_bc") == null ? null : rs.getDouble("vl_red_bc"));
        reg.setCodObs(rs.getString("cod_obs"));
        return reg;
    }
}
