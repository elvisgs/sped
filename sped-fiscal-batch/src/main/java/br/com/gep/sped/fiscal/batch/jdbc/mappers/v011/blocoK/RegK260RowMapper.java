package br.com.gep.sped.fiscal.batch.jdbc.mappers.v011.blocoK;

import br.com.gep.sped.fiscal.marshaller.registros.v011.blocoK.RegK260;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegK260RowMapper implements RowMapper<RegK260> {

    @Override
    public RegK260 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegK260 reg = new RegK260();
        reg.setId(rs.getInt("id"));
        reg.setCodOpOs(rs.getString("cod_op_os"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setDtSaida(rs.getDate("dt_saida"));
        reg.setQtdSaida(rs.getObject("qtd_saida") == null ? null : rs.getDouble("qtd_saida"));
        reg.setDtRet(rs.getDate("dt_ret"));
        reg.setQtdRet(rs.getObject("qtd_ret") == null ? null : rs.getDouble("qtd_ret"));
        return reg;
    }
}
