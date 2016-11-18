package br.com.gep.sped.contrib.marshaller.registros.blocoP;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * P210 - Ajuste da Contribuição Previdenciária apurada sobre a Receita Bruta
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "P210"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class RegP210 extends Registro {

    /**
     * Indicador do tipo de ajuste
     * <p>0=Ajuste de redução;1=Ajuste de acréscimo</p>
     */
    @Field(at = 2)
    private String indAj;

    /**
     * Valor do ajuste
     */
    @Field(at = 3)
    private Double vlAj;

    /**
     * Código do ajuste
     */
    @Field(at = 4)
    private String codAj;

    /**
     * Número do processo, documento ou ato concessório ao qual o ajuste está vinculado, se houver
     */
    @Field(at = 5)
    private String numDoc;

    /**
     * Descrição resumida do ajuste
     */
    @Field(at = 6)
    private String descrAj;

    /**
     * Data de referência do ajuste (ddmmaaaa)
     */
    @Field(at = 7)
    private Date dtRef;


}