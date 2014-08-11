package br.com.gep.spedcontrib.arquivo.registros.blocoC;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C010 - Estabelecimento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C010"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class RegC010 {
    
    @Field(at = 2)
    private String cnpj;
    
    @Field(at = 3)
    private String indEscri;
    
    
    /**
     * Obtém Número de inscrição do estabelecimento no CNPJ
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Seta Número de inscrição do estabelecimento no CNPJ
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    /**
     * Obtém Indicador da Apuração
     */
    public String getIndEscri() {
        return indEscri;
    }

    /**
     * Seta Indicador da Apuração
     */
    public void setIndEscri(String indEscri) {
        this.indEscri = indEscri;
    }
    
    
}