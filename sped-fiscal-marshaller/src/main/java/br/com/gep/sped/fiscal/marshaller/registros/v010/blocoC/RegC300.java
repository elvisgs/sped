package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Resumo Diário das NF de Venda a Consumidor
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C300"),
    @Field(at = 12, name = "fimLinha")
})
@Getter
@Setter
public class RegC300 extends Registro {

    /**
     * Código do modelo do documento
     * <p>02=Nota Fiscal de Venda a Consumidor;</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Série do documento fiscal
     */
    @Field(at = 3)
    private String ser;

    /**
     * Subsérie do documento fiscal
     */
    @Field(at = 4)
    private String sub;

    /**
     * Documento fiscal inicial
     */
    @Field(at = 5)
    private String numDocIni;

    /**
     * Documento fiscal final
     */
    @Field(at = 6)
    private String numDocFin;

    /**
     * Data da emissão
     */
    @Field(at = 7)
    private Date dtDoc;

    /**
     * Valor total dos documentos
     */
    @Field(at = 8)
    private Double vlDoc;

    /**
     * Valor total do PIS
     */
    @Field(at = 9)
    private Double vlPis;

    /**
     * Valor total da COFINS
     */
    @Field(at = 10)
    private Double vlCofins;

    /**
     * Código da conta analítica
     */
    @Field(at = 11)
    private String codCta;


}
