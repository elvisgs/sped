package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F525 - Composição da receita escriturada no período - detalhamento da receita recebida pelo regime de caixa
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "F525"),
    @Field(at = 12, name = "fimLinha", literal = "")
})
public class RegF525 extends RegBase {
    
    @Field(at = 2)
    private Double vlRec;
    
    @Field(at = 3)
    private String indRec;
    
    @Field(at = 4)
    private String cnpjCpf;
    
    @Field(at = 5)
    private String numDoc;
    
    @Field(at = 6)
    private String codItem;
    
    @Field(at = 7)
    private Double vlRecDet;
    
    @Field(at = 8)
    private String cstPis;
    
    @Field(at = 9)
    private String cstCofins;
    
    @Field(at = 10)
    private String infoCompl;
    
    @Field(at = 11)
    private String codCta;
    
    
    /**
     * Obtém Total receita recebida
     */
    public Double getVlRec() {
        return vlRec;
    }

    /**
     * Seta Total receita recebida
     */
    public void setVlRec(Double vlRec) {
        this.vlRec = vlRec;
    }
    
    /**
     * Obtém Origem receita recebida
     */
    public String getIndRec() {
        return indRec;
    }

    /**
     * Seta Origem receita recebida
     */
    public void setIndRec(String indRec) {
        this.indRec = indRec;
    }
    
    /**
     * Obtém CNPJ/CPF do participante (cliente/pessoa física ou jurídica pagadora) ou da administradora de cartões (vendas por cartão de débito ou de crédito), no caso de detalhamento da receita recebida conforme os indicadores “01” ou “02”, respectivamente
     */
    public String getCnpjCpf() {
        return cnpjCpf;
    }

    /**
     * Seta CNPJ/CPF do participante (cliente/pessoa física ou jurídica pagadora) ou da administradora de cartões (vendas por cartão de débito ou de crédito), no caso de detalhamento da receita recebida conforme os indicadores “01” ou “02”, respectivamente
     */
    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }
    
    /**
     * Obtém Número do título de crédito ou do documento fiscal, no caso de detalhamento da receita recebida conforme os indicadores “03” ou “04”, respectivamente
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Seta Número do título de crédito ou do documento fiscal, no caso de detalhamento da receita recebida conforme os indicadores “03” ou “04”, respectivamente
     */
    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    
    /**
     * Obtém Código do item (campo 02 do Registro 0200), no caso de detalhamento da receita recebida por item vendido, conforme o indicador “05”
     */
    public String getCodItem() {
        return codItem;
    }

    /**
     * Seta Código do item (campo 02 do Registro 0200), no caso de detalhamento da receita recebida por item vendido, conforme o indicador “05”
     */
    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    
    /**
     * Obtém Receita detalhada
     */
    public Double getVlRecDet() {
        return vlRecDet;
    }

    /**
     * Seta Receita detalhada
     */
    public void setVlRecDet(Double vlRecDet) {
        this.vlRecDet = vlRecDet;
    }
    
    /**
     * Obtém CST PIS/PASEP
     */
    public String getCstPis() {
        return cstPis;
    }

    /**
     * Seta CST PIS/PASEP
     */
    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    
    /**
     * Obtém CST COFINS
     */
    public String getCstCofins() {
        return cstCofins;
    }

    /**
     * Seta CST COFINS
     */
    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    
    /**
     * Obtém Informação complementar
     */
    public String getInfoCompl() {
        return infoCompl;
    }

    /**
     * Seta Informação complementar
     */
    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
    }
    
    /**
     * Obtém Conta analítica contábil
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Conta analítica contábil
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
    
}