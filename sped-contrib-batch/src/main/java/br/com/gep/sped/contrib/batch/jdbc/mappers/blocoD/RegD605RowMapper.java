package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.contrib.marshaller.registros.blocoD.RegD605;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD605RowMapper implements RowMapper<RegD605> {

    @Override
    public RegD605 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD605 reg = new RegD605();
        reg.setId(rs.getInt("id"));
        reg.setCodClass(rs.getString("cod_class"));
        reg.setVlItem(rs.getObject("vl_item") == null ? null : rs.getDouble("vl_item"));
        reg.setVlDesc(rs.getObject("vl_desc") == null ? null : rs.getDouble("vl_desc"));
        reg.setCstCofins(rs.getString("cst_cofins"));
        reg.setVlBcCofins(rs.getObject("vl_bc_cofins") == null ? null : rs.getDouble("vl_bc_cofins"));
        reg.setAliqCofins(rs.getObject("aliq_cofins") == null ? null : rs.getDouble("aliq_cofins"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        reg.setCodCta(rs.getString("cod_cta"));
        return reg;
    }
}
