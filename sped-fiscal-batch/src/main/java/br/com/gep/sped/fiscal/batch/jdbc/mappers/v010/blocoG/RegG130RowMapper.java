package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoG;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoG.RegG130;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegG130RowMapper implements RowMapper<RegG130> {

    @Override
    public RegG130 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegG130 reg = new RegG130();
        reg.setId(rs.getInt("id"));
        reg.setIndEmit(rs.getString("ind_emit"));
        reg.setCodPart(rs.getString("cod_part"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setSerie(rs.getString("serie"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setChvNfeCte(rs.getString("chv_nfe_cte"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        return reg;
    }
}
