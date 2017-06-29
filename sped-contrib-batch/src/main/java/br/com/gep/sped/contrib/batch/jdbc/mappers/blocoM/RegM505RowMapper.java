package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM505;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegM505RowMapper implements RowMapper<RegM505> {

    @Override
    public RegM505 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM505 reg = new RegM505();
        reg.setId(rs.getInt("id"));
        reg.setNatBcCred(rs.getString("nat_bc_cred"));
        reg.setCstCofins(rs.getString("cst_cofins"));
        reg.setVlBcCofinsTot(rs.getObject("vl_bc_cofins_tot") == null ? null : rs.getDouble("vl_bc_cofins_tot"));
        reg.setVlBcCofinsCum(rs.getObject("vl_bc_cofins_cum") == null ? null : rs.getDouble("vl_bc_cofins_cum"));
        reg.setVlBcCofinsNc(rs.getObject("vl_bc_cofins_nc") == null ? null : rs.getDouble("vl_bc_cofins_nc"));
        reg.setVlBcCofins(rs.getObject("vl_bc_cofins") == null ? null : rs.getDouble("vl_bc_cofins"));
        reg.setQuantBcCofinsTot(rs.getObject("quant_bc_cofins_tot") == null ? null : rs.getDouble("quant_bc_cofins_tot"));
        reg.setQuantBcCofins(rs.getObject("quant_bc_cofins") == null ? null : rs.getDouble("quant_bc_cofins"));
        reg.setDescCred(rs.getString("desc_cred"));
        return reg;
    }
}
