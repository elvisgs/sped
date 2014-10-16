package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0005;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reg0005RowMapper implements RowMapper<Reg0005> {

    @Override
    public Reg0005 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0005 reg = new Reg0005();
        reg.setId(rs.getInt("id"));
        reg.setFantasia(rs.getString("fantasia"));
        reg.setCep(rs.getString("cep"));
        reg.setEndereco(rs.getString("endereco"));
        reg.setNum(rs.getString("num"));
        reg.setCompl(rs.getString("compl"));
        reg.setBairro(rs.getString("bairro"));
        reg.setFone(rs.getString("fone"));
        reg.setFax(rs.getString("fax"));
        reg.setEmail(rs.getString("email"));
        return reg;
    }
}
