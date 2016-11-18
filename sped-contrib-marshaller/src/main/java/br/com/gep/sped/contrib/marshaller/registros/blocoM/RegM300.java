package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * M300 - Contribuição de PIS/PASEP Diferida em Períodos Anteriores - Valores a Pagar no Período
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "M300"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegM300 extends Registro {

    /**
     * Código da contribuição  social diferida em períodos anteriores , conforme a Tabela 4.3.5
     */
    @Field(at = 2)
    private String codCont;

    /**
     * Valor da Contribuição Apurada, diferida em períodos anteriores
     */
    @Field(at = 3)
    private Double vlContApurDifer;

    /**
     * Natureza do Crédito Diferido, vinculado a receita tributada no mercado interno, a descontar:01 - Crédito a Alíquota Básica;02 - Crédito a Alíquota Diferenciada;03 - Crédito a Alíquota por Unidade de Produto;04 Crédito Presumido da Agroindústria.
     * <p>01=Crédito a Alíquota Básica;02=Crédito a Alíquota Diferenciada;03=Crédito a Alíquota por Unidade de Produto;04=Crédito Presumido da Agroindústria</p>
     */
    @Field(at = 4)
    private String natCredDesc;

    /**
     * Valor do Crédito a Descontar vinculado à contribuição diferida
     */
    @Field(at = 5)
    private Double vlCredDescDifer;

    /**
     * Valor da Contribuição a Recolher, diferida em períodos anteriores (Campo 03 – Campo 05)
     */
    @Field(at = 6)
    private Double vlContDiferAnt;

    /**
     * Período de apuração da contribuição social e dos créditos diferidos (MMAAAA)
     */
    @Field(at = 7)
    private String perApur;

    /**
     * Data de recebimento da receita, objeto de diferimento
     */
    @Field(at = 8)
    private Date dtReceb;


}