package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoP;

import br.com.gep.sped.contrib.marshaller.registros.blocoP.RegP210;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegP210RowMapper implements RowMapper<RegP210> {

    @Override
    public RegP210 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegP210 reg = new RegP210();
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
