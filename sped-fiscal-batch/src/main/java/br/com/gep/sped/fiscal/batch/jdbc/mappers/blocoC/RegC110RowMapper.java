package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC110;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC110RowMapper implements RowMapper<RegC110> {

    @Override
    public RegC110 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC110 reg = new RegC110();
        reg.setId(rs.getInt("id"));
        reg.setCodInf(rs.getString("cod_inf"));
        reg.setTxtCompl(rs.getString("txt_compl"));
        return reg;
    }
}
