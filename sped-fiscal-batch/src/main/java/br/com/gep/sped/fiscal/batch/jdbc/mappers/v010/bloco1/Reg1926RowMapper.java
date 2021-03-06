package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1.Reg1926;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1926RowMapper implements RowMapper<Reg1926> {

    @Override
    public Reg1926 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1926 reg = new Reg1926();
        reg.setId(rs.getInt("id"));
        reg.setCodOr(rs.getString("cod_or"));
        reg.setVlOr(rs.getObject("vl_or") == null ? null : rs.getDouble("vl_or"));
        reg.setDtVcto(rs.getDate("dt_vcto"));
        reg.setCodRec(rs.getString("cod_rec"));
        reg.setNumProc(rs.getString("num_proc"));
        reg.setIndProc(rs.getObject("ind_proc") == null ? null : rs.getDouble("ind_proc"));
        reg.setProc(rs.getString("proc"));
        reg.setTxtCompl(rs.getString("txt_compl"));
        reg.setMesRef(rs.getString("mes_ref"));
        return reg;
    }
}
