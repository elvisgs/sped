package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD110;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD110RowMapper implements RowMapper<RegD110> {

    @Override
    public RegD110 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD110 reg = new RegD110();
        reg.setId(rs.getInt("id"));
        reg.setNumItem(rs.getString("num_item"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setVlServ(rs.getObject("vl_serv") == null ? null : rs.getDouble("vl_serv"));
        reg.setVlOut(rs.getObject("vl_out") == null ? null : rs.getDouble("vl_out"));
        return reg;
    }
}
