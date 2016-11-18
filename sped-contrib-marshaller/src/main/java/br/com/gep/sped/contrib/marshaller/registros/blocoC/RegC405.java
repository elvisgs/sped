package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C405 - Redução Z
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C405"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class RegC405 extends Registro {

    /**
     * Data do movimento a que se refere a Redução Z
     */
    @Field(at = 2)
    private Date dtDoc;

    /**
     * Posição do Contador de Reinício de Operação
     */
    @Field(at = 3)
    private String cro;

    /**
     * Posição do Contador de Redução Z
     */
    @Field(at = 4)
    private String crz;

    /**
     * Número do Contador de Ordem de Operação do último documento emitido no dia (Número do COO na Redução Z)
     */
    @Field(at = 5)
    private String numCooFin;

    /**
     * Valor do Grande Total final
     */
    @Field(at = 6)
    private Double gtFin;

    /**
     * Valor da venda bruta
     */
    @Field(at = 7)
    private Double vlBrt;


}