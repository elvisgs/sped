package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Local Coleta/Entrega
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "D161"),
    @Field(at = 9, name = "fimLinha", literal = "")
})
public class RegD161 extends Registro {
    
    @Field(at = 2)
    private String indCarga;
    
    @Field(at = 3)
    private String cnpjCpfCol;
    
    @Field(at = 4)
    private String ieCol;
    
    @Field(at = 5)
    private String codMunCol;
    
    @Field(at = 6)
    private String cnpjCpfEntg;
    
    @Field(at = 7)
    private String ieEntg;
    
    @Field(at = 8)
    private String codMunEntg;
    
    /**
     * Obtém Tipo de transporte
     */
    public String getIndCarga() {
        return indCarga;
    }

    /**
     * Seta Tipo de transporte
     * <p>0=Rodoviário;1=Ferroviário;2=Rodo-Ferroviário;3=Aquaviário;4=Dutoviário;5=Aéreo;9=Outros</p>
     */
    public void setIndCarga(String indCarga) {
        this.indCarga = indCarga;
    }
    
    /**
     * Obtém CNPJ ou CPF do contribuinte na coleta
     */
    public String getCnpjCpfCol() {
        return cnpjCpfCol;
    }

    /**
     * Seta CNPJ ou CPF do contribuinte na coleta
     */
    public void setCnpjCpfCol(String cnpjCpfCol) {
        this.cnpjCpfCol = cnpjCpfCol;
    }
    
    /**
     * Obtém Inscrição Estadual na coleta
     */
    public String getIeCol() {
        return ieCol;
    }

    /**
     * Seta Inscrição Estadual na coleta
     */
    public void setIeCol(String ieCol) {
        this.ieCol = ieCol;
    }
    
    /**
     * Obtém Código do município na coleta
     */
    public String getCodMunCol() {
        return codMunCol;
    }

    /**
     * Seta Código do município na coleta
     */
    public void setCodMunCol(String codMunCol) {
        this.codMunCol = codMunCol;
    }
    
    /**
     * Obtém CNPJ ou CPF do contribuinte na entrega
     */
    public String getCnpjCpfEntg() {
        return cnpjCpfEntg;
    }

    /**
     * Seta CNPJ ou CPF do contribuinte na entrega
     */
    public void setCnpjCpfEntg(String cnpjCpfEntg) {
        this.cnpjCpfEntg = cnpjCpfEntg;
    }
    
    /**
     * Obtém Inscrição Estadual na entrega
     */
    public String getIeEntg() {
        return ieEntg;
    }

    /**
     * Seta Inscrição Estadual na entrega
     */
    public void setIeEntg(String ieEntg) {
        this.ieEntg = ieEntg;
    }
    
    /**
     * Obtém Código do município na entrega
     */
    public String getCodMunEntg() {
        return codMunEntg;
    }

    /**
     * Seta Código do município na entrega
     */
    public void setCodMunEntg(String codMunEntg) {
        this.codMunEntg = codMunEntg;
    }
    
}