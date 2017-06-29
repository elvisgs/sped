package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.bloco1.Reg1400;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1400RowMapper implements RowMapper<Reg1400> {

    @Override
    public Reg1400 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1400 reg = new Reg1400();
        reg.setId(rs.getInt("id"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setMun(rs.getString("mun"));
        reg.setValor(rs.getObject("valor") == null ? null : rs.getDouble("valor"));
        return reg;
    }
}
