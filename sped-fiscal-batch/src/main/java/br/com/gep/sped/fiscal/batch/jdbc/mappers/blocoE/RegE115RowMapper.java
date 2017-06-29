package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.blocoE.RegE115;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegE115RowMapper implements RowMapper<RegE115> {

    @Override
    public RegE115 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE115 reg = new RegE115();
        reg.setId(rs.getInt("id"));
        reg.setCodInfAdic(rs.getString("cod_inf_adic"));
        reg.setVlInfAdic(rs.getObject("vl_inf_adic") == null ? null : rs.getDouble("vl_inf_adic"));
        reg.setDescrComplAj(rs.getString("descr_compl_aj"));
        return reg;
    }
}
