package br.com.gep.sped.contrib.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * D501 - Complemento da Operação - PIS/PASEP
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D501"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegD501 extends Registro {

    /**
     * Código da Situação Tributária referente ao PIS/PASEP
     */
    @Field(at = 2)
    private String cstPis;

    /**
     * Valor Total dos Itens  (Serviços)
     */
    @Field(at = 3)
    private Double vlItem;

    /**
     * Código da Natureza da Base de Cálculo do Crédito, conforme a Tabela indicada no item 4.3.7
     * <p>01=Aquisição de bens para revenda;03=Aquisição de serviços utilizados como insumo;13=Outras Operações com Direito a Crédito</p>
     */
    @Field(at = 4)
    private String natBcCred;

    /**
     * Valor da base de cálculo do PIS/PASEP
     */
    @Field(at = 5)
    private Double vlBcPis;

    /**
     * Alíquota do PIS/PASEP (em percentual)
     */
    @Field(at = 6)
    private Double aliqPis;

    /**
     * Valor do PIS/PASEP
     */
    @Field(at = 7)
    private Double vlPis;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 8)
    private String codCta;


}