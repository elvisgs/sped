package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC500;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC500RowMapper implements RowMapper<RegC500> {

    @Override
    public RegC500 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC500 reg = new RegC500();
        reg.setId(rs.getInt("id"));
        reg.setCodPart(rs.getString("cod_part"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setCodSit(rs.getString("cod_sit"));
        reg.setSer(rs.getString("ser"));
        reg.setSub(rs.getString("sub"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setDtES(rs.getDate("dt_e_s"));
        reg.setVlDoc(rs.getObject("vl_doc") == null ? null : rs.getDouble("vl_doc"));
        reg.setVlIcms(rs.getObject("vl_icms") == null ? null : rs.getDouble("vl_icms"));
        reg.setCodInf(rs.getString("cod_inf"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        return reg;
    }
}
