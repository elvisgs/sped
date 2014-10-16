package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.bloco1.Reg1010;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reg1010RowMapper implements RowMapper<Reg1010> {

    @Override
    public Reg1010 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1010 reg = new Reg1010();
        reg.setId(rs.getInt("id"));
        reg.setIndExp(rs.getString("ind_exp"));
        reg.setIndCcrf(rs.getString("ind_ccrf"));
        reg.setIndComb(rs.getString("ind_comb"));
        reg.setIndUsina(rs.getString("ind_usina"));
        reg.setIndVa(rs.getString("ind_va"));
        reg.setIndEe(rs.getString("ind_ee"));
        reg.setIndCart(rs.getString("ind_cart"));
        reg.setIndForm(rs.getString("ind_form"));
        reg.setIndAer(rs.getString("ind_aer"));
        return reg;
    }
}
