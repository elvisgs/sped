package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC.RegC120;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC120RowMapper implements RowMapper<RegC120> {

    @Override
    public RegC120 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC120 reg = new RegC120();
        reg.setId(rs.getInt("id"));
        reg.setCodDocImp(rs.getString("cod_doc_imp"));
        reg.setNumDocImp(rs.getString("num_doc_imp"));
        reg.setPisImp(rs.getObject("pis_imp") == null ? null : rs.getDouble("pis_imp"));
        reg.setCofinsImp(rs.getObject("cofins_imp") == null ? null : rs.getDouble("cofins_imp"));
        reg.setNumAcdraw(rs.getString("num_acdraw"));
        return reg;
    }
}
