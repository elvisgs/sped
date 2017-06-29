package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD001;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD001RowMapper implements RowMapper<RegD001> {

    @Override
    public RegD001 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD001 reg = new RegD001();
        reg.setId(rs.getInt("id"));
        reg.setIndMov(rs.getString("ind_mov"));
        return reg;
    }
}
