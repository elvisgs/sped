package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0140;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg0140RowMapper implements RowMapper<Reg0140> {

    @Override
    public Reg0140 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0140 reg = new Reg0140();
        reg.setId(rs.getInt("id"));
        reg.setCodEst(rs.getString("cod_est"));
        reg.setNome(rs.getString("nome"));
        reg.setCnpj(rs.getString("cnpj"));
        reg.setUf(rs.getString("uf"));
        reg.setIe(rs.getString("ie"));
        reg.setCodMun(rs.getString("cod_mun"));
        reg.setIm(rs.getString("im"));
        reg.setSuframa(rs.getString("suframa"));
        return reg;
    }
}
