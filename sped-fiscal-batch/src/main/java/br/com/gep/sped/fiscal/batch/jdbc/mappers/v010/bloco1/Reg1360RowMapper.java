package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1.Reg1360;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1360RowMapper implements RowMapper<Reg1360> {

    @Override
    public Reg1360 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1360 reg = new Reg1360();
        reg.setId(rs.getInt("id"));
        reg.setNumLacre(rs.getString("num_lacre"));
        reg.setDatAplicacao(rs.getDate("dat_aplicacao"));
        return reg;
    }
}
