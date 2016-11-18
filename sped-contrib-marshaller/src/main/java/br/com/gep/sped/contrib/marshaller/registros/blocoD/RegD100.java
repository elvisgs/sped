package br.com.gep.sped.contrib.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * D100 - Aquisição de Serviços de Transportes
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
     * Indicador do tipo de operação
     * <p>0=Aquisição</p>
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
     * Código do participante (campo 02 do Registro 0150): do prestador de serviço, no caso de aquisição de serviço; tomador do serviço, no caso de prestação de serviços
     */
    @Field(at = 4)
    private String codPart;

    /**
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     * <p>07=D100 - Nota Fiscal de Serviço de Transporte;08=D100 - Conhecimento de Transporte Rodoviário de Cargas;8B=D100 - Conhecimento de Transporte de Cargas Avulso;09=D100 - Conhecimento de Transporte Aquaviário de Cargas;10=D100 - Conhecimento Aéreo;11=D100 - Conhecimento de Transporte Ferroviário de Cargas;26=D100 - Conhecimento de Transporte Multimodal de Cargas;27=D100 - Nota Fiscal de Transporte Ferroviário de Cargas;57=D100 - Conhecimento de Transporte Eletrônico - CT-e</p>
     */
    @Field(at = 5)
    private String codMod;

    /**
     * Código da situação do documento fiscal, conforme a Tabela 4.1.2
     * <p>00=Documento regular;02=Documento cancelado;04=NFe ou CT-e denegada;05=NFe ou CT-e Numeração inutilizada;06=Documento Fiscal Complementar;08=Documento Fiscal emitido com base em Regime Especial ou Norma Específica</p>
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
     * Chave do Conhecimento de Transporte Eletrônico
     */
    @Field(at = 10)
    private String chvCte;

    /**
     * Data da emissão do documento fiscal
     */
    @Field(at = 11)
    private Date dtDoc;

    /**
     * Data da aquisição ou da prestação do serviço
     */
    @Field(at = 12)
    private Date dtAP;

    /**
     * Tipo de Conhecimento de Transporte Eletrônico conforme definido no Manual de Integração do CT-e
     */
    @Field(at = 13)
    private String tpCte;

    /**
     * Chave do CT-e de referência cujos valores foram complementados (opção “1” do campo anterior) ou cujo débito foi anulado(opção “2” do campo anterior)
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
     * Indicador do tipo do frete
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
     * Valor da base de cálculo do ICMS
     */
    @Field(at = 19)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 20)
    private Double vlIcms;

    /**
     * Valor não-tributado do ICMS
     */
    @Field(at = 21)
    private Double vlNt;

    /**
     * Código da informação complementar do documento fiscal (campo 02 do Registro 0450)
     */
    @Field(at = 22)
    private String codInf;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 23)
    private String codCta;


}