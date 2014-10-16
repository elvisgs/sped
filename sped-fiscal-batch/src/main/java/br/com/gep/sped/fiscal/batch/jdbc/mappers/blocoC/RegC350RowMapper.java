package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC350;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegC350RowMapper implements RowMapper<RegC350> {

    @Override
    public RegC350 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC350 reg = new RegC350();
        reg.setId(rs.getInt("id"));
        reg.setSer(rs.getString("ser"));
        reg.setSubSer(rs.getString("sub_ser"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setCnpjCpf(rs.getString("cnpj_cpf"));
        reg.setVlMerc(rs.getObject("vl_merc") == null ? null : rs.getDouble("vl_merc"));
        reg.setVlDoc(rs.getObject("vl_doc") == null ? null : rs.getDouble("vl_doc"));
        reg.setVlDesc(rs.getObject("vl_desc") == null ? null : rs.getDouble("vl_desc"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setVlCofis(rs.getObject("vl_cofis") == null ? null : rs.getDouble("vl_cofis"));
        reg.setCodCta(rs.getString("cod_cta"));
        return reg;
    }
}
