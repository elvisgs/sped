package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC.RegC195;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC195RowMapper implements RowMapper<RegC195> {

    @Override
    public RegC195 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC195 reg = new RegC195();
        reg.setId(rs.getInt("id"));
        reg.setCodObs(rs.getString("cod_obs"));
        reg.setTxtCompl(rs.getString("txt_compl"));
        return reg;
    }
}
