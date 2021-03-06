package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC.RegC105;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC105RowMapper implements RowMapper<RegC105> {

    @Override
    public RegC105 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC105 reg = new RegC105();
        reg.setId(rs.getInt("id"));
        reg.setOper(rs.getString("oper"));
        reg.setCodUf(rs.getString("cod_uf"));
        return reg;
    }
}
