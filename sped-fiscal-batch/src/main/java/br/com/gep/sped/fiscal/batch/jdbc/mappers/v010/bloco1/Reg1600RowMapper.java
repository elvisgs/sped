package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1.Reg1600;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1600RowMapper implements RowMapper<Reg1600> {

    @Override
    public Reg1600 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1600 reg = new Reg1600();
        reg.setId(rs.getInt("id"));
        reg.setCodPart(rs.getString("cod_part"));
        reg.setTotCredito(rs.getObject("tot_credito") == null ? null : rs.getDouble("tot_credito"));
        reg.setTotDebito(rs.getObject("tot_debito") == null ? null : rs.getDouble("tot_debito"));
        return reg;
    }
}
