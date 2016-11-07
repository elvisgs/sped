package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Movimentação Diária
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1300"),
    @Field(at = 12, name = "fimLinha")
})
public class Reg1300 extends Registro {
    
    @Field(at = 2)
    private String codItem;
    
    @Field(at = 3)
    private Date dtFech;
    
    @Field(at = 4)
    private Double estqAbert;
    
    @Field(at = 5)
    private Double volEntr;
    
    @Field(at = 6)
    private Double volDisp;
    
    @Field(at = 7)
    private Double volSaidas;
    
    @Field(at = 8)
    private Double estqEscr;
    
    @Field(at = 9)
    private Double valAjPerda;
    
    @Field(at = 10)
    private Double valAjGanho;
    
    @Field(at = 11)
    private Double fechFisico;
    
    /**
     * Obtém Código do produto
     */
    public String getCodItem() {
        return codItem;
    }

    /**
     * Seta Código do produto
     */
    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    
    /**
     * Obtém Data do fechamento
     */
    public Date getDtFech() {
        return dtFech;
    }

    /**
     * Seta Data do fechamento
     */
    public void setDtFech(Date dtFech) {
        this.dtFech = dtFech;
    }
    
    /**
     * Obtém Estoque no inicio do dia
     */
    public Double getEstqAbert() {
        return estqAbert;
    }

    /**
     * Seta Estoque no inicio do dia
     */
    public void setEstqAbert(Double estqAbert) {
        this.estqAbert = estqAbert;
    }
    
    /**
     * Obtém Volume total das entradas
     */
    public Double getVolEntr() {
        return volEntr;
    }

    /**
     * Seta Volume total das entradas
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