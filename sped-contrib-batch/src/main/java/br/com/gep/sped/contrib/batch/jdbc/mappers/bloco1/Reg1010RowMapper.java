package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.contrib.marshaller.registros.bloco1.Reg1010;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1010RowMapper implements RowMapper<Reg1010> {

    @Override
    public Reg1010 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1010 reg = new Reg1010();
        reg.setId(rs.getInt("id"));
        reg.setNumProc(rs.getString("num_proc"));
        reg.setIdSecJud(rs.getString("id_sec_jud"));
        reg.setIdVara(rs.getString("id_vara"));
        reg.setIndNatAcao(rs.getString("ind_nat_acao"));
        reg.setDescDecJud(rs.getString("desc_dec_jud"));
        reg.setDtSentJud(rs.getDate("dt_sent_jud"));
        return reg;
    }
}
