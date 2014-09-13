package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoA;

import br.com.gep.sped.contrib.marshaller.registros.blocoA.RegA120;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegA120RowMapper implements RowMapper<RegA120> {

    @Override
    public RegA120 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegA120 reg = new RegA120();
        reg.setId(rs.getInt("id"));
        reg.setVlTotServ(rs.getObject("vl_tot_serv") == null ? null : rs.getDouble("vl_tot_serv"));
        reg.setVlBcPis(rs.getObject("vl_bc_pis") == null ? null : rs.getDouble("vl_bc_pis"));
        reg.setVlPisImp(rs.getObject("vl_pis_imp") == null ? null : rs.getDouble("vl_pis_imp"));
        reg.setDtPagPis(rs.getDate("dt_pag_pis"));
        reg.setVlBcCofins(rs.getObject("vl_bc_cofins") == null ? null : rs.getDouble("vl_bc_cofins"));
        reg.setVlCofinsImp(rs.getObject("vl_cofins_imp") == null ? null : rs.getDouble("vl_cofins_imp"));
        reg.setDtPagCofins(rs.getDate("dt_pag_cofins"));
        reg.setLocExeServ(rs.getString("loc_exe_serv"));
        return reg;
    }
}
