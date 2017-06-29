package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0205;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg0205RowMapper implements RowMapper<Reg0205> {

    @Override
    public Reg0205 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0205 reg = new Reg0205();
        reg.setId(rs.getInt("id"));
        reg.setDescrAntItem(rs.getString("descr_ant_item"));
        reg.setDtIni(rs.getDate("dt_ini"));
        reg.setDtFim(rs.getDate("dt_fim"));
        reg.setCodAntItem(rs.getString("cod_ant_item"));
        return reg;
    }
}
