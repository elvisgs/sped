package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC.RegC601;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC601RowMapper implements RowMapper<RegC601> {

    @Override
    public RegC601 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC601 reg = new RegC601();
        reg.setId(rs.getInt("id"));
        reg.setNumDocCanc(rs.getString("num_doc_canc"));
        return reg;
    }
}
