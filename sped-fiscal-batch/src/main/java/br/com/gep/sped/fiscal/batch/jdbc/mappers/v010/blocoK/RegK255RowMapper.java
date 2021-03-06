package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoK;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoK.RegK255;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegK255RowMapper implements RowMapper<RegK255> {

    @Override
    public RegK255 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegK255 reg = new RegK255();
        reg.setId(rs.getInt("id"));
        reg.setDtCons(rs.getDate("dt_cons"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setQtd(rs.getObject("qtd") == null ? null : rs.getDouble("qtd"));
        reg.setCodInsSubst(rs.getString("cod_ins_subst"));
        return reg;
    }
}
