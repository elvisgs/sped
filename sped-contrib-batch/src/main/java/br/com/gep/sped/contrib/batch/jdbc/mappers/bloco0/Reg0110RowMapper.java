package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0110;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg0110RowMapper implements RowMapper<Reg0110> {

    @Override
    public Reg0110 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0110 reg = new Reg0110();
        reg.setId(rs.getInt("id"));
        reg.setCodIncTrib(rs.getString("cod_inc_trib"));
        reg.setIndAproCred(rs.getString("ind_apro_cred"));
        reg.setCodTipoCont(rs.getString("cod_tipo_cont"));
        reg.setIndRegCum(rs.getString("ind_reg_cum"));
        return reg;
    }
}
