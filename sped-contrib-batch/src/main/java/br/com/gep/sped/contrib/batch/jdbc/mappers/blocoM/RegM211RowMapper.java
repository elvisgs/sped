package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM211;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegM211RowMapper implements RowMapper<RegM211> {

    @Override
    public RegM211 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM211 reg = new RegM211();
        reg.setId(rs.getInt("id"));
        reg.setIndTipCoop(rs.getString("ind_tip_coop"));
        reg.setVlBcContAntExcCoop(rs.getObject("vl_bc_cont_ant_exc_coop") == null ? null : rs.getDouble("vl_bc_cont_ant_exc_coop"));
        reg.setVlExcCoopGer(rs.getObject("vl_exc_coop_ger") == null ? null : rs.getDouble("vl_exc_coop_ger"));
        reg.setVlExcEspCoop(rs.getObject("vl_exc_esp_coop") == null ? null : rs.getDouble("vl_exc_esp_coop"));
        reg.setVlBcCont(rs.getObject("vl_bc_cont") == null ? null : rs.getDouble("vl_bc_cont"));
        return reg;
    }
}
