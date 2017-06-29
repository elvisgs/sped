package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC199;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC199RowMapper implements RowMapper<RegC199> {

    @Override
    public RegC199 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC199 reg = new RegC199();
        reg.setId(rs.getInt("id"));
        reg.setCodDocImp(rs.getString("cod_doc_imp"));
        reg.setNumDocImp(rs.getString("num_doc_imp"));
        reg.setVlPisImp(rs.getObject("vl_pis_imp") == null ? null : rs.getDouble("vl_pis_imp"));
        reg.setVlCofinsImp(rs.getObject("vl_cofins_imp") == null ? null : rs.getDouble("vl_cofins_imp"));
        reg.setNumAcdraw(rs.getString("num_acdraw"));
        return reg;
    }
}
