package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * ICMS ST p/ UF Diversa
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C105"),
    @Field(at = 4, name = "fimLinha")
})
public class RegC105 extends Registro {
    
    @Field(at = 2)
    private String oper;
    
    @Field(at = 3)
    private String codUf;
    
    /**
     * Obtém Tipo de operação
     */
    public String getOper() {
        return oper;
    }

    /**
     * Seta Tipo de operação
     * <p>0=Combustíveis e Lubrificantes;1=Leasing de veículos ou faturamento direto</p>
     */
    public void setOper(String oper) {
        this.oper = oper;
    }
    
    /**
     * Obtém UF
     */
    public String getCodUf() {
        return codUf;
    }

    /**
     * Seta UF
     */
    public void setCodUf(String codUf) {
        this.codUf = codUf;
    }
    
}