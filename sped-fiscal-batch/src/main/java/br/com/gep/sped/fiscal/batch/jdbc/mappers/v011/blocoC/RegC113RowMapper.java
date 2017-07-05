package br.com.gep.sped.fiscal.batch.jdbc.mappers.v011.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v011.blocoC.RegC113;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component("regC113RowMapperV011")
@Lazy
public class RegC113RowMapper implements RowMapper<RegC113> {

    @Override
    public RegC113 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC113 reg = new RegC113();
        reg.setId(rs.getInt("id"));
        reg.setIndOper(rs.getString("ind_oper"));
        reg.setIndEmit(rs.getString("ind_emit"));
        reg.setCodPart(rs.getString("cod_part"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setSer(rs.getString("ser"));
        reg.setSub(rs.getString("sub"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setChvDoce(rs.getString("chv_doce"));
        return reg;
    }
}
