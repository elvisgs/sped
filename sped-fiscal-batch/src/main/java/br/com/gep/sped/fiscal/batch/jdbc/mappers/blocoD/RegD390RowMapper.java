package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD390;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegD390RowMapper implements RowMapper<RegD390> {

    @Override
    public RegD390 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD390 reg = new RegD390();
        reg.setId(rs.getInt("id"));
        reg.setCstIcms(rs.getString("cst_icms"));
        reg.setCfop(rs.getString("cfop"));
        reg.setAliqIcms(rs.getObject("aliq_icms") == null ? null : rs.getDouble("aliq_icms"));
        reg.setVlOpr(rs.getObject("vl_opr") == null ? null : rs.getDouble("vl_opr"));
        reg.setVlBcIssqn(rs.getObject("vl_bc_issqn") == null ? null : rs.getDouble("vl_bc_issqn"));
        reg.setAliqIssqn(rs.getObject("aliq_issqn") == null ? null : rs.getDouble("aliq_issqn"));
        reg.setVlIssqn(rs.getObject("vl_issqn") == null ? null : rs.getDouble("vl_issqn"));
        reg.setVlBcIcms(rs.getObject("vl_bc_icms") == null ? null : rs.getDouble("vl_bc_icms"));
        reg.setVlIcms(rs.getObject("vl_icms") == null ? null : rs.getDouble("vl_icms"));
        reg.setCodObs(rs.getString("cod_obs"));
        return reg;
    }
}
