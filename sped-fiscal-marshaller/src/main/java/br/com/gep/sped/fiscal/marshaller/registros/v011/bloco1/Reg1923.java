package br.com.gep.sped.fiscal.marshaller.registros.v011.bloco1;

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
    @Field(at = 1, name = "reg", rid = true, literal = "1923"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class Reg1923 extends Registro {

    /**
     * Código do participante (campo 02 do Registro 0150): - do emitente do documento ou do remetente das mercadorias, no caso de entradas; - do adquirente, no caso de saídas
     */
    @Field(at = 2)
    private String codPart;

    /**
     * Código do modelo do documento fiscal
     */
    @Field(at = 3)
    private String codMod;

    /**
     * Série do documento fiscal
     */
    @Field(at = 4)
    private String ser;

    /**
     * Subsérie do documento fiscal
     */
    @Field(at = 5)
    private String sub;

    /**
     * Número do documento fiscal
     */
    @Field(at = 6)
    private String numDoc;

    /**
     * Data de emissão do Documento Fiscal (DD/MM/AAAA)
     */
    @Field(at = 7)
    private Date dtDoc;

    /**
     * Código do item (campo 02 do Registro 0200)
     */
    @Field(at = 8)
    private String codItem;

    /**
     * Valor ajuste para a operação/item.'
     */
    @Field(at = 9)
    private Double vlAjItem;

    /**
     * Chave do documento eletrônico
     */
    @Field(at = 10)
    private String chvDoce;


}
