package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM220;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegM220RowMapper implements RowMapper<RegM220> {

    @Override
    public RegM220 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM220 reg = new RegM220();
        reg.setId(rs.getInt("id"));
        reg.setIndAj(rs.getString("ind_aj"));
        reg.setVlAj(rs.getObject("vl_aj") == null ? null : rs.getDouble("vl_aj"));
        reg.setCodAj(rs.getString("cod_aj"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setDescrAj(rs.getString("descr_aj"));
        reg.setDtRef(rs.getDate("dt_ref"));
        return reg;
    }
}
