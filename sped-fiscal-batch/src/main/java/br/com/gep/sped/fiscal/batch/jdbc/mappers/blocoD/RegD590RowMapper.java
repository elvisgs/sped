package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD590;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD590RowMapper implements RowMapper<RegD590> {

    @Override
    public RegD590 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD590 reg = new RegD590();
        reg.setId(rs.getInt("id"));
        reg.setCstIcms(rs.getString("cst_icms"));
        reg.setCfop(rs.getString("cfop"));
        reg.setAliqIcms(rs.getObject("aliq_icms") == null ? null : rs.getDouble("aliq_icms"));
        reg.setVlOpr(rs.getObject("vl_opr") == null ? null : rs.getDouble("vl_opr"));
        reg.setVlBcIcms(rs.getObject("vl_bc_icms") == null ? null : rs.getDouble("vl_bc_icms"));
        reg.setVlIcms(rs.getObject("vl_icms") == null ? null : rs.getDouble("vl_icms"));
        reg.setVlBcIcmsSt(rs.getObject("vl_bc_icms_st") == null ? null : rs.getDouble("vl_bc_icms_st"));
        reg.setVlIcmsSt(rs.getObject("vl_icms_st") == null ? null : rs.getDouble("vl_icms_st"));
        reg.setVlRedBc(rs.getObject("vl_red_bc") == null ? null : rs.getDouble("vl_red_bc"));
        reg.setCodObs(rs.getString("cod_obs"));
        return reg;
    }
}
