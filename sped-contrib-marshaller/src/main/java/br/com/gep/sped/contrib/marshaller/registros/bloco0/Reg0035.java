package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Identificação de Sociedades em Conta de Participação (SCP)
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0035"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class Reg0035 extends Registro {

    /**
     * Código de identificação do estabelecimento
     */
    @Field(at = 3)
    private String codScp;

    /**
     * Nome empresarial do estabelecimento
     */
    @Field(at = 2)
    private String nomeScp;

    /**
     * Informação Complementar do registro
     */
    @Field(at = 4)
    private String infComp;


}