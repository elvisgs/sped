package br.com.gep.spedcontrib.arquivo.registros.bloco1;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 1500 - Controle de Créditos Fiscais - COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "1500")
})
public class Reg1500 {
    
    @Field(at = 1)
    private String perApuCred;
    
    @Field(at = 2)
    private String origCred;
    
    @Field(at = 3)
    private String cnpjSuc;
    
    @Field(at = 4)
    private String codCred;
    
    @Field(at = 5)
    private Double vlCredApu;
    
    @Field(at = 6)
    private Double vlCredExtApu;
    
    @Field(at = 7)
    private Double vlTotCredApu;
    
    @Field(at = 8)
    private Double vlCredDescPaAnt;
    
    @Field(at = 9)
    private Double vlCredPerPaAnt;
    
    @Field(at = 10)
    private Double vlCredDcompPaAnt;
    
    @Field(at = 11)
    private Double sdCredDispEfd;
    
    @Field(at = 12)
    private Double vlCredDescEfd;
    
    @Field(at = 13)
    private Double vlCredPerEfd;
    
    @Field(at = 14)
    private Double vlCredDcompEfd;
    
    @Field(at = 15)
    private Double vlCredTrans;
    
    @Field(at = 16)
    private Double vlCredOut;
    
    @Field(at = 17)
    private Double sldCredFim;
    
    
    /**
     * Obtém Período de Apuração do Crédito (MM/AAAA)
     */
    public String getPerApuCred() {
        return perApuCred;
    }

    /**
     * Seta Período de Apuração do Crédito (MM/AAAA)
     */
    public void setPerApuCred(String perApuCred) {
        this.perApuCred = perApuCred;
    }
    
    /**
     * Obtém Indicador da origem do crédito.
     */
    public String getOrigCred() {
        return origCred;
    }

    /**
     * Seta Indicador da origem do crédito.
     */
    public void setOrigCred(String origCred) {
        this.origCred = origCred;
    }
    
    /**
     * Obtém CNPJ da pessoa jurídica cedente do crédito (se ORIG_CRED = 02).
     */
    public String getCnpjSuc() {
        return cnpjSuc;
    }

    /**
     * Seta CNPJ da pessoa jurídica cedente do crédito (se ORIG_CRED = 02).
     */
    public void setCnpjSuc(String cnpjSuc) {
        this.cnpjSuc = cnpjSuc;
    }
    
    /**
     * Obtém Código do Tipo do Crédito, conforme Tabela 4.3.6
     */
    public String getCodCred() {
        return codCred;
    }

    /**
     * Seta Código do Tipo do Crédito, conforme Tabela 4.3.6
     */
    public void setCodCred(String codCred) {
        this.codCred = codCred;
    }
    
    /**
     * Obtém Valor do Crédito já apurado em Demonstrativo Dacon ou em Escrituração Fiscal Digital.
     */
    public Double getVlCredApu() {
        return vlCredApu;
    }

    /**
     * Seta Valor do Crédito já apurado em Demonstrativo Dacon ou em Escrituração Fiscal Digital.
     */
    public void setVlCredApu(Double vlCredApu) {
        this.vlCredApu = vlCredApu;
    }
    
    /**
     * Obtém Valor de Crédito Extemporâneo Apurado (Registro 1501), referente a Período Anterior, Informado no Campo 02 - PER_APU_CRED
     */
    public Double getVlCredExtApu() {
        return vlCredExtApu;
    }

    /**
     * Seta Valor de Crédito Extemporâneo Apurado (Registro 1501), referente a Período Anterior, Informado no Campo 02 - PER_APU_CRED
     */
    public void setVlCredExtApu(Double vlCredExtApu) {
        this.vlCredExtApu = vlCredExtApu;
    }
    
    /**
     * Obtém Valor Total do Crédito Apurado (06 + 07)
     */
    public Double getVlTotCredApu() {
        return vlTotCredApu;
    }

    /**
     * Seta Valor Total do Crédito Apurado (06 + 07)
     */
    public void setVlTotCredApu(Double vlTotCredApu) {
        this.vlTotCredApu = vlTotCredApu;
    }
    
    /**
     * Obtém Valor do Crédito utilizado mediante Desconto, em Período(s)  Anterior(es)
     */
    public Double getVlCredDescPaAnt() {
        return vlCredDescPaAnt;
    }

