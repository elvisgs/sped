package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoG;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoG.RegG140;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegG140RowMapper implements RowMapper<RegG140> {

    @Override
    public RegG140 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegG140 reg = new RegG140();
        reg.setId(rs.getInt("id"));
        reg.setNumItem(rs.getString("num_item"));
        reg.setCodItem(rs.getString("cod_item"));
        return reg;
    }
}
