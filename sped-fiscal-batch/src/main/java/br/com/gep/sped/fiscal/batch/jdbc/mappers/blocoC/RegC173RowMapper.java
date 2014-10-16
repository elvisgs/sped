package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC173;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC173RowMapper implements RowMapper<RegC173> {

    @Override
    public RegC173 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC173 reg = new RegC173();
        reg.setId(rs.getInt("id"));
        reg.setLoteMed(rs.getString("lote_med"));
        reg.setQtdItem(rs.getObject("qtd_item") == null ? null : rs.getDouble("qtd_item"));
        reg.setDtFab(rs.getDate("dt_fab"));
        reg.setDtVal(rs.getDate("dt_val"));
        reg.setIndMed(rs.getString("ind_med"));
        reg.setTpProd(rs.getString("tp_prod"));
        reg.setVlTabMax(rs.getObject("vl_tab_max") == null ? null : rs.getDouble("vl_tab_max"));
        return reg;
    }
}
