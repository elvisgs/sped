package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C395 - Nota Fiscal de Venda a Consumidor
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C395"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegC395 extends Registro {

    /**
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     * <p>02=C395 - Nota Fiscal de Venda a Consumidor;2D=C395 - Cupom Fiscal emitido por ECF;2E=C395 - Bilhete de Passagem emitido por ECF;59=C395 - Cupom Fiscal Eletrônico CF-e;60=C395 - Cupom Fiscal Eletrônico CF-e-ECF;65=C395 - Nota Fiscal do Consumidor Eletrônica</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Código do participante (campo 02 do Registro 0150) - emitente do documento
     */
    @Field(at = 3)
    private String codPart;

    /**
     * Série do documento fiscal
     */
    @Field(at = 4)
    private String ser;

    /**
     * Subsérie do documento fiscal
     */
    @Field(at = 5)
    private String subSer;

    /**
     * Número do documento fiscal
     */
    @Field(at = 6)
    private String numDoc;

    /**
     * Data da emissão do documento fiscal
     */
    @Field(at = 7)
    private Date dtDoc;

    /**
     * Valor total do documento fiscal
     */
    @Field(at = 8)
    private Double vlDoc;


}