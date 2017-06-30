package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoK;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoK.RegK235;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegK235RowMapper implements RowMapper<RegK235> {

    @Override
    public RegK235 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegK235 reg = new RegK235();
        reg.setId(rs.getInt("id"));
        reg.setDtSaida(rs.getDate("dt_saida"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setQtd(rs.getObject("qtd") == null ? null : rs.getDouble("qtd"));
        reg.setCodInsSubst(rs.getString("cod_ins_subst"));
        return reg;
    }
}
