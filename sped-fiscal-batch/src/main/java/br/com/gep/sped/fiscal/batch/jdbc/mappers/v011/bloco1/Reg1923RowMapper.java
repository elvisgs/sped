package br.com.gep.sped.fiscal.batch.jdbc.mappers.v011.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.v011.bloco1.Reg1923;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component("reg1923RowMapperV011")
@Lazy
public class Reg1923RowMapper implements RowMapper<Reg1923> {

    @Override
    public Reg1923 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1923 reg = new Reg1923();
        reg.setId(rs.getInt("id"));
        reg.setCodPart(rs.getString("cod_part"));
        reg.setCodMod(rs.getString("cod_mod"));
        reg.setSer(rs.getString("ser"));
        reg.setSub(rs.getString("sub"));
        reg.setNumDoc(rs.getString("num_doc"));
        reg.setDtDoc(rs.getDate("dt_doc"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setVlAjItem(rs.getObject("vl_aj_item") == null ? null : rs.getDouble("vl_aj_item"));
        reg.setChvDoce(rs.getString("chv_doce"));
        return reg;
    }
}
