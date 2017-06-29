package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM800;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegM800RowMapper implements RowMapper<RegM800> {

    @Override
    public RegM800 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM800 reg = new RegM800();
        reg.setId(rs.getInt("id"));
        reg.setCstCofins(rs.getString("cst_cofins"));
        reg.setVlTotRec(rs.getObject("vl_tot_rec") == null ? null : rs.getDouble("vl_tot_rec"));
        reg.setCodCta(rs.getString("cod_cta"));
        reg.setDescCompl(rs.getString("desc_compl"));
        return reg;
    }
}
