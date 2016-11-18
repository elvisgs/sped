package br.com.gep.sped.contrib.marshaller.registros.blocoI;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * I300 - Complemento das Operações - Informações Complementares de Receitas, Deduções e/ou Exclusões
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "I300"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class RegI300 extends Registro {

    /**
     * Código do Complemento
     */
    @Field(at = 2)
    private String codComp;

    /**
     * Valor detalhado referente ao campo 02 deste registro
     */
    @Field(at = 3)
    private Double vlComp;

    /**
     * Conta Contábil
     */
    @Field(at = 4)
    private String codCta;

    /**
     * Informações Complementares
     */
    @Field(at = 5)
    private String infComp;


}