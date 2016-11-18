package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C600 - Consolidação de NF de Energia Elétrica, Água e Gás
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
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     * <p>01=C600 - Nota Fiscal;06=C600 - Nota Fiscal/Conta de Energia Elétrica;29=C600 - Nota Fiscal/Conta de Fornecimento de Água Canalizada;28=C600 - Nota Fiscal/Conta de Fornecimento de Gás Canalizado;55=C600 - Nota Fiscal Eletrônica</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Código do município dos pontos de consumo, conforme a tabela IBGE
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
     * Código de classe de consumo de energia elétrica, conforme a Tabela 4.4.5, ou Código de Consumo de Fornecimento D'água - Tabela 4.4.2 ou Código da classe de consumo de gás canalizado conforme Tabela 4.4.3
     */
    @Field(at = 6)
    private String codCons;

    /**
     * Quantidade de documentos consolidados neste registro
     */
    @Field(at = 7)
    private Integer qtdCons;

    /**
     * Quantidade de documentos cancelados
     */
    @Field(at = 8)
    private Integer qtdCanc;

    /**
     * Data dos documentos consolidados
     */
    @Field(at = 9)
    private Date dtDoc;

    /**
     * Valor total dos documentos
     */
    @Field(at = 10)
    private Double vlDoc;

    /**
     * Valor acumulado dos descontos
     */
    @Field(at = 11)
    private Double vlDesc;

    /**
     * Consumo total acumulado, em kWh (Código 06)
     */
    @Field(at = 12)
    private Integer cons;

    /**
     * Valor acumulado do fornecimento
     */
    @Field(at = 13)
    private Double vlForn;

    /**
     * Valor acumulado dos serviços não-tributados pelo ICMS
     */
    @Field(at = 14)
    private Double vlServNt;

    /**
     * Valores cobrados em nome de terceiros
     */
    @Field(at = 15)
    private Double vlTerc;

    /**
     * Valor acumulado das despesas acessórias
     */
    @Field(at = 16)
    private Double vlDa;

    /**
     * Valor acumulado da base de cálculo do ICMS
     */
    @Field(at = 17)
    private Double vlBcIcms;

    /**
     * Valor acumulado do ICMS
     */
    @Field(at = 18)
    private Double vlIcms;

    /**
     * Valor acumulado da base de cálculo do ICMS substituição tributária
     */
    @Field(at = 19)
    private Double vlBcIcmsSt;

    /**
     * Valor acumulado do ICMS retido por substituição tributária
     */
    @Field(at = 20)
    private Double vlIcmsSt;

    /**
     * Valor acumulado do PIS/PASEP
     */
    @Field(at = 21)
    private Double vlPis;

    /**
     * Valor acumulado da COFINS
     */
    @Field(at = 22)
    private Double vlCofins;


}