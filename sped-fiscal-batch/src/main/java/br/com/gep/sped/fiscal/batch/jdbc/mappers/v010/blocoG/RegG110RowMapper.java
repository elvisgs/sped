package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoG;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoG.RegG110;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegG110RowMapper implements RowMapper<RegG110> {

    @Override
    public RegG110 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegG110 reg = new RegG110();
        reg.setId(rs.getInt("id"));
        reg.setDtIni(rs.getDate("dt_ini"));
        reg.setDtFin(rs.getDate("dt_fin"));
        reg.setSaldoInIcms(rs.getObject("saldo_in_icms") == null ? null : rs.getDouble("saldo_in_icms"));
        reg.setSomParc(rs.getObject("som_parc") == null ? null : rs.getDouble("som_parc"));
        reg.setVlTribExp(rs.getObject("vl_trib_exp") == null ? null : rs.getDouble("vl_trib_exp"));
        reg.setVlTotal(rs.getObject("vl_total") == null ? null : rs.getDouble("vl_total"));
        reg.setIndPerSai(rs.getObject("ind_per_sai") == null ? null : rs.getDouble("ind_per_sai"));
        reg.setIcmsAprop(rs.getObject("icms_aprop") == null ? null : rs.getDouble("icms_aprop"));
        reg.setSomIcmsOc(rs.getObject("som_icms_oc") == null ? null : rs.getDouble("som_icms_oc"));
        return reg;
    }
}
