package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.contrib.marshaller.registros.bloco1.Reg1020;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1020RowMapper implements RowMapper<Reg1020> {

    @Override
    public Reg1020 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1020 reg = new Reg1020();
        reg.setId(rs.getInt("id"));
        reg.setNumProc(rs.getString("num_proc"));
        reg.setIndNatAcao(rs.getString("ind_nat_acao"));
        reg.setDtDecAdm(rs.getDate("dt_dec_adm"));
        return reg;
    }
}
