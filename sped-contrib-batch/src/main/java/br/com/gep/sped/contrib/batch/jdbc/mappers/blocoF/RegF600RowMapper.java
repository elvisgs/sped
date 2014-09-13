package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.blocoF.RegF600;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegF600RowMapper implements RowMapper<RegF600> {

    @Override
    public RegF600 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegF600 reg = new RegF600();
        reg.setId(rs.getInt("id"));
        reg.setIndNatRet(rs.getString("ind_nat_ret"));
        reg.setDtRet(rs.getDate("dt_ret"));
        reg.setVlBcRet(rs.getObject("vl_bc_ret") == null ? null : rs.getDouble("vl_bc_ret"));
        reg.setVlRet(rs.getObject("vl_ret") == null ? null : rs.getDouble("vl_ret"));
        reg.setCodRec(rs.getString("cod_rec"));
        reg.setIndNatRec(rs.getString("ind_nat_rec"));
        reg.setCnpj(rs.getString("cnpj"));
        reg.setVlRetPis(rs.getObject("vl_ret_pis") == null ? null : rs.getDouble("vl_ret_pis"));
        reg.setVlRetCofins(rs.getObject("vl_ret_cofins") == null ? null : rs.getDouble("vl_ret_cofins"));
        reg.setIndDec(rs.getString("ind_dec"));
        return reg;
    }
}
