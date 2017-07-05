package br.com.gep.sped.fiscal.batch.jdbc.mappers.v011.blocoK;

import br.com.gep.sped.fiscal.marshaller.registros.v011.blocoK.RegK270;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegK270RowMapper implements RowMapper<RegK270> {

    @Override
    public RegK270 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegK270 reg = new RegK270();
        reg.setId(rs.getInt("id"));
        reg.setDtIniAp(rs.getDate("dt_ini_ap"));
        reg.setDtFinAp(rs.getDate("dt_fin_ap"));
        reg.setCodOpOs(rs.getString("cod_op_os"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setQtdCorPos(rs.getObject("qtd_cor_pos") == null ? null : rs.getDouble("qtd_cor_pos"));
        reg.setQtdCorNeg(rs.getObject("qtd_cor_neg") == null ? null : rs.getDouble("qtd_cor_neg"));
        reg.setOrigem(rs.getString("origem"));
        return reg;
    }
}
