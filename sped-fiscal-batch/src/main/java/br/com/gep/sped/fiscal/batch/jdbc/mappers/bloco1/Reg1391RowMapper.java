package br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.bloco1.Reg1391;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1391RowMapper implements RowMapper<Reg1391> {

    @Override
    public Reg1391 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1391 reg = new Reg1391();
        reg.setId(rs.getInt("id"));
        reg.setDtRegistro(rs.getDate("dt_registro"));
        reg.setQtdMoid(rs.getObject("qtd_moid") == null ? null : rs.getDouble("qtd_moid"));
        reg.setEstqIni(rs.getObject("estq_ini") == null ? null : rs.getDouble("estq_ini"));
        reg.setQtdProduz(rs.getObject("qtd_produz") == null ? null : rs.getDouble("qtd_produz"));
        reg.setEntAnidHid(rs.getObject("ent_anid_hid") == null ? null : rs.getDouble("ent_anid_hid"));
        reg.setOutrEntr(rs.getObject("outr_entr") == null ? null : rs.getDouble("outr_entr"));
        reg.setPerda(rs.getObject("perda") == null ? null : rs.getDouble("perda"));
        reg.setCons(rs.getObject("cons") == null ? null : rs.getDouble("cons"));
        reg.setSaiAniHid(rs.getObject("sai_ani_hid") == null ? null : rs.getDouble("sai_ani_hid"));
        reg.setSaidas(rs.getObject("saidas") == null ? null : rs.getDouble("saidas"));
        reg.setEstqFin(rs.getObject("estq_fin") == null ? null : rs.getDouble("estq_fin"));
        reg.setEstqIniMel(rs.getObject("estq_ini_mel") == null ? null : rs.getDouble("estq_ini_mel"));
        reg.setProdDiaMel(rs.getObject("prod_dia_mel") == null ? null : rs.getDouble("prod_dia_mel"));
        reg.setUtilMel(rs.getObject("util_mel") == null ? null : rs.getDouble("util_mel"));
        reg.setProdAlcMel(rs.getObject("prod_alc_mel") == null ? null : rs.getDouble("prod_alc_mel"));
        reg.setObs(rs.getString("obs"));
        return reg;
    }
}
