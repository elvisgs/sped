package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0120;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reg0120RowMapper implements RowMapper<Reg0120> {

    @Override
    public Reg0120 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0120 reg = new Reg0120();
        reg.setId(rs.getInt("id"));
        reg.setMesDispensa(rs.getString("mes_dispensa"));
        reg.setInfComp(rs.getString("inf_comp"));
        return reg;
    }
}
