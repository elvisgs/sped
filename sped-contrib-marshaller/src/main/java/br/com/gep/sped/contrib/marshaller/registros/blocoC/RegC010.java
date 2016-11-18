package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C010 - Estabelecimento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C010"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class RegC010 extends Registro {

    /**
     * Número de inscrição do estabelecimento no CNPJ
     */
    @Field(at = 2)
    private String cnpj;

    /**
     * Indicador da apuração das contribuições e créditos, na escrituração das operações por NF-e e ECF, no período
     * <p>1=Apuração com base nos registros de consolidação das operações por NF-e (C180 e C190) e por ECF (C490);2=Apuração com base no registro individualizado de NF-e (C100 e C170) e de ECF (C400)</p>
     */
    @Field(at = 3)
    private String indEscri;


}