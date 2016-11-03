package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoK;

import br.com.gep.sped.fiscal.marshaller.registros.blocoK.RegK235;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegK235RowMapper implements RowMapper<RegK235> {

    @Override
    public RegK235 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegK235 reg = new RegK235();
        reg.setId(rs.getInt("id"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setQtd(rs.getObject("qtd") == null ? null : rs.getDouble("qtd"));
        reg.setCodInsSubst(rs.getString("cod_ins_subst"));
        return reg;
    }
}