    /**
     * Seta Valor do Crédito utilizado mediante Desconto, em Período(s)  Anterior(es)
     */
    public void setVlCredDescPaAnt(Double vlCredDescPaAnt) {
        this.vlCredDescPaAnt = vlCredDescPaAnt;
    }
    
    /**
     * Obtém Valor do Crédito utilizado mediante Pedido de Ressarcimento, em Período(s) Anterior(es).
     */
    public Double getVlCredPerPaAnt() {
        return vlCredPerPaAnt;
    }

    /**
     * Seta Valor do Crédito utilizado mediante Pedido de Ressarcimento, em Período(s) Anterior(es).
     */
    public void setVlCredPerPaAnt(Double vlCredPerPaAnt) {
        this.vlCredPerPaAnt = vlCredPerPaAnt;
    }
    
    /**
     * Obtém Valor do Crédito utilizado mediante Declaração de Compensação Intermediária (Crédito de Exportação), em Período(s) Anterior(es)
     */
    public Double getVlCredDcompPaAnt() {
        return vlCredDcompPaAnt;
    }

    /**
     * Seta Valor do Crédito utilizado mediante Declaração de Compensação Intermediária (Crédito de Exportação), em Período(s) Anterior(es)
     */
    public void setVlCredDcompPaAnt(Double vlCredDcompPaAnt) {
        this.vlCredDcompPaAnt = vlCredDcompPaAnt;
    }
    
    /**
     * Obtém Saldo do Crédito Disponível para Utilização neste  Período de Escrituração (08-09-10-11)
     */
    public Double getSdCredDispEfd() {
        return sdCredDispEfd;
    }

    /**
     * Seta Saldo do Crédito Disponível para Utilização neste  Período de Escrituração (08-09-10-11)
     */
    public void setSdCredDispEfd(Double sdCredDispEfd) {
        this.sdCredDispEfd = sdCredDispEfd;
    }
    
    /**
     * Obtém Valor do Crédito descontado neste período de escrituração
     */
    public Double getVlCredDescEfd() {
        return vlCredDescEfd;
    }

    /**
     * Seta Valor do Crédito descontado neste período de escrituração
     */
    public void setVlCredDescEfd(Double vlCredDescEfd) {
        this.vlCredDescEfd = vlCredDescEfd;
    }
    
    /**
     * Obtém Valor do Crédito objeto de Pedido de Ressarcimento (PER) neste período de escrituração
     */
    public Double getVlCredPerEfd() {
        return vlCredPerEfd;
    }

    /**
     * Seta Valor do Crédito objeto de Pedido de Ressarcimento (PER) neste período de escrituração
     */
    public void setVlCredPerEfd(Double vlCredPerEfd) {
        this.vlCredPerEfd = vlCredPerEfd;
    }
    
    /**
     * Obtém Valor do Crédito utilizado mediante Declaração de Compensação Intermediária neste período de escrituração
     */
    public Double getVlCredDcompEfd() {
        return vlCredDcompEfd;
    }

    /**
     * Seta Valor do Crédito utilizado mediante Declaração de Compensação Intermediária neste período de escrituração
     */
    public void setVlCredDcompEfd(Double vlCredDcompEfd) {
        this.vlCredDcompEfd = vlCredDcompEfd;
    }
    
    /**
     * Obtém Valor do crédito transferido em evento de cisão, fusão ou incorporação
     */
    public Double getVlCredTrans() {
        return vlCredTrans;
    }

    /**
     * Seta Valor do crédito transferido em evento de cisão, fusão ou incorporação
     */
    public void setVlCredTrans(Double vlCredTrans) {
        this.vlCredTrans = vlCredTrans;
    }
    
    /**
     * Obtém Valor do crédito utilizado por outras formas
     */
    public Double getVlCredOut() {
        return vlCredOut;
    }

    /**
     * Seta Valor do crédito utilizado por outras formas
     */
    public void setVlCredOut(Double vlCredOut) {
        this.vlCredOut = vlCredOut;
    }
    
    /**
     * Obtém Saldo de créditos a utilizar em período de apuração futuro (12-13-14-15-16-17).
     */
    public Double getSldCredFim() {
        return sldCredFim;
    }

    /**
     * Seta Saldo de créditos a utilizar em período de apuração futuro (12-13-14-15-16-17).
     */
    public void setSldCredFim(Double sldCredFim) {
        this.sldCredFim = sldCredFim;
    }
    
    
}