package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC.RegC500;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC500RowMapper implements RowMapper<RegC500> {

    @Override
    public RegC500 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC500 reg = new RegC500();
        reg.setId(rs.getInt("id"));
        reg.setIndOper(rs.getString("ind_oper"));
        reg.setIndEmit(rs.getString("ind_emit"));
        reg.setCodPart(rs.getString("cod_part"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setCodSit(rs.getString("cod_sit"));
        reg.setSer(rs.getString("ser"));
        reg.setSub(rs.getString("sub"));
        reg.setCodCons(rs.getString("cod_cons"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setDtES(rs.getDate("dt_e_s"));
        reg.setVlDoc(rs.getObject("vl_doc") == null ? null : rs.getDouble("vl_doc"));
        reg.setVlDesc(rs.getObject("vl_desc") == null ? null : rs.getDouble("vl_desc"));
        reg.setVlForn(rs.getObject("vl_forn") == null ? null : rs.getDouble("vl_forn"));
        reg.setVlServNt(rs.getObject("vl_serv_nt") == null ? null : rs.getDouble("vl_serv_nt"));
        reg.setVlTerc(rs.getObject("vl_terc") == null ? null : rs.getDouble("vl_terc"));
        reg.setVlDa(rs.getObject("vl_da") == null ? null : rs.getDouble("vl_da"));
        reg.setVlBcIcms(rs.getObject("vl_bc_icms") == null ? null : rs.getDouble("vl_bc_icms"));
        reg.setVlIcms(rs.getObject("vl_icms") == null ? null : rs.getDouble("vl_icms"));
        reg.setVlBcIcmsSt(rs.getObject("vl_bc_icms_st") == null ? null : rs.getDouble("vl_bc_icms_st"));
        reg.setVlIcmsSt(rs.getObject("vl_icms_st") == null ? null : rs.getDouble("vl_icms_st"));
        reg.setCodInf(rs.getString("cod_inf"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        reg.setTpLigacao(rs.getString("tp_ligacao"));
        reg.setCodGrupoTensao(rs.getString("cod_grupo_tensao"));
        return reg;
    }
}
