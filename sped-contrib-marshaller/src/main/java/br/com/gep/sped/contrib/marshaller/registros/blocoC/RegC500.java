package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C500 - NF de Energia Elétrica, Água e Gás
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C500"),
    @Field(at = 15, name = "fimLinha")
})
@Getter
@Setter
public class RegC500 extends Registro {

    /**
     * Código do participante do fornecedor (campo 02 do Registro 0150)
     */
    @Field(at = 2)
    private String codPart;

    /**
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     * <p>01=C500 - Nota Fiscal;06=C500 - Nota Fiscal/Conta de Energia Elétrica;28=C500 - Nota Fiscal/Conta de Fornecimento de Gás Canalizado;29=C500 - Nota Fiscal/Conta de Fornecimento de Água Canalizada;55=C500 - Nota Fiscal Eletrônica</p>
     */
    @Field(at = 3)
    private String codMod;

    /**
     * Código da situação do documento fiscal, conforme a Tabela 4.1.2
     * <p>00=Documento regular;01=Documento regular extemporâneo;02=Documento cancelado;03=Documento cancelado extemporâneo;06=Documento Fiscal Complementar;08=Documento Fiscal emitido com base em Regime Especial ou Norma Específica</p>
     */
    @Field(at = 4)
    private String codSit;

    /**
     * Série do documento fiscal
     */
    @Field(at = 5)
    private String ser;

    /**
     * Subsérie do documento fiscal
     */
    @Field(at = 6)
    private String sub;

    /**
     * Número do documento fiscal
     */
    @Field(at = 7)
    private String numDoc;

    /**
     * Data da emissão do documento fiscal
     */
    @Field(at = 8)
    private Date dtDoc;

    /**
     * Data da entrada
     */
    @Field(at = 9)
    private Date dtES;

    /**
     * Valor total do documento fiscal
     */
    @Field(at = 10)
    private Double vlDoc;

    /**
     * Valor acumulado do ICMS
     */
    @Field(at = 11)
    private Double vlIcms;

    /**
     * Código da informação complementar do documento fiscal (campo 02 do Registro 0450)
     */
    @Field(at = 12)
    private String codInf;

    /**
     * Valor do PIS/PASEP
     */
    @Field(at = 13)
    private Double vlPis;

    /**
     * Valor da COFINS
     */
    @Field(at = 14)
    private Double vlCofins;


}