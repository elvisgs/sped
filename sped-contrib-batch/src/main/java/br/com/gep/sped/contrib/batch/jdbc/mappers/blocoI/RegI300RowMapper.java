package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoI;

import br.com.gep.sped.contrib.marshaller.registros.blocoI.RegI300;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegI300RowMapper implements RowMapper<RegI300> {

    @Override
    public RegI300 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegI300 reg = new RegI300();
        reg.setId(rs.getInt("id"));
        reg.setCodComp(rs.getString("cod_comp"));
        reg.setVlComp(rs.getObject("vl_comp") == null ? null : rs.getDouble("vl_comp"));
        reg.setCodCta(rs.getString("cod_cta"));
        reg.setInfComp(rs.getString("inf_comp"));
        return reg;
    }
}
