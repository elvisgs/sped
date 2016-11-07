package br.com.gep.sped.fiscal.marshaller.registros.blocoG;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Movimentação de bem
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "G125"),
    @Field(at = 11, name = "fimLinha")
})
public class RegG125 extends Registro {
    
    @Field(at = 2)
    private String codIndBem;
    
    @Field(at = 3)
    private Date dtMov;
    
    @Field(at = 4)
    private String tipoMov;
    
    @Field(at = 5)
    private Double vlImobIcmsOp;
    
    @Field(at = 6)
    private Double vlImobIcmsSt;
    
    @Field(at = 7)
    private Double vlImobIcmsFrt;
    
    @Field(at = 8)
    private Double vlImobIcmsDif;
    
    @Field(at = 9)
    private String numParc;
    
    @Field(at = 10)
    private Double vlParcPass;
    
    /**
     * Obtém Código do bem
     */
    public String getCodIndBem() {
        return codIndBem;
    }

    /**
     * Seta Código do bem
     */
    public void setCodIndBem(String codIndBem) {
        this.codIndBem = codIndBem;
    }
    
    /**
     * Obtém Data da movimentação
     */
    public Date getDtMov() {
        return dtMov;
    }

    /**
     * Seta Data da movimentação
     */
    public void setDtMov(Date dtMov) {
        this.dtMov = dtMov;
    }
    
    /**
     * Obtém Tipo de movimentação
     */
    public String getTipoMov() {
        return tipoMov;
    }

    /**
     * Seta Tipo de movimentação
     * <p>SI=Saldo inicial de bens imobilizados;IM=Imobilização de bem individual;IA=Imobilização em Andamento - Componente;CI=Conclusão de Imobilização em Andamento – Bem Resultante;MC=Imobilização oriunda do Ativo Circulante;BA=Baixa do bem - Fim do período de apropriação;AT=Alienação ou Transferência;PE=Perecimento, Extravio ou Deterioração;OT=Outras Saídas do Imobilizado</p>
     */
    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }
    
    /**
     * Obtém Valor do ICMS da Operação Própria
     */
    public Double getVlImobIcmsOp() {
        return vlImobIcmsOp;
    }

    /**
     * Seta Valor do ICMS da Operação Própria
     */
    public void setVlImobIcmsOp(Double vlImobIcmsOp) {
        this.vlImobIcmsOp = vlImobIcmsOp;
    }
    
    /**
     * Obtém Valor do ICMS da Oper. por Sub. Tributária
     */
    public Double getVlImobIcmsSt() {
        return vlImobIcmsSt;
    }

    /**
     * Seta Valor do ICMS da Oper. por Sub. Tributária
     */
    public void setVlImobIcmsSt(Double vlImobIcmsSt) {
        this.vlImobIcmsSt = vlImobIcmsSt;
    }
    
    /**
     * Obtém Valor do ICMS sobre Frete
     */
    public Double getVlImobIcmsFrt() {
        return vlImobIcmsFrt;
    }

    /**
     * Seta Valor do ICMS sobre Frete
     */
    public void setVlImobIcmsFrt(Double vlImobIcmsFrt) {
        this.vlImobIcmsFrt = vlImobIcmsFrt;
    }
    
    /**
     * Obtém Valor do ICMS - Diferencial de Alíquota
     */
    public Double getVlImobIcmsDif() {
        return vlImobIcmsDif;
    }

    /**
     * Seta Valor do ICMS - Diferencial de Alíquota
     */
    public void setVlImobIcmsDif(Double vlImobIcmsDif) {
        this.vlImobIcmsDif = vlImobIcmsDif;
    }
    
    /**
     * Obtém Número da parcela
     */
    public String getNumParc() {
        return numParc;
    }

    /**
     * Seta Número da parcela
     */
    public void setNumParc(String numParc) {
        this.numParc = numParc;
    }
    
    /**
     * Obtém Valor da parcela de ICMS passível de apropriação
     */
    public Double getVlParcPass() {
        return vlParcPass;
    }

    /**
     * Seta Valor da parcela de ICMS passível de apropriação
     */
    public void setVlParcPass(Double vlParcPass) {
        this.vlParcPass = vlParcPass;
    }
    
}