package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Cupom Fiscal
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C114"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class RegC114 extends Registro {

    /**
     * Código do modelo do documento
     * <p>02=Nota Fiscal de Venda a Consumidor;2D=Cupom Fiscal emitido por ECF;2E=Bilhete de Passagem emitido por ECF</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Série de fabricação do ECF
     */
    @Field(at = 3)
    private String ecfFab;

    /**
     * Caixa atribuído ao ECF
     */
    @Field(at = 4)
    private String ecfCx;

    /**
     * Número do documento
     */
    @Field(at = 5)
    private String numDoc;

    /**
     * Data da emissão
     */
    @Field(at = 6)
    private Date dtDoc;


}