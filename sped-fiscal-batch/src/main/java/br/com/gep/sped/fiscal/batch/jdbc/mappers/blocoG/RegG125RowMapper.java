package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoG;

import br.com.gep.sped.fiscal.marshaller.registros.blocoG.RegG125;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegG125RowMapper implements RowMapper<RegG125> {

    @Override
    public RegG125 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegG125 reg = new RegG125();
        reg.setId(rs.getInt("id"));
        reg.setCodIndBem(rs.getString("cod_ind_bem"));
        reg.setDtMov(rs.getDate("dt_mov"));
        reg.setTipoMov(rs.getString("tipo_mov"));
        reg.setVlImobIcmsOp(rs.getObject("vl_imob_icms_op") == null ? null : rs.getDouble("vl_imob_icms_op"));
        reg.setVlImobIcmsSt(rs.getObject("vl_imob_icms_st") == null ? null : rs.getDouble("vl_imob_icms_st"));
        reg.setVlImobIcmsFrt(rs.getObject("vl_imob_icms_frt") == null ? null : rs.getDouble("vl_imob_icms_frt"));
        reg.setVlImobIcmsDif(rs.getObject("vl_imob_icms_dif") == null ? null : rs.getDouble("vl_imob_icms_dif"));
        reg.setNumParc(rs.getString("num_parc"));
        reg.setVlParcPass(rs.getObject("vl_parc_pass") == null ? null : rs.getDouble("vl_parc_pass"));
        return reg;
    }
}
