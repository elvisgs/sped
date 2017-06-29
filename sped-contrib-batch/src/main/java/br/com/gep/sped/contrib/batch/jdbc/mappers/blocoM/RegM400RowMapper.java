package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM400;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegM400RowMapper implements RowMapper<RegM400> {

    @Override
    public RegM400 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM400 reg = new RegM400();
        reg.setId(rs.getInt("id"));
        reg.setCstPis(rs.getString("cst_pis"));
        reg.setVlTotRec(rs.getObject("vl_tot_rec") == null ? null : rs.getDouble("vl_tot_rec"));
        reg.setCodCta(rs.getString("cod_cta"));
        reg.setDescCompl(rs.getString("desc_compl"));
        return reg;
    }
}
