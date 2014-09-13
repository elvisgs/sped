package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0145;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reg0145RowMapper implements RowMapper<Reg0145> {

    @Override
    public Reg0145 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0145 reg = new Reg0145();
        reg.setId(rs.getInt("id"));
        reg.setCodIncTrib(rs.getString("cod_inc_trib"));
        reg.setVlRecTot(rs.getObject("vl_rec_tot") == null ? null : rs.getDouble("vl_rec_tot"));
        reg.setVlRecAtiv(rs.getObject("vl_rec_ativ") == null ? null : rs.getDouble("vl_rec_ativ"));
        reg.setVlRecDemaisAtiv(rs.getObject("vl_rec_demais_ativ") == null ? null : rs.getDouble("vl_rec_demais_ativ"));
        reg.setInfoCompl(rs.getString("info_compl"));
        return reg;
    }
}
