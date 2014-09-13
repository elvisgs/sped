package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM600;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegM600RowMapper implements RowMapper<RegM600> {

    @Override
    public RegM600 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM600 reg = new RegM600();
        reg.setId(rs.getInt("id"));
        reg.setVlTotContNcPer(rs.getObject("vl_tot_cont_nc_per") == null ? null : rs.getDouble("vl_tot_cont_nc_per"));
        reg.setVlTotCredDesc(rs.getObject("vl_tot_cred_desc") == null ? null : rs.getDouble("vl_tot_cred_desc"));
        reg.setVlTotCredDescAnt(rs.getObject("vl_tot_cred_desc_ant") == null ? null : rs.getDouble("vl_tot_cred_desc_ant"));
        reg.setVlTotContNcDev(rs.getObject("vl_tot_cont_nc_dev") == null ? null : rs.getDouble("vl_tot_cont_nc_dev"));
        reg.setVlRetNc(rs.getObject("vl_ret_nc") == null ? null : rs.getDouble("vl_ret_nc"));
        reg.setVlOutDedNc(rs.getObject("vl_out_ded_nc") == null ? null : rs.getDouble("vl_out_ded_nc"));
        reg.setVlContNcRec(rs.getObject("vl_cont_nc_rec") == null ? null : rs.getDouble("vl_cont_nc_rec"));
        reg.setVlTotContCumPer(rs.getObject("vl_tot_cont_cum_per") == null ? null : rs.getDouble("vl_tot_cont_cum_per"));
        reg.setVlRetCum(rs.getObject("vl_ret_cum") == null ? null : rs.getDouble("vl_ret_cum"));
        reg.setVlOutDedCum(rs.getObject("vl_out_ded_cum") == null ? null : rs.getDouble("vl_out_ded_cum"));
        reg.setVlContCumRec(rs.getObject("vl_cont_cum_rec") == null ? null : rs.getDouble("vl_cont_cum_rec"));
        reg.setVlTotContRec(rs.getObject("vl_tot_cont_rec") == null ? null : rs.getDouble("vl_tot_cont_rec"));
        return reg;
    }
}
