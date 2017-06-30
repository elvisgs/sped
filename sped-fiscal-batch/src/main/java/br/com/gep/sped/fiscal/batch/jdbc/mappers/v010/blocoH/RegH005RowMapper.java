package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoH;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoH.RegH005;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegH005RowMapper implements RowMapper<RegH005> {

    @Override
    public RegH005 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegH005 reg = new RegH005();
        reg.setId(rs.getInt("id"));
        reg.setDtInv(rs.getDate("dt_inv"));
        reg.setVlInv(rs.getObject("vl_inv") == null ? null : rs.getDouble("vl_inv"));
        reg.setMotInv(rs.getString("mot_inv"));
        return reg;
    }
}
