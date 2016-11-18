package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C396 - Itens do Documento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C396"),
    @Field(at = 15, name = "fimLinha")
})
@Getter
@Setter
public class RegC396 extends Registro {

    /**
     * Código do item (campo 02 do Registro 0200)
     */
    @Field(at = 2)
    private String codItem;

    /**
     * Valor total do item (mercadorias ou serviços)
     */
    @Field(at = 3)
    private Double vlItem;

    /**
     * Valor do desconto comercial do item
     */
    @Field(at = 4)
    private Double vlDesc;

    /**
     * Código da Natureza da Base de Cálculo do Crédito, conforme a Tabela indicada no item 4.3.7
     * <p>01=Aquisição de bens para revenda;02=Aquisição de bens utilizados como insumo;10=Máquinas, equipamentos e outros bens incorporados ao ativo imobilizado (crédito com base no valor de aquisição);13=Outras Operações com Direito a Crédito</p>
     */
    @Field(at = 5)
    private String natBcCred;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP
     */
    @Field(at = 6)
    private String cstPis;

    /**
     * Valor da base de cálculo do credito de PIS/PASEP
     */
    @Field(at = 7)
    private Double vlBcPis;

    /**
     * Alíquota do PIS/PASEP (em percentual)
     */
    @Field(at = 8)
    private Double aliqPis;

    /**
     * Valor do crédito de PIS/PASEP
     */
    @Field(at = 9)
    private Double vlPis;

    /**
     * Código da Situação Tributária referente a COFINS
     */
    @Field(at = 10)
    private String cstCofins;

    /**
     * Valor da base de cálculo do crédito de COFINS
     */
    @Field(at = 11)
    private Double vlBcCofins;

    /**
     * Alíquota da COFINS (em percentual)
     */
    @Field(at = 12)
    private Double aliqCofins;

    /**
     * Valor do crédito de COFINS
     */
    @Field(at = 13)
    private Double vlCofins;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 14)
    private String codCta;


}