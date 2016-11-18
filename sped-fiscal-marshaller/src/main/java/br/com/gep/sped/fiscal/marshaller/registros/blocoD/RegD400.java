package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Resumo de Movimento Diário
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D400"),
    @Field(at = 17, name = "fimLinha")
})
@Getter
@Setter
public class RegD400 extends Registro {

    /**
     * Código do participante
     */
    @Field(at = 2)
    private String codPart;

    /**
     * Código do modelo do documento
     * <p>18=Resumo de Movimento Diário</p>
     */
    @Field(at = 3)
    private String codMod;

    /**
     * Código da situação do documento
     * <p>00=Documento regular;01=Documento regular extemporâneo;02=Documento cancelado;03=Documento cancelado extemporâneo;06=Documento Fiscal Complementar;07=Documento Fiscal Complementar extemporâneo;08=Documento Fiscal emitido com base em Regime Especial ou Norma Específica</p>
     */
    @Field(at = 4)
    private String codSit;

    /**
     * Série
     */
    @Field(at = 5)
    private String ser;

    /**
     * Subsérie
     */
    @Field(at = 6)
    private String sub;

    /**
     * Número do documento
     */
    @Field(at = 7)
    private String numDoc;

    /**
     * Data da emissão
     */
    @Field(at = 8)
    private Date dtDoc;

    /**
     * Valor total
     */
    @Field(at = 9)
    private Double vlDoc;

    /**
     * Valor dos descontos
     */
    @Field(at = 10)
    private Double vlDesc;

    /**
     * Valor da prestação de serviço
     */
    @Field(at = 11)
    private Double vlServ;

    /**
     * Base de cálculo do ICMS
     */
    @Field(at = 12)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 13)
    private Double vlIcms;

    /**
     * Valor do PIS
     */
    @Field(at = 14)
    private Double vlPis;

    /**
     * Valor da COFINS
     */
    @Field(at = 15)
    private Double vlCofins;

    /**
     * Código da conta analítica
     */
    @Field(at = 16)
    private String codCta;


}