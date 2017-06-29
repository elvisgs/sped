package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.bloco1.Reg1001;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1001RowMapper implements RowMapper<Reg1001> {

    @Override
    public Reg1001 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1001 reg = new Reg1001();
        reg.setId(rs.getInt("id"));
        reg.setIndMov(rs.getString("ind_mov"));
        return reg;
    }
}
