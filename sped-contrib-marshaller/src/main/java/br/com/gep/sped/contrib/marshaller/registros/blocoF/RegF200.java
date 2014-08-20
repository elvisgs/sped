package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * F200 - Operações da Atividade Imobiliária - Unidade Imobiliária Vendida
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "F200"),
    @Field(at = 23, name = "fimLinha", literal = "")
})
public class RegF200 extends RegBase {
    
    @Field(at = 2)
    private String indOper;
    
    @Field(at = 3)
    private String unidImob;
    
    @Field(at = 4)
    private String identEmp;
    
    @Field(at = 5)
    private String descUnidImob;
    
    @Field(at = 6)
    private String numCont;
    
    @Field(at = 7)
    private String cpfCnpjAdqu;
    
    @Field(at = 8)
    private Date dtOper;
    
    @Field(at = 9)
    private Double vlTotVend;
    
    @Field(at = 10)
    private Double vlRecAcum;
    
    @Field(at = 11)
    private Double vlTotRec;
    
    @Field(at = 12)
    private String cstPis;
    
    @Field(at = 13)
    private Double vlBcPis;
    
    @Field(at = 14)
    private Double aliqPis;
    
    @Field(at = 15)
    private Double vlPis;
    
    @Field(at = 16)
    private String cstCofins;
    
    @Field(at = 17)
    private Double vlBcCofins;
    
    @Field(at = 18)
    private Double aliqCofins;
    
    @Field(at = 19)
    private Double vlCofins;
    
    @Field(at = 20)
    private Double percRecReceb;
    
    @Field(at = 21)
    private String indNatEmp;
    
    @Field(at = 22)
    private String infComp;
    
    
    /**
     * Obtém Indicador do Tipo da Operação
     */
    public String getIndOper() {
        return indOper;
    }

