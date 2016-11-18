package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Produção diária da Usina
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1391"),
    @Field(at = 18, name = "fimLinha")
})
@Getter
@Setter
public class Reg1391 extends Registro {

    /**
     * Data produção
     */
    @Field(at = 2)
    private Date dtRegistro;

    /**
     * Quantidade de cana esmagada (toneladas)
     */
    @Field(at = 3)
    private Double qtdMoid;

    /**
     * Estoque inicial (litros / Kg)
     */
    @Field(at = 4)
    private Double estqIni;

    /**
     * Quantidade produzida (litros / Kg)
     */
    @Field(at = 5)
    private Double qtdProduz;

    /**
     * Entrada de álcool anidro decorrente da transformação do álcool hidratado ou Entrada de álcool hidratado decorrente da transformação do álcool anidro (litros)
     */
    @Field(at = 6)
    private Double entAnidHid;

    /**
     * Outras entradas  (litros / Kg)
     */
    @Field(at = 7)
    private Double outrEntr;

    /**
     * Evaporação (litros) ou Quebra de peso (Kg)
     */
    @Field(at = 8)
    private Double perda;

    /**
     * Consumo (litros)
     */
    @Field(at = 9)
    private Double cons;

    /**
     * Saída para transformação (litros)
     */
    @Field(at = 10)
    private Double saiAniHid;

    /**
     * Saídas (litros / Kg)
     */
    @Field(at = 11)
    private Double saidas;

    /**
     * Estoque final  (litros / Kg)
     */
    @Field(at = 12)
    private Double estqFin;

    /**
     * Estoque inicial de mel residual (Kg)
     */
    @Field(at = 13)
    private Double estqIniMel;

    /**
     * Produção de mel residual (Kg) e entradas de mel (Kg)
     */
    @Field(at = 14)
    private Double prodDiaMel;

    /**
     * Mel residual utilizado (Kg) e saídas de mel
     */
    @Field(at = 15)
    private Double utilMel;

    /**
     * Produção de álcool (litros) proveniente do mel residual
     */
    @Field(at = 16)
    private Double prodAlcMel;

    /**
     * Observações
     */
    @Field(at = 17)
    private String obs;


}