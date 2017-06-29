package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.blocoE.RegE112;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegE112RowMapper implements RowMapper<RegE112> {

    @Override
    public RegE112 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE112 reg = new RegE112();
        reg.setId(rs.getInt("id"));
        reg.setNumDa(rs.getString("num_da"));
        reg.setNumProc(rs.getString("num_proc"));
        reg.setIndProc(rs.getString("ind_proc"));
        reg.setProc(rs.getString("proc"));
        reg.setTxtCompl(rs.getString("txt_compl"));
        return reg;
    }
}
