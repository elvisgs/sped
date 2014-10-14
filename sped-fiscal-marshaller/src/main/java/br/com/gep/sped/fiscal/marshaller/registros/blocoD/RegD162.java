package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

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
    @Field(at = 1, name = "reg", rid = true, literal = "D162"),
    @Field(at = 11, name = "fimLinha", literal = "")
})
public class RegD162 extends Registro {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private String ser;
    
    @Field(at = 4)
    private String numDoc;
    
    @Field(at = 5)
    private Date dtDoc;
    
    @Field(at = 6)
    private Double vlDoc;
    
    @Field(at = 7)
    private Double vlMerc;
    
    @Field(at = 8)
    private Integer qtdVol;
    
    @Field(at = 9)
    private Double pesoBrt;
    
    @Field(at = 10)
    private Double pesoLiq;
    
    /**
     * Obtém Código do Modelo de Documento Fiscal
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do Modelo de Documento Fiscal
     * <p>01=Nota Fiscal;1B=Nota Fiscal Avulsa;04=Nota Fiscal de Produtor;55=Nota Fiscal Eletrônica</p>
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Série do Documento Fiscal
     */
    public String getSer() {
        return ser;
    }

    /**
     * Seta Série do Documento Fiscal
     */
    public void setSer(String ser) {
        this.ser = ser;
    }
    
    /**
     * Obtém Número do Documento fiscal
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Seta Número do Documento fiscal
     */
    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    
    /**
     * Obtém Data de emissão
     */
    public Date getDtDoc() {
        return dtDoc;
    }

    /**
     * Seta Data de emissão
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
     * Obtém Valor das mercadorias
     */
    public Double getVlMerc() {
        return vlMerc;
    }

    /**
     * Seta Valor das mercadorias
     */
    public void setVlMerc(Double vlMerc) {
        this.vlMerc = vlMerc;
    }
    
    /**
     * Obtém Quantidade de volumes transportados
     */
    public Integer getQtdVol() {
        return qtdVol;
    }

    /**
     * Seta Quantidade de volumes transportados
     */
    public void setQtdVol(Integer qtdVol) {
        this.qtdVol = qtdVol;
    }
    
    /**
     * Obtém Peso bruto
     */
    public Double getPesoBrt() {
        return pesoBrt;
    }

    /**
     * Seta Peso bruto
     */
    public void setPesoBrt(Double pesoBrt) {
        this.pesoBrt = pesoBrt;
    }
    
    /**
     * Obtém Peso líquido
     */
    public Double getPesoLiq() {
        return pesoLiq;
    }

    /**
     * Seta Peso líquido
     */
    public void setPesoLiq(Double pesoLiq) {
        this.pesoLiq = pesoLiq;
    }
    
}