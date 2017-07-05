package br.com.gep.sped.fiscal.batch.jdbc.mappers.v011.bloco0;

import br.com.gep.sped.fiscal.marshaller.registros.v011.bloco0.Reg0200;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component("reg0200RowMapperV011")
@Lazy
public class Reg0200RowMapper implements RowMapper<Reg0200> {

    @Override
    public Reg0200 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg0200 reg = new Reg0200();
        reg.setId(rs.getInt("id"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setDescrItem(rs.getString("descr_item"));
        reg.setCodBarra(rs.getString("cod_barra"));
        reg.setCodAntItem(rs.getString("cod_ant_item"));
        reg.setUnidInv(rs.getString("unid_inv"));
        reg.setTipoItem(rs.getString("tipo_item"));
        reg.setCodNcm(rs.getString("cod_ncm"));
        reg.setExIpi(rs.getString("ex_ipi"));
        reg.setCodGen(rs.getString("cod_gen"));
        reg.setCodLst(rs.getString("cod_lst"));
        reg.setAliqIcms(rs.getObject("aliq_icms") == null ? null : rs.getDouble("aliq_icms"));
        reg.setCest(rs.getString("cest"));
        return reg;
    }
}
