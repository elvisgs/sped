package br.com.gep.sped.fiscal.marshaller.registros.v011.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * UTILIZAÇÃO DE CRÉDITOS FISCAIS - ICMS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1210"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class Reg1210 extends Registro {

    /**
     * Tipo de utilização do crédito, conforme Tabela de Tipos de Utilização dos Créditos Fiscais
     */
    @Field(at = 2)
    private String tipoUtil;

    /**
     * Número do documento utilizado na baixa de créditos
     */
    @Field(at = 3)
    private String nrDoc;

    /**
     * Total de crédito utilizado
     */
    @Field(at = 4)
    private Double vlCredUtil;

    /**
     * Chave do documento eletrônico
     */
    @Field(at = 5)
    private String chvDoce;


}
