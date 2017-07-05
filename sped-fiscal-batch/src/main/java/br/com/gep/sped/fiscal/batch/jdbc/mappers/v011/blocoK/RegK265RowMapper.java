package br.com.gep.sped.fiscal.batch.jdbc.mappers.v011.blocoK;

import br.com.gep.sped.fiscal.marshaller.registros.v011.blocoK.RegK265;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegK265RowMapper implements RowMapper<RegK265> {

    @Override
    public RegK265 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegK265 reg = new RegK265();
        reg.setId(rs.getInt("id"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setQtdCons(rs.getObject("qtd_cons") == null ? null : rs.getDouble("qtd_cons"));
        reg.setQtdRet(rs.getObject("qtd_ret") == null ? null : rs.getDouble("qtd_ret"));
        return reg;
    }
}
