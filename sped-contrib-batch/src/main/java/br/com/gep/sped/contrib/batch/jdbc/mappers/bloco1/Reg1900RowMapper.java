package br.com.gep.sped.contrib.batch.jdbc.mappers.bloco1;

import br.com.gep.sped.contrib.marshaller.registros.bloco1.Reg1900;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1900RowMapper implements RowMapper<Reg1900> {

    @Override
    public Reg1900 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1900 reg = new Reg1900();
        reg.setId(rs.getInt("id"));
        reg.setCnpj(rs.getString("cnpj"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setSer(rs.getString("ser"));
        reg.setSubSer(rs.getString("sub_ser"));
        reg.setCodSit(rs.getString("cod_sit"));
        reg.setVlTotRec(rs.getObject("vl_tot_rec") == null ? null : rs.getDouble("vl_tot_rec"));
        reg.setQuantDoc(rs.getInt("quant_doc"));
        reg.setCstPis(rs.getString("cst_pis"));
        reg.setCstCofins(rs.getString("cst_cofins"));
        reg.setCfop(rs.getString("cfop"));
        reg.setInfoCompl(rs.getString("info_compl"));
        reg.setCodCta(rs.getString("cod_cta"));
        return reg;
    }
}
