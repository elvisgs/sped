package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD530;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegD530RowMapper implements RowMapper<RegD530> {

    @Override
    public RegD530 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD530 reg = new RegD530();
        reg.setId(rs.getInt("id"));
        reg.setIndServ(rs.getString("ind_serv"));
        reg.setDtIniServ(rs.getDate("dt_ini_serv"));
        reg.setDtFinServ(rs.getDate("dt_fin_serv"));
        reg.setPerFiscal(rs.getString("per_fiscal"));
        reg.setCodArea(rs.getString("cod_area"));
        reg.setTerminal(rs.getInt("terminal"));
        return reg;
    }
}
