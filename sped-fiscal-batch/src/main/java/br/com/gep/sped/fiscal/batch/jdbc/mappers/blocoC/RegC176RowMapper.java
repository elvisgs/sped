package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC176;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC176RowMapper implements RowMapper<RegC176> {

    @Override
    public RegC176 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC176 reg = new RegC176();
        reg.setId(rs.getInt("id"));
        reg.setCodModUltE(rs.getString("cod_mod_ult_e"));
        reg.setNumDocUltE(rs.getString("num_doc_ult_e"));
        reg.setSerUltE(rs.getString("ser_ult_e"));
        reg.setDtUltE(rs.getDate("dt_ult_e"));
        reg.setCodPartUltE(rs.getString("cod_part_ult_e"));
        reg.setQuantUltE(rs.getObject("quant_ult_e") == null ? null : rs.getDouble("quant_ult_e"));
        reg.setVlUnitUltE(rs.getObject("vl_unit_ult_e") == null ? null : rs.getDouble("vl_unit_ult_e"));
        reg.setVlUnitBcSt(rs.getObject("vl_unit_bc_st") == null ? null : rs.getDouble("vl_unit_bc_st"));
        return reg;
    }
}
