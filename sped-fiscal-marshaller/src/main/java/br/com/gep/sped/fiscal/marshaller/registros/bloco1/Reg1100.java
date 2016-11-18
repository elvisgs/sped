package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Exportação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1100"),
    @Field(at = 13, name = "fimLinha")
})
@Getter
@Setter
public class Reg1100 extends Registro {

    /**
     * Tipo de documento
     * <p>0=Declaração de Exportação;1=Declaração Simplificada de Exportação</p>
     */
    @Field(at = 2)
    private String indDoc;

    /**
     * Número da declaração
     */
    @Field(at = 3)
    private String nroDe;

    /**
     * Data da Declaração
     */
    @Field(at = 4)
    private Date dtDe;

    /**
     * Tipo de exportação
     * <p>0=Exportação Direta;1=Exportação Indireta</p>
     */
    @Field(at = 5)
    private String natExp;

    /**
     * Nº do registro
     */
    @Field(at = 6)
    private String nroRe;

    /**
     * Data de exportação
     */
    @Field(at = 7)
    private Date dtRe;

    /**
     * Nº do conhecimento de embarque
     */
    @Field(at = 8)
    private String chcEmb;

    /**
     * Data conhecimento embarque
     */
    @Field(at = 9)
    private Date dtChc;

    /**
     * Data da averbação
     */
    @Field(at = 10)
    private Date dtAvb;

    /**
     * Tipo de conhecimento de transporte
     */
    @Field(at = 11)
    private String tpChc;

    /**
     * Código do país de destino
     */
    @Field(at = 12)
    private String pais;


}