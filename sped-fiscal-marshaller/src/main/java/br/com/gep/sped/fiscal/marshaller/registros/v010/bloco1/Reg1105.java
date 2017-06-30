package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Doc Fiscal de Exportação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1105"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class Reg1105 extends Registro {

    /**
     * Código do modelo da NF
     * <p>01=Nota Fiscal;55=Nota Fiscal Eletrônica</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Série da Nota Fiscal
     */
    @Field(at = 3)
    private String ser;

    /**
     * Número da Nota Fiscal
     */
    @Field(at = 4)
    private String numDoc;

    /**
     * Chave da NFe
     */
    @Field(at = 5)
    private String chvNfe;

    /**
     * Data da emissão
     */
    @Field(at = 6)
    private Date dtDoc;

    /**
     * Código do item
     */
    @Field(at = 7)
    private String codItem;


}
