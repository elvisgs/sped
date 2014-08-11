package br.com.gep.spedcontrib.arquivo.registros.bloco0;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 0110 - Regime de Apuração
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0110"),
    @Field(at = 6, name = "fimLinha", literal = "")
})
public class Reg0110 {
    
    @Field(at = 2)
    private String codIncTrib;
    
    @Field(at = 3)
    private String indAproCred;
    
    @Field(at = 4)
    private String codTipoCont;
    
    @Field(at = 5)
    private String indRegCum;
    
    
    /**
     * Obtém Incidência tributária no período
     */
    public String getCodIncTrib() {
        return codIncTrib;
    }

    /**
     * Seta Incidência tributária no período
     */
    public void setCodIncTrib(String codIncTrib) {
        this.codIncTrib = codIncTrib;
    }
    
    /**
     * Obtém Método de apropriação de créditos comuns
     */
    public String getIndAproCred() {
        return indAproCred;
    }

    /**
     * Seta Método de apropriação de créditos comuns
     */
    public void setIndAproCred(String indAproCred) {
        this.indAproCred = indAproCred;
    }
    
    /**
     * Obtém Tipo de contribuição apurada no período
     */
    public String getCodTipoCont() {
        return codTipoCont;
    }

    /**
     * Seta Tipo de contribuição apurada no período
     */
    public void setCodTipoCont(String codTipoCont) {
        this.codTipoCont = codTipoCont;
    }
    
    /**
     * Obtém Critério de escrituração e apuração
     */
    public String getIndRegCum() {
        return indRegCum;
    }

    /**
     * Seta Critério de escrituração e apuração
     */
    public void setIndRegCum(String indRegCum) {
        this.indRegCum = indRegCum;
    }
    
    
}