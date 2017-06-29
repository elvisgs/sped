package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.bloco1.Reg1710;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1710RowMapper implements RowMapper<Reg1710> {

    @Override
    public Reg1710 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1710 reg = new Reg1710();
        reg.setId(rs.getInt("id"));
        reg.setNumDocIni(rs.getString("num_doc_ini"));
        reg.setNumDocFin(rs.getString("num_doc_fin"));
        return reg;
    }
}
