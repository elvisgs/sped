package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC380;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC380RowMapper implements RowMapper<RegC380> {

    @Override
    public RegC380 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC380 reg = new RegC380();
        reg.setId(rs.getInt("id"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setDtDocIni(rs.getDate("dt_doc_ini"));
        reg.setDtDocFin(rs.getDate("dt_doc_fin"));
        reg.setNumDocIni(rs.getString("num_doc_ini"));
        reg.setNumDocFin(rs.getString("num_doc_fin"));
        reg.setVlDoc(rs.getObject("vl_doc") == null ? null : rs.getDouble("vl_doc"));
        reg.setVlDocCanc(rs.getObject("vl_doc_canc") == null ? null : rs.getDouble("vl_doc_canc"));
        return reg;
    }
}
