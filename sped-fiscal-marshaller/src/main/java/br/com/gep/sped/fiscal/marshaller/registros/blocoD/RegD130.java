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
    @Field(at = 1, name = "reg", rid = true, literal = "D130"),
    @Field(at = 15, name = "fimLinha", literal = "")
})
public class RegD130 extends Registro {
    
    @Field(at = 2)
    private String codPartConsg;
    
    @Field(at = 3)
    private String codPartRed;
    
    @Field(at = 4)
    private String indFrtRed;
    
    @Field(at = 5)
    private String codMunOrig;
    
    @Field(at = 6)
    private String codMunDest;
    
    @Field(at = 7)
    private String veicId;
    
    @Field(at = 8)
    private Double vlLiqFrt;
    
    @Field(at = 9)
    private Double vlSecCat;
    
    @Field(at = 10)
    private Double vlDesp;
    
    @Field(at = 11)
    private Double vlPedg;
    
    @Field(at = 12)
    private Double vlOut;
    
    @Field(at = 13)
    private Double vlFrt;
    
    @Field(at = 14)
    private String ufId;
    
    /**
     * Obtém Código do participante consignatário
     */
    public String getCodPartConsg() {
        return codPartConsg;
    }

    /**
     * Seta Código do participante consignatário
     */
    public void setCodPartConsg(String codPartConsg) {
        this.codPartConsg = codPartConsg;
    }
    
    /**
     * Obtém Código do participante redespachante
     */
    public String getCodPartRed() {
        return codPartRed;
    }

    /**
     * Seta Código do participante redespachante
     */
    public void setCodPartRed(String codPartRed) {
        this.codPartRed = codPartRed;
    }
    
    /**
     * Obtém Tipo do frete - redespacho
     */
    public String getIndFrtRed() {
        return indFrtRed;
    }

    /**
     * Seta Tipo do frete - redespacho
     * <p>0=Sem redespacho;1=Por conta do emitente;2=Por conta do destinatário;9=Outros</p>
     */
    public void setIndFrtRed(String indFrtRed) {
        this.indFrtRed = indFrtRed;
    }
    
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
     * Obtém Placa do veículo
     */
    public String getVeicId() {
        return veicId;
    }

    /**
     * Seta Placa do veículo
     */
    public void setVeicId(String veicId) {
        this.veicId = veicId;
    }
    
    /**
     * Obtém Valor líquido do frete
     */
    public Double getVlLiqFrt() {
        return vlLiqFrt;
    }

    /**
     * Seta Valor líquido do frete
     */
    public void setVlLiqFrt(Double vlLiqFrt) {
        this.vlLiqFrt = vlLiqFrt;
    }
    
    /**
     * Obtém Soma de valores de SEC/CAT
     */
    public Double getVlSecCat() {
        return vlSecCat;
    }

    /**
     * Seta Soma de valores de SEC/CAT
     */
    public void setVlSecCat(Double vlSecCat) {
        this.vlSecCat = vlSecCat;
    }
    
    /**
     * Obtém Soma de valores de despacho
     */
    public Double getVlDesp() {
        return vlDesp;
    }

    /**
     * Seta Soma de valores de despacho
     */
    public void setVlDesp(Double vlDesp) {
        this.vlDesp = vlDesp;
    }
    
    /**
     * Obtém Soma dos valores de pedágio
     */
    public Double getVlPedg() {
        return vlPedg;
    }

    /**
     * Seta Soma dos valores de pedágio
     */
    public void setVlPedg(Double vlPedg) {
        this.vlPedg = vlPedg;
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
     * Obtém Valor total do frete
     */
    public Double getVlFrt() {
        return vlFrt;
    }

    /**
     * Seta Valor total do frete
     */
    public void setVlFrt(Double vlFrt) {
        this.vlFrt = vlFrt;
    }
    
    /**
     * Obtém Sigla da UF da placa do veículo
     */
    public String getUfId() {
        return ufId;
    }

    /**
     * Seta Sigla da UF da placa do veículo
     */
    public void setUfId(String ufId) {
        this.ufId = ufId;
    }
    
}