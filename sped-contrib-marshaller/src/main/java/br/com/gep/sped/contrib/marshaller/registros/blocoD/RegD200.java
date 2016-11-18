package br.com.gep.sped.contrib.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * D200 - Prestação de Serviços de Transporte
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D200"),
    @Field(at = 12, name = "fimLinha")
})
@Getter
@Setter
public class RegD200 extends Registro {

    /**
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     * <p>07=D200 - Nota Fiscal de Serviço de Transporte;08=D200 - Conhecimento de Transporte Rodoviário de Cargas;8B=D200 - Conhecimento de Transporte de Cargas Avulso;09=D200 - Conhecimento de Transporte Aquaviário de Cargas;10=D200 - Conhecimento Aéreo;11=D200 - Conhecimento de Transporte Ferroviário de Cargas;26=D200 - Conhecimento de Transporte Multimodal de Cargas;27=D200 - Nota Fiscal de Transporte Ferroviário de Cargas;57=D200 - Conhecimento de Transporte Eletrônico - CT-e</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Código da situação do documento fiscal, conforme a Tabela 4.1.2
     * <p>00=Documento regular;02=Documento cancelado;04=NFe ou CT-e denegada;05=NFe ou CT-e Numeração inutilizada;06=Documento Fiscal Complementar;08=Documento Fiscal emitido com base em Regime Especial ou Norma Específica</p>
     */
    @Field(at = 3)
    private String codSit;

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
     * Número do documento fiscal inicial (mesmo modelo, série e subsérie)
     */
    @Field(at = 6)
    private String numDocIni;

    /**
     * Número do documento fiscal final (mesmo modelo, série e subsérie)
     */
    @Field(at = 7)
    private String numDocFin;

    /**
     * Código Fiscal de Operação e Prestação conforme tabela indicada no item 4.2.2
     */
    @Field(at = 8)
    private String cfop;

    /**
     * Data do dia de referência do resumo diário
     */
    @Field(at = 9)
    private Date dtRef;

    /**
     * Valor total dos documentos fiscais
     */
    @Field(at = 10)
    private Double vlDoc;

    /**
     * Valor total dos descontos
     */
    @Field(at = 11)
    private Double vlDesc;


}