package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoK;

import br.com.gep.sped.fiscal.marshaller.registros.blocoK.RegK230;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegK230RowMapper implements RowMapper<RegK230> {

    @Override
    public RegK230 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegK230 reg = new RegK230();
        reg.setId(rs.getInt("id"));
        reg.setDtFinOp(rs.getDate("dt_fin_op"));
        reg.setCodDocOp(rs.getString("cod_doc_op"));
        reg.setCodItem(rs.getString("cod_item"));
        reg.setQtdEnc(rs.getObject("qtd_enc") == null ? null : rs.getDouble("qtd_enc"));
        return reg;
    }
}