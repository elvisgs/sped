package br.com.gep.spedcontrib.arquivo.registros.bloco0;

import br.com.gep.spedcontrib.arquivo.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 0500 - Plano de Contas Contábeis
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0500"),
    @Field(at = 10, name = "fimLinha", literal = "")
})
public class Reg0500 extends Registro {
    
    @Field(at = 2)
    private Date dtAlt;
    
    @Field(at = 3)
    private String codNatCc;
    
    @Field(at = 4)
    private String indCta;
    
    @Field(at = 5)
    private String nivel;
    
    @Field(at = 6)
    private String codCta;
    
    @Field(at = 7)
    private String nomeCta;
    
    @Field(at = 8)
    private String codCtaRef;
    
    @Field(at = 9)
    private String cnpjEst;
    
    
    /**
     * Obtém Data da inclusão ou alteração
     */
    public Date getDtAlt() {
        return dtAlt;
    }

    /**
     * Seta Data da inclusão ou alteração
     */
    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }
    
    /**
     * Obtém Natureza
     */
    public String getCodNatCc() {
        return codNatCc;
    }

    /**
     * Seta Natureza
     */
    public void setCodNatCc(String codNatCc) {
        this.codNatCc = codNatCc;
    }
    
    /**
     * Obtém Tipo
     */
    public String getIndCta() {
        return indCta;
    }

    /**
     * Seta Tipo
     */
    public void setIndCta(String indCta) {
        this.indCta = indCta;
    }
    
    /**
     * Obtém Nível
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * Seta Nível
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    /**
     * Obtém Código
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Código
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
    /**
     * Obtém Nome
     */
    public String getNomeCta() {
        return nomeCta;
    }

    /**
     * Seta Nome
     */
    public void setNomeCta(String nomeCta) {
        this.nomeCta = nomeCta;
    }
    
    /**
     * Obtém Conta relacionada no Plano de Contas Referenciado da RFB
     */
    public String getCodCtaRef() {
        return codCtaRef;
    }

    /**
     * Seta Conta relacionada no Plano de Contas Referenciado da RFB
     */
    public void setCodCtaRef(String codCtaRef) {
        this.codCtaRef = codCtaRef;
    }
    
    /**
     * Obtém CNPJ do Estabelecimento
     */
    public String getCnpjEst() {
        return cnpjEst;
    }

    /**
     * Seta CNPJ do Estabelecimento
     */
    public void setCnpjEst(String cnpjEst) {
        this.cnpjEst = cnpjEst;
    }
    
    
}