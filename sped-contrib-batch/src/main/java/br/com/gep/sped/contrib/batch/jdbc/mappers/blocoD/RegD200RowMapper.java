package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.contrib.marshaller.registros.blocoD.RegD200;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegD200RowMapper implements RowMapper<RegD200> {

    @Override
    public RegD200 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD200 reg = new RegD200();
        reg.setId(rs.getInt("id"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setCodSit(rs.getString("cod_sit"));
        reg.setSer(rs.getString("ser"));
        reg.setSub(rs.getString("sub"));
        reg.setNumDocIni(rs.getString("num_doc_ini"));
        reg.setNumDocFin(rs.getString("num_doc_fin"));
        reg.setCfop(rs.getString("cfop"));
        reg.setDtRef(rs.getDate("dt_ref"));
        reg.setVlDoc(rs.getObject("vl_doc") == null ? null : rs.getDouble("vl_doc"));
        reg.setVlDesc(rs.getObject("vl_desc") == null ? null : rs.getDouble("vl_desc"));
        return reg;
    }
}
