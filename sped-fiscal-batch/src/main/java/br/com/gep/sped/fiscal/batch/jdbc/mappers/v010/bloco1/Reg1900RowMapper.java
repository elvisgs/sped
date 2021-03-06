package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1.Reg1900;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1900RowMapper implements RowMapper<Reg1900> {

    @Override
    public Reg1900 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1900 reg = new Reg1900();
        reg.setId(rs.getInt("id"));
        reg.setIndApurIcms(rs.getString("ind_apur_icms"));
        reg.setDescrComplOutApur(rs.getString("descr_compl_out_apur"));
        return reg;
    }
}
