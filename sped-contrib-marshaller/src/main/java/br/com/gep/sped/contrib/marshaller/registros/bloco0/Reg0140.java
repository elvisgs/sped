package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 0140 - Cadastro de Estabelecimentos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0140"),
    @Field(at = 10, name = "fimLinha")
})
@Getter
@Setter
public class Reg0140 extends Registro {

    /**
     * Codigo de identificação do estabelecimento
     */
    @Field(at = 2)
    private String codEst;

    /**
     * Nome empresarial do estabelecimento
     */
    @Field(at = 3)
    private String nome;

    /**
     * Número de inscrição do estabelecimento no CNPJ
     */
    @Field(at = 4)
    private String cnpj;

    /**
     * Sigla da unidade da federação do estabelecimento
     */
    @Field(at = 5)
    private String uf;

    /**
     * Inscrição Estadual do estabelecimento, se contribuinte de ICMS
     */
    @Field(at = 6)
    private String ie;

    /**
     * Código do município do domicílio fiscal do estabelecimento, conforme a tabela IBGE
     */
    @Field(at = 7)
    private String codMun;

    /**
     * Inscrição Municipal do estabelecimento, se contribuinte do ISS
     */
    @Field(at = 8)
    private String im;

    /**
     * Inscrição do estabelecimento na Suframa
     */
    @Field(at = 9)
    private String suframa;


}