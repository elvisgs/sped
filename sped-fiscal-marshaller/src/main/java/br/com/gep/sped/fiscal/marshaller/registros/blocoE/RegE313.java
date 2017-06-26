package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Informações adicionais da apuração do ICMS diferencial de alíquota – UF origem/destino EC 87/15 identificação dos documentos fiscais
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E313"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class RegE313 extends Registro {

    /**
     * Código do participante (campo 02 do registro 0150):- do emitente do documento ou do remetente das mercadorias, no caso de entradas;- do adquirente, no caso de saídas
     */
    @Field(at = 2)
    private String codPart;

    /**
     * Código do modelo do documento fiscal, conforme a tabela 4.1.1
     */
    @Field(at = 3)
    private String codMod;

    /**
     * Série do documento fiscal
     */
    @Field(at = 4)
    private String ser;

    /**
     * Subserie do documento fiscal
     */
    @Field(at = 5)
    private String sub;

    /**
     * Número do documento fiscal
     */
    @Field(at = 6)
    private String numDoc;

    /**
     * Chave do documento eletrônico
     */
    @Field(at = 7)
    private String chvDoce;

    /**
     * Data da emissão do documento fiscal (DDMMAAAA)
     */
    @Field(at = 8)
    private Date dtDoc;

    /**
     * Código do item (campo 02 do registro 0200)
     */
    @Field(at = 9)
    private String codItem;

    /**
     * Valor do ajuste para a operação/item
     */
    @Field(at = 10)
    private Double vlAjItem;


}