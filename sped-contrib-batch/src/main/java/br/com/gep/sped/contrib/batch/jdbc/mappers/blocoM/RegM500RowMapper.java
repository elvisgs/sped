package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.blocoM.RegM500;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegM500RowMapper implements RowMapper<RegM500> {

    @Override
    public RegM500 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegM500 reg = new RegM500();
        reg.setId(rs.getInt("id"));
        reg.setCodCred(rs.getString("cod_cred"));
        reg.setIndCredOri(rs.getString("ind_cred_ori"));
        reg.setVlBcCred(rs.getObject("vl_bc_cred") == null ? null : rs.getDouble("vl_bc_cred"));
        reg.setAliqCofins(rs.getObject("aliq_cofins") == null ? null : rs.getDouble("aliq_cofins"));
        reg.setQuantBcCofins(rs.getObject("quant_bc_cofins") == null ? null : rs.getDouble("quant_bc_cofins"));
        reg.setAliqCofinsQuant(rs.getObject("aliq_cofins_quant") == null ? null : rs.getDouble("aliq_cofins_quant"));
        reg.setVlCred(rs.getObject("vl_cred") == null ? null : rs.getDouble("vl_cred"));
        reg.setVlAjusAcres(rs.getObject("vl_ajus_acres") == null ? null : rs.getDouble("vl_ajus_acres"));
        reg.setVlAjusReduc(rs.getObject("vl_ajus_reduc") == null ? null : rs.getDouble("vl_ajus_reduc"));
        reg.setVlCredDif(rs.getObject("vl_cred_dif") == null ? null : rs.getDouble("vl_cred_dif"));
        reg.setVlCredDisp(rs.getObject("vl_cred_disp") == null ? null : rs.getDouble("vl_cred_disp"));
        reg.setIndDescCred(rs.getString("ind_desc_cred"));
        reg.setVlCredDesc(rs.getObject("vl_cred_desc") == null ? null : rs.getDouble("vl_cred_desc"));
        reg.setSldCred(rs.getObject("sld_cred") == null ? null : rs.getDouble("sld_cred"));
        return reg;
    }
}
