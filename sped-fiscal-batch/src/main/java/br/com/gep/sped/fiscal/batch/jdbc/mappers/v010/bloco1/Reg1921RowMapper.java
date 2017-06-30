package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1.Reg1921;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1921RowMapper implements RowMapper<Reg1921> {

    @Override
    public Reg1921 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1921 reg = new Reg1921();
        reg.setId(rs.getInt("id"));
        reg.setCodAjApur(rs.getString("cod_aj_apur"));
        reg.setDescrComplAj(rs.getString("descr_compl_aj"));
        reg.setVlAjApur(rs.getObject("vl_aj_apur") == null ? null : rs.getDouble("vl_aj_apur"));
        return reg;
    }
}
