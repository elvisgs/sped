package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoI;

import br.com.gep.sped.contrib.marshaller.registros.blocoI.RegI001;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegI001RowMapper implements RowMapper<RegI001> {

    @Override
    public RegI001 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegI001 reg = new RegI001();
        reg.setId(rs.getInt("id"));
        reg.setIndMov(rs.getString("ind_mov"));
        return reg;
    }
}
