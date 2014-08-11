package br.com.gep.spedcontrib.arquivo.registros.blocoM;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * M230 - Informações Adicionais de Diferimento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "M230"),
    @Field(at = 8, name = "fimLinha", literal = "")
})
public class RegM230 {
    
    @Field(at = 2)
    private String cnpj;
    
    @Field(at = 3)
    private Double vlVend;
    
    @Field(at = 4)
    private Double vlNaoReceb;
    
    @Field(at = 5)
    private Double vlContDif;
    
    @Field(at = 6)
    private Double vlCredDif;
    
    @Field(at = 7)
    private String codCred;
    
    
    /**
     * Obtém CNPJ da pessoa jurídica de direito público, empresa pública, sociedade de economia mista ou suas subsidiárias.
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Seta CNPJ da pessoa jurídica de direito público, empresa pública, sociedade de economia mista ou suas subsidiárias.
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    /**
     * Obtém Valor Total das vendas no período
     */
    public Double getVlVend() {
        return vlVend;
    }

    /**
     * Seta Valor Total das vendas no período
     */
    public void setVlVend(Double vlVend) {
        this.vlVend = vlVend;
    }
    
    /**
     * Obtém Valor Total não recebido no período
     */
    public Double getVlNaoReceb() {
        return vlNaoReceb;
    }

    /**
     * Seta Valor Total não recebido no período
     */
    public void setVlNaoReceb(Double vlNaoReceb) {
        this.vlNaoReceb = vlNaoReceb;
    }
    
    /**
     * Obtém Valor da Contribuição diferida no período
     */
    public Double getVlContDif() {
        return vlContDif;
    }

    /**
     * Seta Valor da Contribuição diferida no período
     */
    public void setVlContDif(Double vlContDif) {
        this.vlContDif = vlContDif;
    }
    
    /**
     * Obtém Valor do Crédito diferido no período
     */
    public Double getVlCredDif() {
        return vlCredDif;
    }

    /**
     * Seta Valor do Crédito diferido no período
     */
    public void setVlCredDif(Double vlCredDif) {
        this.vlCredDif = vlCredDif;
    }
    
    /**
     * Obtém Código de Tipo de Crédito diferido no período, conforme a Tabela 4.3.6
     */
    public String getCodCred() {
        return codCred;
    }

    /**
     * Seta Código de Tipo de Crédito diferido no período, conforme a Tabela 4.3.6
     */
    public void setCodCred(String codCred) {
        this.codCred = codCred;
    }
    
    
}