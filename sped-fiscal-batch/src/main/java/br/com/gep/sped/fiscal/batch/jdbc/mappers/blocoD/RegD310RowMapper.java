package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD310;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegD310RowMapper implements RowMapper<RegD310> {

    @Override
    public RegD310 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD310 reg = new RegD310();
        reg.setId(rs.getInt("id"));
        reg.setCodMunOrig(rs.getString("cod_mun_orig"));
        reg.setVlServ(rs.getObject("vl_serv") == null ? null : rs.getDouble("vl_serv"));
        reg.setVlBcIcms(rs.getObject("vl_bc_icms") == null ? null : rs.getDouble("vl_bc_icms"));
        reg.setVlIcms(rs.getObject("vl_icms") == null ? null : rs.getDouble("vl_icms"));
        return reg;
    }
}
