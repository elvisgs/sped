package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Cupom Fiscal Eletrônico
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C116"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class RegC116 extends Registro {

    /**
     * Código do modelo de documento fiscal
     * <p>59=Cupom Fiscal Eletrônico - CF-e</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Número de Série do Equipamento SAT
     */
    @Field(at = 3)
    private String nrSat;

    /**
     * Chave do cupom fiscal Eletrônico
     */
    @Field(at = 4)
    private String chvCfe;

    /**
     * Número do cupom fiscal eletrônico
     */
    @Field(at = 5)
    private String numCfe;

    /**
     * Data de Emissão do Documento Fiscal
     */
    @Field(at = 6)
    private String dtDoc;


}