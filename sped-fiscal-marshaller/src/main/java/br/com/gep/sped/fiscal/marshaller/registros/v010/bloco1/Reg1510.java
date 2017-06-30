package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Itens
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1510"),
    @Field(at = 22, name = "fimLinha")
})
@Getter
@Setter
public class Reg1510 extends Registro {

    /**
     * Número sequencial
     */
    @Field(at = 2)
    private String numItem;

    /**
     * Código do item
     */
    @Field(at = 3)
    private String codItem;

    /**
     * Código de classificação
     */
    @Field(at = 4)
    private String codClass;

    /**
     * Quantidade do item
     */
    @Field(at = 5)
    private Double qtd;

    /**
     * Unidade do item
     */
    @Field(at = 6)
    private String unid;

    /**
     * Valor do item
     */
    @Field(at = 7)
    private Double vlItem;

    /**
     * Valor total do desconto
     */
    @Field(at = 8)
    private Double vlDesc;

    /**
     * CST/ICMS
     */
    @Field(at = 9)
    private String cstIcms;

    /**
     * CFOP
     */
    @Field(at = 10)
    private String cfop;

    /**
     * Valor da base de cálculo do ICMS
     */
    @Field(at = 11)
    private Double vlBcIcms;

    /**
     * Alíquota do ICMS
     */
    @Field(at = 12)
    private Double aliqIcms;

    /**
     * Valor do ICMS creditado/debitado
     */
    @Field(at = 13)
    private Double vlIcms;

    /**
     * Valor da base de cálculo ST
     */
    @Field(at = 14)
    private Double vlBcIcmsSt;

    /**
     * Alíquota do ICMS da ST
     */
    @Field(at = 15)
    private Double aliqSt;

    /**
     * Valor do ICMS ST
     */
    @Field(at = 16)
    private Double vlIcmsSt;

    /**
     * Indicador do tipo de receita:
     * <p>0=Receita própria;1=Receita de terceiros</p>
     */
    @Field(at = 17)
    private String indRec;

    /**
     * Código do participante
     */
    @Field(at = 18)
    private String codPart;

    /**
     * Valor do PIS
     */
    @Field(at = 19)
    private Double vlPis;

    /**
     * Valor da COFINS
     */
    @Field(at = 20)
    private Double vlCofis;

    /**
     * Código da conta analítica contábil
     */
    @Field(at = 21)
    private String codCta;


}
