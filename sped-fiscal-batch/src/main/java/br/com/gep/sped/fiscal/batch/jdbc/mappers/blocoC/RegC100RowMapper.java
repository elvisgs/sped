package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC100;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC100RowMapper implements RowMapper<RegC100> {

    @Override
    public RegC100 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC100 reg = new RegC100();
        reg.setId(rs.getInt("id"));
        reg.setIndOper(rs.getString("ind_oper"));
        reg.setIndEmit(rs.getString("ind_emit"));
        reg.setCodPart(rs.getString("cod_part"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setCodSit(rs.getString("cod_sit"));
        reg.setSer(rs.getString("ser"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setChvNfe(rs.getString("chv_nfe"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setDtES(rs.getDate("dt_e_s"));
        reg.setVlDoc(rs.getObject("vl_doc") == null ? null : rs.getDouble("vl_doc"));
        reg.setIndPgto(rs.getString("ind_pgto"));
        reg.setVlDesc(rs.getObject("vl_desc") == null ? null : rs.getDouble("vl_desc"));
        reg.setVlAbatNt(rs.getObject("vl_abat_nt") == null ? null : rs.getDouble("vl_abat_nt"));
        reg.setVlMerc(rs.getObject("vl_merc") == null ? null : rs.getDouble("vl_merc"));
        reg.setIndFrt(rs.getString("ind_frt"));
        reg.setVlFrt(rs.getObject("vl_frt") == null ? null : rs.getDouble("vl_frt"));
        reg.setVlSeg(rs.getObject("vl_seg") == null ? null : rs.getDouble("vl_seg"));
        reg.setVlOutDa(rs.getObject("vl_out_da") == null ? null : rs.getDouble("vl_out_da"));
        reg.setVlBcIcms(rs.getObject("vl_bc_icms") == null ? null : rs.getDouble("vl_bc_icms"));
        reg.setVlIcms(rs.getObject("vl_icms") == null ? null : rs.getDouble("vl_icms"));
        reg.setVlBcIcmsSt(rs.getObject("vl_bc_icms_st") == null ? null : rs.getDouble("vl_bc_icms_st"));
        reg.setVlIcmsSt(rs.getObject("vl_icms_st") == null ? null : rs.getDouble("vl_icms_st"));
        reg.setVlIpi(rs.getObject("vl_ipi") == null ? null : rs.getDouble("vl_ipi"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        reg.setVlPisSt(rs.getObject("vl_pis_st") == null ? null : rs.getDouble("vl_pis_st"));
        reg.setVlCofinsSt(rs.getObject("vl_cofins_st") == null ? null : rs.getDouble("vl_cofins_st"));
        return reg;
    }
}
