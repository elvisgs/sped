package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD140;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegD140RowMapper implements RowMapper<RegD140> {

    @Override
    public RegD140 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD140 reg = new RegD140();
        reg.setId(rs.getInt("id"));
        reg.setCodPartConsg(rs.getString("cod_part_consg"));
        reg.setCodMunOrig(rs.getString("cod_mun_orig"));
        reg.setCodMunDest(rs.getString("cod_mun_dest"));
        reg.setIndVeic(rs.getString("ind_veic"));
        reg.setVeicId(rs.getString("veic_id"));
        reg.setIndNav(rs.getString("ind_nav"));
        reg.setViagem(rs.getInt("viagem"));
        reg.setVlFrtLiq(rs.getObject("vl_frt_liq") == null ? null : rs.getDouble("vl_frt_liq"));
        reg.setVlDespPort(rs.getObject("vl_desp_port") == null ? null : rs.getDouble("vl_desp_port"));
        reg.setVlDespCarDesc(rs.getObject("vl_desp_car_desc") == null ? null : rs.getDouble("vl_desp_car_desc"));
        reg.setVlOut(rs.getObject("vl_out") == null ? null : rs.getDouble("vl_out"));
        reg.setVlFrtBrt(rs.getObject("vl_frt_brt") == null ? null : rs.getDouble("vl_frt_brt"));
        reg.setVlFrtMm(rs.getObject("vl_frt_mm") == null ? null : rs.getDouble("vl_frt_mm"));
        return reg;
    }
}
