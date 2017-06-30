package br.com.gep.sped.fiscal.batch.jdbc.mappers.v010.bloco1;

import br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1.Reg1320;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class Reg1320RowMapper implements RowMapper<Reg1320> {

    @Override
    public Reg1320 mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reg1320 reg = new Reg1320();
        reg.setId(rs.getInt("id"));
        reg.setNumBico(rs.getInt("num_bico"));
        reg.setNrInterv(rs.getInt("nr_interv"));
        reg.setMotInterv(rs.getString("mot_interv"));
        reg.setNomInterv(rs.getString("nom_interv"));
        reg.setCnpjInterv(rs.getString("cnpj_interv"));
        reg.setCpfInterv(rs.getString("cpf_interv"));
        reg.setValFecha(rs.getObject("val_fecha") == null ? null : rs.getDouble("val_fecha"));
        reg.setValAbert(rs.getObject("val_abert") == null ? null : rs.getDouble("val_abert"));
        reg.setVolAferi(rs.getObject("vol_aferi") == null ? null : rs.getDouble("vol_aferi"));
        reg.setVolVendas(rs.getObject("vol_vendas") == null ? null : rs.getDouble("vol_vendas"));
        return reg;
    }
}
