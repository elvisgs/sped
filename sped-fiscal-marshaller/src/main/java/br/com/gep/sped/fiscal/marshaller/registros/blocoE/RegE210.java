package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Valores de Apuração
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "E210"),
    @Field(at = 16, name = "fimLinha", literal = "")
})
public class RegE210 extends Registro {
    
    @Field(at = 2)
    private String indMovSt;
    
    @Field(at = 3)
    private Double vlSldCredAntSt;
    
    @Field(at = 4)
    private Double vlDevolSt;
    
    @Field(at = 5)
    private Double vlRessarcSt;
    
    @Field(at = 6)
    private Double vlOutCredSt;
    
    @Field(at = 7)
    private Double vlAjCreditosSt;
    
    @Field(at = 8)
    private Double vlRetencaoSt;
    
    @Field(at = 9)
    private Double vlOutDebSt;
    
    @Field(at = 10)
    private Double vlAjDebitosSt;
    
    @Field(at = 11)
    private Double vlSldDevAntSt;
    
    @Field(at = 12)
    private Double vlDeducoesSt;
    
    @Field(at = 13)
    private Double vlIcmsRecolSt;
    
    @Field(at = 14)
    private Double vlSldCredStTransportar;
    
    @Field(at = 15)
    private Double debEspSt;
    
    /**
     * Obtém Indicador de movimento
     */
    public String getIndMovSt() {
        return indMovSt;
    }

    /**
     * Seta Indicador de movimento
     * <p>0=Sem operações com ST;1=Com operações de ST</p>
     */
    public void setIndMovSt(String indMovSt) {
        this.indMovSt = indMovSt;
    }
    
    /**
     * Obtém Saldo credor do período anterior - ST
     */
    public Double getVlSldCredAntSt() {
        return vlSldCredAntSt;
    }

    /**
     * Seta Saldo credor do período anterior - ST
     */
    public void setVlSldCredAntSt(Double vlSldCredAntSt) {
        this.vlSldCredAntSt = vlSldCredAntSt;
    }
    
    /**
     * Obtém Valor total ICMS ST devol. mercadoria
     */
    public Double getVlDevolSt() {
        return vlDevolSt;
    }

    /**
     * Seta Valor total ICMS ST devol. mercadoria
     */
    public void setVlDevolSt(Double vlDevolSt) {
        this.vlDevolSt = vlDevolSt;
    }
    
    /**
     * Obtém Valor total ICMS ST - ressarcimentos
     */
    public Double getVlRessarcSt() {
        return vlRessarcSt;
    }

    /**
     * Seta Valor total ICMS ST - ressarcimentos
     */
    public void setVlRessarcSt(Double vlRessarcSt) {
        this.vlRessarcSt = vlRessarcSt;
    }
    
    /**
     * Obtém Valor total - outros créditos ST
     */
    public Double getVlOutCredSt() {
        return vlOutCredSt;
    }

    /**
     * Seta Valor total - outros créditos ST
     */
    public void setVlOutCredSt(Double vlOutCredSt) {
        this.vlOutCredSt = vlOutCredSt;
    }
    
    /**
     * Obtém Valor ajustes a crédito ICMS ST (doc fiscal)
     */
    public Double getVlAjCreditosSt() {
        return vlAjCreditosSt;
    }

    /**
     * Seta Valor ajustes a crédito ICMS ST (doc fiscal)
     */
    public void setVlAjCreditosSt(Double vlAjCreditosSt) {
        this.vlAjCreditosSt = vlAjCreditosSt;
    }
    
    /**
     * Obtém Valor total do ICMS retido ST
     */
    public Double getVlRetencaoSt() {
        return vlRetencaoSt;
    }

    /**
     * Seta Valor total do ICMS retido ST
     */
    public void setVlRetencaoSt(Double vlRetencaoSt) {
        this.vlRetencaoSt = vlRetencaoSt;
    }
    
    /**
     * Obtém Valor total - outros débitos ST
     */
    public Double getVlOutDebSt() {
        return vlOutDebSt;
    }

    /**
     * Seta Valor total - outros débitos ST
     */
    public void setVlOutDebSt(Double vlOutDebSt) {
        this.vlOutDebSt = vlOutDebSt;
    }
    
    /**
     * Obtém Valor ajustes a débito ICMS ST (doc fiscal)
     */
    public Double getVlAjDebitosSt() {
        return vlAjDebitosSt;
    }

    /**
     * Seta Valor ajustes a débito ICMS ST (doc fiscal)
     */
    public void setVlAjDebitosSt(Double vlAjDebitosSt) {
        this.vlAjDebitosSt = vlAjDebitosSt;
    }
    
    /**
     * Obtém Valor do saldo devedor antes das deduções
     */
    public Double getVlSldDevAntSt() {
        return vlSldDevAntSt;
    }

    /**
     * Seta Valor do saldo devedor antes das deduções
     */
    public void setVlSldDevAntSt(Double vlSldDevAntSt) {
        this.vlSldDevAntSt = vlSldDevAntSt;
    }
    
    /**
     * Obtém Valor total das deduções ST
     */
    public Double getVlDeducoesSt() {
        return vlDeducoesSt;
    }

    /**
     * Seta Valor total das deduções ST
     */
    public void setVlDeducoesSt(Double vlDeducoesSt) {
        this.vlDeducoesSt = vlDeducoesSt;
    }
    
    /**
     * Obtém Valor total do ICMS a recolher ST
     */
    public Double getVlIcmsRecolSt() {
        return vlIcmsRecolSt;
    }

    /**
     * Seta Valor total do ICMS a recolher ST
     */
    public void setVlIcmsRecolSt(Double vlIcmsRecolSt) {
        this.vlIcmsRecolSt = vlIcmsRecolSt;
    }
    
    /**
     * Obtém Valor do saldo credor do ICMS ST
     */
    public Double getVlSldCredStTransportar() {
        return vlSldCredStTransportar;
    }

    /**
     * Seta Valor do saldo credor do ICMS ST
     */
    public void setVlSldCredStTransportar(Double vlSldCredStTransportar) {
        this.vlSldCredStTransportar = vlSldCredStTransportar;
    }
    
    /**
     * Obtém Valores recolhidos ou a recolher, extra-apuração
     */
    public Double getDebEspSt() {
        return debEspSt;
    }

    /**
     * Seta Valores recolhidos ou a recolher, extra-apuração
     */
    public void setDebEspSt(Double debEspSt) {
        this.debEspSt = debEspSt;
    }
    
}