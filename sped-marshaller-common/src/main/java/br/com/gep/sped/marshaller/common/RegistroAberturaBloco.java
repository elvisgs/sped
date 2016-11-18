package br.com.gep.sped.marshaller.common;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;

@Getter
@Setter
public class RegistroAberturaBloco extends Registro {

    /**
     * Indicador de movimento
     * <p>0=Bloco com dados informados;1=Bloco sem dados informados</p>
     */
    @Field(at = 2)
    private String indMov;
}
