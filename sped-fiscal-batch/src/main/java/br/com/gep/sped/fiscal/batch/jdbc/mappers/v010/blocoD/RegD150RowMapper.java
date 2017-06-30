package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.blocoD;

import br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD.RegD150;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegD150RowMapper implements RowMapper<RegD150> {

    @Override
    public RegD150 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegD150 reg = new RegD150();
        reg.setId(rs.getInt("id"));
        reg.setCodMunOrig(rs.getString("cod_mun_orig"));
        reg.setCodMunDest(rs.getString("cod_mun_dest"));
        reg.setVeicId(rs.getString("veic_id"));
        reg.setViagem(rs.getInt("viagem"));
        reg.setIndTfa(rs.getString("ind_tfa"));
        reg.setVlPesoTx(rs.getObject("vl_peso_tx") == null ? null : rs.getDouble("vl_peso_tx"));
        reg.setVlTxTerr(rs.getObject("vl_tx_terr") == null ? null : rs.getDouble("vl_tx_terr"));
        reg.setVlTxRed(rs.getObject("vl_tx_red") == null ? null : rs.getDouble("vl_tx_red"));
        reg.setVlOut(rs.getObject("vl_out") == null ? null : rs.getDouble("vl_out"));
        reg.setVlTxAdv(rs.getObject("vl_tx_adv") == null ? null : rs.getDouble("vl_tx_adv"));
        return reg;
    }
}
