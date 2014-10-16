package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC177;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC177RowMapper implements RowMapper<RegC177> {

    @Override
    public RegC177 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC177 reg = new RegC177();
        reg.setId(rs.getInt("id"));
        reg.setCodSeloIpi(rs.getString("cod_selo_ipi"));
        reg.setQtSeloIpi(rs.getString("qt_selo_ipi"));
        return reg;
    }
}
