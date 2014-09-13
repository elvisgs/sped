package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM610;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegM610RowMapper implements RowMapper<RegM610> {

    @Override
    public RegM610 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM610 reg = new RegM610();
        reg.setId(rs.getInt("id"));
        reg.setCodCont(rs.getString("cod_cont"));
        reg.setVlRecBrt(rs.getObject("vl_rec_brt") == null ? null : rs.getDouble("vl_rec_brt"));
        reg.setVlBcCont(rs.getObject("vl_bc_cont") == null ? null : rs.getDouble("vl_bc_cont"));
        reg.setAliqCofins(rs.getObject("aliq_cofins") == null ? null : rs.getDouble("aliq_cofins"));
        reg.setQuantBcCofins(rs.getObject("quant_bc_cofins") == null ? null : rs.getDouble("quant_bc_cofins"));
        reg.setAliqCofinsQuant(rs.getObject("aliq_cofins_quant") == null ? null : rs.getDouble("aliq_cofins_quant"));
        reg.setVlContApur(rs.getObject("vl_cont_apur") == null ? null : rs.getDouble("vl_cont_apur"));
        reg.setVlAjusAcres(rs.getObject("vl_ajus_acres") == null ? null : rs.getDouble("vl_ajus_acres"));
        reg.setVlAjusReduc(rs.getObject("vl_ajus_reduc") == null ? null : rs.getDouble("vl_ajus_reduc"));
        reg.setVlContDifer(rs.getObject("vl_cont_difer") == null ? null : rs.getDouble("vl_cont_difer"));
        reg.setVlContDiferAnt(rs.getObject("vl_cont_difer_ant") == null ? null : rs.getDouble("vl_cont_difer_ant"));
        reg.setVlContPer(rs.getObject("vl_cont_per") == null ? null : rs.getDouble("vl_cont_per"));
        return reg;
    }
}
