package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM115;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegM115RowMapper implements RowMapper<RegM115> {

    @Override
    public RegM115 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM115 reg = new RegM115();
        reg.setId(rs.getInt("id"));
        reg.setDetValorAj(rs.getObject("det_valor_aj") == null ? null : rs.getDouble("det_valor_aj"));
        reg.setCstPis(rs.getString("cst_pis"));
        reg.setDetBcCred(rs.getObject("det_bc_cred") == null ? null : rs.getDouble("det_bc_cred"));
        reg.setDetAliq(rs.getObject("det_aliq") == null ? null : rs.getDouble("det_aliq"));
        reg.setDtOperAj(rs.getDate("dt_oper_aj"));
        reg.setDescAj(rs.getString("desc_aj"));
        reg.setCodCta(rs.getString("cod_cta"));
        reg.setInfoCompl(rs.getString("info_compl"));
        return reg;
    }
}
