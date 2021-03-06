package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1.Reg1922;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1922RowMapper implements RowMapper<Reg1922> {

    @Override
    public Reg1922 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1922 reg = new Reg1922();
        reg.setId(rs.getInt("id"));
        reg.setNumDa(rs.getString("num_da"));
        reg.setNumProc(rs.getString("num_proc"));
        reg.setIndProc(rs.getString("ind_proc"));
        reg.setProc(rs.getString("proc"));
        reg.setTxtCompl(rs.getString("txt_compl"));
        return reg;
    }
}
