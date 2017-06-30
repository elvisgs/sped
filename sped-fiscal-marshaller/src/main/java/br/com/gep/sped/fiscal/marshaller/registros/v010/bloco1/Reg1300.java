package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Movimentação Diária
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1300"),
    @Field(at = 12, name = "fimLinha")
})
@Getter
@Setter
public class Reg1300 extends Registro {

    /**
     * Código do produto
     */
    @Field(at = 2)
    private String codItem;

    /**
     * Data do fechamento
     */
    @Field(at = 3)
    private Date dtFech;

    /**
     * Estoque no inicio do dia
     */
    @Field(at = 4)
    private Double estqAbert;

    /**
     * Volume total das entradas
     */
    @Field(at = 5)
    private Double volEntr;

    /**
     * Volume disponível
     */
    @Field(at = 6)
    private Double volDisp;

    /**
     * Volume total das saídas
     */
    @Field(at = 7)
    private Double volSaidas;

    /**
     * Estoque escritural
     */
    @Field(at = 8)
    private Double estqEscr;

    /**
     * Valor da perda
     */
    @Field(at = 9)
    private Double valAjPerda;

    /**
     * Valor do ganho
     */
    @Field(at = 10)
    private Double valAjGanho;

    /**
     * Estoque de fechamento
     */
    @Field(at = 11)
    private Double fechFisico;


}
