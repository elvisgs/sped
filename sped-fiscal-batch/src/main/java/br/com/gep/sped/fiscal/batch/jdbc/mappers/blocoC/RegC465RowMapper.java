package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC465;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC465RowMapper implements RowMapper<RegC465> {

    @Override
    public RegC465 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC465 reg = new RegC465();
        reg.setId(rs.getInt("id"));
        reg.setChvCfe(rs.getString("chv_cfe"));
        reg.setNumCcf(rs.getString("num_ccf"));
        return reg;
    }
}