    /**
     * Seta Indicador do Tipo da Operação
     */
    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }
    
    /**
     * Obtém Indicador do tipo de unidade imobiliária Vendida.
     */
    public String getUnidImob() {
        return unidImob;
    }

    /**
     * Seta Indicador do tipo de unidade imobiliária Vendida.
     */
    public void setUnidImob(String unidImob) {
        this.unidImob = unidImob;
    }
    
    /**
     * Obtém Identificação/Nome do Empreendimento
     */
    public String getIdentEmp() {
        return identEmp;
    }

    /**
     * Seta Identificação/Nome do Empreendimento
     */
    public void setIdentEmp(String identEmp) {
        this.identEmp = identEmp;
    }
    
    /**
     * Obtém Descrição Resumida da Unidade Imobiliária Vendida
     */
    public String getDescUnidImob() {
        return descUnidImob;
    }

    /**
     * Seta Descrição Resumida da Unidade Imobiliária Vendida
     */
    public void setDescUnidImob(String descUnidImob) {
        this.descUnidImob = descUnidImob;
    }
    
    /**
     * Obtém Número do Contrato de Venda da Unidade Imobiliária
     */
    public String getNumCont() {
        return numCont;
    }

    /**
     * Seta Número do Contrato de Venda da Unidade Imobiliária
     */
    public void setNumCont(String numCont) {
        this.numCont = numCont;
    }
    
    /**
     * Obtém Identificação da pessoa  física (CPF) ou da pessoa jurídica (CNPJ) adquirente da unidade imobiliária
     */
    public String getCpfCnpjAdqu() {
        return cpfCnpjAdqu;
    }

    /**
     * Seta Identificação da pessoa  física (CPF) ou da pessoa jurídica (CNPJ) adquirente da unidade imobiliária
     */
    public void setCpfCnpjAdqu(String cpfCnpjAdqu) {
        this.cpfCnpjAdqu = cpfCnpjAdqu;
    }
    
    /**
     * Obtém Data da operação de venda da Unidade Imobiliária
     */
    public Date getDtOper() {
        return dtOper;
    }

    /**
     * Seta Data da operação de venda da Unidade Imobiliária
     */
    public void setDtOper(Date dtOper) {
        this.dtOper = dtOper;
    }
    
    /**
     * Obtém Valor total da unidade imobiliária vendida
     */
    public Double getVlTotVend() {
        return vlTotVend;
    }

    /**
     * Seta Valor total da unidade imobiliária vendida
     */
    public void setVlTotVend(Double vlTotVend) {
        this.vlTotVend = vlTotVend;
    }
    
    /**
     * Obtém Valor recebido, acumulado até o mês anterior ao da escrituração.
     */
    public Double getVlRecAcum() {
        return vlRecAcum;
    }

    /**
     * Seta Valor recebido, acumulado até o mês anterior ao da escrituração.
     */
    public void setVlRecAcum(Double vlRecAcum) {
        this.vlRecAcum = vlRecAcum;
    }
    
    /**
     * Obtém Valor total recebido no mês da escrituração
     */
    public Double getVlTotRec() {
        return vlTotRec;
    }

    /**
     * Seta Valor total recebido no mês da escrituração
     */
    public void setVlTotRec(Double vlTotRec) {
        this.vlTotRec = vlTotRec;
    }
    
    /**
     * Obtém Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3 (IN RFB nº 1.009, de 2010)
     */
    public String getCstPis() {
        return cstPis;
    }

    /**
     * Seta Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3 (IN RFB nº 1.009, de 2010)
     */
    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    
    /**
     * Obtém Base de Cálculo do PIS/PASEP
     */
    public Double getVlBcPis() {
        return vlBcPis;
    }

    /**
     * Seta Base de Cálculo do PIS/PASEP
     */
    public void setVlBcPis(Double vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    
    /**
     * Obtém Alíquota do PIS/PASEP (em percentual)
     */
    public Double getAliqPis() {
        return aliqPis;
    }

    /**
     * Seta Alíquota do PIS/PASEP (em percentual)
     */
    public void setAliqPis(Double aliqPis) {
        this.aliqPis = aliqPis;
    }
    
    /**
     * Obtém Valor do PIS/PASEP
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor do PIS/PASEP
     */
    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
    }
    
    /**
     * Obtém Código da Situação Tributária referente a COFINS, conforme a Tabela indicada no item 4.3.4 (IN RFB nº 1.009, de 2010)
     */
    public String getCstCofins() {
        return cstCofins;
    }

    /**
     * Seta Código da Situação Tributária referente a COFINS, conforme a Tabela indicada no item 4.3.4 (IN RFB nº 1.009, de 2010)
     */
    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    
    /**
     * Obtém Base de Cálculo da COFINS
     */
    public Double getVlBcCofins() {
        return vlBcCofins;
    }

    /**
     * Seta Base de Cálculo da COFINS
     */
    public void setVlBcCofins(Double vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    
    /**
     * Obtém Alíquota da COFINS (em percentual)
     */
    public Double getAliqCofins() {
        return aliqCofins;
    }

    /**
     * Seta Alíquota da COFINS (em percentual)
     */
    public void setAliqCofins(Double aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    
    /**
     * Obtém Valor da COFINS
     */
    public Double getVlCofins() {
        return vlCofins;
    }

    /**
     * Seta Valor da COFINS
     */
    public void setVlCofins(Double vlCofins) {
        this.vlCofins = vlCofins;
    }
    
    /**
     * Obtém Percentual da receita total recebida até o mês, da unidade imobiliária vendida ((Campo 10 + Campo 11) / Campo 09)
     */
    public Double getPercRecReceb() {
        return percRecReceb;
    }

    /**
     * Seta Percentual da receita total recebida até o mês, da unidade imobiliária vendida ((Campo 10 + Campo 11) / Campo 09)
     */
    public void setPercRecReceb(Double percRecReceb) {
        this.percRecReceb = percRecReceb;
    }
    
    /**
     * Obtém Indicador da Natureza Específica do Empreendimento
     */
    public String getIndNatEmp() {
        return indNatEmp;
    }

    /**
     * Seta Indicador da Natureza Específica do Empreendimento
     */
    public void setIndNatEmp(String indNatEmp) {
        this.indNatEmp = indNatEmp;
    }
    
    /**
     * Obtém Informações Complementares
     */
    public String getInfComp() {
        return infComp;
    }

    /**
     * Seta Informações Complementares
     */
    public void setInfComp(String infComp) {
        this.infComp = infComp;
    }
    
    
}