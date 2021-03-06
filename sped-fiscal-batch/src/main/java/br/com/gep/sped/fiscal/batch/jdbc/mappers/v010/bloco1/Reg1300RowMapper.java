package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1.Reg1300;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1300RowMapper implements RowMapper<Reg1300> {

    @Override
    public Reg1300 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1300 reg = new Reg1300();
        reg.setId(rs.getInt("id"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setDtFech(rs.getDate("dt_fech"));
        reg.setEstqAbert(rs.getObject("estq_abert") == null ? null : rs.getDouble("estq_abert"));
        reg.setVolEntr(rs.getObject("vol_entr") == null ? null : rs.getDouble("vol_entr"));
        reg.setVolDisp(rs.getObject("vol_disp") == null ? null : rs.getDouble("vol_disp"));
        reg.setVolSaidas(rs.getObject("vol_saidas") == null ? null : rs.getDouble("vol_saidas"));
        reg.setEstqEscr(rs.getObject("estq_escr") == null ? null : rs.getDouble("estq_escr"));
        reg.setValAjPerda(rs.getObject("val_aj_perda") == null ? null : rs.getDouble("val_aj_perda"));
        reg.setValAjGanho(rs.getObject("val_aj_ganho") == null ? null : rs.getDouble("val_aj_ganho"));
        reg.setFechFisico(rs.getObject("fech_fisico") == null ? null : rs.getDouble("fech_fisico"));
        return reg;
    }
}
