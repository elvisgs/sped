package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC600;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC600RowMapper implements RowMapper<RegC600> {

    @Override
    public RegC600 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC600 reg = new RegC600();
        reg.setId(rs.getInt("id"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setCodMun(rs.getString("cod_mun"));
        reg.setSer(rs.getString("ser"));
        reg.setSub(rs.getString("sub"));
        reg.setCodCons(rs.getString("cod_cons"));
        reg.setQtdCons(rs.getInt("qtd_cons"));
        reg.setQtdCanc(rs.getInt("qtd_canc"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setVlDoc(rs.getObject("vl_doc") == null ? null : rs.getDouble("vl_doc"));
        reg.setVlDesc(rs.getObject("vl_desc") == null ? null : rs.getDouble("vl_desc"));
        reg.setCons(rs.getInt("cons"));
        reg.setVlForn(rs.getObject("vl_forn") == null ? null : rs.getDouble("vl_forn"));
        reg.setVlServNt(rs.getObject("vl_serv_nt") == null ? null : rs.getDouble("vl_serv_nt"));
        reg.setVlTerc(rs.getObject("vl_terc") == null ? null : rs.getDouble("vl_terc"));
        reg.setVlDa(rs.getObject("vl_da") == null ? null : rs.getDouble("vl_da"));
        reg.setVlBcIcms(rs.getObject("vl_bc_icms") == null ? null : rs.getDouble("vl_bc_icms"));
        reg.setVlIcms(rs.getObject("vl_icms") == null ? null : rs.getDouble("vl_icms"));
        reg.setVlBcIcmsSt(rs.getObject("vl_bc_icms_st") == null ? null : rs.getDouble("vl_bc_icms_st"));
        reg.setVlIcmsSt(rs.getObject("vl_icms_st") == null ? null : rs.getDouble("vl_icms_st"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        return reg;
    }
}
