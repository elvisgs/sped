package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Movimentação Diária por Tanque
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1310"),
    @Field(at = 11, name = "fimLinha")
})
public class Reg1310 extends Registro {
    
    @Field(at = 2)
    private String numTanque;
    
    @Field(at = 3)
    private Double estqAbert;
    
    @Field(at = 4)
    private Double volEntr;
    
    @Field(at = 5)
    private Double volDisp;
    
    @Field(at = 6)
    private Double volSaidas;
    
    @Field(at = 7)
    private Double estqEscr;
    
    @Field(at = 8)
    private Double valAjPerda;
    
    @Field(at = 9)
    private Double valAjGanho;
    
    @Field(at = 10)
    private Double fechFisico;
    
    /**
     * Obtém Número do tanque de armazenagem
     */
    public String getNumTanque() {
        return numTanque;
    }

    /**
     * Seta Número do tanque de armazenagem
     */
    public void setNumTanque(String numTanque) {
        this.numTanque = numTanque;
    }
    
    /**
     * Obtém Estoque no início do dia
     */
    public Double getEstqAbert() {
        return estqAbert;
    }

    /**
     * Seta Estoque no início do dia
     */
    public void setEstqAbert(Double estqAbert) {
        this.estqAbert = estqAbert;
    }
    
    /**
     * Obtém Volume recebido no dia
     */
    public Double getVolEntr() {
        return volEntr;
    }

    /**
     * Seta Volume recebido no dia
     */
    public void setVolEntr(Double volEntr) {
        this.volEntr = volEntr;
    }
    
    /**
     * Obtém Volume disponível
     */
    public Double getVolDisp() {
        return volDisp;
    }

    /**
     * Seta Volume disponível
     */
    public void setVolDisp(Double volDisp) {
        this.volDisp = volDisp;
    }
    
    /**
     * Obtém Volume total das saídas
     */
    public Double getVolSaidas() {
        return volSaidas;
    }

    /**
     * Seta Volume total das saídas
     */
    public void setVolSaidas(Double volSaidas) {
        this.volSaidas = volSaidas;
    }
    
    /**
     * Obtém Estoque escritural
     */
    public Double getEstqEscr() {
        return estqEscr;
    }

    /**
     * Seta Estoque escritural
     */
    public void setEstqEscr(Double estqEscr) {
        this.estqEscr = estqEscr;
    }
    
    /**
     * Obtém Valor da perda
     */
    public Double getValAjPerda() {
        return valAjPerda;
    }

    /**
     * Seta Valor da perda
     */
    public void setValAjPerda(Double valAjPerda) {
        this.valAjPerda = valAjPerda;
    }
    
    /**
     * Obtém Valor do ganho
     */
    public Double getValAjGanho() {
        return valAjGanho;
    }

    /**
     * Seta Valor do ganho
     */
    public void setValAjGanho(Double valAjGanho) {
        this.valAjGanho = valAjGanho;
    }
    
    /**
     * Obtém Estoque de fechamento
     */
    public Double getFechFisico() {
        return fechFisico;
    }

    /**
     * Seta Estoque de fechamento
     */
    public void setFechFisico(Double fechFisico) {
        this.fechFisico = fechFisico;
    }
    
}