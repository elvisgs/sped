package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * NF / Conta de Energia Elétrica, Gás e Água
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C500"),
    @Field(at = 28, name = "fimLinha")
})
@Getter
@Setter
public class RegC500 extends Registro {

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
     * <p>06=Nota Fiscal/Conta de Energia Elétrica;28=Nota Fiscal/Conta de Fornecimento de Gás Canalizado;29=Nota Fiscal/Conta de Fornecimento de Água Canalizada</p>
     */
    @Field(at = 5)
    private String codMod;

    /**
     * Código da situação do documento
     * <p>00=Documento regular;01=Documento regular extemporâneo;02=Documento cancelado;03=Documento cancelado extemporâneo;06=Documento Fiscal Complementar;07=Documento Fiscal Complementar extemporâneo;08=Documento Fiscal emitido com base em Regime Especial ou Norma Específica</p>
     */
    @Field(at = 6)
    private String codSit;

    /**
     * Série
     */
    @Field(at = 7)
    private String ser;

    /**
     * Subsérie
     */
    @Field(at = 8)
    private String sub;

    /**
     * Classe de consumo energia/gás/água
     */
    @Field(at = 9)
    private String codCons;

    /**
     * Número do documento
     */
    @Field(at = 10)
    private String numDoc;

    /**
     * Data da emissão
     */
    @Field(at = 11)
    private Date dtDoc;

    /**
     * Data da entrada/saída
     */
    @Field(at = 12)
    private Date dtES;

    /**
     * Valor total do documento fiscal
     */
    @Field(at = 13)
    private Double vlDoc;

    /**
     * Valor total do desconto
     */
    @Field(at = 14)
    private Double vlDesc;

    /**
     * Valor total fornecido/consumido
     */
    @Field(at = 15)
    private Double vlForn;

    /**
     * Valor serviços não-tributados pelo ICMS
     */
    @Field(at = 16)
    private Double vlServNt;

    /**
     * Valor cobrado para terceiros
     */
    @Field(at = 17)
    private Double vlTerc;

    /**
     * Valor de despesas acessórias
     */
    @Field(at = 18)
    private Double vlDa;

    /**
     * Base de cálculo do ICMS
     */
    @Field(at = 19)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 20)
    private Double vlIcms;

    /**
     * Base de cálculo do ICMS ST
     */
    @Field(at = 21)
    private Double vlBcIcmsSt;

    /**
     * Valor do ICMS ST
     */
    @Field(at = 22)
    private Double vlIcmsSt;

    /**
     * Código inf complementar (doc fiscal)
     */
    @Field(at = 23)
    private String codInf;

    /**
     * Valor do PIS
     */
    @Field(at = 24)
    private Double vlPis;

    /**
     * Valor da COFINS
     */
    @Field(at = 25)
    private Double vlCofins;

    /**
     * Código de tipo de Ligação
     * <p>1=Monofásico;2=Bifásico;3=Trifásico</p>
     */
    @Field(at = 26)
    private String tpLigacao;

    /**
     * Código de grupo de tensão
     * <p>01=A1 - Alta Tensão (230kV ou mais);02=A2 - Alta Tensão (88 a 138kV);03=A3 - Alta Tensão (69kV);04=A3a - Alta Tensão (30kV a 44kV);05=A4 - Alta Tensão (2,3kV a 25kV);06=AS - Alta Tensão Subterrâneo 06;07=B1 - Residencial 07;08=B1 - Residencial Baixa Renda 08;09=B2 - Rural 09;10=B2 - Cooperativa de Eletrificação Rural;11=B2 - Serviço Público de Irrigação;12=B3 - Demais Classes;13=B4a - Iluminação Pública - rede de distribuição;14=B4b - Iluminação Pública - bulbo de lâmpada</p>
     */
    @Field(at = 27)
    private String codGrupoTensao;


}