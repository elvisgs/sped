package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC.RegC197;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
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
