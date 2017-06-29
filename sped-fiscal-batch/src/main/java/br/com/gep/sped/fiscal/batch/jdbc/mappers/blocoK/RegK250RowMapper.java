package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoK;

import br.com.gep.sped.fiscal.marshaller.registros.blocoK.RegK250;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegK250RowMapper implements RowMapper<RegK250> {

    @Override
    public RegK250 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegK250 reg = new RegK250();
        reg.setId(rs.getInt("id"));
        reg.setDtProd(rs.getDate("dt_prod"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setQtd(rs.getObject("qtd") == null ? null : rs.getDouble("qtd"));
        return reg;
    }
}
