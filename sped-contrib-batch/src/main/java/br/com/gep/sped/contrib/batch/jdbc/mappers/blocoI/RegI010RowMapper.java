package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoI;

import br.com.gep.sped.contrib.marshaller.registros.blocoI.RegI010;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegI010RowMapper implements RowMapper<RegI010> {

    @Override
    public RegI010 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegI010 reg = new RegI010();
        reg.setId(rs.getInt("id"));
        reg.setCnpj(rs.getString("cnpj"));
        reg.setIndAtiv(rs.getString("ind_ativ"));
        reg.setInfoCompl(rs.getString("info_compl"));
        return reg;
    }
}
