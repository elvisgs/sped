package br.com.gep.sped.fiscal.batch.jdbc.mappers.v011.blocoK;

import br.com.gep.sped.fiscal.marshaller.registros.v011.blocoK.RegK280;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegK280RowMapper implements RowMapper<RegK280> {

    @Override
    public RegK280 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegK280 reg = new RegK280();
        reg.setId(rs.getInt("id"));
        reg.setDtEst(rs.getDate("dt_est"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setQtdCorPos(rs.getObject("qtd_cor_pos") == null ? null : rs.getDouble("qtd_cor_pos"));
        reg.setQtdCorNeg(rs.getObject("qtd_cor_neg") == null ? null : rs.getDouble("qtd_cor_neg"));
        reg.setIndEst(rs.getString("ind_est"));
        reg.setCodPart(rs.getString("cod_part"));
        return reg;
    }
}
