package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco0.Reg0150;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg0150RowMapper implements RowMapper<Reg0150> {

    @Override
    public Reg0150 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0150 reg = new Reg0150();
        reg.setId(rs.getInt("id"));
        reg.setCodPart(rs.getString("cod_part"));
        reg.setNome(rs.getString("nome"));
        reg.setCodPais(rs.getString("cod_pais"));
        reg.setCnpj(rs.getString("cnpj"));
        reg.setCpf(rs.getString("cpf"));
        reg.setIe(rs.getString("ie"));
        reg.setCodMun(rs.getString("cod_mun"));
        reg.setSuframa(rs.getString("suframa"));
        reg.setEndereco(rs.getString("endereco"));
        reg.setNum(rs.getString("num"));
        reg.setCompl(rs.getString("compl"));
        reg.setBairro(rs.getString("bairro"));
        return reg;
    }
}
