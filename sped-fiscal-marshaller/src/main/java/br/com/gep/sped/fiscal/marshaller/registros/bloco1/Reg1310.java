package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Movimentação Diária por Tanque
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1310"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class Reg1310 extends Registro {

    /**
     * Número do tanque de armazenagem
     */
    @Field(at = 2)
    private String numTanque;

    /**
     * Estoque no início do dia
     */
    @Field(at = 3)
    private Double estqAbert;

    /**
     * Volume recebido no dia
     */
    @Field(at = 4)
    private Double volEntr;

    /**
     * Volume disponível
     */
    @Field(at = 5)
    private Double volDisp;

    /**
     * Volume total das saídas
     */
    @Field(at = 6)
    private Double volSaidas;

    /**
     * Estoque escritural
     */
    @Field(at = 7)
    private Double estqEscr;

    /**
     * Valor da perda
     */
    @Field(at = 8)
    private Double valAjPerda;

    /**
     * Valor do ganho
     */
    @Field(at = 9)
    private Double valAjGanho;

    /**
     * Estoque de fechamento
     */
    @Field(at = 10)
    private Double fechFisico;


}