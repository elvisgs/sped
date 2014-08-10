package br.com.gep.spedcontrib.arquivo.registros.bloco0;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 0100 - Dados do Contabilista
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "0100")
})
public class Reg0100 {
    
    @Field(at = 1)
    private String nome;
    
    @Field(at = 2)
    private String cpf;
    
    @Field(at = 3)
    private String crc;
    
    @Field(at = 4)
    private String cnpj;
    
    @Field(at = 5)
    private String cep;
    
    @Field(at = 6)
    private String end;
    
    @Field(at = 7)
    private String num;
    
    @Field(at = 8)
    private String compl;
    
    @Field(at = 9)
    private String bairro;
    
    @Field(at = 10)
    private String fone;
    
    @Field(at = 11)
    private String fax;
    
    @Field(at = 12)
    private String email;
    
    @Field(at = 13)
    private String codMun;
    
    
    /**
     * Obtém Nome do contabilista
     */
    public String getNome() {
        return nome;
    }

    /**
     * Seta Nome do contabilista
     */
    public void setNome(String nome) {
        this.nome = nome;
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
     * Obtém CRC
     */
    public String getCrc() {
        return crc;
    }

    /**
     * Seta CRC
     */
    public void setCrc(String crc) {
        this.crc = crc;
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
     * Obtém CEP
     */
    public String getCep() {
        return cep;
    }

    /**
     * Seta CEP
     */
    public void setCep(String cep) {
        this.cep = cep;
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
    
    /**
     * Obtém Telefone
     */
    public String getFone() {
        return fone;
    }

    /**
     * Seta Telefone
     */
    public void setFone(String fone) {
        this.fone = fone;
    }
    
    /**
     * Obtém Fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * Seta Fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }
    
    /**
     * Obtém E-mail
     */
    public String getEmail() {
        return email;
    }

    /**
     * Seta E-mail
     */
    public void setEmail(String email) {
        this.email = email;
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
    
    
}