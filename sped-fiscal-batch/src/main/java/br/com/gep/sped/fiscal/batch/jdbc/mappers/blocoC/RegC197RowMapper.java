package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC197;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC197RowMapper implements RowMapper<RegC197> {

    @Override
    public RegC197 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC197 reg = new RegC197();
        reg.setId(rs.getInt("id"));
        reg.setCodAj(rs.getString("cod_aj"));
        reg.setDescrComplAj(rs.getString("descr_compl_aj"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setVlBcIcms(rs.getObject("vl_bc_icms") == null ? null : rs.getDouble("vl_bc_icms"));
        reg.setAliqIcms(rs.getObject("aliq_icms") == null ? null : rs.getDouble("aliq_icms"));
        reg.setVlIcms(rs.getObject("vl_icms") == null ? null : rs.getDouble("vl_icms"));
        reg.setVlOutros(rs.getObject("vl_outros") == null ? null : rs.getDouble("vl_outros"));
        return reg;
    }
}
