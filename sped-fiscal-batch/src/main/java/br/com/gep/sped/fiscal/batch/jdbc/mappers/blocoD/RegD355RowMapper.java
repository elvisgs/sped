package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD355;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD355RowMapper implements RowMapper<RegD355> {

    @Override
    public RegD355 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD355 reg = new RegD355();
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
