package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD;

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
    @Field(at = 1, name = "reg", rid = true, literal = "D162"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class RegD162 extends Registro {

    /**
     * Código do Modelo de Documento Fiscal
     * <p>01=Nota Fiscal;1B=Nota Fiscal Avulsa;04=Nota Fiscal de Produtor;55=Nota Fiscal Eletrônica</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Série do Documento Fiscal
     */
    @Field(at = 3)
    private String ser;

    /**
     * Número do Documento fiscal
     */
    @Field(at = 4)
    private String numDoc;

    /**
     * Data de emissão
     */
    @Field(at = 5)
    private Date dtDoc;

    /**
     * Valor total
     */
    @Field(at = 6)
    private Double vlDoc;

    /**
     * Valor das mercadorias
     */
    @Field(at = 7)
    private Double vlMerc;

    /**
     * Quantidade de volumes transportados
     */
    @Field(at = 8)
    private Integer qtdVol;

    /**
     * Peso bruto
     */
    @Field(at = 9)
    private Double pesoBrt;

    /**
     * Peso líquido
     */
    @Field(at = 10)
    private Double pesoLiq;


}
