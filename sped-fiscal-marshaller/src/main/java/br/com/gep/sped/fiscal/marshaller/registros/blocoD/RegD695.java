package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * NF Comunicação e Telecomunicação Consolidada - Convênio 115
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D695"),
    @Field(at = 10, name = "fimLinha")
})
public class RegD695 extends Registro {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private String ser;
    
    @Field(at = 4)
    private Integer nroOrdIni;
    
    @Field(at = 5)
    private Integer nroOrdFin;
    
    @Field(at = 6)
    private Date dtDocIni;
    
    @Field(at = 7)
    private Date dtDocFin;
    
    @Field(at = 8)
    private String nomMest;
    
    @Field(at = 9)
    private String chvCodDig;
    
    /**
     * Obtém Código do modelo do documento
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo do documento
     * <p>21=Nota Fiscal de Serviço de Comunicação;22=Nota Fiscal de Serviço de Telecomunicação</p>
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
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
     * Obtém Documento fiscal inicial
     */
    public Integer getNroOrdIni() {
        return nroOrdIni;
    }

    /**
     * Seta Documento fiscal inicial
     */
    public void setNroOrdIni(Integer nroOrdIni) {
        this.nroOrdIni = nroOrdIni;
    }
    
    /**
     * Obtém Documento fiscal final
     */
    public Integer getNroOrdFin() {
        return nroOrdFin;
    }

    /**
     * Seta Documento fiscal final
     */
    public void setNroOrdFin(Integer nroOrdFin) {
        this.nroOrdFin = nroOrdFin;
    }
    
    /**
     * Obtém Data de emissão inicial
     */
    public Date getDtDocIni() {
        return dtDocIni;
    }

    /**
     * Seta Data de emissão inicial
     */
    public void setDtDocIni(Date dtDocIni) {
        this.dtDocIni = dtDocIni;
    }
    
    /**
     * Obtém Data de emissão final
     */
    public Date getDtDocFin() {
        return dtDocFin;
    }

    /**
     * Seta Data de emissão final
     */
    public void setDtDocFin(Date dtDocFin) {
        this.dtDocFin = dtDocFin;
    }
    
    /**
     * Obtém Nome do arquivo mestre
     */
    public String getNomMest() {
        return nomMest;
    }

    /**
     * Seta Nome do arquivo mestre
     */
    public void setNomMest(String nomMest) {
        this.nomMest = nomMest;
    }
    
    /**
     * Obtém Chave de codificação digital
     */
    public String getChvCodDig() {
        return chvCodDig;
    }

    /**
     * Seta Chave de codificação digital
     */
    public void setChvCodDig(String chvCodDig) {
        this.chvCodDig = chvCodDig;
    }
    
}