package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Volume de Vendas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1320"),
    @Field(at = 12, name = "fimLinha")
})
@Getter
@Setter
public class Reg1320 extends Registro {

    /**
     * Bico ligado à bomba
     */
    @Field(at = 2)
    private Integer numBico;

    /**
     * Número da intervenção
     */
    @Field(at = 3)
    private Integer nrInterv;

    /**
     * Motivo da intervenção
     */
    @Field(at = 4)
    private String motInterv;

    /**
     * Nome do interventor
     */
    @Field(at = 5)
    private String nomInterv;

    /**
     * CNPJ da empresa responsável pela intervenção
     */
    @Field(at = 6)
    private String cnpjInterv;

    /**
     * CPF do técnico responsável pela intervenção
     */
    @Field(at = 7)
    private String cpfInterv;

    /**
     * Valor da leitura final do contador, no fechamento do bico
     */
    @Field(at = 8)
    private Double valFecha;

    /**
     * Valor da leitura inicial do contador, na abertura do bico
     */
    @Field(at = 9)
    private Double valAbert;

    /**
     * Aferição da bomba, em litros
     */
    @Field(at = 10)
    private Double volAferi;

    /**
     * Venda (08 - 09 - 10) do bico, em litros
     */
    @Field(at = 11)
    private Double volVendas;


}