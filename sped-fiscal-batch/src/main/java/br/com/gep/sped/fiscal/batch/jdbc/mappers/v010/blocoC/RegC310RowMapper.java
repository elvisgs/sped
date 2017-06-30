package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC.RegC310;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC310RowMapper implements RowMapper<RegC310> {

    @Override
    public RegC310 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC310 reg = new RegC310();
        reg.setId(rs.getInt("id"));
        reg.setNumDocCanc(rs.getString("num_doc_canc"));
        return reg;
    }
}
