package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Industrialização Efetuada por Terceiros – Itens Produzidos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "K250"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class RegK250 extends Registro {

    /**
     * Data do reconhecimento da produção ocorrida no terceiro
     */
    @Field(at = 2)
    private Date dtProd;

    /**
     * Código do item produzido
     */
    @Field(at = 3)
    private String codItem;

    /**
     * Quantidade produzida
     */
    @Field(at = 4)
    private Double qtd;


}
