package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoA;

import br.com.gep.sped.contrib.marshaller.registros.blocoA.RegA100;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegA100RowMapper implements RowMapper<RegA100> {

    @Override
    public RegA100 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegA100 reg = new RegA100();
        reg.setId(rs.getInt("id"));
        reg.setIndOper(rs.getString("ind_oper"));
        reg.setIndEmit(rs.getString("ind_emit"));
        reg.setCodPart(rs.getString("cod_part"));
        reg.setCodSit(rs.getString("cod_sit"));
        reg.setSer(rs.getString("ser"));
        reg.setSub(rs.getString("sub"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setChvNfse(rs.getString("chv_nfse"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setDtExeServ(rs.getDate("dt_exe_serv"));
        reg.setVlDoc(rs.getObject("vl_doc") == null ? null : rs.getDouble("vl_doc"));
        reg.setIndPgto(rs.getString("ind_pgto"));
        reg.setVlDesc(rs.getObject("vl_desc") == null ? null : rs.getDouble("vl_desc"));
        reg.setVlBcPis(rs.getObject("vl_bc_pis") == null ? null : rs.getDouble("vl_bc_pis"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setVlBcCofins(rs.getObject("vl_bc_cofins") == null ? null : rs.getDouble("vl_bc_cofins"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        reg.setVlPisRet(rs.getObject("vl_pis_ret") == null ? null : rs.getDouble("vl_pis_ret"));
        reg.setVlCofinsRet(rs.getObject("vl_cofins_ret") == null ? null : rs.getDouble("vl_cofins_ret"));
        reg.setVlIss(rs.getObject("vl_iss") == null ? null : rs.getDouble("vl_iss"));
        return reg;
    }
}
