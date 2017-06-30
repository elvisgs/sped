package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC.RegC174;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC174RowMapper implements RowMapper<RegC174> {

    @Override
    public RegC174 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC174 reg = new RegC174();
        reg.setId(rs.getInt("id"));
        reg.setIndArm(rs.getString("ind_arm"));
        reg.setNumArm(rs.getString("num_arm"));
        reg.setDescrCompl(rs.getString("descr_compl"));
        return reg;
    }
}
