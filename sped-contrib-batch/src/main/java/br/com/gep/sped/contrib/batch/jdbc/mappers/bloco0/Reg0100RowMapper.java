package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0100;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg0100RowMapper implements RowMapper<Reg0100> {

    @Override
    public Reg0100 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0100 reg = new Reg0100();
        reg.setId(rs.getInt("id"));
        reg.setNome(rs.getString("nome"));
        reg.setCpf(rs.getString("cpf"));
        reg.setCrc(rs.getString("crc"));
        reg.setCnpj(rs.getString("cnpj"));
        reg.setCep(rs.getString("cep"));
        reg.setEnd(rs.getString("end"));
        reg.setNum(rs.getString("num"));
        reg.setCompl(rs.getString("compl"));
        reg.setBairro(rs.getString("bairro"));
        reg.setFone(rs.getString("fone"));
        reg.setFax(rs.getString("fax"));
        reg.setEmail(rs.getString("email"));
        reg.setCodMun(rs.getString("cod_mun"));
        return reg;
    }
}
