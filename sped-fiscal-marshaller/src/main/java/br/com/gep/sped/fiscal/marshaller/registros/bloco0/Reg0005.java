package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Complemento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0005"),
    @Field(at = 11, name = "fimLinha")
})
public class Reg0005 extends Registro {
    
    @Field(at = 2)
    private String fantasia;
    
    @Field(at = 3)
    private String cep;
    
    @Field(at = 4)
    private String endereco;
    
    @Field(at = 5)
    private String num;
    
    @Field(at = 6)
    private String compl;
    
    @Field(at = 7)
    private String bairro;
    
    @Field(at = 8)
    private String fone;
    
    @Field(at = 9)
    private String fax;
    
    @Field(at = 10)
    private String email;
    
    /**
     * Obtém Nome de fantasia
     */
    public String getFantasia() {
        return fantasia;
    }

    /**
     * Seta Nome de fantasia
     */
    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
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
    
}