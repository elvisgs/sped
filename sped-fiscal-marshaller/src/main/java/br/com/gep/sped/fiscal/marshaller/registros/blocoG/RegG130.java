package br.com.gep.sped.fiscal.marshaller.registros.blocoG;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Identificação do documento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "G130"),
    @Field(at = 9, name = "fimLinha")
})
public class RegG130 extends Registro {
    
    @Field(at = 2)
    private String indEmit;
    
    @Field(at = 3)
    private String codPart;
    
    @Field(at = 4)
    private String codMod;
    
    @Field(at = 5)
    private String serie;
    
    @Field(at = 6)
    private String numDoc;
    
    @Field(at = 7)
    private String chvNfeCte;
    
    @Field(at = 10)
    private Date dtDoc;
    
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
     * <p>01=Nota Fiscal;1B=Nota Fiscal Avulsa;04=Nota Fiscal de Produtor;07=Nota Fiscal de Serviço de Transporte;08=Conhecimento de Transporte Rodoviário de Cargas;8B=Conhecimento de Transporte de Cargas Avulso;09=Conhecimento de Transporte Aquaviário de Cargas;10=Conhecimento Aéreo;26=Conhecimento de Transporte Multimodal de Cargas;27=Nota Fiscal de Transporte Ferroviário de Cargas;55=Nota Fiscal Eletrônica;57=Conhecimento de Transporte Eletrônico - CT-e</p>
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Série
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Seta Série
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    /**
     * Obtém Número do documento
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Seta Número do documento
     */
    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    
    /**
     * Obtém Chave da NFe/CTe
     */
    public String getChvNfeCte() {
        return chvNfeCte;
    }

    /**
     * Seta Chave da NFe/CTe
     */
    public void setChvNfeCte(String chvNfeCte) {
        this.chvNfeCte = chvNfeCte;
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
    
}