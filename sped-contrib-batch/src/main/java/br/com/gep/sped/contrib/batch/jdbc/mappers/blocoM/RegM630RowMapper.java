package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM630;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegM630RowMapper implements RowMapper<RegM630> {

    @Override
    public RegM630 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM630 reg = new RegM630();
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
