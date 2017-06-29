package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0000;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg0000RowMapper implements RowMapper<Reg0000> {

    @Override
    public Reg0000 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0000 reg = new Reg0000();
        reg.setId(rs.getInt("id"));
        reg.setCodVer(rs.getString("cod_ver"));
        reg.setCodFin(rs.getString("cod_fin"));
        reg.setDtIni(rs.getDate("dt_ini"));
        reg.setDtFin(rs.getDate("dt_fin"));
        reg.setNome(rs.getString("nome"));
        reg.setCnpj(rs.getString("cnpj"));
        reg.setCpf(rs.getString("cpf"));
        reg.setUf(rs.getString("uf"));
        reg.setIe(rs.getString("ie"));
        reg.setCodMun(rs.getString("cod_mun"));
        reg.setIm(rs.getString("im"));
        reg.setSuframa(rs.getString("suframa"));
        reg.setIndPerfil(rs.getString("ind_perfil"));
        reg.setIndAtiv(rs.getString("ind_ativ"));
        return reg;
    }
}
