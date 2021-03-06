package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC405;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC405RowMapper implements RowMapper<RegC405> {

    @Override
    public RegC405 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC405 reg = new RegC405();
        reg.setId(rs.getInt("id"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setCro(rs.getString("cro"));
        reg.setCrz(rs.getString("crz"));
        reg.setNumCooFin(rs.getString("num_coo_fin"));
        reg.setGtFin(rs.getObject("gt_fin") == null ? null : rs.getDouble("gt_fin"));
        reg.setVlBrt(rs.getObject("vl_brt") == null ? null : rs.getDouble("vl_brt"));
        return reg;
    }
}
