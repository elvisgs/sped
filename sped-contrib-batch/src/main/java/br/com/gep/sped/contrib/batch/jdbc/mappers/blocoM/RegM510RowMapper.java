package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM510;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegM510RowMapper implements RowMapper<RegM510> {

    @Override
    public RegM510 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM510 reg = new RegM510();
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
