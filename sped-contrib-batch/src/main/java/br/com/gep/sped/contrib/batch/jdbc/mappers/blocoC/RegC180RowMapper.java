package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC180;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC180RowMapper implements RowMapper<RegC180> {

    @Override
    public RegC180 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC180 reg = new RegC180();
        reg.setId(rs.getInt("id"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setDtDocIni(rs.getDate("dt_doc_ini"));
        reg.setDtDocFin(rs.getDate("dt_doc_fin"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setCodNcm(rs.getString("cod_ncm"));
        reg.setExIpi(rs.getString("ex_ipi"));
        reg.setVlTotItem(rs.getObject("vl_tot_item") == null ? null : rs.getDouble("vl_tot_item"));
        return reg;
    }
}
