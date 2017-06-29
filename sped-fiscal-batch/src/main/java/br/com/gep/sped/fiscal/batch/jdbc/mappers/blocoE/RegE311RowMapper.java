package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.blocoE.RegE311;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegE311RowMapper implements RowMapper<RegE311> {

    @Override
    public RegE311 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE311 reg = new RegE311();
        reg.setId(rs.getInt("id"));
        reg.setCodAjApur(rs.getString("cod_aj_apur"));
        reg.setDescrComplAj(rs.getString("descr_compl_aj"));
        reg.setVlAjApur(rs.getObject("vl_aj_apur") == null ? null : rs.getDouble("vl_aj_apur"));
        return reg;
    }
}
