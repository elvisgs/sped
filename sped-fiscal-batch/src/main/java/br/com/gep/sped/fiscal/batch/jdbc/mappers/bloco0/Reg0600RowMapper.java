package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0600;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg0600RowMapper implements RowMapper<Reg0600> {

    @Override
    public Reg0600 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0600 reg = new Reg0600();
        reg.setId(rs.getInt("id"));
        reg.setDtAlt(rs.getDate("dt_alt"));
        reg.setCodCcus(rs.getString("cod_ccus"));
        reg.setCcus(rs.getString("ccus"));
        return reg;
    }
}
