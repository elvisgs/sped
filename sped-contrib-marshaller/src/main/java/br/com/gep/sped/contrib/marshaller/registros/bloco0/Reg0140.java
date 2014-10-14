package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 0140 - Cadastro de Estabelecimentos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0140"),
    @Field(at = 10, name = "fimLinha", literal = "")
})
public class Reg0140 extends Registro {
    
    @Field(at = 2)
    private String codEst;
    
    @Field(at = 3)
    private String nome;
    
    @Field(at = 4)
    private String cnpj;
    
    @Field(at = 5)
    private String uf;
    
    @Field(at = 6)
    private String ie;
    
    @Field(at = 7)
    private String codMun;
    
    @Field(at = 8)
    private String im;
    
    @Field(at = 9)
    private String suframa;
    
    
    /**
     * Obtém Código
     */
    public String getCodEst() {
        return codEst;
    }

    /**
     * Seta Código
     */
    public void setCodEst(String codEst) {
        this.codEst = codEst;
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
    
    
}