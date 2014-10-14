package br.com.gep.sped.marshaller.common;

import org.beanio.annotation.Field;

public class RegistroAberturaBloco extends Registro {

    @Field(at = 2)
    private String indMov;

    /**
     * Obtém Indicador de movimento
     */
    public String getIndMov() {
        return indMov;
    }

    /**
     * Seta Indicador de movimento
     * <p>0=Bloco com dados informados;1=Bloco sem dados informados</p>
     */
    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }
}
