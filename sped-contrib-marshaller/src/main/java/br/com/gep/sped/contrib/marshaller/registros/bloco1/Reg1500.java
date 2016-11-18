package br.com.gep.sped.contrib.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 1500 - Controle de Créditos Fiscais - COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1500"),
    @Field(at = 19, name = "fimLinha")
})
@Getter
@Setter
public class Reg1500 extends Registro {

    /**
     * Período de Apuração do Crédito (MM/AAAA)
     */
    @Field(at = 2)
    private String perApuCred;

    /**
     * Indicador da origem do crédito.
     * <p>01=Crédito decorrente de operações próprias;02=Crédito transferidos por pessoa jurídica sucedida</p>
     */
    @Field(at = 3)
    private String origCred;

    /**
     * CNPJ da pessoa jurídica cedente do crédito (se ORIG_CRED = 02).
     */
    @Field(at = 4)
    private String cnpjSuc;

    /**
     * Código do Tipo do Crédito, conforme Tabela 4.3.6
     */
    @Field(at = 5)
    private String codCred;

    /**
     * Valor do Crédito já apurado em Demonstrativo Dacon ou em Escrituração Fiscal Digital.
     */
    @Field(at = 6)
    private Double vlCredApu;

    /**
     * Valor de Crédito Extemporâneo Apurado (Registro 1501), referente a Período Anterior, Informado no Campo 02 - PER_APU_CRED
     */
    @Field(at = 7)
    private Double vlCredExtApu;

    /**
     * Valor Total do Crédito Apurado (06 + 07)
     */
    @Field(at = 8)
    private Double vlTotCredApu;

    /**
     * Valor do Crédito utilizado mediante Desconto, em Período(s)  Anterior(es)
     */
    @Field(at = 9)
    private Double vlCredDescPaAnt;

    /**
     * Valor do Crédito utilizado mediante Pedido de Ressarcimento, em Período(s) Anterior(es).
     */
    @Field(at = 10)
    private Double vlCredPerPaAnt;

    /**
     * Valor do Crédito utilizado mediante Declaração de Compensação Intermediária (Crédito de Exportação), em Período(s) Anterior(es)
     */
    @Field(at = 11)
    private Double vlCredDcompPaAnt;

    /**
     * Saldo do Crédito Disponível para Utilização neste  Período de Escrituração (08-09-10-11)
     */
    @Field(at = 12)
    private Double sdCredDispEfd;

    /**
     * Valor do Crédito descontado neste período de escrituração
     */
    @Field(at = 13)
    private Double vlCredDescEfd;

    /**
     * Valor do Crédito objeto de Pedido de Ressarcimento (PER) neste período de escrituração
     */
    @Field(at = 14)
    private Double vlCredPerEfd;

    /**
     * Valor do Crédito utilizado mediante Declaração de Compensação Intermediária neste período de escrituração
     */
    @Field(at = 15)
    private Double vlCredDcompEfd;

    /**
     * Valor do crédito transferido em evento de cisão, fusão ou incorporação
     */
    @Field(at = 16)
    private Double vlCredTrans;

    /**
     * Valor do crédito utilizado por outras formas
     */
    @Field(at = 17)
    private Double vlCredOut;

    /**
     * Saldo de créditos a utilizar em período de apuração futuro (12-13-14-15-16-17).
     */
    @Field(at = 18)
    private Double sldCredFim;


}