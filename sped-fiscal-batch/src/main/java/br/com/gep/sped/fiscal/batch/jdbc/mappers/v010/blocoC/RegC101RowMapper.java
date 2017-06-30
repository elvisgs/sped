package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC.RegC101;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC101RowMapper implements RowMapper<RegC101> {

    @Override
    public RegC101 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC101 reg = new RegC101();
        reg.setId(rs.getInt("id"));
        reg.setVlFcpUfDest(rs.getObject("vl_fcp_uf_dest") == null ? null : rs.getDouble("vl_fcp_uf_dest"));
        reg.setVlIcmsUfDest(rs.getObject("vl_icms_uf_dest") == null ? null : rs.getDouble("vl_icms_uf_dest"));
        reg.setVlIcmsUfRem(rs.getObject("vl_icms_uf_rem") == null ? null : rs.getDouble("vl_icms_uf_rem"));
        return reg;
    }
}
