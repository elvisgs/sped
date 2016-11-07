package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Cupom Fiscal Eletrônico
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C116"),
    @Field(at = 7, name = "fimLinha")
})
public class RegC116 extends Registro {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private String nrSat;
    
    @Field(at = 4)
    private String chvCfe;
    
    @Field(at = 5)
    private String numCfe;
    
    @Field(at = 6)
    private String dtDoc;
    
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
     * Obtém Chave do cupom fiscal Eletrônico
     */
    public String getChvCfe() {
        return chvCfe;
    }

    /**
     * Seta Chave do cupom fiscal Eletrônico
     */
    public void setChvCfe(String chvCfe) {
        this.chvCfe = chvCfe;
    }
    
    /**
     * Obtém Número do cupom fiscal eletrônico
     */
    public String getNumCfe() {
        return numCfe;
    }

    /**
     * Seta Número do cupom fiscal eletrônico
     */
    public void setNumCfe(String numCfe) {
        this.numCfe = numCfe;
    }
    
    /**
     * Obtém Data de Emissão do Documento Fiscal
     */
    public String getDtDoc() {
        return dtDoc;
    }

    /**
     * Seta Data de Emissão do Documento Fiscal
     */
    public void setDtDoc(String dtDoc) {
        this.dtDoc = dtDoc;
    }
    
}