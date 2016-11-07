package br.com.gep.sped.fiscal.marshaller.registros.blocoG;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Outros créditos CIAP
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "G126"),
    @Field(at = 10, name = "fimLinha")
})
public class RegG126 extends Registro {
    
    @Field(at = 2)
    private Date dtIni;
    
    @Field(at = 3)
    private Date dtFin;
    
    @Field(at = 4)
    private String numParc;
    
    @Field(at = 5)
    private Double vlParcPass;
    
    @Field(at = 6)
    private Double vlTribOc;
    
    @Field(at = 7)
    private Double vlTotal;
    
    @Field(at = 8)
    private Double indPerSai;
    
    @Field(at = 9)
    private Double vlParcAprop;
    
    /**
     * Obtém Data inicial da apuração
     */
    public Date getDtIni() {
        return dtIni;
    }

    /**
     * Seta Data inicial da apuração
     */
    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }
    
    /**
     * Obtém Data final da apuração
     */
    public Date getDtFin() {
        return dtFin;
    }

    /**
     * Seta Data final da apuração
     */
    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
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
    
    /**
     * Obtém Valor do somatório das saídas tributadas/exportação
     */
    public Double getVlTribOc() {
        return vlTribOc;
    }

    /**
     * Seta Valor do somatório das saídas tributadas/exportação
     */
    public void setVlTribOc(Double vlTribOc) {
        this.vlTribOc = vlTribOc;
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
     * Obtém Índice de participação do valor do somatório das saídas tributadas/exportação
     */
    public Double getIndPerSai() {
        return indPerSai;
    }

    /**
     * Seta Índice de participação do valor do somatório das saídas tributadas/exportação
     */
    public void setIndPerSai(Double indPerSai) {
        this.indPerSai = indPerSai;
    }
    
    /**
     * Obtém Valor da parcela apropriada de ICMS
     */
    public Double getVlParcAprop() {
        return vlParcAprop;
    }

    /**
     * Seta Valor da parcela apropriada de ICMS
     */
    public void setVlParcAprop(Double vlParcAprop) {
        this.vlParcAprop = vlParcAprop;
    }
    
}