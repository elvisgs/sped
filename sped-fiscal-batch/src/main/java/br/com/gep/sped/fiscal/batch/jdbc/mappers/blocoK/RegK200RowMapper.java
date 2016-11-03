package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoK;

import br.com.gep.sped.fiscal.marshaller.registros.blocoK.RegK200;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegK200RowMapper implements RowMapper<RegK200> {

    @Override
    public RegK200 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegK200 reg = new RegK200();
        reg.setId(rs.getInt("id"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setQtd(rs.getObject("qtd") == null ? null : rs.getDouble("qtd"));
        reg.setIndEst(rs.getString("ind_est"));
        reg.setCodPart(rs.getString("cod_part"));
        return reg;
    }
}
