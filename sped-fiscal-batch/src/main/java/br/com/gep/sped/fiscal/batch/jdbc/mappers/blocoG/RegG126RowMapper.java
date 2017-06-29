package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoG;

import br.com.gep.sped.fiscal.marshaller.registros.blocoG.RegG126;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegG126RowMapper implements RowMapper<RegG126> {

    @Override
    public RegG126 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegG126 reg = new RegG126();
        reg.setId(rs.getInt("id"));
        reg.setDtIni(rs.getDate("dt_ini"));
        reg.setDtFin(rs.getDate("dt_fin"));
        reg.setNumParc(rs.getString("num_parc"));
        reg.setVlParcPass(rs.getObject("vl_parc_pass") == null ? null : rs.getDouble("vl_parc_pass"));
        reg.setVlTribOc(rs.getObject("vl_trib_oc") == null ? null : rs.getDouble("vl_trib_oc"));
        reg.setVlTotal(rs.getObject("vl_total") == null ? null : rs.getDouble("vl_total"));
        reg.setIndPerSai(rs.getObject("ind_per_sai") == null ? null : rs.getDouble("ind_per_sai"));
        reg.setVlParcAprop(rs.getObject("vl_parc_aprop") == null ? null : rs.getDouble("vl_parc_aprop"));
        return reg;
    }
}
