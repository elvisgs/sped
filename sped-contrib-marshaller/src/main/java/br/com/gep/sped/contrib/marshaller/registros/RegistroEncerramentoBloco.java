package br.com.gep.sped.contrib.marshaller.registros;

import org.beanio.annotation.Field;

public abstract class RegistroEncerramentoBloco extends Registro {

    @Field(at = 2)
    private int qtdLin;

    /**
     * Obtém quantidade de linhas no bloco
     */
    public int getQtdLin() {
        return qtdLin;
    }

    /**
     * Seta quantidade de linhas no bloco
     */
    public void setQtdLin(int qtdLin) {
        this.qtdLin = qtdLin;
    }
}
