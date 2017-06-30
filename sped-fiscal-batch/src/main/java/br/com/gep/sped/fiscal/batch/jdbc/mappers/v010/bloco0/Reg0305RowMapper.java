package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco0.Reg0305;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
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
