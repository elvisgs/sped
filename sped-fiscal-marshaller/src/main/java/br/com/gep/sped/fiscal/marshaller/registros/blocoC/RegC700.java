package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Energia Elétrica/Gás - NF em Via Única (Convênio ICMS 115/03)
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C700"),
    @Field(at = 10, name = "fimLinha", literal = "")
})
public class RegC700 extends Registro {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private String ser;
    
    @Field(at = 4)
    private String nroOrdIni;
    
    @Field(at = 5)
    private String nroOrdFin;
    
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
     * <p>06=Nota Fiscal/Conta de Energia Elétrica;28=Nota Fiscal/Conta de Fornecimento de Gás Canalizado</p>
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
     * Obtém Número de ordem inicial
     */
    public String getNroOrdIni() {
        return nroOrdIni;
    }

    /**
     * Seta Número de ordem inicial
     */
    public void setNroOrdIni(String nroOrdIni) {
        this.nroOrdIni = nroOrdIni;
    }
    
    /**
     * Obtém Número de ordem final
     */
    public String getNroOrdFin() {
        return nroOrdFin;
    }

    /**
     * Seta Número de ordem final
     */
    public void setNroOrdFin(String nroOrdFin) {
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
     * Obtém Chave de codificação
     */
    public String getChvCodDig() {
        return chvCodDig;
    }

    /**
     * Seta Chave de codificação
     */
    public void setChvCodDig(String chvCodDig) {
        this.chvCodDig = chvCodDig;
    }
    
}