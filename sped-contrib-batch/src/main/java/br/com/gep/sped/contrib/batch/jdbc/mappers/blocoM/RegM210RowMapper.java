package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM210;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegM210RowMapper implements RowMapper<RegM210> {

    @Override
    public RegM210 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM210 reg = new RegM210();
        reg.setId(rs.getInt("id"));
        reg.setCodCont(rs.getString("cod_cont"));
        reg.setVlRecBrt(rs.getObject("vl_rec_brt") == null ? null : rs.getDouble("vl_rec_brt"));
        reg.setVlBcCont(rs.getObject("vl_bc_cont") == null ? null : rs.getDouble("vl_bc_cont"));
        reg.setAliqPis(rs.getObject("aliq_pis") == null ? null : rs.getDouble("aliq_pis"));
        reg.setQuantBcPis(rs.getObject("quant_bc_pis") == null ? null : rs.getDouble("quant_bc_pis"));
        reg.setAliqPisQuant(rs.getObject("aliq_pis_quant") == null ? null : rs.getDouble("aliq_pis_quant"));
        reg.setVlContApur(rs.getObject("vl_cont_apur") == null ? null : rs.getDouble("vl_cont_apur"));
        reg.setVlAjusAcres(rs.getObject("vl_ajus_acres") == null ? null : rs.getDouble("vl_ajus_acres"));
        reg.setVlAjusReduc(rs.getObject("vl_ajus_reduc") == null ? null : rs.getDouble("vl_ajus_reduc"));
        reg.setVlContDifer(rs.getObject("vl_cont_difer") == null ? null : rs.getDouble("vl_cont_difer"));
        reg.setVlContDiferAnt(rs.getObject("vl_cont_difer_ant") == null ? null : rs.getDouble("vl_cont_difer_ant"));
        reg.setVlContPer(rs.getObject("vl_cont_per") == null ? null : rs.getDouble("vl_cont_per"));
        return reg;
    }
}
