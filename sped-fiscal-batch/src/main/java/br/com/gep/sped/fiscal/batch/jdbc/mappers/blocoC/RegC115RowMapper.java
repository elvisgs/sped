package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC115;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC115RowMapper implements RowMapper<RegC115> {

    @Override
    public RegC115 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC115 reg = new RegC115();
        reg.setId(rs.getInt("id"));
        reg.setIndCarga(rs.getString("ind_carga"));
        reg.setCnpjCol(rs.getString("cnpj_col"));
        reg.setIeCol(rs.getString("ie_col"));
        reg.setCpfCol(rs.getString("cpf_col"));
        reg.setCodMunCol(rs.getString("cod_mun_col"));
        reg.setCnpjEntg(rs.getString("cnpj_entg"));
        reg.setIeEntg(rs.getString("ie_entg"));
        reg.setCpfEntg(rs.getString("cpf_entg"));
        reg.setCodMunEntg(rs.getString("cod_mun_entg"));
        return reg;
    }
}
