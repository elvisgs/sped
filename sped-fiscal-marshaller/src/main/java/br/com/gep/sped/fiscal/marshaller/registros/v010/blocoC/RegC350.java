package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * NF de venda a consumidor
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C350"),
    @Field(at = 13, name = "fimLinha")
})
@Getter
@Setter
public class RegC350 extends Registro {

    /**
     * Série
     */
    @Field(at = 2)
    private String ser;

    /**
     * Subsérie
     */
    @Field(at = 3)
    private String subSer;

    /**
     * Número do documento
     */
    @Field(at = 4)
    private String numDoc;

    /**
     * Data da emissão do documento fiscal
     */
    @Field(at = 5)
    private Date dtDoc;

    /**
     * CNPJ ou CPF do destinatário
     */
    @Field(at = 6)
    private String cnpjCpf;

    /**
     * Valor das mercadorias
     */
    @Field(at = 7)
    private Double vlMerc;

    /**
     * Valor Total do Documento Fiscal
     */
    @Field(at = 8)
    private Double vlDoc;

    /**
     * Valor Total do desconto
     */
    @Field(at = 9)
    private Double vlDesc;

    /**
     * Valor Total do PIS
     */
    @Field(at = 10)
    private Double vlPis;

    /**
     * Valor Total da COFIS
     */
    @Field(at = 11)
    private Double vlCofis;

    /**
     * Código da Conta Analítica
     */
    @Field(at = 12)
    private String codCta;


}
