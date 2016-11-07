package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Lacres
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1360"),
    @Field(at = 4, name = "fimLinha")
})
public class Reg1360 extends Registro {
    
    @Field(at = 2)
    private String numLacre;
    
    @Field(at = 3)
    private Date datAplicacao;
    
    /**
     * Obtém Número do lacre
     */
    public String getNumLacre() {
        return numLacre;
    }

    /**
     * Seta Número do lacre
     */
    public void setNumLacre(String numLacre) {
        this.numLacre = numLacre;
    }
    
    /**
     * Obtém Data de aplicação
     */
    public Date getDatAplicacao() {
        return datAplicacao;
    }

    /**
     * Seta Data de aplicação
     */
    public void setDatAplicacao(Date datAplicacao) {
        this.datAplicacao = datAplicacao;
    }
    
}