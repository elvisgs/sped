package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * CF-e Emitido por SAT
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C800"),
    @Field(at = 18, name = "fimLinha", literal = "")
})
public class RegC800 extends Registro {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private String codSit;
    
    @Field(at = 4)
    private String numCfe;
    
    @Field(at = 5)
    private Date dtDoc;
    
    @Field(at = 6)
    private Double vlCfe;
    
    @Field(at = 7)
    private Double vlPis;
    
    @Field(at = 8)
    private Double vlCofins;
    
    @Field(at = 9)
    private String cnpjCpf;
    
    @Field(at = 10)
    private String nrSat;
    
    @Field(at = 11)
    private String chvCfe;
    
    @Field(at = 12)
    private Double vlDesc;
    
    @Field(at = 13)
    private Double vlMerc;
    
    @Field(at = 14)
    private Double vlOutDa;
    
    @Field(at = 15)
    private Double vlIcms;
    
    @Field(at = 16)
    private Double vlPisSt;
    
    @Field(at = 17)
    private Double vlCofinsSt;
    
    /**
     * Obtém Código do modelo de documento fiscal
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo de documento fiscal
     * <p>59=Cupom Fiscal Eletrônico - CF-e</p>
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Código da Situação do documento fiscal
     */
    public String getCodSit() {
        return codSit;
    }

    /**
     * Seta Código da Situação do documento fiscal
     * <p>00=Documento regular;01=Documento regular extemporâneo;02=Documento cancelado;03=Documento cancelado extemporâneo</p>
     */
    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }
    
    /**
     * Obtém Número do cupom fiscal Eletrônico
     */
    public String getNumCfe() {
        return numCfe;
    }

    /**
     * Seta Número do cupom fiscal Eletrônico
     */
    public void setNumCfe(String numCfe) {
        this.numCfe = numCfe;
    }
    
    /**
     * Obtém Data da Emissão do cupom fiscal eletrônico
     */
    public Date getDtDoc() {
        return dtDoc;
    }

    /**
     * Seta Data da Emissão do cupom fiscal eletrônico
     */
    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    
    /**
     * Obtém Valor Total do Cupom Fiscal Eletrônico
     */
    public Double getVlCfe() {
        return vlCfe;
    }

    /**
     * Seta Valor Total do Cupom Fiscal Eletrônico
     */
    public void setVlCfe(Double vlCfe) {
        this.vlCfe = vlCfe;
    }
    
    /**
     * Obtém Valor Total do PIS
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor Total do PIS
     */
    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
    }
    
    /**
     * Obtém Valor Total da COFINS
     */
    public Double getVlCofins() {
        return vlCofins;
    }

    /**
     * Seta Valor Total da COFINS
     */
    public void setVlCofins(Double vlCofins) {
        this.vlCofins = vlCofins;
    }
    
    /**
     * Obtém CNPJ ou CPF do destinatário
     */
    public String getCnpjCpf() {
        return cnpjCpf;
    }

    /**
     * Seta CNPJ ou CPF do destinatário
     */
    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }
    
    /**
     * Obtém Número de Série do Equipamento SAT
     */
    public String getNrSat() {
        return nrSat;
    }

    /**
     * Seta Número de Série do Equipamento SAT
     */
    public void setNrSat(String nrSat) {
        this.nrSat = nrSat;
    }
    
    /**
     * Obtém Chave do Cupom Fiscal Eletrônico
     */
    public String getChvCfe() {
        return chvCfe;
    }

    /**
     * Seta Chave do Cupom Fiscal Eletrônico
     */
    public void setChvCfe(String chvCfe) {
        this.chvCfe = chvCfe;
    }
    
    /**
     * Obtém Valor total do desconto sobre item
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor total do desconto sobre item
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }
    
    /**
     * Obtém Valor total das mercadorias e serviços
     */
    public Double getVlMerc() {
        return vlMerc;
    }

    /**
     * Seta Valor total das mercadorias e serviços
     */
    public void setVlMerc(Double vlMerc) {
        this.vlMerc = vlMerc;
    }
    
    /**
     * Obtém Valor de outras desp. acessórias (acréscimo)
     */
    public Double getVlOutDa() {
        return vlOutDa;
    }

    /**
     * Seta Valor de outras desp. acessórias (acréscimo)
     */
    public void setVlOutDa(Double vlOutDa) {
        this.vlOutDa = vlOutDa;
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
     * Obtém Valor total do PIS retido por subs. trib
     */
    public Double getVlPisSt() {
        return vlPisSt;
    }

    /**
     * Seta Valor total do PIS retido por subs. trib
     */
    public void setVlPisSt(Double vlPisSt) {
        this.vlPisSt = vlPisSt;
    }
    
    /**
     * Obtém Valor total da COFINS retido por subs. trib
     */
    public Double getVlCofinsSt() {
        return vlCofinsSt;
    }

    /**
     * Seta Valor total da COFINS retido por subs. trib
     */
    public void setVlCofinsSt(Double vlCofinsSt) {
        this.vlCofinsSt = vlCofinsSt;
    }
    
}