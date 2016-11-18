package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Doc. Arrecadação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C112"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegC112 extends Registro {

    /**
     * Modelo do documento
     * <p>0=documento estadual de arrecadação;1=GNRE</p>
     */
    @Field(at = 2)
    private String codDa;

    /**
     * UF beneficiária
     */
    @Field(at = 3)
    private String uf;

    /**
     * Número do documento
     */
    @Field(at = 4)
    private String numDa;

    /**
     * Código autenticação bancária
     */
    @Field(at = 5)
    private String codAut;

    /**
     * Valor total do documento
     */
    @Field(at = 6)
    private Double vlDa;

    /**
     * Data de vencimento
     */
    @Field(at = 7)
    private Date dtVcto;

    /**
     * Data de pagamento
     */
    @Field(at = 8)
    private Date dtPgto;


}