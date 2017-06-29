package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC385;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC385RowMapper implements RowMapper<RegC385> {

    @Override
    public RegC385 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC385 reg = new RegC385();
        reg.setId(rs.getInt("id"));
        reg.setCstCofins(rs.getString("cst_cofins"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setVlItem(rs.getObject("vl_item") == null ? null : rs.getDouble("vl_item"));
        reg.setVlBcCofins(rs.getObject("vl_bc_cofins") == null ? null : rs.getDouble("vl_bc_cofins"));
        reg.setAliqCofins(rs.getObject("aliq_cofins") == null ? null : rs.getDouble("aliq_cofins"));
        reg.setQuantBcCofins(rs.getObject("quant_bc_cofins") == null ? null : rs.getDouble("quant_bc_cofins"));
        reg.setAliqCofinsQuant(rs.getObject("aliq_cofins_quant") == null ? null : rs.getDouble("aliq_cofins_quant"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        reg.setCodCta(rs.getString("cod_cta"));
        return reg;
    }
}
