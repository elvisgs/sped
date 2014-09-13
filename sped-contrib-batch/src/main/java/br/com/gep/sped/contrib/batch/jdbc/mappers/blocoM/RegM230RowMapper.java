package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM230;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegM230RowMapper implements RowMapper<RegM230> {

    @Override
    public RegM230 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM230 reg = new RegM230();
        reg.setId(rs.getInt("id"));
        reg.setCnpj(rs.getString("cnpj"));
        reg.setVlVend(rs.getObject("vl_vend") == null ? null : rs.getDouble("vl_vend"));
        reg.setVlNaoReceb(rs.getObject("vl_nao_receb") == null ? null : rs.getDouble("vl_nao_receb"));
        reg.setVlContDif(rs.getObject("vl_cont_dif") == null ? null : rs.getDouble("vl_cont_dif"));
        reg.setVlCredDif(rs.getObject("vl_cred_dif") == null ? null : rs.getDouble("vl_cred_dif"));
        reg.setCodCred(rs.getString("cod_cred"));
        return reg;
    }
}
