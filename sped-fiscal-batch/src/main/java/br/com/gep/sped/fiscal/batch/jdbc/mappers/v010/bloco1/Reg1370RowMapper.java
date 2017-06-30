package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1.Reg1370;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1370RowMapper implements RowMapper<Reg1370> {

    @Override
    public Reg1370 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1370 reg = new Reg1370();
        reg.setId(rs.getInt("id"));
        reg.setNumBico(rs.getString("num_bico"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setNumTanque(rs.getString("num_tanque"));
        return reg;
    }
}
