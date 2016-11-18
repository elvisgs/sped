package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;
import org.beanio.builder.Align;

/**
 * 0200 - Itens (Produtos e Serviços)
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0200"),
    @Field(at = 13, name = "fimLinha")
})
@Getter
@Setter
public class Reg0200 extends Registro {

    /**
     * Código do item
     */
    @Field(at = 2)
    private String codItem;

    /**
     * Descrição do item
     */
    @Field(at = 3)
    private String descrItem;

    /**
     * Representação alfanumérico do código de barra do produto, se houver
     */
    @Field(at = 4)
    private String codBarra;

    /**
     * Código anterior do item com relação à última informação apresentada
     */
    @Field(at = 5)
    private String codAntItem;

    /**
     * Unidade de medida utilizada na quantificação de estoques
     */
    @Field(at = 6)
    private String unidInv;

    /**
     * Tipo do item - Atividades Industriais, Comerciais e Serviços
     * <p>00=Mercadoria para Revenda;01=Matéria-Prima;02=Embalagem;03=Produto em Processo;04=Produto Acabado;05=Subproduto;06=Produto Intermediário;07=Material de Uso e Consumo;08=Ativo Imobilizado;09=Serviços;10=Outros insumos;99=Outras</p>
     */
    @Field(at = 7)
    private String tipoItem;

    /**
     * Código da Nomenclatura Comum do Mercosul
     */
    @Field(at = 8, length = 8, padding = '0', align = Align.RIGHT)
    private String codNcm;

    /**
     * Código EX, conforme a TIPI
     */
    @Field(at = 9)
    private String exIpi;

    /**
     * Código do gênero do item, conforme a Tabela 4.2.1
     */
    @Field(at = 10)
    private String codGen;

    /**
     * Código do serviço conforme lista do Anexo I da Lei Complementar Federal nº 116/03
     */
    @Field(at = 11)
    private String codLst;

    /**
     * Alíquota de ICMS aplicável ao item nas operações internas
     */
    @Field(at = 12)
    private Double aliqIcms;


}
