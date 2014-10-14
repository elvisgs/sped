package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

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
    @Field(at = 1, name = "reg", rid = true, literal = "C115"),
    @Field(at = 11, name = "fimLinha", literal = "")
})
public class RegC115 extends Registro {
    
    @Field(at = 2)
    private String indCarga;
    
    @Field(at = 3)
    private String cnpjCol;
    
    @Field(at = 4)
    private String ieCol;
    
    @Field(at = 5)
    private String cpfCol;
    
    @Field(at = 6)
    private String codMunCol;
    
    @Field(at = 7)
    private String cnpjEntg;
    
    @Field(at = 8)
    private String ieEntg;
    
    @Field(at = 9)
    private String cpfEntg;
    
    @Field(at = 10)
    private String codMunEntg;
    
    /**
     * Obtém Tipo de carga
     */
    public String getIndCarga() {
        return indCarga;
    }

    /**
     * Seta Tipo de carga
     * <p>0=Rodoviário;1=Ferroviário;2=Rodo-Ferroviário;3=Aquaviário;4=Dutoviário;5=Aéreo;9=Outros</p>
     */
    public void setIndCarga(String indCarga) {
        this.indCarga = indCarga;
    }
    
    /**
     * Obtém CNPJ (coleta)
     */
    public String getCnpjCol() {
        return cnpjCol;
    }

    /**
     * Seta CNPJ (coleta)
     */
    public void setCnpjCol(String cnpjCol) {
        this.cnpjCol = cnpjCol;
    }
    
    /**
     * Obtém IE (coleta)
     */
    public String getIeCol() {
        return ieCol;
    }

    /**
     * Seta IE (coleta)
     */
    public void setIeCol(String ieCol) {
        this.ieCol = ieCol;
    }
    
    /**
     * Obtém CPF (coleta)
     */
    public String getCpfCol() {
        return cpfCol;
    }

    /**
     * Seta CPF (coleta)
     */
    public void setCpfCol(String cpfCol) {
        this.cpfCol = cpfCol;
    }
    
    /**
     * Obtém Código do Município (coleta)
     */
    public String getCodMunCol() {
        return codMunCol;
    }

    /**
     * Seta Código do Município (coleta)
     */
    public void setCodMunCol(String codMunCol) {
        this.codMunCol = codMunCol;
    }
    
    /**
     * Obtém CNPJ (entrega)
     */
    public String getCnpjEntg() {
        return cnpjEntg;
    }

    /**
     * Seta CNPJ (entrega)
     */
    public void setCnpjEntg(String cnpjEntg) {
        this.cnpjEntg = cnpjEntg;
    }
    
    /**
     * Obtém IE (entrega)
     */
    public String getIeEntg() {
        return ieEntg;
    }

    /**
     * Seta IE (entrega)
     */
    public void setIeEntg(String ieEntg) {
        this.ieEntg = ieEntg;
    }
    
    /**
     * Obtém CPF (entrega)
     */
    public String getCpfEntg() {
        return cpfEntg;
    }

    /**
     * Seta CPF (entrega)
     */
    public void setCpfEntg(String cpfEntg) {
        this.cpfEntg = cpfEntg;
    }
    
    /**
     * Obtém Código do Município (entrega)
     */
    public String getCodMunEntg() {
        return codMunEntg;
    }

    /**
     * Seta Código do Município (entrega)
     */
    public void setCodMunEntg(String codMunEntg) {
        this.codMunEntg = codMunEntg;
    }
    
}