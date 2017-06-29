package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.bloco1.Reg1910;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1910RowMapper implements RowMapper<Reg1910> {

    @Override
    public Reg1910 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1910 reg = new Reg1910();
        reg.setId(rs.getInt("id"));
        reg.setDtIni(rs.getDate("dt_ini"));
        reg.setDtFin(rs.getDate("dt_fin"));
        return reg;
    }
}
