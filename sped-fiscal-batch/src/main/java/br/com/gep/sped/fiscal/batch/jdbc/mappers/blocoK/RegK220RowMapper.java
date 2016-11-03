package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoK;

import br.com.gep.sped.fiscal.marshaller.registros.blocoK.RegK220;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegK220RowMapper implements RowMapper<RegK220> {

    @Override
    public RegK220 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegK220 reg = new RegK220();
        reg.setId(rs.getInt("id"));
        reg.setCodItemOri(rs.getString("cod_item_ori"));
        reg.setCodItemDest(rs.getString("cod_item_dest"));
        reg.setQtd(rs.getObject("qtd") == null ? null : rs.getDouble("qtd"));
        return reg;
    }
}
