package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC130;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC130RowMapper implements RowMapper<RegC130> {

    @Override
    public RegC130 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC130 reg = new RegC130();
        reg.setId(rs.getInt("id"));
        reg.setVlServNt(rs.getObject("vl_serv_nt") == null ? null : rs.getDouble("vl_serv_nt"));
        reg.setVlBcIssqn(rs.getObject("vl_bc_issqn") == null ? null : rs.getDouble("vl_bc_issqn"));
        reg.setVlIssqn(rs.getObject("vl_issqn") == null ? null : rs.getDouble("vl_issqn"));
        reg.setVlBcIrrf(rs.getObject("vl_bc_irrf") == null ? null : rs.getDouble("vl_bc_irrf"));
        reg.setVlIrrf(rs.getObject("vl_irrf") == null ? null : rs.getDouble("vl_irrf"));
        reg.setVlBcPrev(rs.getObject("vl_bc_prev") == null ? null : rs.getDouble("vl_bc_prev"));
        reg.setVlPrev(rs.getObject("vl_prev") == null ? null : rs.getDouble("vl_prev"));
        return reg;
    }
}
