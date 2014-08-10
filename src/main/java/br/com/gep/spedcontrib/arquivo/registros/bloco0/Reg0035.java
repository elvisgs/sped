package br.com.gep.spedcontrib.arquivo.registros.bloco0;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Identificação de Sociedades em Conta de Participação (SCP)
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "0035")
})
public class Reg0035 {
    
    @Field(at = 1)
    private String codScp;
    
    @Field(at = 2)
    private String nomeScp;
    
    @Field(at = 3)
    private String infComp;
    
    
    /**
     * Obtém Identificação
     */
    public String getCodScp() {
        return codScp;
    }

    /**
     * Seta Identificação
     */
    public void setCodScp(String codScp) {
        this.codScp = codScp;
    }
    
    /**
     * Obtém Descrição
     */
    public String getNomeScp() {
        return nomeScp;
    }

    /**
     * Seta Descrição
     */
    public void setNomeScp(String nomeScp) {
        this.nomeScp = nomeScp;
    }
    
    /**
     * Obtém Informação complementar
     */
    public String getInfComp() {
        return infComp;
    }

    /**
     * Seta Informação complementar
     */
    public void setInfComp(String infComp) {
        this.infComp = infComp;
    }
    
    
}