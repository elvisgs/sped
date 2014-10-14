package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Doc. Fiscal
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C460"),
    @Field(at = 11, name = "fimLinha", literal = "")
})
public class RegC460 extends Registro {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private String codSit;
    
    @Field(at = 4)
    private String numDoc;
    
    @Field(at = 5)
    private Date dtDoc;
    
    @Field(at = 6)
    private Double vlDoc;
    
    @Field(at = 7)
    private Double vlPis;
    
    @Field(at = 8)
    private Double vlCofins;
    
    @Field(at = 9)
    private String cpfCnpj;
    
    @Field(at = 10)
    private String nomeAdq;
    
    /**
     * Obtém Código do modelo
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo
     * <p>02=Nota Fiscal de Venda a Consumidor;2D=Cupom Fiscal emitido por ECF;60=CF-e-ECF</p>
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Código da situação
     */
    public String getCodSit() {
        return codSit;
    }

    /**
     * Seta Código da situação
     * <p>00=Documento regular;01=Documento regular extemporâneo;02=Documento cancelado</p>
     */
    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }
    
    /**
     * Obtém Número do documento fiscal (COO)
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Seta Número do documento fiscal (COO)
     */
    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
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
    
    /**
     * Obtém CPF/CNPJ do adquirente
     */
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    /**
     * Seta CPF/CNPJ do adquirente
     */
    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
    
    /**
     * Obtém Nome do adquirente
     */
    public String getNomeAdq() {
        return nomeAdq;
    }

    /**
     * Seta Nome do adquirente
     */
    public void setNomeAdq(String nomeAdq) {
        this.nomeAdq = nomeAdq;
    }
    
}