package br.com.gep.sped.fiscal.marshaller.registros.v011.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Ressarcimento em ST
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C176"),
    @Field(at = 27, name = "fimLinha")
})
@Getter
@Setter
public class RegC176 extends Registro {

    /**
     * Código do modelo do documento fiscal relativo à última entrada
     * <p>01=Nota Fiscal;55=Nota Fiscal Eletrônica</p>
     */
    @Field(at = 2)
    private String codModUltE;

    /**
     * Número do documento fiscal relativo à última entrada
     */
    @Field(at = 3)
    private String numDocUltE;

    /**
     * Série do documento fiscal relativa à última entrada
     */
    @Field(at = 4)
    private String serUltE;

    /**
     * Data relativa à última entrada da mercadoria
     */
    @Field(at = 5)
    private Date dtUltE;

    /**
     * Código do participante (do emitente do documento relativo à última entrada)
     */
    @Field(at = 6)
    private String codPartUltE;

    /**
     * Quantidade do item relativa à última entrada
     */
    @Field(at = 7)
    private Double quantUltE;

    /**
     * Valor unitário da mercadoria constante na NF relativo à última entrada inclusive despesas acessórias
     */
    @Field(at = 8)
    private Double vlUnitUltE;

    /**
     * Valor unitário da base de cálculo do imposto pago por substituição
     */
    @Field(at = 9)
    private Double vlUnitBcSt;

    /**
     * Número completo da chave da NFe relativo à última entrada
     */
    @Field(at = 10)
    private String chaveNfeUltE;

    /**
     * Número sequencial do item na NF entrada que corresponde à mercadoria objeto de pedido de ressarcimento
     */
    @Field(at = 11)
    private String numItemUltE;

    /**
     * Valor unitário da base de cálculo da operação própria do remetente sob o regime comum de tributação
     */
    @Field(at = 12)
    private Double vlUnitBcIcmsUltE;

    /**
     * Alíquota do ICMS aplicável à última entrada da mercadoria
     */
    @Field(at = 13)
    private Double aliqIcmsUltE;

    /**
     * Valor unitário da base de cálculo do ICMS relativo à última entrada da mercadoria, limitado ao valor da BC da retenção (corresponde ao menor valor entre os campos VL_UNIT_BC_ST e VL_UNIT_BC_ICMS_ULT_E )
     */
    @Field(at = 14)
    private Double vlUnitLimiteBcIcmsUltE;

    /**
     * Valor unitário do crédito de ICMS sobre operações próprias do remetente, relativo à última entrada da mercadoria, decorrente da quebra da ST – equivalente a multiplicação entre os campos 13 e 14
     */
    @Field(at = 15)
    private Double vlUnitIcmsUltE;

    /**
     * Alíquota do ICMS ST relativa à última entrada da mercadoria
     */
    @Field(at = 16)
    private Double aliqStUltE;

    /**
     * Valor unitário do ressarcimento (parcial ou completo) de ICMS decorrente da quebra da ST
     */
    @Field(at = 17)
    private Double vlUnitRes;

    /**
     * Código que indica o responsável pela retenção do ICMS-ST
     * <p>1=Remetente Direto;2=Remetente Indireto;3=Próprio declarante</p>
     */
    @Field(at = 18)
    private String codRespRet;

    /**
     * Código do motivo do ressarcimento
     * <p>1=Venda para outra UF;2=Saída amparada por isenção ou não incidência;3=Perda ou deterioração;4=Furto ou roubo;9=Outros</p>
     */
    @Field(at = 19)
    private String codMotRes;

    /**
     * Número completo da chave da NF-e emitida pelo substituto, na qual consta o valor do ICMS-ST retido
     */
    @Field(at = 20)
    private String chaveNfeRet;

    /**
     * Código do participante do emitente da NF-e em que houve a retenção do ICMS-ST – campo 02 do registro 0150
     */
    @Field(at = 21)
    private String codPartNfeRet;

    /**
     * Série da NF-e em que houve a retenção do ICMS-ST
     */
    @Field(at = 22)
    private String serNfeRet;

    /**
     * Número da NF-e em que houve a retenção do ICMS-ST
     */
    @Field(at = 23)
    private String numNfeRet;

    /**
     * Número sequencial do item na NF-e em que houve a retenção do ICMS-ST, que corresponde à mercadoria objeto de pedido de ressarcimento
     */
    @Field(at = 24)
    private String itemNfeRet;

    /**
     * Código do modelo do documento de arrecadação
     * <p>0=Documento estadual de arrecadação;1=GNRE</p>
     */
    @Field(at = 25)
    private String codDa;

    /**
     * Número do documento de arrecadação estadual, se houver
     */
    @Field(at = 26)
    private String numDa;


}
