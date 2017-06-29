package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0460;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg0460RowMapper implements RowMapper<Reg0460> {

    @Override
    public Reg0460 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0460 reg = new Reg0460();
        reg.setId(rs.getInt("id"));
        reg.setCodObs(rs.getString("cod_obs"));
        reg.setTxt(rs.getString("txt"));
        return reg;
    }
}
