package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoI;

import br.com.gep.sped.contrib.marshaller.registros.blocoI.RegI100;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegI100RowMapper implements RowMapper<RegI100> {

    @Override
    public RegI100 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegI100 reg = new RegI100();
        reg.setId(rs.getInt("id"));
        reg.setVlRecFin(rs.getObject("vl_rec_fin") == null ? null : rs.getDouble("vl_rec_fin"));
        reg.setCst(rs.getString("cst"));
        reg.setVlTotDedGer(rs.getObject("vl_tot_ded_ger") == null ? null : rs.getDouble("vl_tot_ded_ger"));
        reg.setVlTotDedEsp(rs.getObject("vl_tot_ded_esp") == null ? null : rs.getDouble("vl_tot_ded_esp"));
        reg.setVlBcPis(rs.getObject("vl_bc_pis") == null ? null : rs.getDouble("vl_bc_pis"));
        reg.setAliqPis(rs.getObject("aliq_pis") == null ? null : rs.getDouble("aliq_pis"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setVlBcCofins(rs.getObject("vl_bc_cofins") == null ? null : rs.getDouble("vl_bc_cofins"));
        reg.setAliqCofins(rs.getObject("aliq_cofins") == null ? null : rs.getDouble("aliq_cofins"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        reg.setInfComp(rs.getString("inf_comp"));
        return reg;
    }
}
