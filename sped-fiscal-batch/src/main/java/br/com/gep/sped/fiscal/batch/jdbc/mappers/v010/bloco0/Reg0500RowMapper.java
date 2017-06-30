package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco0.Reg0500;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
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
        return reg;
    }
}
