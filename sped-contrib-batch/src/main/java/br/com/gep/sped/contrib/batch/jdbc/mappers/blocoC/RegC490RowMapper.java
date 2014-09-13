package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC490;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC490RowMapper implements RowMapper<RegC490> {

    @Override
    public RegC490 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC490 reg = new RegC490();
        reg.setId(rs.getInt("id"));
        reg.setDtDocIni(rs.getDate("dt_doc_ini"));
        reg.setDtDocFin(rs.getDate("dt_doc_fin"));
        reg.setCodMod(rs.getString("cod_mod"));
        return reg;
    }
}
