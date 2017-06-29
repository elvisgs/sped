package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0206;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg0206RowMapper implements RowMapper<Reg0206> {

    @Override
    public Reg0206 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0206 reg = new Reg0206();
        reg.setId(rs.getInt("id"));
        reg.setCodComb(rs.getString("cod_comb"));
        return reg;
    }
}
