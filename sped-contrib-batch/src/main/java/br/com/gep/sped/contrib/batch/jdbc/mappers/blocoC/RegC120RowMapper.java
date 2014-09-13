package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC120;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC120RowMapper implements RowMapper<RegC120> {

    @Override
    public RegC120 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC120 reg = new RegC120();
        reg.setId(rs.getInt("id"));
        reg.setCodDocImp(rs.getString("cod_doc_imp"));
        reg.setNumDocImp(rs.getString("num_doc_imp"));
        reg.setVlPisImp(rs.getObject("vl_pis_imp") == null ? null : rs.getDouble("vl_pis_imp"));
        reg.setVlCofinsImp(rs.getObject("vl_cofins_imp") == null ? null : rs.getDouble("vl_cofins_imp"));
        reg.setNumAcdraw(rs.getString("num_acdraw"));
        return reg;
    }
}
