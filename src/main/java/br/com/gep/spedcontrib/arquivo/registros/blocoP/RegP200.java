package br.com.gep.spedcontrib.arquivo.registros.blocoP;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * P200 - Consolidação da Contribuição Previdenciária sobre a Receita Bruta
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "P200")
})
public class RegP200 {
    
    @Field(at = 1)
    private String perRef;
    
    @Field(at = 2)
    private Double vlTotContApu;
    
    @Field(at = 3)
    private Double vlTotAjReduc;
    
    @Field(at = 4)
    private Double vlTotAjAcres;
    
    @Field(at = 5)
    private Double vlTotContDev;
    
    @Field(at = 6)
    private String codRec;
    
    
    /**
     * Obtém Período de referência da escrituração (MMAAAA)
     */
    public String getPerRef() {
        return perRef;
    }

    /**
     * Seta Período de referência da escrituração (MMAAAA)
     */
    public void setPerRef(String perRef) {
        this.perRef = perRef;
    }
    
    /**
     * Obtém Valor total apurado da Contribuição Previdenciária sobre a Receita Bruta
     */
    public Double getVlTotContApu() {
        return vlTotContApu;
    }

    /**
     * Seta Valor total apurado da Contribuição Previdenciária sobre a Receita Bruta
     */
    public void setVlTotContApu(Double vlTotContApu) {
        this.vlTotContApu = vlTotContApu;
    }
    
    /**
     * Obtém Valor total de “Ajustes de redução”
     */
    public Double getVlTotAjReduc() {
        return vlTotAjReduc;
    }

    /**
     * Seta Valor total de “Ajustes de redução”
     */
    public void setVlTotAjReduc(Double vlTotAjReduc) {
        this.vlTotAjReduc = vlTotAjReduc;
    }
    
    /**
     * Obtém Valor total de “Ajustes de acréscimo”
     */
    public Double getVlTotAjAcres() {
        return vlTotAjAcres;
    }

    /**
     * Seta Valor total de “Ajustes de acréscimo”
     */
    public void setVlTotAjAcres(Double vlTotAjAcres) {
        this.vlTotAjAcres = vlTotAjAcres;
    }
    
    /**
     * Obtém Valor total da Contribuição Previdenciária sobre a Receita Bruta a recolher
     */
    public Double getVlTotContDev() {
        return vlTotContDev;
    }

    /**
     * Seta Valor total da Contribuição Previdenciária sobre a Receita Bruta a recolher
     */
    public void setVlTotContDev(Double vlTotContDev) {
        this.vlTotContDev = vlTotContDev;
    }
    
    /**
     * Obtém Código de Receita referente à Contribuição Previdenciária, conforme informado em DCTF (&quot;298501&quot; para Serviços e &quot;299101&quot; para Produtos)
     */
    public String getCodRec() {
        return codRec;
    }

    /**
     * Seta Código de Receita referente à Contribuição Previdenciária, conforme informado em DCTF (&quot;298501&quot; para Serviços e &quot;299101&quot; para Produtos)
     */
    public void setCodRec(String codRec) {
        this.codRec = codRec;
    }
    
    
}