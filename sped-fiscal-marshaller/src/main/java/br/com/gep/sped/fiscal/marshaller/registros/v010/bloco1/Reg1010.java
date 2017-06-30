package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * OBRIGATORIEDADE DE REGISTROS DO BLOCO 1
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1010"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class Reg1010 extends Registro {

    /**
     * Reg. 1100
     * <p>S=Sim;N=Não</p>
     */
    @Field(at = 2)
    private String indExp;

    /**
     * Reg. 1200
     * <p>S=Sim;N=Não</p>
     */
    @Field(at = 3)
    private String indCcrf;

    /**
     * Reg. 1300
     * <p>S=Sim;N=Não</p>
     */
    @Field(at = 4)
    private String indComb;

    /**
     * Reg. 1390
     * <p>S=Sim;N=Não</p>
     */
    @Field(at = 5)
    private String indUsina;

    /**
     * Reg. 1400
     * <p>S=Sim;N=Não</p>
     */
    @Field(at = 6)
    private String indVa;

    /**
     * Reg. 1500
     * <p>S=Sim;N=Não</p>
     */
    @Field(at = 7)
    private String indEe;

    /**
     * Reg. 1600
     * <p>S=Sim;N=Não</p>
     */
    @Field(at = 8)
    private String indCart;

    /**
     * Reg. 1700
     * <p>S=Sim;N=Não</p>
     */
    @Field(at = 9)
    private String indForm;

    /**
     * Reg. 1800
     * <p>S=Sim;N=Não</p>
     */
    @Field(at = 10)
    private String indAer;


}
