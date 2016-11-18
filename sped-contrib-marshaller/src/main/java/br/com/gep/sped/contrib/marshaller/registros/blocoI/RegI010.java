package br.com.gep.sped.contrib.marshaller.registros.blocoI;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * I010 - Identificação do Estabelecimento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "I010"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class RegI010 extends Registro {

    /**
     * Número de inscrição do estabelecimento no CNPJ
     */
    @Field(at = 2)
    private String cnpj;

    /**
     * Indicador de operações realizadas no período
     * <p>01=Exclusivamente operações de Instituições Financeiras e Assemelhadas;02=Exclusivamente operações de Seguros Privados;03=Exclusivamente operações de Previdência Complementar;04=Exclusivamente operações de Capitalização;05=Exclusivamente operações de Planos de Assistência à Saúde;06=Realizou operações referentes a mais de um dos indicadores acima</p>
     */
    @Field(at = 3)
    private String indAtiv;

    /**
     * Informação complementar
     */
    @Field(at = 4)
    private String infoCompl;


}