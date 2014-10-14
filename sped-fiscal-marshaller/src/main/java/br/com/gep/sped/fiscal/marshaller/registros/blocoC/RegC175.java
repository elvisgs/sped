package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Veículo Novo
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C175"),
    @Field(at = 6, name = "fimLinha", literal = "")
})
public class RegC175 extends Registro {
    
    @Field(at = 2)
    private String indVeicOper;
    
    @Field(at = 3)
    private String cnpj;
    
    @Field(at = 4)
    private String uf;
    
    @Field(at = 5)
    private String chassiVeic;
    
    /**
     * Obtém Tipo de operação com veículo
     */
    public String getIndVeicOper() {
        return indVeicOper;
    }

    /**
     * Seta Tipo de operação com veículo
     * <p>0=Venda para concessionária;1=Faturamento direto;2=Venda direta;3=Venda da concessionária;9=Outros</p>
     */
    public void setIndVeicOper(String indVeicOper) {
        this.indVeicOper = indVeicOper;
    }
    
    /**
     * Obtém CNPJ da Concessionária
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Seta CNPJ da Concessionária
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    /**
     * Obtém UF da Concessionária
     */
    public String getUf() {
        return uf;
    }

    /**
     * Seta UF da Concessionária
     */
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    /**
     * Obtém Chassi do veículo
     */
    public String getChassiVeic() {
        return chassiVeic;
    }

    /**
     * Seta Chassi do veículo
     */
    public void setChassiVeic(String chassiVeic) {
        this.chassiVeic = chassiVeic;
    }
    
}