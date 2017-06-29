package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.bloco1.Reg1390;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1390RowMapper implements RowMapper<Reg1390> {

    @Override
    public Reg1390 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1390 reg = new Reg1390();
        reg.setId(rs.getInt("id"));
        reg.setCodProd(rs.getString("cod_prod"));
        return reg;
    }
}
