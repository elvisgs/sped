package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC.RegC425;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC425RowMapper implements RowMapper<RegC425> {

    @Override
    public RegC425 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC425 reg = new RegC425();
        reg.setId(rs.getInt("id"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setQtd(rs.getObject("qtd") == null ? null : rs.getDouble("qtd"));
        reg.setUnid(rs.getString("unid"));
        reg.setVlItem(rs.getObject("vl_item") == null ? null : rs.getDouble("vl_item"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        return reg;
    }
}
