package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Ajustes
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E530"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class RegE530 extends Registro {

    /**
     * Tipo de ajuste
     * <p>0=Ajuste a débito;1=Ajuste a crédito</p>
     */
    @Field(at = 2)
    private String indAj;

    /**
     * Valor do ajuste
     */
    @Field(at = 3)
    private Double vlAj;

    /**
     * Código do ajuste da apuração
     */
    @Field(at = 4)
    private String codAj;

    /**
     * Origem do documento
     * <p>0=Processo Judicial;1=Processo Administrativo;2=PER/DCOMP;9=Outros</p>
     */
    @Field(at = 5)
    private String indDoc;

    /**
     * Número do documento
     */
    @Field(at = 6)
    private String numDoc;

    /**
     * Descrição resumida
     */
    @Field(at = 7)
    private String descrAj;


}