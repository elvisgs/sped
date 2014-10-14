package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Bens/Componentes do Ativo Imobilizado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0300"),
    @Field(at = 8, name = "fimLinha", literal = "")
})
public class Reg0300 extends Registro {
    
    @Field(at = 2)
    private String codIndBem;
    
    @Field(at = 3)
    private String identMerc;
    
    @Field(at = 4)
    private String descrItem;
    
    @Field(at = 5)
    private String codPrnc;
    
    @Field(at = 6)
    private String codCta;
    
    @Field(at = 7)
    private String nrParc;
    
    /**
     * Obtém Código do bem
     */
    public String getCodIndBem() {
        return codIndBem;
    }

    /**
     * Seta Código do bem
     */
    public void setCodIndBem(String codIndBem) {
        this.codIndBem = codIndBem;
    }
    
    /**
     * Obtém Tipo de mercadoria
     */
    public String getIdentMerc() {
        return identMerc;
    }

    /**
     * Seta Tipo de mercadoria
     * <p>1=bem;2=componente</p>
     */
    public void setIdentMerc(String identMerc) {
        this.identMerc = identMerc;
    }
    
    /**
     * Obtém Descrição do bem
     */
    public String getDescrItem() {
        return descrItem;
    }

    /**
     * Seta Descrição do bem
     */
    public void setDescrItem(String descrItem) {
        this.descrItem = descrItem;
    }
    
    /**
     * Obtém Código do bem principal
     */
    public String getCodPrnc() {
        return codPrnc;
    }

    /**
     * Seta Código do bem principal
     */
    public void setCodPrnc(String codPrnc) {
        this.codPrnc = codPrnc;
    }
    
    /**
     * Obtém Código da conta
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Código da conta
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
    /**
     * Obtém Número de parcelas
     */
    public String getNrParc() {
        return nrParc;
    }

    /**
     * Seta Número de parcelas
     */
    public void setNrParc(String nrParc) {
        this.nrParc = nrParc;
    }
    
}