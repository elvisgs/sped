package br.com.gep.spedcontrib.arquivo.registros.blocoM;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * M605 - Detalhamento da Contribuição
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "M605"),
    @Field(at = 5, name = "fimLinha", literal = "")
})
public class RegM605 {
    
    @Field(at = 2)
    private String numCampo;
    
    @Field(at = 3)
    private String codRec;
    
    @Field(at = 4)
    private Double vlDebito;
    
    
    /**
     * Obtém Número do Campo de M600 a ser detalhado
     */
    public String getNumCampo() {
        return numCampo;
    }

    /**
     * Seta Número do Campo de M600 a ser detalhado
     */
    public void setNumCampo(String numCampo) {
        this.numCampo = numCampo;
    }
    
    /**
     * Obtém Código da Receita
     */
    public String getCodRec() {
        return codRec;
    }

    /**
     * Seta Código da Receita
     */
    public void setCodRec(String codRec) {
        this.codRec = codRec;
    }
    
    /**
     * Obtém Valor do Débito
     */
    public Double getVlDebito() {
        return vlDebito;
    }

    /**
     * Seta Valor do Débito
     */
    public void setVlDebito(Double vlDebito) {
        this.vlDebito = vlDebito;
    }
    
    
}