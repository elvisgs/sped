package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0450;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

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
