package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoA;

import br.com.gep.sped.contrib.marshaller.registros.blocoA.RegA111;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegA111RowMapper implements RowMapper<RegA111> {

    @Override
    public RegA111 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegA111 reg = new RegA111();
        reg.setId(rs.getInt("id"));
        reg.setNumProc(rs.getString("num_proc"));
        reg.setIndProc(rs.getString("ind_proc"));
        return reg;
    }
}
