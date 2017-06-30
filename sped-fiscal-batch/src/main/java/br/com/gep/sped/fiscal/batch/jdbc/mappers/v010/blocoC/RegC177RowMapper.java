package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC.RegC177;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
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
