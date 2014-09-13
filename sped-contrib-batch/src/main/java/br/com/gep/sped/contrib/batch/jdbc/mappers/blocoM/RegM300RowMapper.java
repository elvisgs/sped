package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM300;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegM300RowMapper implements RowMapper<RegM300> {

    @Override
    public RegM300 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM300 reg = new RegM300();
        reg.setId(rs.getInt("id"));
        reg.setCodCont(rs.getString("cod_cont"));
        reg.setVlContApurDifer(rs.getObject("vl_cont_apur_difer") == null ? null : rs.getDouble("vl_cont_apur_difer"));
        reg.setNatCredDesc(rs.getString("nat_cred_desc"));
        reg.setVlCredDescDifer(rs.getObject("vl_cred_desc_difer") == null ? null : rs.getDouble("vl_cred_desc_difer"));
        reg.setVlContDiferAnt(rs.getObject("vl_cont_difer_ant") == null ? null : rs.getDouble("vl_cont_difer_ant"));
        reg.setPerApur(rs.getString("per_apur"));
        reg.setDtReceb(rs.getDate("dt_receb"));
        return reg;
    }
}
