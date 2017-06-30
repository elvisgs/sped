package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Carga Transportada
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D160"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegD160 extends Registro {

    /**
     * Identificação do número do despacho
     */
    @Field(at = 2)
    private String despacho;

    /**
     * CNPJ ou CPF do remetente
     */
    @Field(at = 3)
    private String cnpjCpfRem;

    /**
     * Inscrição Estadual do remetente
     */
    @Field(at = 4)
    private String ieRem;

    /**
     * Código do município de origem
     */
    @Field(at = 5)
    private String codMunOri;

    /**
     * CNPJ ou CPF do destinatário
     */
    @Field(at = 6)
    private String cnpjCpfDest;

    /**
     * Inscrição Estadual do destinatário
     */
    @Field(at = 7)
    private String ieDest;

    /**
     * Código do município de destino
     */
    @Field(at = 8)
    private String codMunDest;


}
