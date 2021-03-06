package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoA;

import br.com.gep.sped.contrib.marshaller.registros.blocoA.RegA010;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegA010RowMapper implements RowMapper<RegA010> {

    @Override
    public RegA010 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegA010 reg = new RegA010();
        reg.setId(rs.getInt("id"));
        reg.setCnpj(rs.getString("cnpj"));
        return reg;
    }
}
