package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Identificação dos Documentos Fiscais
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E240"),
    @Field(at = 10, name = "fimLinha")
})
@Getter
@Setter
public class RegE240 extends Registro {

    /**
     * Código do participante
     */
    @Field(at = 2)
    private String codPart;

    /**
     * Código do modelo
     */
    @Field(at = 3)
    private String codMod;

    /**
     * Série
     */
    @Field(at = 4)
    private String ser;

    /**
     * Subserie
     */
    @Field(at = 5)
    private String sub;

    /**
     * Número do documento
     */
    @Field(at = 6)
    private String numDoc;

    /**
     * Data da emissão
     */
    @Field(at = 7)
    private Date dtDoc;

    /**
     * Código do item
     */
    @Field(at = 8)
    private String codItem;

    /**
     * Valor do ajuste do item
     */
    @Field(at = 9)
    private Double vlAjItem;


}
