package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * F600 - Contribuição Retida na Fonte
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "F600"),
    @Field(at = 12, name = "fimLinha", literal = "")
})
public class RegF600 extends RegBase {
    
    @Field(at = 2)
    private String indNatRet;
    
    @Field(at = 3)
    private Date dtRet;
    
    @Field(at = 4)
    private Double vlBcRet;
    
    @Field(at = 5)
    private Double vlRet;
    
    @Field(at = 6)
    private String codRec;
    
    @Field(at = 7)
    private String indNatRec;
    
    @Field(at = 8)
    private String cnpj;
    
    @Field(at = 9)
    private Double vlRetPis;
    
    @Field(at = 10)
    private Double vlRetCofins;
    
    @Field(at = 11)
    private String indDec;
    
    
    /**
     * Obtém Indicador de Natureza da Retenção na Fonte: 01 - Retenção por Órgãos, Autarquias e Fundações Federais; 02 - Retenção por outras Entidades da Adm. Pública Federal; 03 - Retenção por Pessoas Jurídicas de Direito Privado; 04 - Retenção por Sociedade Cooperativa; 05 - Retenção por Fabricante de Máquinas e Veículos; 99 - Outras Retenções
     */
    public String getIndNatRet() {
        return indNatRet;
    }

    /**
     * Seta Indicador de Natureza da Retenção na Fonte: 01 - Retenção por Órgãos, Autarquias e Fundações Federais; 02 - Retenção por outras Entidades da Adm. Pública Federal; 03 - Retenção por Pessoas Jurídicas de Direito Privado; 04 - Retenção por Sociedade Cooperativa; 05 - Retenção por Fabricante de Máquinas e Veículos; 99 - Outras Retenções
     */
    public void setIndNatRet(String indNatRet) {
        this.indNatRet = indNatRet;
    }
    
    /**
     * Obtém Data da Retenção
     */
    public Date getDtRet() {
        return dtRet;
    }

    /**
     * Seta Data da Retenção
     */
    public void setDtRet(Date dtRet) {
        this.dtRet = dtRet;
    }
    
    /**
     * Obtém Valor da base de cálculo da retenção ou do recolhimento (sociedade cooperativa)
     */
    public Double getVlBcRet() {
        return vlBcRet;
    }

    /**
     * Seta Valor da base de cálculo da retenção ou do recolhimento (sociedade cooperativa)
     */
    public void setVlBcRet(Double vlBcRet) {
        this.vlBcRet = vlBcRet;
    }
    
    /**
     * Obtém Valor Total Retido na Fonte / Recolhido (sociedade cooperativa)
     */
    public Double getVlRet() {
        return vlRet;
    }

    /**
     * Seta Valor Total Retido na Fonte / Recolhido (sociedade cooperativa)
     */
    public void setVlRet(Double vlRet) {
        this.vlRet = vlRet;
    }
    
    /**
     * Obtém Código da Receita
     */
    public String getCodRec() {
        return codRec;
    }

    /**
     * Seta Código da Receita
     */
    public void setCodRec(String codRec) {
        this.codRec = codRec;
    }
    
    /**
     * Obtém Indicador da Natureza da Receita: 0 - Receita de Natureza Não Cumulativa; 1 - Receita de Natureza Cumulativa
     */
    public String getIndNatRec() {
        return indNatRec;
    }

    /**
     * Seta Indicador da Natureza da Receita: 0 - Receita de Natureza Não Cumulativa; 1 - Receita de Natureza Cumulativa
     */
    public void setIndNatRec(String indNatRec) {
        this.indNatRec = indNatRec;
    }
    
    /**
     * Obtém CNPJ da Fonte Pagadora ou Beneficiária da Retenção / Recolhimento
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Seta CNPJ da Fonte Pagadora ou Beneficiária da Retenção / Recolhimento
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    /**
     * Obtém Valor Retido na Fonte - Parcela Referente ao PIS/Pasep
     */
    public Double getVlRetPis() {
        return vlRetPis;
    }

    /**
     * Seta Valor Retido na Fonte - Parcela Referente ao PIS/Pasep
     */
    public void setVlRetPis(Double vlRetPis) {
        this.vlRetPis = vlRetPis;
    }
    
    /**
     * Obtém Valor Retido na Fonte - Parcela Referente a COFINS
     */
    public Double getVlRetCofins() {
        return vlRetCofins;
    }

    /**
     * Seta Valor Retido na Fonte - Parcela Referente a COFINS
     */
    public void setVlRetCofins(Double vlRetCofins) {
        this.vlRetCofins = vlRetCofins;
    }
    
    /**
     * Obtém Indicador da Condição da Pessoa Jurídica Declarante
     */
    public String getIndDec() {
        return indDec;
    }

    /**
     * Seta Indicador da Condição da Pessoa Jurídica Declarante
     */
    public void setIndDec(String indDec) {
        this.indDec = indDec;
    }
    
    
}