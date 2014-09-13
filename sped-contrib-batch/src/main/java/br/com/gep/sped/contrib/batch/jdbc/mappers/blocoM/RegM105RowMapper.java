package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM105;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegM105RowMapper implements RowMapper<RegM105> {

    @Override
    public RegM105 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM105 reg = new RegM105();
        reg.setId(rs.getInt("id"));
        reg.setNatBcCred(rs.getString("nat_bc_cred"));
        reg.setCstPis(rs.getString("cst_pis"));
        reg.setVlBcPisTot(rs.getObject("vl_bc_pis_tot") == null ? null : rs.getDouble("vl_bc_pis_tot"));
        reg.setVlBcPisCum(rs.getObject("vl_bc_pis_cum") == null ? null : rs.getDouble("vl_bc_pis_cum"));
        reg.setVlBcPisNc(rs.getObject("vl_bc_pis_nc") == null ? null : rs.getDouble("vl_bc_pis_nc"));
        reg.setVlBcPis(rs.getObject("vl_bc_pis") == null ? null : rs.getDouble("vl_bc_pis"));
        reg.setQuantBcPisTot(rs.getObject("quant_bc_pis_tot") == null ? null : rs.getDouble("quant_bc_pis_tot"));
        reg.setQuantBcPis(rs.getObject("quant_bc_pis") == null ? null : rs.getDouble("quant_bc_pis"));
        reg.setDescCred(rs.getString("desc_cred"));
        return reg;
    }
}
