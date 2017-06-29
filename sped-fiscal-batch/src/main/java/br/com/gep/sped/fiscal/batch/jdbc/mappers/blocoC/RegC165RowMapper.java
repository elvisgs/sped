package br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC;

import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC165;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegC165RowMapper implements RowMapper<RegC165> {

    @Override
    public RegC165 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegC165 reg = new RegC165();
        reg.setId(rs.getInt("id"));
        reg.setCodPart(rs.getString("cod_part"));
        reg.setVeicId(rs.getString("veic_id"));
        reg.setCodAut(rs.getString("cod_aut"));
        reg.setNrPasse(rs.getString("nr_passe"));
        reg.setHora(rs.getString("hora"));
        reg.setTemper(rs.getObject("temper") == null ? null : rs.getDouble("temper"));
        reg.setQtdVol(rs.getInt("qtd_vol"));
        reg.setPesoBrt(rs.getObject("peso_brt") == null ? null : rs.getDouble("peso_brt"));
        reg.setPesoLiq(rs.getObject("peso_liq") == null ? null : rs.getDouble("peso_liq"));
        reg.setNomMot(rs.getString("nom_mot"));
        reg.setCpf(rs.getString("cpf"));
        reg.setUfId(rs.getString("uf_id"));
        return reg;
    }
}
