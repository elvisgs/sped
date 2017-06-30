package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD.RegD120;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD120RowMapper implements RowMapper<RegD120> {

    @Override
    public RegD120 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD120 reg = new RegD120();
        reg.setId(rs.getInt("id"));
        reg.setCodMunOrig(rs.getString("cod_mun_orig"));
        reg.setCodMunDest(rs.getString("cod_mun_dest"));
        reg.setVeicId(rs.getString("veic_id"));
        reg.setUfId(rs.getString("uf_id"));
        return reg;
    }
}
