package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Fatura
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C140"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class RegC140 extends Registro {

    /**
     * Emitente do título
     * <p>0=Emissão própria;1=Terceiros</p>
     */
    @Field(at = 2)
    private String indEmit;

    /**
     * Tipo do título
     * <p>00=Duplicata;01=Cheque;02=Promissória;03=Recibo;99=Outros (descrever)</p>
     */
    @Field(at = 3)
    private String indTit;

    /**
     * Descrição complementar
     */
    @Field(at = 4)
    private String descTit;

    /**
     * Número do título
     */
    @Field(at = 5)
    private String numTit;

    /**
     * Quantidade de parcelas
     */
    @Field(at = 6)
    private String qtdParc;

    /**
     * Valor total
     */
    @Field(at = 7)
    private Double vlTit;


}