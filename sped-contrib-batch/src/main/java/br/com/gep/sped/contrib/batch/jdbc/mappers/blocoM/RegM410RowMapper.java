package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM410;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegM410RowMapper implements RowMapper<RegM410> {

    @Override
    public RegM410 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM410 reg = new RegM410();
        reg.setId(rs.getInt("id"));
        reg.setNatRec(rs.getString("nat_rec"));
        reg.setVlRec(rs.getObject("vl_rec") == null ? null : rs.getDouble("vl_rec"));
        reg.setCodCta(rs.getString("cod_cta"));
        reg.setDescCompl(rs.getString("desc_compl"));
        return reg;
    }
}
