package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC160;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC160RowMapper implements RowMapper<RegC160> {

    @Override
    public RegC160 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC160 reg = new RegC160();
        reg.setId(rs.getInt("id"));
        reg.setCodPart(rs.getString("cod_part"));
        reg.setVeicId(rs.getString("veic_id"));
        reg.setQtdVol(rs.getInt("qtd_vol"));
        reg.setPesoBrt(rs.getObject("peso_brt") == null ? null : rs.getDouble("peso_brt"));
        reg.setPesoLiq(rs.getObject("peso_liq") == null ? null : rs.getDouble("peso_liq"));
        reg.setUfId(rs.getString("uf_id"));
        return reg;
    }
}
