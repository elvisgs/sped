package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Modais
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D180"),
    @Field(at = 18, name = "fimLinha")
})
@Getter
@Setter
public class RegD180 extends Registro {

    /**
     * Número de ordem seqüencial
     */
    @Field(at = 2)
    private Integer numSeq;

    /**
     * Emitente
     * <p>0=Emissão própria;1=Terceiros</p>
     */
    @Field(at = 3)
    private String indEmit;

    /**
     * CNPJ/CPF do emitente
     */
    @Field(at = 4)
    private String cnpjCpfEmit;

    /**
     * UF do emitente
     */
    @Field(at = 5)
    private String ufEmit;

    /**
     * Inscrição Estadual emitente
     */
    @Field(at = 6)
    private String ieEmit;

    /**
     * Código do município de origem
     */
    @Field(at = 7)
    private String codMunOrig;

    /**
     * CNPJ/CPF do tomador do serviço
     */
    @Field(at = 8)
    private String cnpjCpfTom;

    /**
     * UF do tomador do serviço
     */
    @Field(at = 9)
    private String ufTom;

    /**
     * Inscrição Estadual tomador
     */
    @Field(at = 10)
    private String ieTom;

    /**
     * Código do município de destino
     */
    @Field(at = 11)
    private String codMunDest;

    /**
     * Código do modelo do documento
     */
    @Field(at = 12)
    private String codMod;

    /**
     * Série
     */
    @Field(at = 13)
    private String ser;

    /**
     * Subsérie
     */
    @Field(at = 14)
    private String sub;

    /**
     * Número do documento
     */
    @Field(at = 15)
    private String numDoc;

    /**
     * Data da emissão
     */
    @Field(at = 16)
    private Date dtDoc;

    /**
     * Valor total do doc fiscal
     */
    @Field(at = 17)
    private Double vlDoc;


}