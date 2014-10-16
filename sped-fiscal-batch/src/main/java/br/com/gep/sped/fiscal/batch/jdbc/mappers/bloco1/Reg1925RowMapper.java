package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.bloco1.Reg1925;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reg1925RowMapper implements RowMapper<Reg1925> {

    @Override
    public Reg1925 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1925 reg = new Reg1925();
        reg.setId(rs.getInt("id"));
        reg.setCodInfAdic(rs.getString("cod_inf_adic"));
        reg.setVlInfAdic(rs.getObject("vl_inf_adic") == null ? null : rs.getDouble("vl_inf_adic"));
        reg.setDescComplAj(rs.getString("desc_compl_aj"));
        return reg;
    }
}
