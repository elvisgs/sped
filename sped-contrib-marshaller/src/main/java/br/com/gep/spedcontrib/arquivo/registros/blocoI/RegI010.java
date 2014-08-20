package br.com.gep.spedcontrib.arquivo.registros.blocoI;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * I010 - Identificação do Estabelecimento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "I010"),
    @Field(at = 5, name = "fimLinha", literal = "")
})
public class RegI010 extends RegBase {
    
    @Field(at = 2)
    private String cnpj;
    
    @Field(at = 3)
    private String indAtiv;
    
    @Field(at = 4)
    private String infoCompl;
    
    
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
     * Obtém Indicador de operações realizadas no período
     */
    public String getIndAtiv() {
        return indAtiv;
    }

    /**
     * Seta Indicador de operações realizadas no período
     */
    public void setIndAtiv(String indAtiv) {
        this.indAtiv = indAtiv;
    }
    
    /**
     * Obtém Informação complementar
     */
    public String getInfoCompl() {
        return infoCompl;
    }

    /**
     * Seta Informação complementar
     */
    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
    }
    
    
}