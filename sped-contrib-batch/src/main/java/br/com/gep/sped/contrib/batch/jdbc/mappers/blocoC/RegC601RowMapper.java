package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC601;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC601RowMapper implements RowMapper<RegC601> {

    @Override
    public RegC601 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC601 reg = new RegC601();
        reg.setId(rs.getInt("id"));
        reg.setCstPis(rs.getString("cst_pis"));
        reg.setVlItem(rs.getObject("vl_item") == null ? null : rs.getDouble("vl_item"));
        reg.setVlBcPis(rs.getObject("vl_bc_pis") == null ? null : rs.getDouble("vl_bc_pis"));
        reg.setAliqPis(rs.getObject("aliq_pis") == null ? null : rs.getDouble("aliq_pis"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setCodCta(rs.getString("cod_cta"));
        return reg;
    }
}
