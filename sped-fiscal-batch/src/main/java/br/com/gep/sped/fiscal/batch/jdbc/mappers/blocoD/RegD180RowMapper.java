package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.blocoD.RegD180;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD180RowMapper implements RowMapper<RegD180> {

    @Override
    public RegD180 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD180 reg = new RegD180();
        reg.setId(rs.getInt("id"));
        reg.setNumSeq(rs.getInt("num_seq"));
        reg.setIndEmit(rs.getString("ind_emit"));
        reg.setCnpjCpfEmit(rs.getString("cnpj_cpf_emit"));
        reg.setUfEmit(rs.getString("uf_emit"));
        reg.setIeEmit(rs.getString("ie_emit"));
        reg.setCodMunOrig(rs.getString("cod_mun_orig"));
        reg.setCnpjCpfTom(rs.getString("cnpj_cpf_tom"));
        reg.setUfTom(rs.getString("uf_tom"));
        reg.setIeTom(rs.getString("ie_tom"));
        reg.setCodMunDest(rs.getString("cod_mun_dest"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setSer(rs.getString("ser"));
        reg.setSub(rs.getString("sub"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setVlDoc(rs.getObject("vl_doc") == null ? null : rs.getDouble("vl_doc"));
        return reg;
    }
}
