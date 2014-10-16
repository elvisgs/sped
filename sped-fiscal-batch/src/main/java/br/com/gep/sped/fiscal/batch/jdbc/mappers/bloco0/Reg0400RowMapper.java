package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0400;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reg0400RowMapper implements RowMapper<Reg0400> {

    @Override
    public Reg0400 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0400 reg = new Reg0400();
        reg.setId(rs.getInt("id"));
        reg.setCodNat(rs.getString("cod_nat"));
        reg.setDescrNat(rs.getString("descr_nat"));
        return reg;
    }
}
