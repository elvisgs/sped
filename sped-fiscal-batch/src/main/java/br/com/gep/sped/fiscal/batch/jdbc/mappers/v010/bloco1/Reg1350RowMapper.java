package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1.Reg1350;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1350RowMapper implements RowMapper<Reg1350> {

    @Override
    public Reg1350 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1350 reg = new Reg1350();
        reg.setId(rs.getInt("id"));
        reg.setSerie(rs.getString("serie"));
        reg.setFabricante(rs.getString("fabricante"));
        reg.setModelo(rs.getString("modelo"));
        reg.setTipoMedicao(rs.getString("tipo_medicao"));
        return reg;
    }
}
