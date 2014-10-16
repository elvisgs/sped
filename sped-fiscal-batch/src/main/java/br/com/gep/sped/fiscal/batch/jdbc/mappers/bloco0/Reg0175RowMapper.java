package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0175;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reg0175RowMapper implements RowMapper<Reg0175> {

    @Override
    public Reg0175 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0175 reg = new Reg0175();
        reg.setId(rs.getInt("id"));
        reg.setDtAlt(rs.getDate("dt_alt"));
        reg.setNrCampo(rs.getString("nr_campo"));
        reg.setContAnt(rs.getString("cont_ant"));
        return reg;
    }
}
