package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM605;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegM605RowMapper implements RowMapper<RegM605> {

    @Override
    public RegM605 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM605 reg = new RegM605();
        reg.setId(rs.getInt("id"));
        reg.setNumCampo(rs.getString("num_campo"));
        reg.setCodRec(rs.getString("cod_rec"));
        reg.setVlDebito(rs.getObject("vl_debito") == null ? null : rs.getDouble("vl_debito"));
        return reg;
    }
}
