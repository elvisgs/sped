package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.contrib.marshaller.registros.bloco1.Reg1700;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1700RowMapper implements RowMapper<Reg1700> {

    @Override
    public Reg1700 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1700 reg = new Reg1700();
        reg.setId(rs.getInt("id"));
        reg.setIndNatRet(rs.getString("ind_nat_ret"));
        reg.setPrRecRet(rs.getString("pr_rec_ret"));
        reg.setVlRetApu(rs.getObject("vl_ret_apu") == null ? null : rs.getDouble("vl_ret_apu"));
        reg.setVlRetDed(rs.getObject("vl_ret_ded") == null ? null : rs.getDouble("vl_ret_ded"));
        reg.setVlRetPer(rs.getObject("vl_ret_per") == null ? null : rs.getDouble("vl_ret_per"));
        reg.setVlRetDcomp(rs.getObject("vl_ret_dcomp") == null ? null : rs.getDouble("vl_ret_dcomp"));
        reg.setSldRet(rs.getObject("sld_ret") == null ? null : rs.getDouble("sld_ret"));
        return reg;
    }
}
