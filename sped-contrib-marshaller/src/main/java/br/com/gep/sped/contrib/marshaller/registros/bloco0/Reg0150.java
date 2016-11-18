package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 0150 - Cadastro de Participante
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
     * Código de identificação do participante no arquivo
     */
    @Field(at = 2)
    private String codPart;

    /**
     * Nome pessoal ou empresarial do participante
     */
    @Field(at = 3)
    private String nome;

    /**
     * Código do país do participante, conforme a tabela indicada no item 3.2.1
     */
    @Field(at = 4)
    private String codPais;

    /**
     * CNPJ do participante
     */
    @Field(at = 5)
    private String cnpj;

    /**
     * CPF do participante
     */
    @Field(at = 6)
    private String cpf;

    /**
     * Inscrição Estadual do participante
     */
    @Field(at = 7)
    private String ie;

    /**
     * Código do município, conforme a tabela IBGE
     */
    @Field(at = 8)
    private String codMun;

    /**
     * Número de inscrição do participante na Suframa
     */
    @Field(at = 9)
    private String suframa;

    /**
     * Logradouro e endereço do imóvel
     */
    @Field(at = 10)
    private String end;

    /**
     * Número do imóvel
     */
    @Field(at = 11)
    private String num;

    /**
     * Dados complementares do endereço
     */
    @Field(at = 12)
    private String compl;

    /**
     * Bairro em que o imóvel está situado
     */
    @Field(at = 13)
    private String bairro;


}