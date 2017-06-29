package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD370;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD370RowMapper implements RowMapper<RegD370> {

    @Override
    public RegD370 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD370 reg = new RegD370();
        reg.setId(rs.getInt("id"));
        reg.setCodMunOrig(rs.getString("cod_mun_orig"));
        reg.setVlServ(rs.getObject("vl_serv") == null ? null : rs.getDouble("vl_serv"));
        reg.setQtdBilh(rs.getInt("qtd_bilh"));
        reg.setVlBcIcms(rs.getObject("vl_bc_icms") == null ? null : rs.getDouble("vl_bc_icms"));
        reg.setVlIcms(rs.getObject("vl_icms") == null ? null : rs.getDouble("vl_icms"));
        return reg;
    }
}
