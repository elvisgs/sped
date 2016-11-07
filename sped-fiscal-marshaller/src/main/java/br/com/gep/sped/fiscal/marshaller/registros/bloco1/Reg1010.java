package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * OBRIGATORIEDADE DE REGISTROS DO BLOCO 1
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1010"),
    @Field(at = 11, name = "fimLinha")
})
public class Reg1010 extends Registro {
    
    @Field(at = 2)
    private String indExp;
    
    @Field(at = 3)
    private String indCcrf;
    
    @Field(at = 4)
    private String indComb;
    
    @Field(at = 5)
    private String indUsina;
    
    @Field(at = 6)
    private String indVa;
    
    @Field(at = 7)
    private String indEe;
    
    @Field(at = 8)
    private String indCart;
    
    @Field(at = 9)
    private String indForm;
    
    @Field(at = 10)
    private String indAer;
    
    /**
     * Obtém Reg. 1100
     */
    public String getIndExp() {
        return indExp;
    }

    /**
     * Seta Reg. 1100
     * <p>S=Sim;N=Não</p>
     */
    public void setIndExp(String indExp) {
        this.indExp = indExp;
    }
    
    /**
     * Obtém Reg. 1200
     */
    public String getIndCcrf() {
        return indCcrf;
    }

    /**
     * Seta Reg. 1200
     * <p>S=Sim;N=Não</p>
     */
    public void setIndCcrf(String indCcrf) {
        this.indCcrf = indCcrf;
    }
    
    /**
     * Obtém Reg. 1300
     */
    public String getIndComb() {
        return indComb;
    }

    /**
     * Seta Reg. 1300
     * <p>S=Sim;N=Não</p>
     */
    public void setIndComb(String indComb) {
        this.indComb = indComb;
    }
    
    /**
     * Obtém Reg. 1390
     */
    public String getIndUsina() {
        return indUsina;
    }

    /**
     * Seta Reg. 1390
     * <p>S=Sim;N=Não</p>
     */
    public void setIndUsina(String indUsina) {
        this.indUsina = indUsina;
    }
    
    /**
     * Obtém Reg. 1400
     */
    public String getIndVa() {
        return indVa;
    }

    /**
     * Seta Reg. 1400
     * <p>S=Sim;N=Não</p>
     */
    public void setIndVa(String indVa) {
        this.indVa = indVa;
    }
    
    /**
     * Obtém Reg. 1500
     */
    public String getIndEe() {
        return indEe;
    }

    /**
     * Seta Reg. 1500
     * <p>S=Sim;N=Não</p>
     */
    public void setIndEe(String indEe) {
        this.indEe = indEe;
    }
    
    /**
     * Obtém Reg. 1600
     */
    public String getIndCart() {
        return indCart;
    }

    /**
     * Seta Reg. 1600
     * <p>S=Sim;N=Não</p>
     */
    public void setIndCart(String indCart) {
        this.indCart = indCart;
    }
    
    /**
     * Obtém Reg. 1700
     */
    public String getIndForm() {
        return indForm;
    }

    /**
     * Seta Reg. 1700
     * <p>S=Sim;N=Não</p>
     */
    public void setIndForm(String indForm) {
        this.indForm = indForm;
    }
    
    /**
     * Obtém Reg. 1800
     */
    public String getIndAer() {
        return indAer;
    }

    /**
     * Seta Reg. 1800
     * <p>S=Sim;N=Não</p>
     */
    public void setIndAer(String indAer) {
        this.indAer = indAer;
    }
    
}