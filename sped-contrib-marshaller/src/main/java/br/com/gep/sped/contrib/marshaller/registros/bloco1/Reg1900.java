package br.com.gep.sped.contrib.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 1900 - Consolidação dos documentos emitidos no período por pessoa jurídica submetida ao regime de tributação com base no lucro presumido - regime de caixa ou de competência
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1900"),
    @Field(at = 14, name = "fimLinha")
})
@Getter
@Setter
public class Reg1900 extends Registro {

    /**
     * CNPJ do estabelecimento da pessoa jurídica, emitente dos documentos geradores de receita
     */
    @Field(at = 2)
    private String cnpj;

    /**
     * Código do modelo do documento fiscal conforme a Tabela 4.1.1, ou 98 - Nota Fiscal de Prestação de Serviços (ISSQN) ou 99 - Outros Documentos
     */
    @Field(at = 3)
    private String codMod;

    /**
     * Série do documento fiscal
     */
    @Field(at = 4)
    private String ser;

    /**
     * Subsérie do documento fiscal
     */
    @Field(at = 5)
    private String subSer;

    /**
     * Código da situação do documento fiscal
     * <p>00=Documento regular;02=Documento cancelado;99=Outros</p>
     */
    @Field(at = 6)
    private String codSit;

    /**
     * Valor total da receita, conforme os documentos emitidos no período, representativos da venda de bens e serviços
     */
    @Field(at = 7)
    private Double vlTotRec;

    /**
     * Quantidade total de documentos emitidos no período
     */
    @Field(at = 8)
    private Integer quantDoc;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP
     */
    @Field(at = 9)
    private String cstPis;

    /**
     * Código da Situação Tributária referente a COFINS
     */
    @Field(at = 10)
    private String cstCofins;

    /**
     * Código Fiscal de Operação e Prestação
     */
    @Field(at = 11)
    private String cfop;

    /**
     * Informação complementar
     */
    @Field(at = 12)
    private String infoCompl;

    /**
     * Código da conta analítica contábil representativa da receita recebida
     */
    @Field(at = 13)
    private String codCta;


}