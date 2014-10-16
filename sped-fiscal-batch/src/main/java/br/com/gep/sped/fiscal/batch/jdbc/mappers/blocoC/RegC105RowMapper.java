package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC105;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

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
