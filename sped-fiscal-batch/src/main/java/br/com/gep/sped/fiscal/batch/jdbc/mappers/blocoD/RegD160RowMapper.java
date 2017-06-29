package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD160;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD160RowMapper implements RowMapper<RegD160> {

    @Override
    public RegD160 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD160 reg = new RegD160();
        reg.setId(rs.getInt("id"));
        reg.setDespacho(rs.getString("despacho"));
        reg.setCnpjCpfRem(rs.getString("cnpj_cpf_rem"));
        reg.setIeRem(rs.getString("ie_rem"));
        reg.setCodMunOri(rs.getString("cod_mun_ori"));
        reg.setCnpjCpfDest(rs.getString("cnpj_cpf_dest"));
        reg.setIeDest(rs.getString("ie_dest"));
        reg.setCodMunDest(rs.getString("cod_mun_dest"));
        return reg;
    }
}
