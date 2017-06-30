package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC.RegC140;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC140RowMapper implements RowMapper<RegC140> {

    @Override
    public RegC140 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC140 reg = new RegC140();
        reg.setId(rs.getInt("id"));
        reg.setIndEmit(rs.getString("ind_emit"));
        reg.setIndTit(rs.getString("ind_tit"));
        reg.setDescTit(rs.getString("desc_tit"));
        reg.setNumTit(rs.getString("num_tit"));
        reg.setQtdParc(rs.getString("qtd_parc"));
        reg.setVlTit(rs.getObject("vl_tit") == null ? null : rs.getDouble("vl_tit"));
        return reg;
    }
}
