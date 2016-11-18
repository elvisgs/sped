package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Alterações
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0175"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class Reg0175 extends Registro {

    /**
     * Data de alteração
     */
    @Field(at = 2)
    private Date dtAlt;

    /**
     * Número do campo alterado
     * <p>03=Nome;04=Código do País;05=CNPJ;06=CPF;08=Código do Município;09=Inscrição na Suframa;10=Logradouro;11=Número;12=Complemento;13=Bairro;</p>
     */
    @Field(at = 3)
    private String nrCampo;

    /**
     * Conteúdo anterior
     */
    @Field(at = 4)
    private String contAnt;


}