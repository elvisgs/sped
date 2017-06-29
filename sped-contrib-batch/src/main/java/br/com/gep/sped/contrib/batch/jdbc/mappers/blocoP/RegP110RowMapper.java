package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoP;

import br.com.gep.sped.contrib.marshaller.registros.blocoP.RegP110;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegP110RowMapper implements RowMapper<RegP110> {

    @Override
    public RegP110 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegP110 reg = new RegP110();
        reg.setId(rs.getInt("id"));
        reg.setNumCampo(rs.getString("num_campo"));
        reg.setCodDet(rs.getString("cod_det"));
        reg.setDetValor(rs.getObject("det_valor") == null ? null : rs.getDouble("det_valor"));
        reg.setInfCompl(rs.getString("inf_compl"));
        return reg;
    }
}
