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
    @Field(at = 1, name = "reg", rid = true, literal = "D170"),
    @Field(at = 15, name = "fimLinha", literal = "")
})
public class RegD170 extends Registro {
    
    @Field(at = 2)
    private String codPartConsg;
    
    @Field(at = 3)
    private String codPartRed;
    
    @Field(at = 4)
    private String codMunOrig;
    
    @Field(at = 5)
    private String codMunDest;
    
    @Field(at = 6)
    private String otm;
    
    @Field(at = 7)
    private String indNatFrt;
    
    @Field(at = 8)
    private Double vlLiqFrt;
    
    @Field(at = 9)
    private Double vlGris;
    
    @Field(at = 10)
    private Double vlPdg;
    
    @Field(at = 11)
    private Double vlOut;
    
    @Field(at = 12)
    private Double vlFrt;
    
    @Field(at = 13)
    private String veicId;
    
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
     * Obtém Registro do operador
     */
    public String getOtm() {
        return otm;
    }

    /**
     * Seta Registro do operador
     */
    public void setOtm(String otm) {
        this.otm = otm;
    }
    
    /**
     * Obtém Natureza do frete
     */
    public String getIndNatFrt() {
        return indNatFrt;
    }

    /**
     * Seta Natureza do frete
     * <p>0=Negociável;1=Não negociável</p>
     */
    public void setIndNatFrt(String indNatFrt) {
        this.indNatFrt = indNatFrt;
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
     * Obtém Valor do GRIS
     */
    public Double getVlGris() {
        return vlGris;
    }

    /**
     * Seta Valor do GRIS
     */
    public void setVlGris(Double vlGris) {
        this.vlGris = vlGris;
    }
    
    /**
     * Obtém Somatório valores de pedágio
     */
    public Double getVlPdg() {
        return vlPdg;
    }

    /**
     * Seta Somatório valores de pedágio
     */
    public void setVlPdg(Double vlPdg) {
        this.vlPdg = vlPdg;
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