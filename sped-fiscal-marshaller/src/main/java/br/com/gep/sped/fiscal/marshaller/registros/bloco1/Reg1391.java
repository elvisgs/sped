package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Produção diária da Usina
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "1391"),
    @Field(at = 18, name = "fimLinha", literal = "")
})
public class Reg1391 extends Registro {
    
    @Field(at = 2)
    private Date dtRegistro;
    
    @Field(at = 3)
    private Double qtdMoid;
    
    @Field(at = 4)
    private Double estqIni;
    
    @Field(at = 5)
    private Double qtdProduz;
    
    @Field(at = 6)
    private Double entAnidHid;
    
    @Field(at = 7)
    private Double outrEntr;
    
    @Field(at = 8)
    private Double perda;
    
    @Field(at = 9)
    private Double cons;
    
    @Field(at = 10)
    private Double saiAniHid;
    
    @Field(at = 11)
    private Double saidas;
    
    @Field(at = 12)
    private Double estqFin;
    
    @Field(at = 13)
    private Double estqIniMel;
    
    @Field(at = 14)
    private Double prodDiaMel;
    
    @Field(at = 15)
    private Double utilMel;
    
    @Field(at = 16)
    private Double prodAlcMel;
    
    @Field(at = 17)
    private String obs;
    
    /**
     * Obtém Data produção
     */
    public Date getDtRegistro() {
        return dtRegistro;
    }

    /**
     * Seta Data produção
     */
    public void setDtRegistro(Date dtRegistro) {
        this.dtRegistro = dtRegistro;
    }
    
    /**
     * Obtém Quantidade de cana esmagada (toneladas)
     */
    public Double getQtdMoid() {
        return qtdMoid;
    }

    /**
     * Seta Quantidade de cana esmagada (toneladas)
     */
    public void setQtdMoid(Double qtdMoid) {
        this.qtdMoid = qtdMoid;
    }
    
    /**
     * Obtém Estoque inicial (litros / Kg)
     */
    public Double getEstqIni() {
        return estqIni;
    }

    /**
     * Seta Estoque inicial (litros / Kg)
     */
    public void setEstqIni(Double estqIni) {
        this.estqIni = estqIni;
    }
    
    /**
     * Obtém Quantidade produzida (litros / Kg)
     */
    public Double getQtdProduz() {
        return qtdProduz;
    }

    /**
     * Seta Quantidade produzida (litros / Kg)
     */
    public void setQtdProduz(Double qtdProduz) {
        this.qtdProduz = qtdProduz;
    }
    
    /**
     * Obtém Entrada de álcool anidro decorrente da transformação do álcool hidratado ou Entrada de álcool hidratado decorrente da transformação do álcool anidro (litros)
     */
    public Double getEntAnidHid() {
        return entAnidHid;
    }

    /**
     * Seta Entrada de álcool anidro decorrente da transformação do álcool hidratado ou Entrada de álcool hidratado decorrente da transformação do álcool anidro (litros)
     */
    public void setEntAnidHid(Double entAnidHid) {
        this.entAnidHid = entAnidHid;
    }
    
    /**
     * Obtém Outras entradas  (litros / Kg)
     */
    public Double getOutrEntr() {
        return outrEntr;
    }

    /**
     * Seta Outras entradas  (litros / Kg)
     */
    public void setOutrEntr(Double outrEntr) {
        this.outrEntr = outrEntr;
    }
    
    /**
     * Obtém Evaporação (litros) ou Quebra de peso (Kg)
     */
    public Double getPerda() {
        return perda;
    }

    /**
     * Seta Evaporação (litros) ou Quebra de peso (Kg)
     */
    public void setPerda(Double perda) {
        this.perda = perda;
    }
    
    /**
     * Obtém Consumo (litros)
     */
    public Double getCons() {
        return cons;
    }

    /**
     * Seta Consumo (litros)
     */
    public void setCons(Double cons) {
        this.cons = cons;
    }
    
    /**
     * Obtém Saída para transformação (litros)
     */
    public Double getSaiAniHid() {
        return saiAniHid;
    }

    /**
     * Seta Saída para transformação (litros)
     */
    public void setSaiAniHid(Double saiAniHid) {
        this.saiAniHid = saiAniHid;
    }
    
    /**
     * Obtém Saídas (litros / Kg)
     */
    public Double getSaidas() {
        return saidas;
    }

    /**
     * Seta Saídas (litros / Kg)
     */
    public void setSaidas(Double saidas) {
        this.saidas = saidas;
    }
    
    /**
     * Obtém Estoque final  (litros / Kg)
     */
    public Double getEstqFin() {
        return estqFin;
    }

    /**
     * Seta Estoque final  (litros / Kg)
     */
    public void setEstqFin(Double estqFin) {
        this.estqFin = estqFin;
    }
    
    /**
     * Obtém Estoque inicial de mel residual (Kg)
     */
    public Double getEstqIniMel() {
        return estqIniMel;
    }

    /**
     * Seta Estoque inicial de mel residual (Kg)
     */
    public void setEstqIniMel(Double estqIniMel) {
        this.estqIniMel = estqIniMel;
    }
    
    /**
     * Obtém Produção de mel residual (Kg) e entradas de mel (Kg)
     */
    public Double getProdDiaMel() {
        return prodDiaMel;
    }

    /**
     * Seta Produção de mel residual (Kg) e entradas de mel (Kg)
     */
    public void setProdDiaMel(Double prodDiaMel) {
        this.prodDiaMel = prodDiaMel;
    }
    
    /**
     * Obtém Mel residual utilizado (Kg) e saídas de mel
     */
    public Double getUtilMel() {
        return utilMel;
    }

    /**
     * Seta Mel residual utilizado (Kg) e saídas de mel
     */
    public void setUtilMel(Double utilMel) {
        this.utilMel = utilMel;
    }
    
    /**
     * Obtém Produção de álcool (litros) proveniente do mel residual
     */
    public Double getProdAlcMel() {
        return prodAlcMel;
    }

    /**
     * Seta Produção de álcool (litros) proveniente do mel residual
     */
    public void setProdAlcMel(Double prodAlcMel) {
        this.prodAlcMel = prodAlcMel;
    }
    
    /**
     * Obtém Observações
     */
    public String getObs() {
        return obs;
    }

    /**
     * Seta Observações
     */
    public void setObs(String obs) {
        this.obs = obs;
    }
    
}