package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * F800 - Créditos Decorrentes de Eventos de Incorporação, Fusão e Cisão
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "F800"),
    @Field(at = 10, name = "fimLinha")
})
@Getter
@Setter
public class RegF800 extends Registro {

    /**
     * Indicador da Natureza do Evento de Sucessão
     * <p>01=Incorporação;02=Fusão;03=Cisão Total;04=Cisão Parcial;99=Outros</p>
     */
    @Field(at = 2)
    private String indNatEven;

    /**
     * Data do Evento
     */
    @Field(at = 3)
    private Date dtEven;

    /**
     * CNPJ da Pessoa Jurídica Sucedida
     */
    @Field(at = 4)
    private String cnpjSuced;

    /**
     * Período de Apuração do Crédito - Mês/Ano (MM/AAAA)
     */
    @Field(at = 5)
    private String paContCred;

    /**
     * Código do crédito transferido, conforme Tabela 4.3.6
     */
    @Field(at = 6)
    private String codCred;

    /**
     * Valor do Crédito Transferido de PIS/PASEP
     */
    @Field(at = 7)
    private Double vlCredPis;

    /**
     * Valor do Crédito Transferido de Cofins
     */
    @Field(at = 8)
    private Double vlCredCofins;

    /**
     * Percentual do crédito original transferido, no caso de evento de Cisão.
     */
    @Field(at = 9)
    private Double perCredCis;


}