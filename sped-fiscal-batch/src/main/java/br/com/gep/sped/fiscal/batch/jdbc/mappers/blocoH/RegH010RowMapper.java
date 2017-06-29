package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoH;

import br.com.gep.sped.fiscal.marshaller.registros.blocoH.RegH010;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegH010RowMapper implements RowMapper<RegH010> {

    @Override
    public RegH010 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegH010 reg = new RegH010();
        reg.setId(rs.getInt("id"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setUnid(rs.getString("unid"));
        reg.setQtd(rs.getObject("qtd") == null ? null : rs.getDouble("qtd"));
        reg.setVlUnit(rs.getObject("vl_unit") == null ? null : rs.getDouble("vl_unit"));
        reg.setVlItem(rs.getObject("vl_item") == null ? null : rs.getDouble("vl_item"));
        reg.setIndProp(rs.getString("ind_prop"));
        reg.setCodPart(rs.getString("cod_part"));
        reg.setTxtCompl(rs.getString("txt_compl"));
        reg.setCodCta(rs.getString("cod_cta"));
        reg.setVlItemIr(rs.getObject("vl_item_ir") == null ? null : rs.getDouble("vl_item_ir"));
        return reg;
    }
}
