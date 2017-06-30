package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD.RegD130;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD130RowMapper implements RowMapper<RegD130> {

    @Override
    public RegD130 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD130 reg = new RegD130();
        reg.setId(rs.getInt("id"));
        reg.setCodPartConsg(rs.getString("cod_part_consg"));
        reg.setCodPartRed(rs.getString("cod_part_red"));
        reg.setIndFrtRed(rs.getString("ind_frt_red"));
        reg.setCodMunOrig(rs.getString("cod_mun_orig"));
        reg.setCodMunDest(rs.getString("cod_mun_dest"));
        reg.setVeicId(rs.getString("veic_id"));
        reg.setVlLiqFrt(rs.getObject("vl_liq_frt") == null ? null : rs.getDouble("vl_liq_frt"));
        reg.setVlSecCat(rs.getObject("vl_sec_cat") == null ? null : rs.getDouble("vl_sec_cat"));
        reg.setVlDesp(rs.getObject("vl_desp") == null ? null : rs.getDouble("vl_desp"));
        reg.setVlPedg(rs.getObject("vl_pedg") == null ? null : rs.getDouble("vl_pedg"));
        reg.setVlOut(rs.getObject("vl_out") == null ? null : rs.getDouble("vl_out"));
        reg.setVlFrt(rs.getObject("vl_frt") == null ? null : rs.getDouble("vl_frt"));
        reg.setUfId(rs.getString("uf_id"));
        return reg;
    }
}
