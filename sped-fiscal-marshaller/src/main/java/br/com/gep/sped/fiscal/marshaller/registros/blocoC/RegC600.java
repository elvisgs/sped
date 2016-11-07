package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Energia Elétrica/Água/Gás - NF consolidadas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C600"),
    @Field(at = 23, name = "fimLinha")
})
public class RegC600 extends Registro {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private String codMun;
    
    @Field(at = 4)
    private String ser;
    
    @Field(at = 5)
    private String sub;
    
    @Field(at = 6)
    private String codCons;
    
    @Field(at = 7)
    private Integer qtdCons;
    
    @Field(at = 8)
    private Integer qtdCanc;
    
    @Field(at = 9)
    private Date dtDoc;
    
    @Field(at = 10)
    private Double vlDoc;
    
    @Field(at = 11)
    private Double vlDesc;
    
    @Field(at = 12)
    private Integer cons;
    
    @Field(at = 13)
    private Double vlForn;
    
    @Field(at = 14)
    private Double vlServNt;
    
    @Field(at = 15)
    private Double vlTerc;
    
    @Field(at = 16)
    private Double vlDa;
    
    @Field(at = 17)
    private Double vlBcIcms;
    
    @Field(at = 18)
    private Double vlIcms;
    
    @Field(at = 19)
    private Double vlBcIcmsSt;
    
    @Field(at = 20)
    private Double vlIcmsSt;
    
    @Field(at = 21)
    private Double vlPis;
    
    @Field(at = 22)
    private Double vlCofins;
    
    /**
     * Obtém Código do modelo do documento
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo do documento
     * <p>06=Nota Fiscal/Conta de Energia Elétrica;28=Nota Fiscal/Conta de Fornecimento de Gás Canalizado;29=Nota Fiscal/Conta de Fornecimento de Água Canalizada</p>
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Código do município
     */
    public String getCodMun() {
        return codMun;
    }

    /**
     * Seta Código do município
     */
    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }
    
    /**
     * Obtém Série do documento fiscal
     */
    public String getSer() {
        return ser;
    }

    /**
     * Seta Série do documento fiscal
     */
    public void setSer(String ser) {
        this.ser = ser;
    }
    
    /**
     * Obtém Subsérie do documento fiscal
     */
    public String getSub() {
        return sub;
    }

    /**
     * Seta Subsérie do documento fiscal
     */
    public void setSub(String sub) {
        this.sub = sub;
    }
    
    /**
     * Obtém Código da classe de consumo
     */
    public String getCodCons() {
        return codCons;
    }

    /**
     * Seta Código da classe de consumo
     */
    public void setCodCons(String codCons) {
        this.codCons = codCons;
    }
    
    /**
     * Obtém Quant. doc. consolidados
     */
    public Integer getQtdCons() {
        return qtdCons;
    }

    /**
     * Seta Quant. doc. consolidados
     */
    public void setQtdCons(Integer qtdCons) {
        this.qtdCons = qtdCons;
    }
    
    /**
     * Obtém Quant. doc. cancelados
     */
    public Integer getQtdCanc() {
        return qtdCanc;
    }

    /**
     * Seta Quant. doc. cancelados
     */
    public void setQtdCanc(Integer qtdCanc) {
        this.qtdCanc = qtdCanc;
    }
    
    /**
     * Obtém Data doc. consolidados
     */
    public Date getDtDoc() {
        return dtDoc;
    }

    /**
     * Seta Data doc. consolidados
     */
    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    
    /**
     * Obtém Valor total
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor total
     */
    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }
    
    /**
     * Obtém Valor acumulado descontos
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor acumulado descontos
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }
    
    /**
     * Obtém Consumo total acumulado
     */
    public Integer getCons() {
        return cons;
    }

    /**
     * Seta Consumo total acumulado
     */
    public void setCons(Integer cons) {
        this.cons = cons;
    }
    
    /**
     * Obtém Valor acumulado do fornecimento
     */
    public Double getVlForn() {
        return vlForn;
    }

    /**
     * Seta Valor acumulado do fornecimento
     */
    public void setVlForn(Double vlForn) {
        this.vlForn = vlForn;
    }
    
    /**
     * Obtém Valor acumulado serviços NT pelo ICMS
     */
    public Double getVlServNt() {
        return vlServNt;
    }

    /**
     * Seta Valor acumulado serviços NT pelo ICMS
     */
    public void setVlServNt(Double vlServNt) {
        this.vlServNt = vlServNt;
    }
    
    /**
     * Obtém Valores cobrados para terceiros
     */
    public Double getVlTerc() {
        return vlTerc;
    }

    /**
     * Seta Valores cobrados para terceiros
     */
    public void setVlTerc(Double vlTerc) {
        this.vlTerc = vlTerc;
    }
    
    /**
     * Obtém Valor despesas acessórias
     */
    public Double getVlDa() {
        return vlDa;
    }

    /**
     * Seta Valor despesas acessórias
     */
    public void setVlDa(Double vlDa) {
        this.vlDa = vlDa;
    }
    
    /**
     * Obtém Base de cálculo do ICMS
     */
    public Double getVlBcIcms() {
        return vlBcIcms;
    }

    /**
     * Seta Base de cálculo do ICMS
     */
    public void setVlBcIcms(Double vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }
    
    /**
     * Obtém Valor do ICMS
     */
    public Double getVlIcms() {
        return vlIcms;
    }

    /**
     * Seta Valor do ICMS
     */
    public void setVlIcms(Double vlIcms) {
        this.vlIcms = vlIcms;
    }
    
    /**
     * Obtém Base de cálculo do ICMS ST
     */
    public Double getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    /**
     * Seta Base de cálculo do ICMS ST
     */
    public void setVlBcIcmsSt(Double vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }
    
    /**
     * Obtém Valor do ICMS ST
     */
    public Double getVlIcmsSt() {
        return vlIcmsSt;
    }

    /**
     * Seta Valor do ICMS ST
     */
    public void setVlIcmsSt(Double vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }
    
    /**
     * Obtém Valor do PIS
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor do PIS
     */
    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
    }
    
    /**
     * Obtém Valor da COFINS
     */
    public Double getVlCofins() {
        return vlCofins;
    }

    /**
     * Seta Valor da COFINS
     */
    public void setVlCofins(Double vlCofins) {
        this.vlCofins = vlCofins;
    }
    
}