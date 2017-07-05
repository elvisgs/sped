package br.com.gep.sped.fiscal.batch.jdbc.mappers.v011.blocoK;

import br.com.gep.sped.fiscal.marshaller.registros.v011.blocoK.RegK215;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegK215RowMapper implements RowMapper<RegK215> {

    @Override
    public RegK215 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegK215 reg = new RegK215();
        reg.setId(rs.getInt("id"));
        reg.setCodItemDest(rs.getString("cod_item_dest"));
        reg.setQtdDes(rs.getObject("qtd_des") == null ? null : rs.getDouble("qtd_des"));
        return reg;
    }
}
