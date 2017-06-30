package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC;

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
    @Field(at = 1, name = "reg", rid = true, literal = "C460"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class RegC460 extends Registro {

    /**
     * Código do modelo
     * <p>02=Nota Fiscal de Venda a Consumidor;2D=Cupom Fiscal emitido por ECF;60=CF-e-ECF</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Código da situação
     * <p>00=Documento regular;01=Documento regular extemporâneo;02=Documento cancelado</p>
     */
    @Field(at = 3)
    private String codSit;

    /**
     * Número do documento fiscal (COO)
     */
    @Field(at = 4)
    private String numDoc;

    /**
     * Data da emissão
     */
    @Field(at = 5)
    private Date dtDoc;

    /**
     * Valor total
     */
    @Field(at = 6)
    private Double vlDoc;

    /**
     * Valor do PIS
     */
    @Field(at = 7)
    private Double vlPis;

    /**
     * Valor da COFINS
     */
    @Field(at = 8)
    private Double vlCofins;

    /**
     * CPF/CNPJ do adquirente
     */
    @Field(at = 9)
    private String cpfCnpj;

    /**
     * Nome do adquirente
     */
    @Field(at = 10)
    private String nomeAdq;


}
