package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0015;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg0015RowMapper implements RowMapper<Reg0015> {

    @Override
    public Reg0015 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0015 reg = new Reg0015();
        reg.setId(rs.getInt("id"));
        reg.setUfSt(rs.getString("uf_st"));
        reg.setIeSt(rs.getString("ie_st"));
        return reg;
    }
}
