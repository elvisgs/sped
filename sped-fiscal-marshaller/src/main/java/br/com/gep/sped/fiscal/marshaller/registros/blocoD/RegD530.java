package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Terminal Faturado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D530"),
    @Field(at = 8, name = "fimLinha")
})
public class RegD530 extends Registro {
    
    @Field(at = 2)
    private String indServ;
    
    @Field(at = 3)
    private Date dtIniServ;
    
    @Field(at = 4)
    private Date dtFinServ;
    
    @Field(at = 5)
    private String perFiscal;
    
    @Field(at = 6)
    private String codArea;
    
    @Field(at = 7)
    private Integer terminal;
    
    /**
     * Obtém Tipo de serviço prestado
     */
    public String getIndServ() {
        return indServ;
    }

    /**
     * Seta Tipo de serviço prestado
     * <p>0=Telefonia;1=Comunicação de dados;2=TV por assinatura;3=Provimento de acesso à Internet;4=Multimídia;9=Outros</p>
     */
    public void setIndServ(String indServ) {
        this.indServ = indServ;
    }
    
    /**
     * Obtém Data de inicio da prestação
     */
    public Date getDtIniServ() {
        return dtIniServ;
    }

    /**
     * Seta Data de inicio da prestação
     */
    public void setDtIniServ(Date dtIniServ) {
        this.dtIniServ = dtIniServ;
    }
    
    /**
     * Obtém Data final da prestação
     */
    public Date getDtFinServ() {
        return dtFinServ;
    }

    /**
     * Seta Data final da prestação
     */
    public void setDtFinServ(Date dtFinServ) {
        this.dtFinServ = dtFinServ;
    }
    
    /**
     * Obtém Período fiscal da prestação (MMAAAA)
     */
    public String getPerFiscal() {
        return perFiscal;
    }

    /**
     * Seta Período fiscal da prestação (MMAAAA)
     */
    public void setPerFiscal(String perFiscal) {
        this.perFiscal = perFiscal;
    }
    
    /**
     * Obtém Código de área do terminal
     */
    public String getCodArea() {
        return codArea;
    }

    /**
     * Seta Código de área do terminal
     */
    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }
    
    /**
     * Obtém Identificação do terminal
     */
    public Integer getTerminal() {
        return terminal;
    }

    /**
     * Seta Identificação do terminal
     */
    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }
    
}