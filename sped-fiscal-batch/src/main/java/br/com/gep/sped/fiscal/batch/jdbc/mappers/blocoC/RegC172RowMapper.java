package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC172;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC172RowMapper implements RowMapper<RegC172> {

    @Override
    public RegC172 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC172 reg = new RegC172();
        reg.setId(rs.getInt("id"));
        reg.setVlBcIssqn(rs.getObject("vl_bc_issqn") == null ? null : rs.getDouble("vl_bc_issqn"));
        reg.setAliqIssqn(rs.getObject("aliq_issqn") == null ? null : rs.getDouble("aliq_issqn"));
        reg.setVlIssqn(rs.getObject("vl_issqn") == null ? null : rs.getDouble("vl_issqn"));
        return reg;
    }
}
