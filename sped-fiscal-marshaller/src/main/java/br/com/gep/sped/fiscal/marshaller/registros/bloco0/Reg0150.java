package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Participante
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0150"),
    @Field(at = 14, name = "fimLinha")
})
@Getter
@Setter
public class Reg0150 extends Registro {

    /**
     * Código do participante
     */
    @Field(at = 2)
    private String codPart;

    /**
     * Nome
     */
    @Field(at = 3)
    private String nome;

    /**
     * Código do país
     */
    @Field(at = 4)
    private String codPais;

    /**
     * CNPJ
     */
    @Field(at = 5)
    private String cnpj;

    /**
     * CPF
     */
    @Field(at = 6)
    private String cpf;

    /**
     * Inscrição Estadual
     */
    @Field(at = 7)
    private String ie;

    /**
     * Código do município
     */
    @Field(at = 8)
    private String codMun;

    /**
     * Inscrição na SUFRAMA
     */
    @Field(at = 9)
    private String suframa;

    /**
     * Logradouro
     */
    @Field(at = 10)
    private String endereco;

    /**
     * Número
     */
    @Field(at = 11)
    private String num;

    /**
     * Complemento
     */
    @Field(at = 12)
    private String compl;

    /**
     * Bairro
     */
    @Field(at = 13)
    private String bairro;


}