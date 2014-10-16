package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC800;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC800RowMapper implements RowMapper<RegC800> {

    @Override
    public RegC800 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC800 reg = new RegC800();
        reg.setId(rs.getInt("id"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setCodSit(rs.getString("cod_sit"));
        reg.setNumCfe(rs.getString("num_cfe"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setVlCfe(rs.getObject("vl_cfe") == null ? null : rs.getDouble("vl_cfe"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        reg.setCnpjCpf(rs.getString("cnpj_cpf"));
        reg.setNrSat(rs.getString("nr_sat"));
        reg.setChvCfe(rs.getString("chv_cfe"));
        reg.setVlDesc(rs.getObject("vl_desc") == null ? null : rs.getDouble("vl_desc"));
        reg.setVlMerc(rs.getObject("vl_merc") == null ? null : rs.getDouble("vl_merc"));
        reg.setVlOutDa(rs.getObject("vl_out_da") == null ? null : rs.getDouble("vl_out_da"));
        reg.setVlIcms(rs.getObject("vl_icms") == null ? null : rs.getDouble("vl_icms"));
        reg.setVlPisSt(rs.getObject("vl_pis_st") == null ? null : rs.getDouble("vl_pis_st"));
        reg.setVlCofinsSt(rs.getObject("vl_cofins_st") == null ? null : rs.getDouble("vl_cofins_st"));
        return reg;
    }
}
