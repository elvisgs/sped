package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoH;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoH.RegH001;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegH001RowMapper implements RowMapper<RegH001> {

    @Override
    public RegH001 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegH001 reg = new RegH001();
        reg.setId(rs.getInt("id"));
        reg.setIndMov(rs.getString("ind_mov"));
        return reg;
    }
}
