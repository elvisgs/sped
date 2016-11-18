package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Bombas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1350"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class Reg1350 extends Registro {

    /**
     * Número de série
     */
    @Field(at = 2)
    private String serie;

    /**
     * Fabricante
     */
    @Field(at = 3)
    private String fabricante;

    /**
     * Modelo
     */
    @Field(at = 4)
    private String modelo;

    /**
     * Identificador de medição
     * <p>0=Analógico;1=Digital</p>
     */
    @Field(at = 5)
    private String tipoMedicao;


}