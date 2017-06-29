package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD162;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD162RowMapper implements RowMapper<RegD162> {

    @Override
    public RegD162 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD162 reg = new RegD162();
        reg.setId(rs.getInt("id"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setSer(rs.getString("ser"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setVlDoc(rs.getObject("vl_doc") == null ? null : rs.getDouble("vl_doc"));
        reg.setVlMerc(rs.getObject("vl_merc") == null ? null : rs.getDouble("vl_merc"));
        reg.setQtdVol(rs.getInt("qtd_vol"));
        reg.setPesoBrt(rs.getObject("peso_brt") == null ? null : rs.getDouble("peso_brt"));
        reg.setPesoLiq(rs.getObject("peso_liq") == null ? null : rs.getDouble("peso_liq"));
        return reg;
    }
}
