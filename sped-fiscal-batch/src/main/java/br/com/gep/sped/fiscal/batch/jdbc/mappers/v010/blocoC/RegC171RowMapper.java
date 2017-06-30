package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC.RegC171;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC171RowMapper implements RowMapper<RegC171> {

    @Override
    public RegC171 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC171 reg = new RegC171();
        reg.setId(rs.getInt("id"));
        reg.setNumTanque(rs.getString("num_tanque"));
        reg.setQtde(rs.getObject("qtde") == null ? null : rs.getDouble("qtde"));
        return reg;
    }
}
