package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Identificação do equipamento SAT-CF-e
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C860"),
    @Field(at = 7, name = "fimLinha", literal = "")
})
public class RegC860 extends Registro {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private String nrSat;
    
    @Field(at = 4)
    private Date dtDoc;
    
    @Field(at = 5)
    private String docIni;
    
    @Field(at = 6)
    private String docFim;
    
    /**
     * Obtém Código do Modelo do documentos fiscal
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do Modelo do documentos fiscal
     * <p>59=Cupom Fiscal Eletrônico - CF-e</p>
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Número de série do equipamento SAT
     */
    public String getNrSat() {
        return nrSat;
    }

    /**
     * Seta Número de série do equipamento SAT
     */
    public void setNrSat(String nrSat) {
        this.nrSat = nrSat;
    }
    
    /**
     * Obtém Data de emissão dos documentos fiscais
     */
    public Date getDtDoc() {
        return dtDoc;
    }

    /**
     * Seta Data de emissão dos documentos fiscais
     */
    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    
    /**
     * Obtém Número do documento inicial
     */
    public String getDocIni() {
        return docIni;
    }

    /**
     * Seta Número do documento inicial
     */
    public void setDocIni(String docIni) {
        this.docIni = docIni;
    }
    
    /**
     * Obtém Número do documento final
     */
    public String getDocFim() {
        return docFim;
    }

    /**
     * Seta Número do documento final
     */
    public void setDocFim(String docFim) {
        this.docFim = docFim;
    }
    
}