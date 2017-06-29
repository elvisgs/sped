package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD300;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD300RowMapper implements RowMapper<RegD300> {

    @Override
    public RegD300 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD300 reg = new RegD300();
        reg.setId(rs.getInt("id"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setSer(rs.getString("ser"));
        reg.setSub(rs.getString("sub"));
        reg.setNumDocIni(rs.getString("num_doc_ini"));
        reg.setNumDocFin(rs.getInt("num_doc_fin"));
        reg.setCstIcms(rs.getString("cst_icms"));
        reg.setCfop(rs.getString("cfop"));
        reg.setAliqIcms(rs.getObject("aliq_icms") == null ? null : rs.getDouble("aliq_icms"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setVlOpr(rs.getObject("vl_opr") == null ? null : rs.getDouble("vl_opr"));
        reg.setVlDesc(rs.getObject("vl_desc") == null ? null : rs.getDouble("vl_desc"));
        reg.setVlServ(rs.getObject("vl_serv") == null ? null : rs.getDouble("vl_serv"));
        reg.setVlSeg(rs.getObject("vl_seg") == null ? null : rs.getDouble("vl_seg"));
        reg.setVlOutDesp(rs.getObject("vl_out_desp") == null ? null : rs.getDouble("vl_out_desp"));
        reg.setVlBcIcms(rs.getObject("vl_bc_icms") == null ? null : rs.getDouble("vl_bc_icms"));
        reg.setVlIcms(rs.getObject("vl_icms") == null ? null : rs.getDouble("vl_icms"));
        reg.setVlRedBc(rs.getObject("vl_red_bc") == null ? null : rs.getDouble("vl_red_bc"));
        reg.setCodObs(rs.getString("cod_obs"));
        reg.setCodCta(rs.getString("cod_cta"));
        return reg;
    }
}
