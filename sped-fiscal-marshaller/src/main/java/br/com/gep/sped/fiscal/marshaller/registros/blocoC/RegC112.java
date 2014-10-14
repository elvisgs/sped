package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Doc. Arrecadação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C112"),
    @Field(at = 9, name = "fimLinha", literal = "")
})
public class RegC112 extends Registro {
    
    @Field(at = 2)
    private String codDa;
    
    @Field(at = 3)
    private String uf;
    
    @Field(at = 4)
    private String numDa;
    
    @Field(at = 5)
    private String codAut;
    
    @Field(at = 6)
    private Double vlDa;
    
    @Field(at = 7)
    private Date dtVcto;
    
    @Field(at = 8)
    private Date dtPgto;
    
    /**
     * Obtém Modelo do documento
     */
    public String getCodDa() {
        return codDa;
    }

    /**
     * Seta Modelo do documento
     * <p>0=documento estadual de arrecadação;1=GNRE</p>
     */
    public void setCodDa(String codDa) {
        this.codDa = codDa;
    }
    
    /**
     * Obtém UF beneficiária
     */
    public String getUf() {
        return uf;
    }

    /**
     * Seta UF beneficiária
     */
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    /**
     * Obtém Número do documento
     */
    public String getNumDa() {
        return numDa;
    }

    /**
     * Seta Número do documento
     */
    public void setNumDa(String numDa) {
        this.numDa = numDa;
    }
    
    /**
     * Obtém Código autenticação bancária
     */
    public String getCodAut() {
        return codAut;
    }

    /**
     * Seta Código autenticação bancária
     */
    public void setCodAut(String codAut) {
        this.codAut = codAut;
    }
    
    /**
     * Obtém Valor total do documento
     */
    public Double getVlDa() {
        return vlDa;
    }

    /**
     * Seta Valor total do documento
     */
    public void setVlDa(Double vlDa) {
        this.vlDa = vlDa;
    }
    
    /**
     * Obtém Data de vencimento
     */
    public Date getDtVcto() {
        return dtVcto;
    }

    /**
     * Seta Data de vencimento
     */
    public void setDtVcto(Date dtVcto) {
        this.dtVcto = dtVcto;
    }
    
    /**
     * Obtém Data de pagamento
     */
    public Date getDtPgto() {
        return dtPgto;
    }

    /**
     * Seta Data de pagamento
     */
    public void setDtPgto(Date dtPgto) {
        this.dtPgto = dtPgto;
    }
    
}