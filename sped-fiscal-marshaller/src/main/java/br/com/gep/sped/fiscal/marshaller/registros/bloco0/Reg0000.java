package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Identificação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0000"),
    @Field(at = 16, name = "fimLinha")
})
public class Reg0000 extends Registro {
    
    @Field(at = 2)
    private String codVer;
    
    @Field(at = 3)
    private String codFin;
    
    @Field(at = 4)
    private Date dtIni;
    
    @Field(at = 5)
    private Date dtFin;
    
    @Field(at = 6)
    private String nome;
    
    @Field(at = 7)
    private String cnpj;
    
    @Field(at = 8)
    private String cpf;
    
    @Field(at = 9)
    private String uf;
    
    @Field(at = 10)
    private String ie;
    
    @Field(at = 11)
    private String codMun;
    
    @Field(at = 12)
    private String im;
    
    @Field(at = 13)
    private String suframa;
    
    @Field(at = 14)
    private String indPerfil;
    
    @Field(at = 15)
    private String indAtiv;
    
    /**
     * Obtém Código da versão do leiaute
     */
    public String getCodVer() {
        return codVer;
    }

    /**
     * Seta Código da versão do leiaute
     */
    public void setCodVer(String codVer) {
        this.codVer = codVer;
    }
    
    /**
     * Obtém Código da finalidade
     */
    public String getCodFin() {
        return codFin;
    }

    /**
     * Seta Código da finalidade
     * <p>0=Remessa do arquivo original;1=Remessa do arquivo substituto</p>
     */
    public void setCodFin(String codFin) {
        this.codFin = codFin;
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
     * Obtém CPF
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Seta CPF
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
     * Obtém Inscrição Estadual
     */
    public String getIe() {
        return ie;
    }

    /**
     * Seta Inscrição Estadual
     */
    public void setIe(String ie) {
        this.ie = ie;
    }
    
    /**
     * Obtém Código do município
     */
    public String getCodMun() {
        return codMun;
    }

    /**
     * Seta Código do município
     */
    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }
    
    /**
     * Obtém Inscrição Municipal
     */
    public String getIm() {
        return im;
    }

    /**
     * Seta Inscrição Municipal
     */
    public void setIm(String im) {
        this.im = im;
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
     * Obtém Perfil do arquivo fiscal
     */
    public String getIndPerfil() {
        return indPerfil;
    }

    /**
     * Seta Perfil do arquivo fiscal
     * <p>A=Perfil A;B=Perfil B;C=Perfil C</p>
     */
    public void setIndPerfil(String indPerfil) {
        this.indPerfil = indPerfil;
    }
    
    /**
     * Obtém Tipo de atividade
     */
    public String getIndAtiv() {
        return indAtiv;
    }

    /**
     * Seta Tipo de atividade
     * <p>0=Industrial ou equiparado a industrial;1=Outras</p>
     */
    public void setIndAtiv(String indAtiv) {
        this.indAtiv = indAtiv;
    }
    
}