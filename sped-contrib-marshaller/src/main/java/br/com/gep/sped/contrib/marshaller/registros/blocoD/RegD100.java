package br.com.gep.sped.contrib.marshaller.registros.blocoD;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * D100 - Aquisição de Serviços de Transportes
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
    private String tpCte;
    
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
     * Obtém Tipo de Operação
     */
    public String getIndOper() {
        return indOper;
    }

    /**
     * Seta Tipo de Operação
     */
    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }
    
    /**
     * Obtém Emitente do Documento
     */
    public String getIndEmit() {
        return indEmit;
    }

    /**
     * Seta Emitente do Documento
     */
    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }
    
    /**
     * Obtém Participante
     */
    public String getCodPart() {
        return codPart;
    }

    /**
     * Seta Participante
     */
    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }
    
    /**
     * Obtém Modelo do Documento
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Modelo do Documento
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Situação do Documento
     */
    public String getCodSit() {
        return codSit;
    }

    /**
     * Seta Situação do Documento
     */
    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }
    
    /**
     * Obtém Série
     */
    public String getSer() {
        return ser;
    }

    /**
     * Seta Série
     */
    public void setSer(String ser) {
        this.ser = ser;
    }
    
    /**
     * Obtém Subsérie
     */
    public String getSub() {
        return sub;
    }

    /**
     * Seta Subsérie
     */
    public void setSub(String sub) {
        this.sub = sub;
    }
    
    /**
     * Obtém Número
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Seta Número
     */
    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    
    /**
     * Obtém Chave do CT-e
     */
    public String getChvCte() {
        return chvCte;
    }

    /**
     * Seta Chave do CT-e
     */
    public void setChvCte(String chvCte) {
        this.chvCte = chvCte;
    }
    
    /**
     * Obtém Data da Emissão do Documento
     */
    public Date getDtDoc() {
        return dtDoc;
    }

    /**
     * Seta Data da Emissão do Documento
     */
    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    
    /**
     * Obtém Data da aquisição/prestação do Serviço
     */
    public Date getDtAP() {
        return dtAP;
    }

    /**
     * Seta Data da aquisição/prestação do Serviço
     */
    public void setDtAP(Date dtAP) {
        this.dtAP = dtAP;
    }
    
    /**
     * Obtém Tipo de CT-e
     */
    public String getTpCte() {
        return tpCte;
    }

    /**
     * Seta Tipo de CT-e
     */
    public void setTpCte(String tpCte) {
        this.tpCte = tpCte;
    }
    
    /**
     * Obtém Chave do CT-e de referência
     */
    public String getChvCteRef() {
        return chvCteRef;
    }

    /**
     * Seta Chave do CT-e de referência
     */
    public void setChvCteRef(String chvCteRef) {
        this.chvCteRef = chvCteRef;
    }
    
    /**
     * Obtém Valor Total do Documento Fiscal
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor Total do Documento Fiscal
     */
    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }
    
    /**
     * Obtém Valor Total do Desconto
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor Total do Desconto
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }
    
    /**
     * Obtém Tipo do Frete
     */
    public String getIndFrt() {
        return indFrt;
    }

    /**
     * Seta Tipo do Frete
     */
    public void setIndFrt(String indFrt) {
        this.indFrt = indFrt;
    }
    
    /**
     * Obtém Valor Total da Prestação de Serviço
     */
    public Double getVlServ() {
        return vlServ;
    }

    /**
     * Seta Valor Total da Prestação de Serviço
     */
    public void setVlServ(Double vlServ) {
        this.vlServ = vlServ;
    }
    
    /**
     * Obtém Base de Cálculo do ICMS
     */
    public Double getVlBcIcms() {
        return vlBcIcms;
    }

    /**
     * Seta Base de Cálculo do ICMS
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
     * Obtém Valor não-tributado do ICMS
     */
    public Double getVlNt() {
        return vlNt;
    }

    /**
     * Seta Valor não-tributado do ICMS
     */
    public void setVlNt(Double vlNt) {
        this.vlNt = vlNt;
    }
    
    /**
     * Obtém Informação Complementar do Documento
     */
    public String getCodInf() {
        return codInf;
    }

    /**
     * Seta Informação Complementar do Documento
     */
    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }
    
    /**
     * Obtém Conta Analítica Contábil
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Conta Analítica Contábil
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
    
}