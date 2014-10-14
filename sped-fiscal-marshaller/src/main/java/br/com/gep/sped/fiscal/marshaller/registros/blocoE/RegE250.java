package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Obrigações do ICMS recolhido ou a recolher - Substituição Tributária
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "E250"),
    @Field(at = 11, name = "fimLinha", literal = "")
})
public class RegE250 extends Registro {
    
    @Field(at = 2)
    private String codOr;
    
    @Field(at = 3)
    private Double vlOr;
    
    @Field(at = 4)
    private Date dtVcto;
    
    @Field(at = 5)
    private String codRec;
    
    @Field(at = 6)
    private String numProc;
    
    @Field(at = 7)
    private String indProc;
    
    @Field(at = 8)
    private String proc;
    
    @Field(at = 9)
    private String txtCompl;
    
    @Field(at = 10)
    private String mesRef;
    
    /**
     * Obtém Código do ICMS ST recolhido ou a recolher
     */
    public String getCodOr() {
        return codOr;
    }

    /**
     * Seta Código do ICMS ST recolhido ou a recolher
     */
    public void setCodOr(String codOr) {
        this.codOr = codOr;
    }
    
    /**
     * Obtém Valor do ICMS ST a recolher
     */
    public Double getVlOr() {
        return vlOr;
    }

    /**
     * Seta Valor do ICMS ST a recolher
     */
    public void setVlOr(Double vlOr) {
        this.vlOr = vlOr;
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
     * Obtém Código de receita
     */
    public String getCodRec() {
        return codRec;
    }

    /**
     * Seta Código de receita
     */
    public void setCodRec(String codRec) {
        this.codRec = codRec;
    }
    
    /**
     * Obtém Número do processo
     */
    public String getNumProc() {
        return numProc;
    }

    /**
     * Seta Número do processo
     */
    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }
    
    /**
     * Obtém Origem do processo
     */
    public String getIndProc() {
        return indProc;
    }

    /**
     * Seta Origem do processo
     * <p>0=Sefaz;1=Justiça Federal;2=Justiça Estadual;9=Outros</p>
     */
    public void setIndProc(String indProc) {
        this.indProc = indProc;
    }
    
    /**
     * Obtém Descrição resumida do processo
     */
    public String getProc() {
        return proc;
    }

    /**
     * Seta Descrição resumida do processo
     */
    public void setProc(String proc) {
        this.proc = proc;
    }
    
    /**
     * Obtém Descrição complementar
     */
    public String getTxtCompl() {
        return txtCompl;
    }

    /**
     * Seta Descrição complementar
     */
    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }
    
    /**
     * Obtém Mês de referência
     */
    public String getMesRef() {
        return mesRef;
    }

    /**
     * Seta Mês de referência
     */
    public void setMesRef(String mesRef) {
        this.mesRef = mesRef;
    }
    
}