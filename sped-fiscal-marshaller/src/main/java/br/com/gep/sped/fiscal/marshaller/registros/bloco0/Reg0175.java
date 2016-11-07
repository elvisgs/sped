package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Alterações
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0175"),
    @Field(at = 5, name = "fimLinha")
})
public class Reg0175 extends Registro {
    
    @Field(at = 2)
    private Date dtAlt;
    
    @Field(at = 3)
    private String nrCampo;
    
    @Field(at = 4)
    private String contAnt;
    
    /**
     * Obtém Data de alteração
     */
    public Date getDtAlt() {
        return dtAlt;
    }

    /**
     * Seta Data de alteração
     */
    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }
    
    /**
     * Obtém Número do campo alterado
     */
    public String getNrCampo() {
        return nrCampo;
    }

    /**
     * Seta Número do campo alterado
     * <p>03=Nome;04=Código do País;05=CNPJ;06=CPF;08=Código do Município;09=Inscrição na Suframa;10=Logradouro;11=Número;12=Complemento;13=Bairro;</p>
     */
    public void setNrCampo(String nrCampo) {
        this.nrCampo = nrCampo;
    }
    
    /**
     * Obtém Conteúdo anterior
     */
    public String getContAnt() {
        return contAnt;
    }

    /**
     * Seta Conteúdo anterior
     */
    public void setContAnt(String contAnt) {
        this.contAnt = contAnt;
    }
    
}