package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Item/Produtos
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
     * Código de barra
     */
    @Field(at = 4)
    private String codBarra;

    /**
     * Código anterior do item
     */
    @Field(at = 5)
    private String codAntItem;

    /**
     * Unidade de medida
     */
    @Field(at = 6)
    private String unidInv;

    /**
     * Tipo do item
     * <p>00=Mercadoria para Revenda;01=Matéria-Prima;02=Embalagem;03=Produto em Processo;04=Produto Acabado;05=Subproduto;06=Produto Intermediário;07=Material de Uso e Consumo;08=Ativo Imobilizado;09=Serviços;10=Outros insumos;99=Outros</p>
     */
    @Field(at = 7)
    private String tipoItem;

    /**
     * Código NCM
     */
    @Field(at = 8)
    private String codNcm;

    /**
     * Código EX
     */
    @Field(at = 9)
    private String exIpi;

    /**
     * Código do gênero do item
     */
    @Field(at = 10)
    private String codGen;

    /**
     * Código do serviço do item
     */
    @Field(at = 11)
    private String codLst;

    /**
     * Alíquota do ICMS(%)
     */
    @Field(at = 12)
    private Double aliqIcms;


}
