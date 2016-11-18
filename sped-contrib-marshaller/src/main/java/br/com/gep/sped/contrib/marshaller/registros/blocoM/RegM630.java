package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M630 - Informações Adicionais de Diferimento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "M630"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class RegM630 extends Registro {

    /**
     * CNPJ da pessoa jurídica de direito público, empresa pública, sociedade de economia mista ou suas subsidiárias.
     */
    @Field(at = 2)
    private String cnpj;

    /**
     * Valor Total das vendas no período
     */
    @Field(at = 3)
    private Double vlVend;

    /**
     * Valor Total não recebido no período
     */
    @Field(at = 4)
    private Double vlNaoReceb;

    /**
     * Valor da Contribuição diferida no período
     */
    @Field(at = 5)
    private Double vlContDif;

    /**
     * Valor do Crédito diferido no período
     */
    @Field(at = 6)
    private Double vlCredDif;

    /**
     * Código de Tipo de Crédito diferido no período, conforme a Tabela 4.3.6
     */
    @Field(at = 7)
    private String codCred;


}