package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * NF de Transporte e Conhecimentos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "D100"),
    @Field(at = 24, name = "fimLinha", literal = "")
})
public class RegD100 extends Registro {
    
    @Field(at = 2)
    private String indOper;
    
    @Field(at = 3)
    private String indEmit;
    
    @Field(at = 4)
    private String codPart;
    
    @Field(at = 5)
    private String codMod;
    
    @Field(at = 6)
    private String codSit;
    
    @Field(at = 7)
    private String ser;
    
    @Field(at = 8)
    private String sub;
    
    @Field(at = 9)
    private String numDoc;
    
    @Field(at = 10)
    private String chvCte;
    
    @Field(at = 11)
    private Date dtDoc;
    
    @Field(at = 12)
    private Date dtAP;
    
    @Field(at = 13)
    private String tpCtE;
    
    @Field(at = 14)
    private String chvCteRef;
    
    @Field(at = 15)
    private Double vlDoc;
    
    @Field(at = 16)
    private Double vlDesc;
    
    @Field(at = 17)
    private String indFrt;
    
    @Field(at = 18)
    private Double vlServ;
    
    @Field(at = 19)
    private Double vlBcIcms;
    
    @Field(at = 20)
    private Double vlIcms;
    
    @Field(at = 21)
    private Double vlNt;
    
    @Field(at = 22)
    private String codInf;
    
    @Field(at = 23)
    private String codCta;
    
    /**
     * Obtém Tipo de operação
     */
    public String getIndOper() {
        return indOper;
    }

    /**
     * Seta Tipo de operação
     * <p>0=Entrada;1=Saída</p>
     */
    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }
    
    /**
     * Obtém Emitente
     */
    public String getIndEmit() {
        return indEmit;
    }

    /**
     * Seta Emitente
     * <p>0=Emissão própria;1=Terceiros</p>
     */
    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }
    
    /**
     * Obtém Código do participante
     */
    public String getCodPart() {
        return codPart;
    }

    /**
     * Seta Código do participante
     */
    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }
    
    /**
     * Obtém Código do modelo do documento
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo do documento
     * <p>07=Nota Fiscal de Serviço de Transporte;08=Conhecimento de Transporte Rodoviário de Cargas;8B=Conhecimento de Transporte de Cargas Avulso;09=Conhecimento de Transporte Aquaviário de Cargas;10=Conhecimento Aéreo;11=Conhecimento de Transporte Ferroviário de Cargas;26=Conhecimento de Transporte Multimodal de Cargas;27=Nota Fiscal de Transporte Ferroviário de Cargas;57=Conhecimento de Transporte Eletrônico – CT-e</p>
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Código da situação do documento
     */
    public String getCodSit() {
        return codSit;
    }

    /**
     * Seta Código da situação do documento
     * <p>00=Documento regular;01=Documento regular extemporâneo;02=Documento cancelado;03=Documento cancelado extemporâneo;04=NF-e ou CT-e denegada;05=NF-e ou CT-e Numeração inutilizada;06=Documento Fiscal Complementar;07=Documento Fiscal Complementar extemporâneo;08=Documento Fiscal emitido com base em Regime Especial ou Norma Específica</p>
     */
    public void setCodSit(String codSit) {
        this.codSit = codSit;
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
     * Obtém Número do documento fiscal
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Seta Número do documento fiscal
     */
    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    
    /**
     * Obtém Chave do conhecimento de transporte eletrônico
     */
    public String getChvCte() {
        return chvCte;
    }

    /**
     * Seta Chave do conhecimento de transporte eletrônico
     */
    public void setChvCte(String chvCte) {
        this.chvCte = chvCte;
    }
    
    /**
     * Obtém Data da emissão
     */
    public Date getDtDoc() {
        return dtDoc;
    }

    /**
     * Seta Data da emissão
     */
    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    
    /**
     * Obtém Data da aquisição/prestação serviço
     */
    public Date getDtAP() {
        return dtAP;
    }

    /**
     * Seta Data da aquisição/prestação serviço
     */
    public void setDtAP(Date dtAP) {
        this.dtAP = dtAP;
    }
    
    /**
     * Obtém Tipo de CT-e
     */
    public String getTpCtE() {
        return tpCtE;
    }

    /**
     * Seta Tipo de CT-e
     */
    public void setTpCtE(String tpCtE) {
        this.tpCtE = tpCtE;
    }
    
    /**
     * Obtém Chave do CT-e de Referência
     */
    public String getChvCteRef() {
        return chvCteRef;
    }

    /**
     * Seta Chave do CT-e de Referência
     */
    public void setChvCteRef(String chvCteRef) {
        this.chvCteRef = chvCteRef;
    }
    
    /**
     * Obtém Valor total do documento fiscal
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor total do documento fiscal
     */
    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }
    
    /**
     * Obtém Valor total do desconto
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor total do desconto
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }
    
    /**
     * Obtém Tipo do frete
     */
    public String getIndFrt() {
        return indFrt;
    }

    /**
     * Seta Tipo do frete
     * <p>0=Por conta do emitente;1=Por conta do destinatário/remetente;2=Por conta de terceiros;9=Sem cobrança de frete</p>
     */
    public void setIndFrt(String indFrt) {
        this.indFrt = indFrt;
    }
    
    /**
     * Obtém Valor total da prestação de serviço
     */
    public Double getVlServ() {
        return vlServ;
    }

    /**
     * Seta Valor total da prestação de serviço
     */
    public void setVlServ(Double vlServ) {
        this.vlServ = vlServ;
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
     * Obtém Valor não-tributado
     */
    public Double getVlNt() {
        return vlNt;
    }

    /**
     * Seta Valor não-tributado
     */
    public void setVlNt(Double vlNt) {
        this.vlNt = vlNt;
    }
    
    /**
     * Obtém Código inf complementar (doc fiscal)
     */
    public String getCodInf() {
        return codInf;
    }

    /**
     * Seta Código inf complementar (doc fiscal)
     */
    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }
    
    /**
     * Obtém Código da conta analítica
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Código da conta analítica
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
}