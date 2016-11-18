package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC860;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC860RowMapper implements RowMapper<RegC860> {

    @Override
    public RegC860 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC860 reg = new RegC860();
        reg.setId(rs.getInt("id"));
        reg.setNrSat(rs.getString("nr_sat"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setDocIni(rs.getString("doc_ini"));
        reg.setDocFim(rs.getString("doc_fim"));
        return reg;
    }
}
