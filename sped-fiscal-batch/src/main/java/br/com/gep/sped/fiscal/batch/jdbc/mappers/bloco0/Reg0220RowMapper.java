package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0220;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg0220RowMapper implements RowMapper<Reg0220> {

    @Override
    public Reg0220 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0220 reg = new Reg0220();
        reg.setId(rs.getInt("id"));
        reg.setUnidConv(rs.getString("unid_conv"));
        reg.setFatConv(rs.getObject("fat_conv") == null ? null : rs.getDouble("fat_conv"));
        return reg;
    }
}
