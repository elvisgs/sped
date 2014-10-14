package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Obrigações do ICMS a recolher
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "1926"),
    @Field(at = 11, name = "fimLinha", literal = "")
})
public class Reg1926 extends Registro {
    
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
    private Double indProc;
    
    @Field(at = 8)
    private String proc;
    
    @Field(at = 9)
    private String txtCompl;
    
    @Field(at = 10)
    private String mesRef;
    
    /**
     * Obtém Código do ICMS a recolher
     */
    public String getCodOr() {
        return codOr;
    }

    /**
     * Seta Código do ICMS a recolher
     */
    public void setCodOr(String codOr) {
        this.codOr = codOr;
    }
    
    /**
     * Obtém Valor do ICMS a recolher
     */
    public Double getVlOr() {
        return vlOr;
    }

    /**
     * Seta Valor do ICMS a recolher
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
     * Obtém Código da receita
     */
    public String getCodRec() {
        return codRec;
    }

    /**
     * Seta Código da receita
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
    public Double getIndProc() {
        return indProc;
    }

    /**
     * Seta Origem do processo
     * <p>0=SEFAZ;1=Justiça Federal;2=Justiça Estadual;9=Outros</p>
     */
    public void setIndProc(Double indProc) {
        this.indProc = indProc;
    }
    
    /**
     * Obtém Descrição resumida
     */
    public String getProc() {
        return proc;
    }

    /**
     * Seta Descrição resumida
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