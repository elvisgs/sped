package br.com.gep.sped.fiscal.marshaller.registros.blocoG;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * ICMS – Ativo Permanente – CIAP
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "G110"),
    @Field(at = 11, name = "fimLinha", literal = "")
})
public class RegG110 extends Registro {
    
    @Field(at = 2)
    private Date dtIni;
    
    @Field(at = 3)
    private Date dtFin;
    
    @Field(at = 4)
    private Double saldoInIcms;
    
    @Field(at = 5)
    private Double somParc;
    
    @Field(at = 6)
    private Double vlTribExp;
    
    @Field(at = 7)
    private Double vlTotal;
    
    @Field(at = 8)
    private Double indPerSai;
    
    @Field(at = 9)
    private Double icmsAprop;
    
    @Field(at = 10)
    private Double somIcmsOc;
    
    /**
     * Obtém Data inicial apuração
     */
    public Date getDtIni() {
        return dtIni;
    }

    /**
     * Seta Data inicial apuração
     */
    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }
    
    /**
     * Obtém Data final apuração
     */
    public Date getDtFin() {
        return dtFin;
    }

    /**
     * Seta Data final apuração
     */
    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
    }
    
    /**
     * Obtém Saldo inicial de ICMS do CIAP
     */
    public Double getSaldoInIcms() {
        return saldoInIcms;
    }

    /**
     * Seta Saldo inicial de ICMS do CIAP
     */
    public void setSaldoInIcms(Double saldoInIcms) {
        this.saldoInIcms = saldoInIcms;
    }
    
    /**
     * Obtém Somatório das parcelas de ICMS
     */
    public Double getSomParc() {
        return somParc;
    }

    /**
     * Seta Somatório das parcelas de ICMS
     */
    public void setSomParc(Double somParc) {
        this.somParc = somParc;
    }
    
    /**
     * Obtém Valor do somatório das saídas tributadas/exportação
     */
    public Double getVlTribExp() {
        return vlTribExp;
    }

    /**
     * Seta Valor do somatório das saídas tributadas/exportação
     */
    public void setVlTribExp(Double vlTribExp) {
        this.vlTribExp = vlTribExp;
    }
    
    /**
     * Obtém Valor total de saídas
     */
    public Double getVlTotal() {
        return vlTotal;
    }

    /**
     * Seta Valor total de saídas
     */
    public void setVlTotal(Double vlTotal) {
        this.vlTotal = vlTotal;
    }
    
    /**
     * Obtém Índice de participação do somatório das saídas tributadas/exportação
     */
    public Double getIndPerSai() {
        return indPerSai;
    }

    /**
     * Seta Índice de participação do somatório das saídas tributadas/exportação
     */
    public void setIndPerSai(Double indPerSai) {
        this.indPerSai = indPerSai;
    }
    
    /**
     * Obtém Parcela de ICMS a ser apropriada
     */
    public Double getIcmsAprop() {
        return icmsAprop;
    }

    /**
     * Seta Parcela de ICMS a ser apropriada
     */
    public void setIcmsAprop(Double icmsAprop) {
        this.icmsAprop = icmsAprop;
    }
    
    /**
     * Obtém Valor de outras parcelas
     */
    public Double getSomIcmsOc() {
        return somIcmsOc;
    }

    /**
     * Seta Valor de outras parcelas
     */
    public void setSomIcmsOc(Double somIcmsOc) {
        this.somIcmsOc = somIcmsOc;
    }
    
}