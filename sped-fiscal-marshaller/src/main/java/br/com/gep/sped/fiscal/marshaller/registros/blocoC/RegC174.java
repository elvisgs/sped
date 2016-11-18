package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Arma de fogo
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C174"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class RegC174 extends Registro {

    /**
     * Tipo da arma
     * <p>0=Uso permitido;1=Uso restrito</p>
     */
    @Field(at = 2)
    private String indArm;

    /**
     * Número de Série
     */
    @Field(at = 3)
    private String numArm;

    /**
     * Descrição da arma
     */
    @Field(at = 4)
    private String descrCompl;


}