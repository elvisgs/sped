package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C100 - NF, NF Avulsa, NF de Produtor, NF-e e NFC-e
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C100"),
    @Field(at = 30, name = "fimLinha")
})
@Getter
@Setter
public class RegC100 extends Registro {

    /**
     * Indicador do tipo de operação
     * <p>0=Entrada;1=Saída</p>
     */
    @Field(at = 2)
    private String indOper;

    /**
     * Indicador do emitente do documento fiscal
     * <p>0=Emissão própria;1=Terceiros</p>
     */
    @Field(at = 3)
    private String indEmit;

    /**
     * Código do participante (campo 02 do Registro 0150): emitente do documento ou do remetente das mercadorias, no caso de entradas; adquirente, no caso de saídas
     */
    @Field(at = 4)
    private String codPart;

    /**
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     * <p>01=C100 - Nota Fiscal;1B=C100 - Nota Fiscal Avulsa;04=C100 - Nota Fiscal de Produtor;55=C100 - Nota Fiscal Eletrônica;65=C100 - Nota Fiscal do Consumidor Eletrônica</p>
     */
    @Field(at = 5)
    private String codMod;

    /**
     * Código da situação do documento fiscal
     * <p>00=Documento regular;01=Documento regular extemporâneo;02=Documento cancelado;03=Documento cancelado extemporâneo;04=Documento eletrônico denegado;05=Documento eletrônico com numeração inutilizada;06=Documento fiscal complementar;07=Documento fiscal complementar extemporâneo;08=Documento fiscal emitido com base em Regime Especial ou Norma Específica</p>
     */
    @Field(at = 6)
    private String codSit;

    /**
     * Série do documento fiscal
     */
    @Field(at = 7)
    private String ser;

    /**
     * Número do documento fiscal
     */
    @Field(at = 8)
    private String numDoc;

    /**
     * Chave da NF-e / NFC-e
     */
    @Field(at = 9)
    private String chvNfe;

    /**
     * Data da emissão do documento fiscal
     */
    @Field(at = 10)
    private Date dtDoc;

    /**
     * Data da entrada ou da saída
     */
    @Field(at = 11)
    private Date dtES;

    /**
     * Valor total do documento fiscal
     */
    @Field(at = 12)
    private Double vlDoc;

    /**
     * Indicador do tipo de pagamento
     * <p>0=À vista;1=A prazo;2=Outros</p>
     */
    @Field(at = 13)
    private String indPgto;

    /**
     * Valor total do desconto
     */
    @Field(at = 14)
    private Double vlDesc;

    /**
     * Abatimento não tributado e não comercial Ex. desconto ICMS nas remessas para ZFM
     */
    @Field(at = 15)
    private Double vlAbatNt;

    /**
     * Valor total das mercadorias e serviços
     */
    @Field(at = 16)
    private Double vlMerc;

    /**
     * Indicador do tipo do frete
     * <p>0=Por conta do emitente;1=Por conta do destinatário/remetente;2=Por conta de terceiros;9=Sem cobrança de frete</p>
     */
    @Field(at = 17)
    private String indFrt;

    /**
     * Valor do frete indicado no documento fiscal
     */
    @Field(at = 18)
    private Double vlFrt;

    /**
     * Valor do seguro indicado no documento fiscal
     */
    @Field(at = 19)
    private Double vlSeg;

    /**
     * Valor de outras despesas acessórias
     */
    @Field(at = 20)
    private Double vlOutDa;

    /**
     * Valor da base de cálculo do ICMS
     */
    @Field(at = 21)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 22)
    private Double vlIcms;

    /**
     * Valor da base de cálculo do ICMS substituição tributária
     */
    @Field(at = 23)
    private Double vlBcIcmsSt;

    /**
     * Valor do ICMS retido por substituição tributária
     */
    @Field(at = 24)
    private Double vlIcmsSt;

    /**
     * Valor total do IPI
     */
    @Field(at = 25)
    private Double vlIpi;

    /**
     * Valor total do PIS
     */
    @Field(at = 26)
    private Double vlPis;

    /**
     * Valor total da COFINS
     */
    @Field(at = 27)
    private Double vlCofins;

    /**
     * Valor total do PIS retido por substituição tributária
     */
    @Field(at = 28)
    private Double vlPisSt;

    /**
     * Valor total da COFINS retido por substituição tributária
     */
    @Field(at = 29)
    private Double vlCofinsSt;


}