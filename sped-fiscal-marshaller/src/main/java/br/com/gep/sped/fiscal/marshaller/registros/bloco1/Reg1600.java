package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Operações com Cartão de Crédito/Débito
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1600"),
    @Field(at = 5, name = "fimLinha")
})
public class Reg1600 extends Registro {
    
    @Field(at = 2)
    private String codPart;
    
    @Field(at = 3)
    private Double totCredito;
    
    @Field(at = 4)
    private Double totDebito;
    
    /**
     * Obtém Código do Participante
     */
    public String getCodPart() {
        return codPart;
    }

    /**
     * Seta Código do Participante
     */
    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }
    
    /**
     * Obtém Valores recebido com cartões de crédito
     */
    public Double getTotCredito() {
        return totCredito;
    }

    /**
     * Seta Valores recebido com cartões de crédito
     */
    public void setTotCredito(Double totCredito) {
        this.totCredito = totCredito;
    }
    
    /**
     * Obtém Valores recebidos com cartões de débito
     */
    public Double getTotDebito() {
        return totDebito;
    }

    /**
     * Seta Valores recebidos com cartões de débito
     */
    public void setTotDebito(Double totDebito) {
        this.totDebito = totDebito;
    }
    
}