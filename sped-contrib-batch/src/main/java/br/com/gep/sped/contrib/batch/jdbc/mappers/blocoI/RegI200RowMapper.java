package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoI;

import br.com.gep.sped.contrib.marshaller.registros.blocoI.RegI200;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegI200RowMapper implements RowMapper<RegI200> {

    @Override
    public RegI200 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegI200 reg = new RegI200();
        reg.setId(rs.getInt("id"));
        reg.setNumCampo(rs.getString("num_campo"));
        reg.setCodDet(rs.getString("cod_det"));
        reg.setVlDet(rs.getObject("vl_det") == null ? null : rs.getDouble("vl_det"));
        reg.setCodCta(rs.getString("cod_cta"));
        reg.setInfComp(rs.getString("inf_comp"));
        return reg;
    }
}
