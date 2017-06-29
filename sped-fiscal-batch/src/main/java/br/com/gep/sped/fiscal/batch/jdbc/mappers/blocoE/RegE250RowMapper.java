package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoE;

import br.com.gep.sped.fiscal.marshaller.registros.blocoE.RegE250;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegE250RowMapper implements RowMapper<RegE250> {

    @Override
    public RegE250 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegE250 reg = new RegE250();
        reg.setId(rs.getInt("id"));
        reg.setCodOr(rs.getString("cod_or"));
        reg.setVlOr(rs.getObject("vl_or") == null ? null : rs.getDouble("vl_or"));
        reg.setDtVcto(rs.getDate("dt_vcto"));
        reg.setCodRec(rs.getString("cod_rec"));
        reg.setNumProc(rs.getString("num_proc"));
        reg.setIndProc(rs.getString("ind_proc"));
        reg.setProc(rs.getString("proc"));
        reg.setTxtCompl(rs.getString("txt_compl"));
        reg.setMesRef(rs.getString("mes_ref"));
        return reg;
    }
}
