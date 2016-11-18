package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Doc. Fiscal
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C113"),
    @Field(at = 10, name = "fimLinha")
})
@Getter
@Setter
public class RegC113 extends Registro {

    /**
     * Tipo de operação
     * <p>0=Entrada;1=Saída</p>
     */
    @Field(at = 2)
    private String indOper;

    /**
     * Emitente do título
     * <p>0=Emissão Própria;1=Terceiros</p>
     */
    @Field(at = 3)
    private String indEmit;

    /**
     * Código do participante
     */
    @Field(at = 4)
    private String codPart;

    /**
     * Código do documento fiscal
     */
    @Field(at = 5)
    private String codMod;

    /**
     * Série
     */
    @Field(at = 6)
    private String ser;

    /**
     * Subsérie
     */
    @Field(at = 7)
    private String sub;

    /**
     * Número do documento
     */
    @Field(at = 8)
    private String numDoc;

    /**
     * Data da emissão
     */
    @Field(at = 9)
    private Date dtDoc;


}