package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.bloco1.Reg1210;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reg1210RowMapper implements RowMapper<Reg1210> {

    @Override
    public Reg1210 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1210 reg = new Reg1210();
        reg.setId(rs.getInt("id"));
        reg.setTipoUtil(rs.getString("tipo_util"));
        reg.setNrDoc(rs.getString("nr_doc"));
        reg.setVlCredUtil(rs.getObject("vl_cred_util") == null ? null : rs.getDouble("vl_cred_util"));
        return reg;
    }
}
