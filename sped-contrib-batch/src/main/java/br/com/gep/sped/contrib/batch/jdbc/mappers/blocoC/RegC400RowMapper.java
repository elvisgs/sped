package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC400;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC400RowMapper implements RowMapper<RegC400> {

    @Override
    public RegC400 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC400 reg = new RegC400();
        reg.setId(rs.getInt("id"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setEcfMod(rs.getString("ecf_mod"));
        reg.setEcfFab(rs.getString("ecf_fab"));
        reg.setEcfCx(rs.getString("ecf_cx"));
        return reg;
    }
}
