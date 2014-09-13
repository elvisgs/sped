package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.blocoF.RegF525;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegF525RowMapper implements RowMapper<RegF525> {

    @Override
    public RegF525 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegF525 reg = new RegF525();
        reg.setId(rs.getInt("id"));
        reg.setVlRec(rs.getObject("vl_rec") == null ? null : rs.getDouble("vl_rec"));
        reg.setIndRec(rs.getString("ind_rec"));
        reg.setCnpjCpf(rs.getString("cnpj_cpf"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setVlRecDet(rs.getObject("vl_rec_det") == null ? null : rs.getDouble("vl_rec_det"));
        reg.setCstPis(rs.getString("cst_pis"));
        reg.setCstCofins(rs.getString("cst_cofins"));
        reg.setInfoCompl(rs.getString("info_compl"));
        reg.setCodCta(rs.getString("cod_cta"));
        return reg;
    }
}
