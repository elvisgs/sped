package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0208;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reg0208RowMapper implements RowMapper<Reg0208> {

    @Override
    public Reg0208 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0208 reg = new Reg0208();
        reg.setId(rs.getInt("id"));
        reg.setCodTab(rs.getString("cod_tab"));
        reg.setCodGru(rs.getString("cod_gru"));
        reg.setMarcaCom(rs.getString("marca_com"));
        return reg;
    }
}
