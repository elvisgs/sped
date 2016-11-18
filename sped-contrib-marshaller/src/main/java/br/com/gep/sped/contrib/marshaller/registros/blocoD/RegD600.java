package br.com.gep.sped.contrib.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * D600 - Consolidação de NF de Serviço de Comunicação e Telecomunicação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D600"),
    @Field(at = 20, name = "fimLinha")
})
@Getter
@Setter
public class RegD600 extends Registro {

    /**
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     * <p>21=D600 - Nota Fiscal de Serviço de Comunicação;22=D600 - Nota Fiscal de Serviço de Telecomunicação;55=D600 - Nota Fiscal Eletrônica</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Código do município dos terminais faturados, conforme a tabela IBGE
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
     * Indicador do tipo de receita
     * <p>0= Receita própria - serviços prestados;1= Receita própria - cobrança de débitos;2= Receita própria - venda de serviço pré-pago – faturamento de períodos anteriores;3= Receita própria - venda de serviço pré-pago – faturamento no período;4= Outras receitas próprias de serviços de comunicação e telecomunicação;5= Receita própria - co-faturamento;6= Receita própria – serviços a faturar em período futuro;7= Outras receitas próprias de natureza não-cumulativa;8= Outras receitas de terceiros;9= Outras receitas</p>
     */
    @Field(at = 6)
    private String indRec;

    /**
     * Quantidade de documentos consolidados neste registro
     */
    @Field(at = 7)
    private Integer qtdCons;

    /**
     * Data Inicial dos documentos consolidados
     */
    @Field(at = 8)
    private Date dtDocIni;

    /**
     * Data Final dos documentos consolidados
     */
    @Field(at = 9)
    private Date dtDocFin;

    /**
     * Valor total acumulado dos documentos fiscais
     */
    @Field(at = 10)
    private Double vlDoc;

    /**
     * Valor acumulado dos descontos
     */
    @Field(at = 11)
    private Double vlDesc;

    /**
     * Valor acumulado das prestações de serviços tributados pelo ICMS
     */
    @Field(at = 12)
    private Double vlServ;

    /**
     * Valor acumulado dos serviços não-tributados pelo ICMS
     */
    @Field(at = 13)
    private Double vlServNt;

    /**
     * Valores cobrados em nome de terceiros
     */
    @Field(at = 14)
    private Double vlTerc;

    /**
     * Valor acumulado das despesas acessórias
     */
    @Field(at = 15)
    private Double vlDa;

    /**
     * Valor acumulado da base de cálculo do ICMS
     */
    @Field(at = 16)
    private Double vlBcIcms;

    /**
     * Valor acumulado do ICMS
     */
    @Field(at = 17)
    private Double vlIcms;

    /**
     * Valor do PIS/PASEP
     */
    @Field(at = 18)
    private Double vlPis;

    /**
     * Valor da COFINS
     */
    @Field(at = 19)
    private Double vlCofins;


}