package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0300;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg0300RowMapper implements RowMapper<Reg0300> {

    @Override
    public Reg0300 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0300 reg = new Reg0300();
        reg.setId(rs.getInt("id"));
        reg.setCodIndBem(rs.getString("cod_ind_bem"));
        reg.setIdentMerc(rs.getString("ident_merc"));
        reg.setDescrItem(rs.getString("descr_item"));
        reg.setCodPrnc(rs.getString("cod_prnc"));
        reg.setCodCta(rs.getString("cod_cta"));
        reg.setNrParc(rs.getString("nr_parc"));
        return reg;
    }
}
