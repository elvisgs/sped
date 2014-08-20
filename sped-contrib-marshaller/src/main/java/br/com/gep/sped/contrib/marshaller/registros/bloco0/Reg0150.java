package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 0150 - Cadastro de Participante
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0150"),
    @Field(at = 14, name = "fimLinha", literal = "")
})
public class Reg0150 extends Registro {
    
    @Field(at = 2)
    private String codPart;
    
    @Field(at = 3)
    private String nome;
    
    @Field(at = 4)
    private String codPais;
    
    @Field(at = 5)
    private String cnpj;
    
    @Field(at = 6)
    private String cpf;
    
    @Field(at = 7)
    private String ie;
    
    @Field(at = 8)
    private String codMun;
    
    @Field(at = 9)
    private String suframa;
    
    @Field(at = 10)
    private String end;
    
    @Field(at = 11)
    private String num;
    
    @Field(at = 12)
    private String compl;
    
    @Field(at = 13)
    private String bairro;
    
    
    /**
     * Obtém Código
     */
    public String getCodPart() {
        return codPart;
    }

    /**
     * Seta Código
     */
    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }
    
    /**
     * Obtém Nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Seta Nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Obtém País
     */
    public String getCodPais() {
        return codPais;
    }

    /**
     * Seta País
     */
    public void setCodPais(String codPais) {
        this.codPais = codPais;
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
     * Obtém Logradouro
     */
    public String getEnd() {
        return end;
    }

    /**
     * Seta Logradouro
     */
    public void setEnd(String end) {
        this.end = end;
    }
    
    /**
     * Obtém Número
     */
    public String getNum() {
        return num;
    }

    /**
     * Seta Número
     */
    public void setNum(String num) {
        this.num = num;
    }
    
    /**
     * Obtém Complemento
     */
    public String getCompl() {
        return compl;
    }

    /**
     * Seta Complemento
     */
    public void setCompl(String compl) {
        this.compl = compl;
    }
    
    /**
     * Obtém Bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Seta Bairro
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    
}