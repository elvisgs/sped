package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Exportação Indireta
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1110"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class Reg1110 extends Registro {

    /**
     * Código do participante-fornecedor
     */
    @Field(at = 2)
    private String codPart;

    /**
     * Código do modelo do documento
     * <p>01=Nota Fiscal;1B=Nota Fiscal Avulsa;04=Nota Fiscal de Produtor;55=Nota Fiscal Eletrônica</p>
     */
    @Field(at = 3)
    private String codMod;

    /**
     * Série do documento fiscal
     */
    @Field(at = 4)
    private String ser;

    /**
     * Número do documento fiscal
     */
    @Field(at = 5)
    private String numDoc;

    /**
     * Data da emissão
     */
    @Field(at = 6)
    private Date dtDoc;

    /**
     * Chave da NFe
     */
    @Field(at = 7)
    private String chvNfe;

    /**
     * Número do Memorando Exp
     */
    @Field(at = 8)
    private Integer nrMemo;

    /**
     * Quantidade do item
     */
    @Field(at = 9)
    private Double qtd;

    /**
     * Unidade do item
     */
    @Field(at = 10)
    private String unid;


}