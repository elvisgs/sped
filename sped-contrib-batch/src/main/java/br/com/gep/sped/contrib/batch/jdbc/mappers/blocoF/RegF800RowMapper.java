package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.blocoF.RegF800;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegF800RowMapper implements RowMapper<RegF800> {

    @Override
    public RegF800 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegF800 reg = new RegF800();
        reg.setId(rs.getInt("id"));
        reg.setIndNatEven(rs.getString("ind_nat_even"));
        reg.setDtEven(rs.getDate("dt_even"));
        reg.setCnpjSuced(rs.getString("cnpj_suced"));
        reg.setPaContCred(rs.getString("pa_cont_cred"));
        reg.setCodCred(rs.getString("cod_cred"));
        reg.setVlCredPis(rs.getObject("vl_cred_pis") == null ? null : rs.getDouble("vl_cred_pis"));
        reg.setVlCredCofins(rs.getObject("vl_cred_cofins") == null ? null : rs.getDouble("vl_cred_cofins"));
        reg.setPerCredCis(rs.getObject("per_cred_cis") == null ? null : rs.getDouble("per_cred_cis"));
        return reg;
    }
}
