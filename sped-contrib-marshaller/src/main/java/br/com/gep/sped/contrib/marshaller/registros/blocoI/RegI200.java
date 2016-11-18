package br.com.gep.sped.contrib.marshaller.registros.blocoI;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * I200 - Detalhamento das Receitas, Deduções e/ou Exclusões do Período
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "I200"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class RegI200 extends Registro {

    /**
     * Número do Campo do registro I100 objeto de detalhamento
     * <p>02=Receitas;04=Deduções e Exclusões Gerais;05=Deduções e Exclusões Específicas</p>
     */
    @Field(at = 2)
    private String numCampo;

    /**
     * Código do Tipo de Detalhamento
     */
    @Field(at = 3)
    private String codDet;

    /**
     * Valor detalhado referente ao campo 02 deste registro
     */
    @Field(at = 4)
    private Double vlDet;

    /**
     * Código da conta contábil referente ao valor informado no campo 04
     */
    @Field(at = 5)
    private String codCta;

    /**
     * Informações Complementares
     */
    @Field(at = 6)
    private String infComp;


}