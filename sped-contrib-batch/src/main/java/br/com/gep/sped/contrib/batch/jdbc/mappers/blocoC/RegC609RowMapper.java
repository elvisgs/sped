package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC609;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC609RowMapper implements RowMapper<RegC609> {

    @Override
    public RegC609 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC609 reg = new RegC609();
        reg.setId(rs.getInt("id"));
        reg.setNumProc(rs.getString("num_proc"));
        reg.setIndProc(rs.getString("ind_proc"));
        return reg;
    }
}
