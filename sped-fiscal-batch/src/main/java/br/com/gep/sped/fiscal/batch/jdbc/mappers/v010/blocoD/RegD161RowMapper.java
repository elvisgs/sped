package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD.RegD161;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD161RowMapper implements RowMapper<RegD161> {

    @Override
    public RegD161 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD161 reg = new RegD161();
        reg.setId(rs.getInt("id"));
        reg.setIndCarga(rs.getString("ind_carga"));
        reg.setCnpjCpfCol(rs.getString("cnpj_cpf_col"));
        reg.setIeCol(rs.getString("ie_col"));
        reg.setCodMunCol(rs.getString("cod_mun_col"));
        reg.setCnpjCpfEntg(rs.getString("cnpj_cpf_entg"));
        reg.setIeEntg(rs.getString("ie_entg"));
        reg.setCodMunEntg(rs.getString("cod_mun_entg"));
        return reg;
    }
}
