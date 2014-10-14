package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Cupom Fiscal
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C114"),
    @Field(at = 7, name = "fimLinha", literal = "")
})
public class RegC114 extends Registro {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private String ecfFab;
    
    @Field(at = 4)
    private String ecfCx;
    
    @Field(at = 5)
    private String numDoc;
    
    @Field(at = 6)
    private Date dtDoc;
    
    /**
     * Obtém Código do modelo do documento
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo do documento
     * <p>02=Nota Fiscal de Venda a Consumidor;2D=Cupom Fiscal emitido por ECF;2E=Bilhete de Passagem emitido por ECF</p>
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Série de fabricação do ECF
     */
    public String getEcfFab() {
        return ecfFab;
    }

    /**
     * Seta Série de fabricação do ECF
     */
    public void setEcfFab(String ecfFab) {
        this.ecfFab = ecfFab;
    }
    
    /**
     * Obtém Caixa atribuído ao ECF
     */
    public String getEcfCx() {
        return ecfCx;
    }

    /**
     * Seta Caixa atribuído ao ECF
     */
    public void setEcfCx(String ecfCx) {
        this.ecfCx = ecfCx;
    }
    
    /**
     * Obtém Número do documento
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Seta Número do documento
     */
    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    
    /**
     * Obtém Data da emissão
     */
    public Date getDtDoc() {
        return dtDoc;
    }

    /**
     * Seta Data da emissão
     */
    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    
}