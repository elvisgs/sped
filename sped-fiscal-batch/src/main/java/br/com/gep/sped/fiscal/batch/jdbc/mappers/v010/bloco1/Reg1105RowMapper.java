package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1.Reg1105;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1105RowMapper implements RowMapper<Reg1105> {

    @Override
    public Reg1105 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1105 reg = new Reg1105();
        reg.setId(rs.getInt("id"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setSer(rs.getString("ser"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setChvNfe(rs.getString("chv_nfe"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setCodItem(rs.getString("cod_item"));
        return reg;
    }
}
