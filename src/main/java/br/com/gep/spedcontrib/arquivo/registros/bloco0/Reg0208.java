package br.com.gep.spedcontrib.arquivo.registros.bloco0;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 0208 - Grupos por Marca Comercial - REFRI
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0208"),
    @Field(at = 5, name = "fimLinha", literal = "")
})
public class Reg0208 {
    
    @Field(at = 2)
    private String codTab;
    
    @Field(at = 3)
    private String codGru;
    
    @Field(at = 4)
    private String marcaCom;
    
    
    /**
     * Obtém Código da Tabela de Incidência
     */
    public String getCodTab() {
        return codTab;
    }

    /**
     * Seta Código da Tabela de Incidência
     */
    public void setCodTab(String codTab) {
        this.codTab = codTab;
    }
    
    /**
     * Obtém Código do grupo
     */
    public String getCodGru() {
        return codGru;
    }

    /**
     * Seta Código do grupo
     */
    public void setCodGru(String codGru) {
        this.codGru = codGru;
    }
    
    /**
     * Obtém Marca comercial
     */
    public String getMarcaCom() {
        return marcaCom;
    }

    /**
     * Seta Marca comercial
     */
    public void setMarcaCom(String marcaCom) {
        this.marcaCom = marcaCom;
    }
    
    
}