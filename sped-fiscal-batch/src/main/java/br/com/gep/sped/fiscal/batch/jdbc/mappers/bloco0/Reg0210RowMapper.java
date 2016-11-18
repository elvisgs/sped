package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0210;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reg0210RowMapper implements RowMapper<Reg0210> {

    @Override
    public Reg0210 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0210 reg = new Reg0210();
        reg.setId(rs.getInt("id"));
        reg.setQtdComp(rs.getObject("qtd_comp") == null ? null : rs.getDouble("qtd_comp"));
        reg.setPerda(rs.getObject("perda") == null ? null : rs.getDouble("perda"));
        return reg;
    }
}
