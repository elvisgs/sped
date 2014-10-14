package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Valores Agregados
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "1400"),
    @Field(at = 5, name = "fimLinha", literal = "")
})
public class Reg1400 extends Registro {
    
    @Field(at = 2)
    private String codItem;
    
    @Field(at = 3)
    private String mun;
    
    @Field(at = 4)
    private Double valor;
    
    /**
     * Obtém Código do item
     */
    public String getCodItem() {
        return codItem;
    }

    /**
     * Seta Código do item
     */
    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    
    /**
     * Obtém Código do município de origem
     */
    public String getMun() {
        return mun;
    }

    /**
     * Seta Código do município de origem
     */
    public void setMun(String mun) {
        this.mun = mun;
    }
    
    /**
     * Obtém Valor mensal
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Seta Valor mensal
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}