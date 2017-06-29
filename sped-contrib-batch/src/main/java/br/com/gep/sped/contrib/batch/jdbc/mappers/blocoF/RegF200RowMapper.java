package br.com.gep.sped.contrib.batch.jdbc.mappers.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.blocoF.RegF200;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@Lazy
public class RegF200RowMapper implements RowMapper<RegF200> {

    @Override
    public RegF200 mapRow(ResultSet rs, int rowNum) throws SQLException {
        RegF200 reg = new RegF200();
        reg.setId(rs.getInt("id"));
        reg.setIndOper(rs.getString("ind_oper"));
        reg.setUnidImob(rs.getString("unid_imob"));
        reg.setIdentEmp(rs.getString("ident_emp"));
        reg.setDescUnidImob(rs.getString("desc_unid_imob"));
        reg.setNumCont(rs.getString("num_cont"));
        reg.setCpfCnpjAdqu(rs.getString("cpf_cnpj_adqu"));
        reg.setDtOper(rs.getDate("dt_oper"));
        reg.setVlTotVend(rs.getObject("vl_tot_vend") == null ? null : rs.getDouble("vl_tot_vend"));
        reg.setVlRecAcum(rs.getObject("vl_rec_acum") == null ? null : rs.getDouble("vl_rec_acum"));
        reg.setVlTotRec(rs.getObject("vl_tot_rec") == null ? null : rs.getDouble("vl_tot_rec"));
        reg.setCstPis(rs.getString("cst_pis"));
        reg.setVlBcPis(rs.getObject("vl_bc_pis") == null ? null : rs.getDouble("vl_bc_pis"));
        reg.setAliqPis(rs.getObject("aliq_pis") == null ? null : rs.getDouble("aliq_pis"));
        reg.setVlPis(rs.getObject("vl_pis") == null ? null : rs.getDouble("vl_pis"));
        reg.setCstCofins(rs.getString("cst_cofins"));
        reg.setVlBcCofins(rs.getObject("vl_bc_cofins") == null ? null : rs.getDouble("vl_bc_cofins"));
        reg.setAliqCofins(rs.getObject("aliq_cofins") == null ? null : rs.getDouble("aliq_cofins"));
        reg.setVlCofins(rs.getObject("vl_cofins") == null ? null : rs.getDouble("vl_cofins"));
        reg.setPercRecReceb(rs.getObject("perc_rec_receb") == null ? null : rs.getDouble("perc_rec_receb"));
        reg.setIndNatEmp(rs.getString("ind_nat_emp"));
        reg.setInfComp(rs.getString("inf_comp"));
        return reg;
    }
}
