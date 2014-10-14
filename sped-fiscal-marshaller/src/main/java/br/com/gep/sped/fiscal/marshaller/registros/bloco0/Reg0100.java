package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Contabilista
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0100"),
    @Field(at = 15, name = "fimLinha", literal = "")
})
public class Reg0100 extends Registro {
    
    @Field(at = 2)
    private String nome;
    
    @Field(at = 3)
    private String cpf;
    
    @Field(at = 4)
    private String crc;
    
    @Field(at = 5)
    private String cnpj;
    
    @Field(at = 6)
    private String cep;
    
    @Field(at = 7)
    private String endereco;
    
    @Field(at = 8)
    private String num;
    
    @Field(at = 9)
    private String compl;
    
    @Field(at = 10)
    private String bairro;
    
    @Field(at = 11)
    private String fone;
    
    @Field(at = 12)
    private String fax;
    
    @Field(at = 13)
    private String email;
    
    @Field(at = 14)
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
     * Obtém Inscrição no CRC
     */
    public String getCrc() {
        return crc;
    }

    /**
     * Seta Inscrição no CRC
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
    public String getEndereco() {
        return endereco;
    }

    /**
     * Seta Logradouro
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
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
     * Obtém Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Seta Email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Obtém Codigo do município
     */
    public String getCodMun() {
        return codMun;
    }

    /**
     * Seta Codigo do município
     */
    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }
    
}