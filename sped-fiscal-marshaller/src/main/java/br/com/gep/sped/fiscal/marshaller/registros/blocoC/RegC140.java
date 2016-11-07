package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Fatura
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C140"),
    @Field(at = 8, name = "fimLinha")
})
public class RegC140 extends Registro {
    
    @Field(at = 2)
    private String indEmit;
    
    @Field(at = 3)
    private String indTit;
    
    @Field(at = 4)
    private String descTit;
    
    @Field(at = 5)
    private String numTit;
    
    @Field(at = 6)
    private String qtdParc;
    
    @Field(at = 7)
    private Double vlTit;
    
    /**
     * Obtém Emitente do título
     */
    public String getIndEmit() {
        return indEmit;
    }

    /**
     * Seta Emitente do título
     * <p>0=Emissão própria;1=Terceiros</p>
     */
    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }
    
    /**
     * Obtém Tipo do título
     */
    public String getIndTit() {
        return indTit;
    }

    /**
     * Seta Tipo do título
     * <p>00=Duplicata;01=Cheque;02=Promissória;03=Recibo;99=Outros (descrever)</p>
     */
    public void setIndTit(String indTit) {
        this.indTit = indTit;
    }
    
    /**
     * Obtém Descrição complementar
     */
    public String getDescTit() {
        return descTit;
    }

    /**
     * Seta Descrição complementar
     */
    public void setDescTit(String descTit) {
        this.descTit = descTit;
    }
    
    /**
     * Obtém Número do título
     */
    public String getNumTit() {
        return numTit;
    }

    /**
     * Seta Número do título
     */
    public void setNumTit(String numTit) {
        this.numTit = numTit;
    }
    
    /**
     * Obtém Quantidade de parcelas
     */
    public String getQtdParc() {
        return qtdParc;
    }

    /**
     * Seta Quantidade de parcelas
     */
    public void setQtdParc(String qtdParc) {
        this.qtdParc = qtdParc;
    }
    
    /**
     * Obtém Valor total
     */
    public Double getVlTit() {
        return vlTit;
    }

    /**
     * Seta Valor total
     */
    public void setVlTit(Double vlTit) {
        this.vlTit = vlTit;
    }
    
}