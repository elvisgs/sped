package br.com.gep.sped.fiscal.batch.jdbc.mappers.v011.blocoK;

import br.com.gep.sped.fiscal.marshaller.registros.v011.blocoK.RegK210;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegK210RowMapper implements RowMapper<RegK210> {

    @Override
    public RegK210 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegK210 reg = new RegK210();
        reg.setId(rs.getInt("id"));
        reg.setDtIniOs(rs.getDate("dt_ini_os"));
        reg.setDtFinOs(rs.getDate("dt_fin_os"));
        reg.setCodDocOs(rs.getString("cod_doc_os"));
        reg.setCodItemOri(rs.getString("cod_item_ori"));
        reg.setQtdOri(rs.getObject("qtd_ori") == null ? null : rs.getDouble("qtd_ori"));
        return reg;
    }
}
