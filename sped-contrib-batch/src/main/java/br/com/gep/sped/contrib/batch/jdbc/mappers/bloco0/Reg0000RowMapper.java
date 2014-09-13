package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0000;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reg0000RowMapper implements RowMapper<Reg0000> {

    @Override
    public Reg0000 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0000 reg = new Reg0000();
        reg.setId(rs.getInt("id"));
        reg.setCodVer(rs.getString("cod_ver"));
        reg.setTipoEscrit(rs.getString("tipo_escrit"));
        reg.setIndSitEsp(rs.getString("ind_sit_esp"));
        reg.setNumRecAnterior(rs.getString("num_rec_anterior"));
        reg.setDtIni(rs.getDate("dt_ini"));
        reg.setDtFin(rs.getDate("dt_fin"));
        reg.setNome(rs.getString("nome"));
        reg.setCnpj(rs.getString("cnpj"));
        reg.setUf(rs.getString("uf"));
        reg.setCodMun(rs.getString("cod_mun"));
        reg.setSuframa(rs.getString("suframa"));
        reg.setIndNatPj(rs.getString("ind_nat_pj"));
        reg.setIndAtiv(rs.getString("ind_ativ"));
        return reg;
    }
}
