package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.contrib.marshaller.registros.bloco1.Reg1800;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1800RowMapper implements RowMapper<Reg1800> {

    @Override
    public Reg1800 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1800 reg = new Reg1800();
        reg.setId(rs.getInt("id"));
        reg.setIncImob(rs.getString("inc_imob"));
        reg.setRecRecebRet(rs.getObject("rec_receb_ret") == null ? null : rs.getDouble("rec_receb_ret"));
        reg.setRecFinRet(rs.getObject("rec_fin_ret") == null ? null : rs.getDouble("rec_fin_ret"));
        reg.setBcRet(rs.getObject("bc_ret") == null ? null : rs.getDouble("bc_ret"));
        reg.setAliqRet(rs.getObject("aliq_ret") == null ? null : rs.getDouble("aliq_ret"));
        reg.setVlRecUni(rs.getObject("vl_rec_uni") == null ? null : rs.getDouble("vl_rec_uni"));
        reg.setDtRecUni(rs.getDate("dt_rec_uni"));
        reg.setCodRec(rs.getString("cod_rec"));
        return reg;
    }
}
