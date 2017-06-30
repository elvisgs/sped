package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC.RegC175;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC175RowMapper implements RowMapper<RegC175> {

    @Override
    public RegC175 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC175 reg = new RegC175();
        reg.setId(rs.getInt("id"));
        reg.setIndVeicOper(rs.getString("ind_veic_oper"));
        reg.setCnpj(rs.getString("cnpj"));
        reg.setUf(rs.getString("uf"));
        reg.setChassiVeic(rs.getString("chassi_veic"));
        return reg;
    }
}
