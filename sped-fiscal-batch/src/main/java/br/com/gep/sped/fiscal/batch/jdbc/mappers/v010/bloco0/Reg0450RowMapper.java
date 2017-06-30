package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco0.Reg0450;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg0450RowMapper implements RowMapper<Reg0450> {

    @Override
    public Reg0450 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0450 reg = new Reg0450();
        reg.setId(rs.getInt("id"));
        reg.setCodInf(rs.getString("cod_inf"));
        reg.setTxt(rs.getString("txt"));
        return reg;
    }
}
