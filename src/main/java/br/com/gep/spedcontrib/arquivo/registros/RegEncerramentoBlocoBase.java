package br.com.gep.spedcontrib.arquivo.registros;

import org.beanio.annotation.Field;

public class RegEncerramentoBlocoBase extends RegBase {

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
