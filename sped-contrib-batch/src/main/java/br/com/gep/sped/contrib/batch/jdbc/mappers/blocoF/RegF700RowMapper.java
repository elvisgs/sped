package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.blocoF.RegF700;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegF700RowMapper implements RowMapper<RegF700> {

    @Override
    public RegF700 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegF700 reg = new RegF700();
        reg.setId(rs.getInt("id"));
        reg.setIndOriDed(rs.getString("ind_ori_ded"));
        reg.setIndNatDed(rs.getString("ind_nat_ded"));
        reg.setVlDedPis(rs.getObject("vl_ded_pis") == null ? null : rs.getDouble("vl_ded_pis"));
        reg.setVlDedCofins(rs.getObject("vl_ded_cofins") == null ? null : rs.getDouble("vl_ded_cofins"));
        reg.setVlBcOper(rs.getObject("vl_bc_oper") == null ? null : rs.getDouble("vl_bc_oper"));
        reg.setCnpj(rs.getString("cnpj"));
        reg.setInfComp(rs.getString("inf_comp"));
        return reg;
    }
}
