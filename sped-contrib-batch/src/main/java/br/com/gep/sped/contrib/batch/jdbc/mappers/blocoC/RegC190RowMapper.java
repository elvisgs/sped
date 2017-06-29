package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC190;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC190RowMapper implements RowMapper<RegC190> {

    @Override
    public RegC190 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC190 reg = new RegC190();
        reg.setId(rs.getInt("id"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setDtRefIni(rs.getDate("dt_ref_ini"));
        reg.setDtRefFin(rs.getDate("dt_ref_fin"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setCodNcm(rs.getString("cod_ncm"));
        reg.setExIpi(rs.getString("ex_ipi"));
        reg.setVlTotItem(rs.getObject("vl_tot_item") == null ? null : rs.getDouble("vl_tot_item"));
        return reg;
    }
}
