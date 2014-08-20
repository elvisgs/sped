package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C490 - Consolidação de Documentos Emitidos por ECF - Saída de Mercadoria
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C490"),
    @Field(at = 5, name = "fimLinha", literal = "")
})
public class RegC490 extends Registro {
    
    @Field(at = 2)
    private Date dtDocIni;
    
    @Field(at = 3)
    private Date dtDocFin;
    
    @Field(at = 4)
    private String codMod;
    
    
    /**
     * Obtém Data de Emissão Inicial dos Documentos
     */
    public Date getDtDocIni() {
        return dtDocIni;
    }

    /**
     * Seta Data de Emissão Inicial dos Documentos
     */
    public void setDtDocIni(Date dtDocIni) {
        this.dtDocIni = dtDocIni;
    }
    
    /**
     * Obtém Data de Emissão Final dos Documentos
     */
    public Date getDtDocFin() {
        return dtDocFin;
    }

    /**
     * Seta Data de Emissão Final dos Documentos
     */
    public void setDtDocFin(Date dtDocFin) {
        this.dtDocFin = dtDocFin;
    }
    
    /**
     * Obtém Código do modelo do documento fiscal
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo do documento fiscal
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    
}