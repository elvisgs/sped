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
    @Field(at = 1, name = "reg", rid = true, literal = "D140"),
    @Field(at = 15, name = "fimLinha", literal = "")
})
public class RegD140 extends Registro {
    
    @Field(at = 2)
    private String codPartConsg;
    
    @Field(at = 3)
    private String codMunOrig;
    
    @Field(at = 4)
    private String codMunDest;
    
    @Field(at = 5)
    private String indVeic;
    
    @Field(at = 6)
    private String veicId;
    
    @Field(at = 7)
    private String indNav;
    
    @Field(at = 8)
    private Integer viagem;
    
    @Field(at = 9)
    private Double vlFrtLiq;
    
    @Field(at = 10)
    private Double vlDespPort;
    
    @Field(at = 11)
    private Double vlDespCarDesc;
    
    @Field(at = 12)
    private Double vlOut;
    
    @Field(at = 13)
    private Double vlFrtBrt;
    
    @Field(at = 14)
    private Double vlFrtMm;
    
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
     * Obtém Tipo do veículo
     */
    public String getIndVeic() {
        return indVeic;
    }

    /**
     * Seta Tipo do veículo
     * <p>0=Embarcação;1=Empurrador/rebocador</p>
     */
    public void setIndVeic(String indVeic) {
        this.indVeic = indVeic;
    }
    
    /**
     * Obtém Identificação da embarcação
     */
    public String getVeicId() {
        return veicId;
    }

    /**
     * Seta Identificação da embarcação
     */
    public void setVeicId(String veicId) {
        this.veicId = veicId;
    }
    
    /**
     * Obtém Tipo da navegação
     */
    public String getIndNav() {
        return indNav;
    }

    /**
     * Seta Tipo da navegação
     * <p>0=Interior;1=Cabotagem</p>
     */
    public void setIndNav(String indNav) {
        this.indNav = indNav;
    }
    
    /**
     * Obtém Número da viagem
     */
    public Integer getViagem() {
        return viagem;
    }

    /**
     * Seta Número da viagem
     */
    public void setViagem(Integer viagem) {
        this.viagem = viagem;
    }
    
    /**
     * Obtém Valor líquido do frete
     */
    public Double getVlFrtLiq() {
        return vlFrtLiq;
    }

    /**
     * Seta Valor líquido do frete
     */
    public void setVlFrtLiq(Double vlFrtLiq) {
        this.vlFrtLiq = vlFrtLiq;
    }
    
    /**
     * Obtém Valor das despesas portuárias
     */
    public Double getVlDespPort() {
        return vlDespPort;
    }

    /**
     * Seta Valor das despesas portuárias
     */
    public void setVlDespPort(Double vlDespPort) {
        this.vlDespPort = vlDespPort;
    }
    
    /**
     * Obtém Valor despesas carga/descarga
     */
    public Double getVlDespCarDesc() {
        return vlDespCarDesc;
    }

    /**
     * Seta Valor despesas carga/descarga
     */
    public void setVlDespCarDesc(Double vlDespCarDesc) {
        this.vlDespCarDesc = vlDespCarDesc;
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
     * Obtém Valor bruto do frete
     */
    public Double getVlFrtBrt() {
        return vlFrtBrt;
    }

    /**
     * Seta Valor bruto do frete
     */
    public void setVlFrtBrt(Double vlFrtBrt) {
        this.vlFrtBrt = vlFrtBrt;
    }
    
    /**
     * Obtém Valor adicional do frete - MM
     */
    public Double getVlFrtMm() {
        return vlFrtMm;
    }

    /**
     * Seta Valor adicional do frete - MM
     */
    public void setVlFrtMm(Double vlFrtMm) {
        this.vlFrtMm = vlFrtMm;
    }
    
}