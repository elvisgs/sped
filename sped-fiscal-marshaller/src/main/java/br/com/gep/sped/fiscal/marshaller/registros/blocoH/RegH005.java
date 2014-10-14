package br.com.gep.sped.fiscal.marshaller.registros.blocoH;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * TOTAIS DO INVENTÁRIO
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "H005"),
    @Field(at = 5, name = "fimLinha", literal = "")
})
public class RegH005 extends Registro {
    
    @Field(at = 2)
    private Date dtInv;
    
    @Field(at = 3)
    private Double vlInv;
    
    @Field(at = 4)
    private String motInv;
    
    /**
     * Obtém Data do inventário
     */
    public Date getDtInv() {
        return dtInv;
    }

    /**
     * Seta Data do inventário
     */
    public void setDtInv(Date dtInv) {
        this.dtInv = dtInv;
    }
    
    /**
     * Obtém Valor total do estoque
     */
    public Double getVlInv() {
        return vlInv;
    }

    /**
     * Seta Valor total do estoque
     */
    public void setVlInv(Double vlInv) {
        this.vlInv = vlInv;
    }
    
    /**
     * Obtém Informe o motivo do inventário
     */
    public String getMotInv() {
        return motInv;
    }

    /**
     * Seta Informe o motivo do inventário
     * <p>01=No final no período;02=Na mudança de forma de tributação da mercadoria (ICMS);03=Na solicitação da baixa cadastral, paralisação temporária;04=Na alteração de regime de pagamento – condição do contribuinte;05=Por determinação dos fiscos</p>
     */
    public void setMotInv(String motInv) {
        this.motInv = motInv;
    }
    
}