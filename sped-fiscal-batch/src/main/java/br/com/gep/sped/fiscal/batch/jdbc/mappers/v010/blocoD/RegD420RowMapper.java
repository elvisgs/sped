package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD.RegD420;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD420RowMapper implements RowMapper<RegD420> {

    @Override
    public RegD420 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD420 reg = new RegD420();
        reg.setId(rs.getInt("id"));
        reg.setCodMunOrig(rs.getString("cod_mun_orig"));
        reg.setVlServ(rs.getObject("vl_serv") == null ? null : rs.getDouble("vl_serv"));
        reg.setVlBcIcms(rs.getObject("vl_bc_icms") == null ? null : rs.getDouble("vl_bc_icms"));
        reg.setVlIcms(rs.getObject("vl_icms") == null ? null : rs.getDouble("vl_icms"));
        return reg;
    }
}
