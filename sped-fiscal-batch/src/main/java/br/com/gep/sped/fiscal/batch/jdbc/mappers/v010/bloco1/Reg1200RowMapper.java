package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1.Reg1200;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1200RowMapper implements RowMapper<Reg1200> {

    @Override
    public Reg1200 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1200 reg = new Reg1200();
        reg.setId(rs.getInt("id"));
        reg.setCodAjApur(rs.getString("cod_aj_apur"));
        reg.setSldCred(rs.getObject("sld_cred") == null ? null : rs.getDouble("sld_cred"));
        reg.setCredApr(rs.getObject("cred_apr") == null ? null : rs.getDouble("cred_apr"));
        reg.setCredReceb(rs.getObject("cred_receb") == null ? null : rs.getDouble("cred_receb"));
        reg.setCredUtil(rs.getObject("cred_util") == null ? null : rs.getDouble("cred_util"));
        reg.setSldCredFim(rs.getObject("sld_cred_fim") == null ? null : rs.getDouble("sld_cred_fim"));
        return reg;
    }
}
