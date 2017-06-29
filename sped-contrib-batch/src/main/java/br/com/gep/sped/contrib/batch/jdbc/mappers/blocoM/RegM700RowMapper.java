package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM700;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegM700RowMapper implements RowMapper<RegM700> {

    @Override
    public RegM700 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM700 reg = new RegM700();
        reg.setId(rs.getInt("id"));
        reg.setCodCont(rs.getString("cod_cont"));
        reg.setVlContApurDifer(rs.getObject("vl_cont_apur_difer") == null ? null : rs.getDouble("vl_cont_apur_difer"));
        reg.setNatBcCredDesc(rs.getString("nat_bc_cred_desc"));
        reg.setVlCredDescDifer(rs.getObject("vl_cred_desc_difer") == null ? null : rs.getDouble("vl_cred_desc_difer"));
        reg.setVlContDiferAnt(rs.getObject("vl_cont_difer_ant") == null ? null : rs.getDouble("vl_cont_difer_ant"));
        reg.setPerApur(rs.getString("per_apur"));
        reg.setDtReceb(rs.getDate("dt_receb"));
        return reg;
    }
}
