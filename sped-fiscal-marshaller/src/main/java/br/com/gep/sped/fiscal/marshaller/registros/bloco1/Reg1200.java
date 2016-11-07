package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * CONTROLE DE CRÉDITOS FISCAIS - ICMS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1200"),
    @Field(at = 8, name = "fimLinha")
})
public class Reg1200 extends Registro {
    
    @Field(at = 2)
    private String codAjApur;
    
    @Field(at = 3)
    private Double sldCred;
    
    @Field(at = 4)
    private Double credApr;
    
    @Field(at = 5)
    private Double credReceb;
    
    @Field(at = 6)
    private Double credUtil;
    
    @Field(at = 7)
    private Double sldCredFim;
    
    /**
     * Obtém Código de ajuste
     */
    public String getCodAjApur() {
        return codAjApur;
    }

    /**
     * Seta Código de ajuste
     */
    public void setCodAjApur(String codAjApur) {
        this.codAjApur = codAjApur;
    }
    
    /**
     * Obtém Saldo de créditos fiscais anteriores
     */
    public Double getSldCred() {
        return sldCred;
    }

    /**
     * Seta Saldo de créditos fiscais anteriores
     */
    public void setSldCred(Double sldCred) {
        this.sldCred = sldCred;
    }
    
    /**
     * Obtém Crédito apropriado no mês
     */
    public Double getCredApr() {
        return credApr;
    }

    /**
     * Seta Crédito apropriado no mês
     */
    public void setCredApr(Double credApr) {
        this.credApr = credApr;
    }
    
    /**
     * Obtém Créditos recebidos por transferência
     */
    public Double getCredReceb() {
        return credReceb;
    }

    /**
     * Seta Créditos recebidos por transferência
     */
    public void setCredReceb(Double credReceb) {
        this.credReceb = credReceb;
    }
    
    /**
     * Obtém Créditos utilizados no período
     */
    public Double getCredUtil() {
        return credUtil;
    }

    /**
     * Seta Créditos utilizados no período
     */
    public void setCredUtil(Double credUtil) {
        this.credUtil = credUtil;
    }
    
    /**
     * Obtém Saldo de crédito fiscal
     */
    public Double getSldCredFim() {
        return sldCredFim;
    }

    /**
     * Seta Saldo de crédito fiscal
     */
    public void setSldCredFim(Double sldCredFim) {
        this.sldCredFim = sldCredFim;
    }
    
}