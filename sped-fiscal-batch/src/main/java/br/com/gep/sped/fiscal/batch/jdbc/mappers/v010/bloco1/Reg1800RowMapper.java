package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1.Reg1800;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1800RowMapper implements RowMapper<Reg1800> {

    @Override
    public Reg1800 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1800 reg = new Reg1800();
        reg.setId(rs.getInt("id"));
        reg.setVlCarga(rs.getObject("vl_carga") == null ? null : rs.getDouble("vl_carga"));
        reg.setVlPass(rs.getObject("vl_pass") == null ? null : rs.getDouble("vl_pass"));
        reg.setVlFat(rs.getObject("vl_fat") == null ? null : rs.getDouble("vl_fat"));
        reg.setIndRat(rs.getObject("ind_rat") == null ? null : rs.getDouble("ind_rat"));
        reg.setVlIcmsAnt(rs.getObject("vl_icms_ant") == null ? null : rs.getDouble("vl_icms_ant"));
        reg.setVlBcIcms(rs.getObject("vl_bc_icms") == null ? null : rs.getDouble("vl_bc_icms"));
        reg.setVlIcmsApur(rs.getObject("vl_icms_apur") == null ? null : rs.getDouble("vl_icms_apur"));
        reg.setVlBcIcmsApur(rs.getObject("vl_bc_icms_apur") == null ? null : rs.getDouble("vl_bc_icms_apur"));
        reg.setVlDif(rs.getObject("vl_dif") == null ? null : rs.getDouble("vl_dif"));
        return reg;
    }
}
