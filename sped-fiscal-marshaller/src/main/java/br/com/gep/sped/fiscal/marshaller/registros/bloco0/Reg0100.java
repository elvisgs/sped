package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Contabilista
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0100"),
    @Field(at = 15, name = "fimLinha")
})
@Getter
@Setter
public class Reg0100 extends Registro {

    /**
     * Nome do contabilista
     */
    @Field(at = 2)
    private String nome;

    /**
     * CPF
     */
    @Field(at = 3)
    private String cpf;

    /**
     * Inscrição no CRC
     */
    @Field(at = 4)
    private String crc;

    /**
     * CNPJ
     */
    @Field(at = 5)
    private String cnpj;

    /**
     * CEP
     */
    @Field(at = 6)
    private String cep;

    /**
     * Logradouro
     */
    @Field(at = 7)
    private String endereco;

    /**
     * Número
     */
    @Field(at = 8)
    private String num;

    /**
     * Complemento
     */
    @Field(at = 9)
    private String compl;

    /**
     * Bairro
     */
    @Field(at = 10)
    private String bairro;

    /**
     * Telefone
     */
    @Field(at = 11)
    private String fone;

    /**
     * Fax
     */
    @Field(at = 12)
    private String fax;

    /**
     * Email
     */
    @Field(at = 13)
    private String email;

    /**
     * Codigo do município
     */
    @Field(at = 14)
    private String codMun;


}