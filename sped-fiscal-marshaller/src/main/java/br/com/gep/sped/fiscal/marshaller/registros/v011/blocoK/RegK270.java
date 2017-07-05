package br.com.gep.sped.fiscal.marshaller.registros.v011.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Correção de apontamento dos registros K210, K220, K230, K250 E K260
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "K270"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegK270 extends Registro {

    /**
     * Data inicial do período de apuração em que ocorreu o apontamento que está sendo corrigido
     */
    @Field(at = 2)
    private Date dtIniAp;

    /**
     * Data final do período de apuração em que ocorreu o apontamento que está sendo corrigido
     */
    @Field(at = 3)
    private Date dtFinAp;

    /**
     * Código de identificação da ordem de produção ou da ordem de serviço que está sendo corrigida
     */
    @Field(at = 4)
    private String codOpOs;

    /**
     * Código da mercadoria que está sendo corrigido (campo 02 do Registro 0200)
     */
    @Field(at = 5)
    private String codItem;

    /**
     * Quantidade de correção positiva de apontamento ocorrido em período de apuração anterior
     */
    @Field(at = 6)
    private Double qtdCorPos;

    /**
     * Quantidade de correção negativa de apontamento ocorrido em período de apuração anterior
     */
    @Field(at = 7)
    private Double qtdCorNeg;

    /**
     * Origem do apontamento
     * <p>1=Correção de apontamento de produção e/ou consumo relativo aos Registros K230/K235;2=Correção de apontamento de produçãoe/ou consumo relativo aos Registros K250/K255;3=Correção de apontamento de desmontagem e/ou consumo relativo aos Registros K210/K215;4=Correção de apontamento de reprocessamento/reparo e/ou consumo relativo aos Registros K260/K265;5=Correção de apontamento de movimentação interna relativo ao Registro K220</p>
     */
    @Field(at = 8)
    private String origem;


}
