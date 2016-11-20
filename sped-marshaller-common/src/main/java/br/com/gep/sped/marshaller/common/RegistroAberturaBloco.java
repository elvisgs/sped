package br.com.gep.sped.marshaller.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.beanio.annotation.Field;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistroAberturaBloco extends Registro {

    public static final String COM_MOVIMENTO = "0";
    public static final String SEM_MOVIMENTO = "1";

    /**
     * Indicador de movimento
     * <p>0=Bloco com dados informados;1=Bloco sem dados informados</p>
     */
    @Field(at = 2)
    private String indMov;
}
