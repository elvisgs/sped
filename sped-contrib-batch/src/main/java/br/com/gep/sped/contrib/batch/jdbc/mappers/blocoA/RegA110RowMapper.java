package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoA;

import br.com.gep.sped.contrib.marshaller.registros.blocoA.RegA110;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegA110RowMapper implements RowMapper<RegA110> {

    @Override
    public RegA110 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegA110 reg = new RegA110();
        reg.setId(rs.getInt("id"));
        reg.setCodInf(rs.getString("cod_inf"));
        reg.setTxtCompl(rs.getString("txt_compl"));
        return reg;
    }
}
