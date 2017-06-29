package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD170;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD170RowMapper implements RowMapper<RegD170> {

    @Override
    public RegD170 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD170 reg = new RegD170();
        reg.setId(rs.getInt("id"));
        reg.setCodPartConsg(rs.getString("cod_part_consg"));
        reg.setCodPartRed(rs.getString("cod_part_red"));
        reg.setCodMunOrig(rs.getString("cod_mun_orig"));
        reg.setCodMunDest(rs.getString("cod_mun_dest"));
        reg.setOtm(rs.getString("otm"));
        reg.setIndNatFrt(rs.getString("ind_nat_frt"));
        reg.setVlLiqFrt(rs.getObject("vl_liq_frt") == null ? null : rs.getDouble("vl_liq_frt"));
        reg.setVlGris(rs.getObject("vl_gris") == null ? null : rs.getDouble("vl_gris"));
        reg.setVlPdg(rs.getObject("vl_pdg") == null ? null : rs.getDouble("vl_pdg"));
        reg.setVlOut(rs.getObject("vl_out") == null ? null : rs.getDouble("vl_out"));
        reg.setVlFrt(rs.getObject("vl_frt") == null ? null : rs.getDouble("vl_frt"));
        reg.setVeicId(rs.getString("veic_id"));
        reg.setUfId(rs.getString("uf_id"));
        return reg;
    }
}
