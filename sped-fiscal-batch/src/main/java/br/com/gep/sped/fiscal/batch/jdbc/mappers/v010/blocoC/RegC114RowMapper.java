package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC.RegC114;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC114RowMapper implements RowMapper<RegC114> {

    @Override
    public RegC114 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC114 reg = new RegC114();
        reg.setId(rs.getInt("id"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setEcfFab(rs.getString("ecf_fab"));
        reg.setEcfCx(rs.getString("ecf_cx"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        return reg;
    }
}
