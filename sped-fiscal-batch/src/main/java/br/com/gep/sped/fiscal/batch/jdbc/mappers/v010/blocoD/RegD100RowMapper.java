package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD.RegD100;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD100RowMapper implements RowMapper<RegD100> {

    @Override
    public RegD100 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD100 reg = new RegD100();
        reg.setId(rs.getInt("id"));
        reg.setIndOper(rs.getString("ind_oper"));
        reg.setIndEmit(rs.getString("ind_emit"));
        reg.setCodPart(rs.getString("cod_part"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setCodSit(rs.getString("cod_sit"));
        reg.setSer(rs.getString("ser"));
        reg.setSub(rs.getString("sub"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setChvCte(rs.getString("chv_cte"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setDtAP(rs.getDate("dt_a_p"));
        reg.setTpCtE(rs.getString("tp_ct_e"));
        reg.setChvCteRef(rs.getString("chv_cte_ref"));
        reg.setVlDoc(rs.getObject("vl_doc") == null ? null : rs.getDouble("vl_doc"));
        reg.setVlDesc(rs.getObject("vl_desc") == null ? null : rs.getDouble("vl_desc"));
        reg.setIndFrt(rs.getString("ind_frt"));
        reg.setVlServ(rs.getObject("vl_serv") == null ? null : rs.getDouble("vl_serv"));
        reg.setVlBcIcms(rs.getObject("vl_bc_icms") == null ? null : rs.getDouble("vl_bc_icms"));
        reg.setVlIcms(rs.getObject("vl_icms") == null ? null : rs.getDouble("vl_icms"));
        reg.setVlNt(rs.getObject("vl_nt") == null ? null : rs.getDouble("vl_nt"));
        reg.setCodInf(rs.getString("cod_inf"));
        reg.setCodCta(rs.getString("cod_cta"));
        return reg;
    }
}
