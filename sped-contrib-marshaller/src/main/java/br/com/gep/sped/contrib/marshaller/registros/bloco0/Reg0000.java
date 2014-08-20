package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 0000 - Identificação da Pessoa Jurídica
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0000"),
    @Field(at = 15, name = "fimLinha", literal = "")
})
public class Reg0000 extends Registro {
    
    @Field(at = 2)
    private String codVer;
    
    @Field(at = 3)
    private String tipoEscrit;
    
    @Field(at = 4)
    private String indSitEsp;
    
    @Field(at = 5)
    private String numRecAnterior;
    
    @Field(at = 6)
    private Date dtIni;
    
    @Field(at = 7)
    private Date dtFin;
    
    @Field(at = 8)
    private String nome;
    
    @Field(at = 9)
    private String cnpj;
    
    @Field(at = 10)
    private String uf;
    
    @Field(at = 11)
    private String codMun;
    
    @Field(at = 12)
    private String suframa;
    
    @Field(at = 13)
    private String indNatPj;
    
    @Field(at = 14)
    private String indAtiv;
    
    
    /**
     * Obtém Versão do leiaute
     */
    public String getCodVer() {
        return codVer;
    }

    /**
     * Seta Versão do leiaute
     */
    public void setCodVer(String codVer) {
        this.codVer = codVer;
    }
    
    /**
     * Obtém Tipo de Escrituração
     */
    public String getTipoEscrit() {
        return tipoEscrit;
    }

    /**
     * Seta Tipo de Escrituração
     */
    public void setTipoEscrit(String tipoEscrit) {
        this.tipoEscrit = tipoEscrit;
    }
    
    /**
     * Obtém Indicador de situação especial
     */
    public String getIndSitEsp() {
        return indSitEsp;
    }

    /**
     * Seta Indicador de situação especial
     */
    public void setIndSitEsp(String indSitEsp) {
        this.indSitEsp = indSitEsp;
    }
    
    /**
     * Obtém Número do Recibo da Escrituração Anterior
     */
    public String getNumRecAnterior() {
        return numRecAnterior;
    }

    /**
     * Seta Número do Recibo da Escrituração Anterior
     */
    public void setNumRecAnterior(String numRecAnterior) {
        this.numRecAnterior = numRecAnterior;
    }
    
    /**
     * Obtém Data inicial
     */
    public Date getDtIni() {
        return dtIni;
    }

    /**
     * Seta Data inicial
     */
    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }
    
    /**
     * Obtém Data final
     */
    public Date getDtFin() {
        return dtFin;
    }

    /**
     * Seta Data final
     */
    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
    }
    
    /**
     * Obtém Nome empresarial
     */
    public String getNome() {
        return nome;
    }

    /**
     * Seta Nome empresarial
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Obtém CNPJ
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Seta CNPJ
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    /**
     * Obtém UF
     */
    public String getUf() {
        return uf;
    }

    /**
     * Seta UF
     */
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    /**
     * Obtém Município
     */
    public String getCodMun() {
        return codMun;
    }

    /**
     * Seta Município
     */
    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }
    
    /**
     * Obtém Inscrição na SUFRAMA
     */
    public String getSuframa() {
        return suframa;
    }

    /**
     * Seta Inscrição na SUFRAMA
     */
    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }
    
    /**
     * Obtém Natureza da pessoa jurídica
     */
    public String getIndNatPj() {
        return indNatPj;
    }

    /**
     * Seta Natureza da pessoa jurídica
     */
    public void setIndNatPj(String indNatPj) {
        this.indNatPj = indNatPj;
    }
    
    /**
     * Obtém Tipo de atividade preponderante
     */
    public String getIndAtiv() {
        return indAtiv;
    }

    /**
     * Seta Tipo de atividade preponderante
     */
    public void setIndAtiv(String indAtiv) {
        this.indAtiv = indAtiv;
    }
    
    
}