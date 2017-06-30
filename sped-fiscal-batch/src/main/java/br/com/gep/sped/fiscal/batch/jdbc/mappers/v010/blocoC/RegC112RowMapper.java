package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC.RegC112;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC112RowMapper implements RowMapper<RegC112> {

    @Override
    public RegC112 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC112 reg = new RegC112();
        reg.setId(rs.getInt("id"));
        reg.setCodDa(rs.getString("cod_da"));
        reg.setUf(rs.getString("uf"));
        reg.setNumDa(rs.getString("num_da"));
        reg.setCodAut(rs.getString("cod_aut"));
        reg.setVlDa(rs.getObject("vl_da") == null ? null : rs.getDouble("vl_da"));
        reg.setDtVcto(rs.getDate("dt_vcto"));
        reg.setDtPgto(rs.getDate("dt_pgto"));
        return reg;
    }
}
