package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco0.Reg0190;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg0190RowMapper implements RowMapper<Reg0190> {

    @Override
    public Reg0190 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0190 reg = new Reg0190();
        reg.setId(rs.getInt("id"));
        reg.setUnid(rs.getString("unid"));
        reg.setDescr(rs.getString("descr"));
        return reg;
    }
}
