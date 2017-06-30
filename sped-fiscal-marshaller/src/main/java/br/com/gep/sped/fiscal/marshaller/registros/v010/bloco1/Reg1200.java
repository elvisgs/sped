package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * CONTROLE DE CRÉDITOS FISCAIS - ICMS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1200"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class Reg1200 extends Registro {

    /**
     * Código de ajuste
     */
    @Field(at = 2)
    private String codAjApur;

    /**
     * Saldo de créditos fiscais anteriores
     */
    @Field(at = 3)
    private Double sldCred;

    /**
     * Crédito apropriado no mês
     */
    @Field(at = 4)
    private Double credApr;

    /**
     * Créditos recebidos por transferência
     */
    @Field(at = 5)
    private Double credReceb;

    /**
     * Créditos utilizados no período
     */
    @Field(at = 6)
    private Double credUtil;

    /**
     * Saldo de crédito fiscal
     */
    @Field(at = 7)
    private Double sldCredFim;


}
