package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * ICMS ST p/ UF Diversa
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C105"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class RegC105 extends Registro {

    /**
     * Tipo de operação
     * <p>0=Combustíveis e Lubrificantes;1=Leasing de veículos ou faturamento direto</p>
     */
    @Field(at = 2)
    private String oper;

    /**
     * UF
     */
    @Field(at = 3)
    private String codUf;


}
