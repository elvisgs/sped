package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Complemento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0005"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class Reg0005 extends Registro {

    /**
     * Nome de fantasia
     */
    @Field(at = 2)
    private String fantasia;

    /**
     * CEP
     */
    @Field(at = 3)
    private String cep;

    /**
     * Logradouro
     */
    @Field(at = 4)
    private String endereco;

    /**
     * Número
     */
    @Field(at = 5)
    private String num;

    /**
     * Complemento
     */
    @Field(at = 6)
    private String compl;

    /**
     * Bairro
     */
    @Field(at = 7)
    private String bairro;

    /**
     * Telefone
     */
    @Field(at = 8)
    private String fone;

    /**
     * Fax
     */
    @Field(at = 9)
    private String fax;

    /**
     * Email
     */
    @Field(at = 10)
    private String email;


}
