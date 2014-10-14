package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Complemento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "D150"),
    @Field(at = 12, name = "fimLinha", literal = "")
})
public class RegD150 extends Registro {
    
    @Field(at = 2)
    private String codMunOrig;
    
    @Field(at = 3)
    private String codMunDest;
    
    @Field(at = 4)
    private String veicId;
    
    @Field(at = 5)
    private Integer viagem;
    
    @Field(at = 6)
    private String indTfa;
    
    @Field(at = 7)
    private Double vlPesoTx;
    
    @Field(at = 8)
    private Double vlTxTerr;
    
    @Field(at = 9)
    private Double vlTxRed;
    
    @Field(at = 10)
    private Double vlOut;
    
    @Field(at = 11)
    private Double vlTxAdv;
    
    /**
     * Obtém Código do município de origem
     */
    public String getCodMunOrig() {
        return codMunOrig;
    }

    /**
     * Seta Código do município de origem
     */
    public void setCodMunOrig(String codMunOrig) {
        this.codMunOrig = codMunOrig;
    }
    
    /**
     * Obtém Código do município de destino
     */
    public String getCodMunDest() {
        return codMunDest;
    }

    /**
     * Seta Código do município de destino
     */
    public void setCodMunDest(String codMunDest) {
        this.codMunDest = codMunDest;
    }
    
    /**
     * Obtém Identificação da aeronave
     */
    public String getVeicId() {
        return veicId;
    }

    /**
     * Seta Identificação da aeronave
     */
    public void setVeicId(String veicId) {
        this.veicId = veicId;
    }
    
    /**
     * Obtém Número do vôo
     */
    public Integer getViagem() {
        return viagem;
    }

    /**
     * Seta Número do vôo
     */
    public void setViagem(Integer viagem) {
        this.viagem = viagem;
    }
    
    /**
     * Obtém Tipo de tarifa aplicada
     */
    public String getIndTfa() {
        return indTfa;
    }

    /**
     * Seta Tipo de tarifa aplicada
     * <p>0=Exp;1=Enc;2=CI;9=Outra</p>
     */
    public void setIndTfa(String indTfa) {
        this.indTfa = indTfa;
    }
    
    /**
     * Obtém Peso taxado
     */
    public Double getVlPesoTx() {
        return vlPesoTx;
    }

    /**
     * Seta Peso taxado
     */
    public void setVlPesoTx(Double vlPesoTx) {
        this.vlPesoTx = vlPesoTx;
    }
    
    /**
     * Obtém Valor da taxa terrestre
     */
    public Double getVlTxTerr() {
        return vlTxTerr;
    }

    /**
     * Seta Valor da taxa terrestre
     */
    public void setVlTxTerr(Double vlTxTerr) {
        this.vlTxTerr = vlTxTerr;
    }
    
    /**
     * Obtém Valor da taxa de redespacho
     */
    public Double getVlTxRed() {
        return vlTxRed;
    }

    /**
     * Seta Valor da taxa de redespacho
     */
    public void setVlTxRed(Double vlTxRed) {
        this.vlTxRed = vlTxRed;
    }
    
    /**
     * Obtém Outros valores
     */
    public Double getVlOut() {
        return vlOut;
    }

    /**
     * Seta Outros valores
     */
    public void setVlOut(Double vlOut) {
        this.vlOut = vlOut;
    }
    
    /**
     * Obtém Valor da taxa &#x27;ad valorem&#x27;
     */
    public Double getVlTxAdv() {
        return vlTxAdv;
    }

    /**
     * Seta Valor da taxa &#x27;ad valorem&#x27;
     */
    public void setVlTxAdv(Double vlTxAdv) {
        this.vlTxAdv = vlTxAdv;
    }
    
}