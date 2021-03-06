package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C860 - Identificação do Equipamento SAT-CF-e
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C860"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class RegC860 extends Registro {

    /**
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1 (Código 59 - Cupom Fiscal Eletrônico CF-e)
     * <p>59=C860 - Cupom Fiscal Eletrônico CF-e</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Número de série do equipamento (SAT)
     */
    @Field(at = 3)
    private String nrSat;

    /**
     * Data de emissão do(s) documento(s) fiscal(is)
     */
    @Field(at = 4)
    private Date dtDoc;

    /**
     * Número do documento inicial
     */
    @Field(at = 5)
    private String docIni;

    /**
     * Número do documento final
     */
    @Field(at = 6)
    private String docFim;


}