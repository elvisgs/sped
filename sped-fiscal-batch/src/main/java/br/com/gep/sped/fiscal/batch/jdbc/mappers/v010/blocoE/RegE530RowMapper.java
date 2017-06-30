package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoE.RegE530;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegE530RowMapper implements RowMapper<RegE530> {

    @Override
    public RegE530 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE530 reg = new RegE530();
        reg.setId(rs.getInt("id"));
        reg.setIndAj(rs.getString("ind_aj"));
        reg.setVlAj(rs.getObject("vl_aj") == null ? null : rs.getDouble("vl_aj"));
        reg.setCodAj(rs.getString("cod_aj"));
        reg.setIndDoc(rs.getString("ind_doc"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setDescrAj(rs.getString("descr_aj"));
        return reg;
    }
}
