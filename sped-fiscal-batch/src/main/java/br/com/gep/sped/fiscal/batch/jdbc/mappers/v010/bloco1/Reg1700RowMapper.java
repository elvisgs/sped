package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1.Reg1700;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1700RowMapper implements RowMapper<Reg1700> {

    @Override
    public Reg1700 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1700 reg = new Reg1700();
        reg.setId(rs.getInt("id"));
        reg.setCodDisp(rs.getString("cod_disp"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setSer(rs.getString("ser"));
        reg.setSub(rs.getString("sub"));
        reg.setNumDocIni(rs.getString("num_doc_ini"));
        reg.setNumDocFin(rs.getString("num_doc_fin"));
        reg.setNumAut(rs.getString("num_aut"));
        return reg;
    }
}
