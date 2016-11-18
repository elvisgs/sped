package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Energia Elétrica/Água/Gás - NF consolidadas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C600"),
    @Field(at = 23, name = "fimLinha")
})
@Getter
@Setter
public class RegC600 extends Registro {

    /**
     * Código do modelo do documento
     * <p>06=Nota Fiscal/Conta de Energia Elétrica;28=Nota Fiscal/Conta de Fornecimento de Gás Canalizado;29=Nota Fiscal/Conta de Fornecimento de Água Canalizada</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Código do município
     */
    @Field(at = 3)
    private String codMun;

    /**
     * Série do documento fiscal
     */
    @Field(at = 4)
    private String ser;

    /**
     * Subsérie do documento fiscal
     */
    @Field(at = 5)
    private String sub;

    /**
     * Código da classe de consumo
     */
    @Field(at = 6)
    private String codCons;

    /**
     * Quant. doc. consolidados
     */
    @Field(at = 7)
    private Integer qtdCons;

    /**
     * Quant. doc. cancelados
     */
    @Field(at = 8)
    private Integer qtdCanc;

    /**
     * Data doc. consolidados
     */
    @Field(at = 9)
    private Date dtDoc;

    /**
     * Valor total
     */
    @Field(at = 10)
    private Double vlDoc;

    /**
     * Valor acumulado descontos
     */
    @Field(at = 11)
    private Double vlDesc;

    /**
     * Consumo total acumulado
     */
    @Field(at = 12)
    private Integer cons;

    /**
     * Valor acumulado do fornecimento
     */
    @Field(at = 13)
    private Double vlForn;

    /**
     * Valor acumulado serviços NT pelo ICMS
     */
    @Field(at = 14)
    private Double vlServNt;

    /**
     * Valores cobrados para terceiros
     */
    @Field(at = 15)
    private Double vlTerc;

    /**
     * Valor despesas acessórias
     */
    @Field(at = 16)
    private Double vlDa;

    /**
     * Base de cálculo do ICMS
     */
    @Field(at = 17)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 18)
    private Double vlIcms;

    /**
     * Base de cálculo do ICMS ST
     */
    @Field(at = 19)
    private Double vlBcIcmsSt;

    /**
     * Valor do ICMS ST
     */
    @Field(at = 20)
    private Double vlIcmsSt;

    /**
     * Valor do PIS
     */
    @Field(at = 21)
    private Double vlPis;

    /**
     * Valor da COFINS
     */
    @Field(at = 22)
    private Double vlCofins;


}