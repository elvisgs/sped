package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM205;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegM205RowMapper implements RowMapper<RegM205> {

    @Override
    public RegM205 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM205 reg = new RegM205();
        reg.setId(rs.getInt("id"));
        reg.setNumCampo(rs.getString("num_campo"));
        reg.setCodRec(rs.getString("cod_rec"));
        reg.setVlDebito(rs.getObject("vl_debito") == null ? null : rs.getDouble("vl_debito"));
        return reg;
    }
}
