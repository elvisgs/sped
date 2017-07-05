package br.com.gep.sped.fiscal.batch.jdbc.mappers.v011.blocoK;

import br.com.gep.sped.fiscal.marshaller.registros.v011.blocoK.RegK275;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegK275RowMapper implements RowMapper<RegK275> {

    @Override
    public RegK275 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegK275 reg = new RegK275();
        reg.setId(rs.getInt("id"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setQtdCorPos(rs.getObject("qtd_cor_pos") == null ? null : rs.getDouble("qtd_cor_pos"));
        reg.setQtdCorNeg(rs.getObject("qtd_cor_neg") == null ? null : rs.getDouble("qtd_cor_neg"));
        reg.setCodInsSubst(rs.getString("cod_ins_subst"));
        return reg;
    }
}
