package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * NF de Transporte e Conhecimentos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D100"),
    @Field(at = 24, name = "fimLinha")
})
@Getter
@Setter
public class RegD100 extends Registro {

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
     * <p>07=Nota Fiscal de Serviço de Transporte;08=Conhecimento de Transporte Rodoviário de Cargas;8B=Conhecimento de Transporte de Cargas Avulso;09=Conhecimento de Transporte Aquaviário de Cargas;10=Conhecimento Aéreo;11=Conhecimento de Transporte Ferroviário de Cargas;26=Conhecimento de Transporte Multimodal de Cargas;27=Nota Fiscal de Transporte Ferroviário de Cargas;57=Conhecimento de Transporte Eletrônico – CT-e</p>
     */
    @Field(at = 5)
    private String codMod;

    /**
     * Código da situação do documento
     * <p>00=Documento regular;01=Documento regular extemporâneo;02=Documento cancelado;03=Documento cancelado extemporâneo;04=NF-e ou CT-e denegada;05=NF-e ou CT-e Numeração inutilizada;06=Documento Fiscal Complementar;07=Documento Fiscal Complementar extemporâneo;08=Documento Fiscal emitido com base em Regime Especial ou Norma Específica</p>
     */
    @Field(at = 6)
    private String codSit;

    /**
     * Série do documento fiscal
     */
    @Field(at = 7)
    private String ser;

    /**
     * Subsérie do documento fiscal
     */
    @Field(at = 8)
    private String sub;

    /**
     * Número do documento fiscal
     */
    @Field(at = 9)
    private String numDoc;

    /**
     * Chave do conhecimento de transporte eletrônico
     */
    @Field(at = 10)
    private String chvCte;

    /**
     * Data da emissão
     */
    @Field(at = 11)
    private Date dtDoc;

    /**
     * Data da aquisição/prestação serviço
     */
    @Field(at = 12)
    private Date dtAP;

    /**
     * Tipo de CT-e
     */
    @Field(at = 13)
    private String tpCtE;

    /**
     * Chave do CT-e de Referência
     */
    @Field(at = 14)
    private String chvCteRef;

    /**
     * Valor total do documento fiscal
     */
    @Field(at = 15)
    private Double vlDoc;

    /**
     * Valor total do desconto
     */
    @Field(at = 16)
    private Double vlDesc;

    /**
     * Tipo do frete
     * <p>0=Por conta do emitente;1=Por conta do destinatário/remetente;2=Por conta de terceiros;9=Sem cobrança de frete</p>
     */
    @Field(at = 17)
    private String indFrt;

    /**
     * Valor total da prestação de serviço
     */
    @Field(at = 18)
    private Double vlServ;

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
     * Valor não-tributado
     */
    @Field(at = 21)
    private Double vlNt;

    /**
     * Código inf complementar (doc fiscal)
     */
    @Field(at = 22)
    private String codInf;

    /**
     * Código da conta analítica
     */
    @Field(at = 23)
    private String codCta;


}