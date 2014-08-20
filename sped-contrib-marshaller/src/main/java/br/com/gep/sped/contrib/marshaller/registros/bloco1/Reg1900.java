package br.com.gep.sped.contrib.marshaller.registros.bloco1;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Consolidação dos documentos emitidos no período por pessoa jurídica submetida ao regime de tributação com base no lucro presumido - regime de caixa ou de competência
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "1900"),
    @Field(at = 14, name = "fimLinha", literal = "")
})
public class Reg1900 extends Registro {
    
    @Field(at = 2)
    private String cnpj;
    
    @Field(at = 3)
    private String codMod;
    
    @Field(at = 4)
    private String ser;
    
    @Field(at = 5)
    private String subSer;
    
    @Field(at = 6)
    private String codSit;
    
    @Field(at = 7)
    private Double vlTotRec;
    
    @Field(at = 8)
    private Integer quantDoc;
    
    @Field(at = 9)
    private String cstPis;
    
    @Field(at = 10)
    private String cstCofins;
    
    @Field(at = 11)
    private String cfop;
    
    @Field(at = 12)
    private String infoCompl;
    
    @Field(at = 13)
    private String codCta;
    
    
    /**
     * Obtém CNPJ do estabelecimento da pessoa jurídica, emitente dos documentos geradores de receita
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Seta CNPJ do estabelecimento da pessoa jurídica, emitente dos documentos geradores de receita
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    /**
     * Obtém Código do modelo do documento fiscal conforme a Tabela 4.1.1, ou 98 - Nota Fiscal de Prestação de Serviços (ISSQN) ou 99 - Outros Documentos
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo do documento fiscal conforme a Tabela 4.1.1, ou 98 - Nota Fiscal de Prestação de Serviços (ISSQN) ou 99 - Outros Documentos
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Série do documento fiscal
     */
    public String getSer() {
        return ser;
    }

    /**
     * Seta Série do documento fiscal
     */
    public void setSer(String ser) {
        this.ser = ser;
    }
    
    /**
     * Obtém Subsérie do documento fiscal
     */
    public String getSubSer() {
        return subSer;
    }

    /**
     * Seta Subsérie do documento fiscal
     */
    public void setSubSer(String subSer) {
        this.subSer = subSer;
    }
    
    /**
     * Obtém Situação do documento
     */
    public String getCodSit() {
        return codSit;
    }

    /**
     * Seta Situação do documento
     */
    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }
    
    /**
     * Obtém Valor total da receita
     */
    public Double getVlTotRec() {
        return vlTotRec;
    }

    /**
     * Seta Valor total da receita
     */
    public void setVlTotRec(Double vlTotRec) {
        this.vlTotRec = vlTotRec;
    }
    
    /**
     * Obtém Quantidade total de documentos
     */
    public Integer getQuantDoc() {
        return quantDoc;
    }

    /**
     * Seta Quantidade total de documentos
     */
    public void setQuantDoc(Integer quantDoc) {
        this.quantDoc = quantDoc;
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
     * Obtém CFOP
     */
    public String getCfop() {
        return cfop;
    }

    /**
     * Seta CFOP
     */
    public void setCfop(String cfop) {
        this.cfop = cfop;
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