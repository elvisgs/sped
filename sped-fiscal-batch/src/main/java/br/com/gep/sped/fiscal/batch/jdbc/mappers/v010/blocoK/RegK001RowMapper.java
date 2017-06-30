package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoK;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoK.RegK001;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegK001RowMapper implements RowMapper<RegK001> {

    @Override
    public RegK001 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegK001 reg = new RegK001();
        reg.setId(rs.getInt("id"));
        reg.setIndMov(rs.getString("ind_mov"));
        return reg;
    }
}
