package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD.RegD350;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD350RowMapper implements RowMapper<RegD350> {

    @Override
    public RegD350 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD350 reg = new RegD350();
        reg.setId(rs.getInt("id"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setEcfMod(rs.getString("ecf_mod"));
        reg.setEcfFab(rs.getString("ecf_fab"));
        reg.setEcfCx(rs.getString("ecf_cx"));
        return reg;
    }
}
