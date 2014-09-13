package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0500;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reg0500RowMapper implements RowMapper<Reg0500> {

    @Override
    public Reg0500 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0500 reg = new Reg0500();
        reg.setId(rs.getInt("id"));
        reg.setDtAlt(rs.getDate("dt_alt"));
        reg.setCodNatCc(rs.getString("cod_nat_cc"));
        reg.setIndCta(rs.getString("ind_cta"));
        reg.setNivel(rs.getString("nivel"));
        reg.setCodCta(rs.getString("cod_cta"));
        reg.setNomeCta(rs.getString("nome_cta"));
        reg.setCodCtaRef(rs.getString("cod_cta_ref"));
        reg.setCnpjEst(rs.getString("cnpj_est"));
        return reg;
    }
}
