package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoE.RegE510;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegE510RowMapper implements RowMapper<RegE510> {

    @Override
    public RegE510 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE510 reg = new RegE510();
        reg.setId(rs.getInt("id"));
        reg.setCfop(rs.getString("cfop"));
        reg.setCstIpi(rs.getString("cst_ipi"));
        reg.setVlContIpi(rs.getObject("vl_cont_ipi") == null ? null : rs.getDouble("vl_cont_ipi"));
        reg.setVlBcIpi(rs.getObject("vl_bc_ipi") == null ? null : rs.getDouble("vl_bc_ipi"));
        reg.setVlIpi(rs.getObject("vl_ipi") == null ? null : rs.getDouble("vl_ipi"));
        return reg;
    }
}
