package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD.RegD301;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD301RowMapper implements RowMapper<RegD301> {

    @Override
    public RegD301 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD301 reg = new RegD301();
        reg.setId(rs.getInt("id"));
        reg.setNumDocCanc(rs.getInt("num_doc_canc"));
        return reg;
    }
}
