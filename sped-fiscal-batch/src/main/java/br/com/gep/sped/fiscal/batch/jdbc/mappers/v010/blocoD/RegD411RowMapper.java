package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD.RegD411;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD411RowMapper implements RowMapper<RegD411> {

    @Override
    public RegD411 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD411 reg = new RegD411();
        reg.setId(rs.getInt("id"));
        reg.setNumDocCanc(rs.getString("num_doc_canc"));
        return reg;
    }
}
