package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C505 - Complemento da operação - COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C505"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegC505 extends Registro {

    /**
     * Código da Situação Tributária referente a COFINS
     */
    @Field(at = 2)
    private String cstCofins;

    /**
     * Valor total dos itens
     */
    @Field(at = 3)
    private Double vlItem;

    /**
     * Código da Natureza da Base de Cálculo do Crédito, conforme a Tabela indicada no item 4.3.7
     * <p>01=Aquisição de bens para revenda;02=Aquisição de bens utilizados como insumo;04=Energia elétrica e térmica, inclusive sob a forma de vapor;13=Outras Operações com Direito a Crédito</p>
     */
    @Field(at = 4)
    private String natBcCred;

    /**
     * Valor da base de cálculo da COFINS
     */
    @Field(at = 5)
    private Double vlBcCofins;

    /**
     * Alíquota da COFINS (em percentual)
     */
    @Field(at = 6)
    private Double aliqCofins;

    /**
     * Valor da COFINS
     */
    @Field(at = 7)
    private Double vlCofins;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 8)
    private String codCta;


}