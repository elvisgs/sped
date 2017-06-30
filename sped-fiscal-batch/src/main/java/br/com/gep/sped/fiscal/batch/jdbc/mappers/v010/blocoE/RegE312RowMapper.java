package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoE.RegE312;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegE312RowMapper implements RowMapper<RegE312> {

    @Override
    public RegE312 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE312 reg = new RegE312();
        reg.setId(rs.getInt("id"));
        reg.setNumDa(rs.getString("num_da"));
        reg.setNumProc(rs.getString("num_proc"));
        reg.setIndProc(rs.getString("ind_proc"));
        reg.setProc(rs.getString("proc"));
        reg.setTxtCompl(rs.getString("txt_compl"));
        return reg;
    }
}
