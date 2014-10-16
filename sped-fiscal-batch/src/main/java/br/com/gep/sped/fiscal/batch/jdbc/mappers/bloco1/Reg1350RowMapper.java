package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.bloco1.Reg1350;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

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
