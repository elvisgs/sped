package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * NF, NF Avulsa, NF Produtor E NF-e
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
     * Tipo de operação
     * <p>0=Entrada;1=Saída</p>
     */
    @Field(at = 2)
    private String indOper;

    /**
     * Emitente
     * <p>0=Emissão própria;1=Terceiros</p>
     */
    @Field(at = 3)
    private String indEmit;

    /**
     * Código do participante
     */
    @Field(at = 4)
    private String codPart;

    /**
     * Código do modelo do documento
     * <p>01=Nota Fiscal;1B=Nota Fiscal Avulsa;04=Nota Fiscal de Produtor;55=Nota Fiscal Eletrônica;65=NF Eletrônica para consumidor final</p>
     */
    @Field(at = 5)
    private String codMod;

    /**
     * Código da situação do documento
     * <p>00=Documento regular;01=Documento regular extemporâneo;02=Documento cancelado;03=Documento cancelado extemporâneo;04=NFe, NFC-e ou CT-e denegado;05=NFe, NFC-e ou CT-e Numeração inutilizada;06=Documento Fiscal Complementar;07=Documento Fiscal Complementar extemporâneo;08=Documento Fiscal emitido com base em Regime Especial ou Norma Específica</p>
     */
    @Field(at = 6)
    private String codSit;

    /**
     * Série
     */
    @Field(at = 7)
    private String ser;

    /**
     * Número do documento
     */
    @Field(at = 8)
    private String numDoc;

    /**
     * Chave da NFe
     */
    @Field(at = 9)
    private String chvNfe;

    /**
     * Data da emissão
     */
    @Field(at = 10)
    private Date dtDoc;

    /**
     * Data da entrada ou saída
     */
    @Field(at = 11)
    private Date dtES;

    /**
     * Valor total do documento
     */
    @Field(at = 12)
    private Double vlDoc;

    /**
     * Tipo de pagamento
     * <p>0=A vista;1=A prazo;2=Outros</p>
     */
    @Field(at = 13)
    private String indPgto;

    /**
     * Valor do desconto
     */
    @Field(at = 14)
    private Double vlDesc;

    /**
     * Abatimento não tributado
     */
    @Field(at = 15)
    private Double vlAbatNt;

    /**
     * Valor das mercadorias
     */
    @Field(at = 16)
    private Double vlMerc;

    /**
     * Tipo do frete
     * <p>0=Por conta do emitente;1=Por conta do destinatário/remetente;2=Por conta de terceiros;9=Sem cobrança de frete</p>
     */
    @Field(at = 17)
    private String indFrt;

    /**
     * Valor do frete
     */
    @Field(at = 18)
    private Double vlFrt;

    /**
     * Valor do seguro
     */
    @Field(at = 19)
    private Double vlSeg;

    /**
     * Valor de outras despesas
     */
    @Field(at = 20)
    private Double vlOutDa;

    /**
     * Base de cálculo do ICMS
     */
    @Field(at = 21)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 22)
    private Double vlIcms;

    /**
     * Base de cálculo do ICMS ST
     */
    @Field(at = 23)
    private Double vlBcIcmsSt;

    /**
     * ICMS retido por ST
     */
    @Field(at = 24)
    private Double vlIcmsSt;

    /**
     * Valor do IPI
     */
    @Field(at = 25)
    private Double vlIpi;

    /**
     * Valor do PIS
     */
    @Field(at = 26)
    private Double vlPis;

    /**
     * Valor da COFINS
     */
    @Field(at = 27)
    private Double vlCofins;

    /**
     * PIS retido por ST
     */
    @Field(at = 28)
    private Double vlPisSt;

    /**
     * COFINS retido por ST
     */
    @Field(at = 29)
    private Double vlCofinsSt;


}