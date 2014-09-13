package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0111;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reg0111RowMapper implements RowMapper<Reg0111> {

    @Override
    public Reg0111 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0111 reg = new Reg0111();
        reg.setId(rs.getInt("id"));
        reg.setRecBruNcumTribMi(rs.getObject("rec_bru_ncum_trib_mi") == null ? null : rs.getDouble("rec_bru_ncum_trib_mi"));
        reg.setRecBruNcumNtMi(rs.getObject("rec_bru_ncum_nt_mi") == null ? null : rs.getDouble("rec_bru_ncum_nt_mi"));
        reg.setRecBruNcumExp(rs.getObject("rec_bru_ncum_exp") == null ? null : rs.getDouble("rec_bru_ncum_exp"));
        reg.setRecBruCum(rs.getObject("rec_bru_cum") == null ? null : rs.getDouble("rec_bru_cum"));
        reg.setRecBruTotal(rs.getObject("rec_bru_total") == null ? null : rs.getDouble("rec_bru_total"));
        return reg;
    }
}
