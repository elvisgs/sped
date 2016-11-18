package br.com.gep.sped.contrib.marshaller.registros.blocoA;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * A120 - Operações de Importação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "A120"),
    @Field(at = 10, name = "fimLinha")
})
@Getter
@Setter
public class RegA120 extends Registro {

    /**
     * Valor total do serviço, prestado por pessoa física ou jurídica domiciliada no exterior
     */
    @Field(at = 2)
    private Double vlTotServ;

    /**
     * Valor da base de cálculo da Operação - PIS/PASEP - Importação
     */
    @Field(at = 3)
    private Double vlBcPis;

    /**
     * Valor pago/recolhido de PIS/PASEP - Importação
     */
    @Field(at = 4)
    private Double vlPisImp;

    /**
     * Data de pagamento do PIS/PASEP - Importação
     */
    @Field(at = 5)
    private Date dtPagPis;

    /**
     * Valor da base de cálculo da Operação - COFINS - Importação
     */
    @Field(at = 6)
    private Double vlBcCofins;

    /**
     * Valor pago/recolhido de COFINS - Importação
     */
    @Field(at = 7)
    private Double vlCofinsImp;

    /**
     * Data de pagamento do COFINS - Importação
     */
    @Field(at = 8)
    private Date dtPagCofins;

    /**
     * Local da execução do serviço
     * <p>0=Executado no País;1=Executado no Exterior, cujo resultado se verifique no País</p>
     */
    @Field(at = 9)
    private String locExeServ;


}