package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC.RegC179;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC179RowMapper implements RowMapper<RegC179> {

    @Override
    public RegC179 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC179 reg = new RegC179();
        reg.setId(rs.getInt("id"));
        reg.setBcStOrigDest(rs.getObject("bc_st_orig_dest") == null ? null : rs.getDouble("bc_st_orig_dest"));
        reg.setIcmsStRep(rs.getObject("icms_st_rep") == null ? null : rs.getDouble("icms_st_rep"));
        reg.setIcmsStCompl(rs.getObject("icms_st_compl") == null ? null : rs.getDouble("icms_st_compl"));
        reg.setBcRet(rs.getObject("bc_ret") == null ? null : rs.getDouble("bc_ret"));
        reg.setIcmsRet(rs.getObject("icms_ret") == null ? null : rs.getDouble("icms_ret"));
        return reg;
    }
}
