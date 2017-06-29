package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0035;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg0035RowMapper implements RowMapper<Reg0035> {

    @Override
    public Reg0035 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0035 reg = new Reg0035();
        reg.setId(rs.getInt("id"));
        reg.setCodScp(rs.getString("cod_scp"));
        reg.setNomeScp(rs.getString("nome_scp"));
        reg.setInfComp(rs.getString("inf_comp"));
        return reg;
    }
}
