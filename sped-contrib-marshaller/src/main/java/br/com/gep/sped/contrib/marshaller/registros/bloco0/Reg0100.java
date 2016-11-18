package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 0100 - Dados do Contabilista
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
     * Número de inscrição do contabilista no CPF
     */
    @Field(at = 3)
    private String cpf;

    /**
     * Número de inscrição do contabilista no Conselho Regional de Contabilidade
     */
    @Field(at = 4)
    private String crc;

    /**
     * Número de inscrição do escritório de contabilidade no CNPJ, se houver
     */
    @Field(at = 5)
    private String cnpj;

    /**
     * Código de Endereçamento Postal
     */
    @Field(at = 6)
    private String cep;

    /**
     * Logradouro e endereço do imóvel
     */
    @Field(at = 7)
    private String end;

    /**
     * Número do imóvel
     */
    @Field(at = 8)
    private String num;

    /**
     * Dados complementares do endereço
     */
    @Field(at = 9)
    private String compl;

    /**
     * Bairro em que o imóvel está situado
     */
    @Field(at = 10)
    private String bairro;

    /**
     * Número do telefone
     */
    @Field(at = 11)
    private String fone;

    /**
     * Número do fax
     */
    @Field(at = 12)
    private String fax;

    /**
     * Endereço do correio eletrônico
     */
    @Field(at = 13)
    private String email;

    /**
     * Código do município, conforme tabela IBGE
     */
    @Field(at = 14)
    private String codMun;


}