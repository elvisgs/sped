package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Bens/Componentes do Ativo Imobilizado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0300"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class Reg0300 extends Registro {

    /**
     * Código do bem
     */
    @Field(at = 2)
    private String codIndBem;

    /**
     * Tipo de mercadoria
     * <p>1=bem;2=componente</p>
     */
    @Field(at = 3)
    private String identMerc;

    /**
     * Descrição do bem
     */
    @Field(at = 4)
    private String descrItem;

    /**
     * Código do bem principal
     */
    @Field(at = 5)
    private String codPrnc;

    /**
     * Código da conta
     */
    @Field(at = 6)
    private String codCta;

    /**
     * Número de parcelas
     */
    @Field(at = 7)
    private String nrParc;


}