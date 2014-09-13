package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco0;

import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0200;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

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
        return reg;
    }
}
