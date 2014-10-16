package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.blocoE.RegE230;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegE230RowMapper implements RowMapper<RegE230> {

    @Override
    public RegE230 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE230 reg = new RegE230();
        reg.setId(rs.getInt("id"));
        reg.setNumDa(rs.getString("num_da"));
        reg.setNumProc(rs.getString("num_proc"));
        reg.setIndProc(rs.getString("ind_proc"));
        reg.setProc(rs.getString("proc"));
        reg.setTxtCompl(rs.getString("txt_compl"));
        return reg;
    }
}
