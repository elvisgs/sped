package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM810;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegM810RowMapper implements RowMapper<RegM810> {

    @Override
    public RegM810 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM810 reg = new RegM810();
        reg.setId(rs.getInt("id"));
        reg.setNatRec(rs.getString("nat_rec"));
        reg.setVlRec(rs.getObject("vl_rec") == null ? null : rs.getDouble("vl_rec"));
        reg.setCodCta(rs.getString("cod_cta"));
        reg.setDescCompl(rs.getString("desc_compl"));
        return reg;
    }
}
