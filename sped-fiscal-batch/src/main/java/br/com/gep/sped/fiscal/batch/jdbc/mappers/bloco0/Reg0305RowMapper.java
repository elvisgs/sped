package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0305;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reg0305RowMapper implements RowMapper<Reg0305> {

    @Override
    public Reg0305 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0305 reg = new Reg0305();
        reg.setId(rs.getInt("id"));
        reg.setCodCcus(rs.getString("cod_ccus"));
        reg.setFunc(rs.getString("func"));
        reg.setVidaUtil(rs.getString("vida_util"));
        return reg;
    }
}