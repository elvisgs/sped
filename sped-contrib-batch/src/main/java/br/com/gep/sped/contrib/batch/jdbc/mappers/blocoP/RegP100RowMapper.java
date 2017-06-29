package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoP;

import br.com.gep.sped.contrib.marshaller.registros.blocoP.RegP100;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegP100RowMapper implements RowMapper<RegP100> {

    @Override
    public RegP100 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegP100 reg = new RegP100();
        reg.setId(rs.getInt("id"));
        reg.setDtIni(rs.getDate("dt_ini"));
        reg.setDtFim(rs.getDate("dt_fim"));
        reg.setVlRecTotEst(rs.getObject("vl_rec_tot_est") == null ? null : rs.getDouble("vl_rec_tot_est"));
        reg.setCodAtivEcon(rs.getString("cod_ativ_econ"));
        reg.setVlRecAtivEstab(rs.getObject("vl_rec_ativ_estab") == null ? null : rs.getDouble("vl_rec_ativ_estab"));
        reg.setVlExc(rs.getObject("vl_exc") == null ? null : rs.getDouble("vl_exc"));
        reg.setVlBcCont(rs.getObject("vl_bc_cont") == null ? null : rs.getDouble("vl_bc_cont"));
        reg.setAliqCont(rs.getObject("aliq_cont") == null ? null : rs.getDouble("aliq_cont"));
        reg.setVlContApu(rs.getObject("vl_cont_apu") == null ? null : rs.getDouble("vl_cont_apu"));
        reg.setCodCta(rs.getString("cod_cta"));
        reg.setInfoCompl(rs.getString("info_compl"));
        return reg;
    }
}
