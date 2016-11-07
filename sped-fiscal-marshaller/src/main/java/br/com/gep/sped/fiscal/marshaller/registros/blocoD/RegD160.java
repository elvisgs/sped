package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Carga Transportada
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D160"),
    @Field(at = 9, name = "fimLinha")
})
public class RegD160 extends Registro {
    
    @Field(at = 2)
    private String despacho;
    
    @Field(at = 3)
    private String cnpjCpfRem;
    
    @Field(at = 4)
    private String ieRem;
    
    @Field(at = 5)
    private String codMunOri;
    
    @Field(at = 6)
    private String cnpjCpfDest;
    
    @Field(at = 7)
    private String ieDest;
    
    @Field(at = 8)
    private String codMunDest;
    
    /**
     * Obtém Identificação do número do despacho
     */
    public String getDespacho() {
        return despacho;
    }

    /**
     * Seta Identificação do número do despacho
     */
    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }
    
    /**
     * Obtém CNPJ ou CPF do remetente
     */
    public String getCnpjCpfRem() {
        return cnpjCpfRem;
    }

    /**
     * Seta CNPJ ou CPF do remetente
     */
    public void setCnpjCpfRem(String cnpjCpfRem) {
        this.cnpjCpfRem = cnpjCpfRem;
    }
    
    /**
     * Obtém Inscrição Estadual do remetente
     */
    public String getIeRem() {
        return ieRem;
    }

    /**
     * Seta Inscrição Estadual do remetente
     */
    public void setIeRem(String ieRem) {
        this.ieRem = ieRem;
    }
    
    /**
     * Obtém Código do município de origem
     */
    public String getCodMunOri() {
        return codMunOri;
    }

    /**
     * Seta Código do município de origem
     */
    public void setCodMunOri(String codMunOri) {
        this.codMunOri = codMunOri;
    }
    
    /**
     * Obtém CNPJ ou CPF do destinatário
     */
    public String getCnpjCpfDest() {
        return cnpjCpfDest;
    }

    /**
     * Seta CNPJ ou CPF do destinatário
     */
    public void setCnpjCpfDest(String cnpjCpfDest) {
        this.cnpjCpfDest = cnpjCpfDest;
    }
    
    /**
     * Obtém Inscrição Estadual do destinatário
     */
    public String getIeDest() {
        return ieDest;
    }

    /**
     * Seta Inscrição Estadual do destinatário
     */
    public void setIeDest(String ieDest) {
        this.ieDest = ieDest;
    }
    
    /**
     * Obtém Código do município de destino
     */
    public String getCodMunDest() {
        return codMunDest;
    }

    /**
     * Seta Código do município de destino
     */
    public void setCodMunDest(String codMunDest) {
        this.codMunDest = codMunDest;
    }
    
}