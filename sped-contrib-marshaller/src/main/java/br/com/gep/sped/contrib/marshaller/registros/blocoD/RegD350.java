package br.com.gep.sped.contrib.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * D350 - Resumo Diário de Cupom Fiscal Emitido por ECF - Prestação de Serviço
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D350"),
    @Field(at = 24, name = "fimLinha")
})
@Getter
@Setter
public class RegD350 extends Registro {

    /**
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     * <p>2E=D350 - Bilhete de Passagem emitido por ECF;13=D350 - Bilhete de Passagem Rodoviário;14=D350 - Bilhete de Passagem Aquaviário;15=D350 - Bilhete de Passagem e Nota de Bagagem;16=D350 - Bilhete de Passagem Ferroviário</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Modelo do equipamento
     */
    @Field(at = 3)
    private String ecfMod;

    /**
     * Número de série de fabricação do ECF
     */
    @Field(at = 4)
    private String ecfFab;

    /**
     * Data do movimento a que se refere a Redução Z
     */
    @Field(at = 5)
    private Date dtDoc;

    /**
     * Posição do Contador de Reinício de Operação
     */
    @Field(at = 6)
    private String cro;

    /**
     * Posição do Contador de Redução Z
     */
    @Field(at = 7)
    private String crz;

    /**
     * Número do Contador de Ordem de Operação do último documento emitido no dia. (Número do COO na Redução Z)
     */
    @Field(at = 8)
    private String numCooFin;

    /**
     * Valor do Grande Total final
     */
    @Field(at = 9)
    private Double gtFin;

    /**
     * Valor da venda bruta
     */
    @Field(at = 10)
    private Double vlBrt;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP
     */
    @Field(at = 11)
    private String cstPis;

    /**
     * Valor da base de cálculo do PIS/PASEP
     */
    @Field(at = 12)
    private Double vlBcPis;

    /**
     * Alíquota do PIS/PASEP (em percentual)
     */
    @Field(at = 13)
    private Double aliqPis;

    /**
     * Base de cálculo em quantidade PIS/PASEP
     */
    @Field(at = 14)
    private Double quantBcPis;

    /**
     * Alíquota do PIS/PASEP (em reais)
     */
    @Field(at = 15)
    private Double aliqPisQuant;

    /**
     * Valor do PIS/PASEP
     */
    @Field(at = 16)
    private Double vlPis;

    /**
     * Código da Situação Tributária referente a COFINS
     */
    @Field(at = 17)
    private String cstCofins;

    /**
     * Valor da base de cálculo da COFINS
     */
    @Field(at = 18)
    private Double vlBcCofins;

    /**
     * Alíquota da COFINS (em percentual)
     */
    @Field(at = 19)
    private Double aliqCofins;

    /**
     * Base de cálculo em quantidade COFINS
     */
    @Field(at = 20)
    private Double quantBcCofins;

    /**
     * Alíquota da COFINS (em reais)
     */
    @Field(at = 21)
    private Double aliqCofinsQuant;

    /**
     * Valor da COFINS
     */
    @Field(at = 22)
    private Double vlCofins;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 23)
    private String codCta;


}