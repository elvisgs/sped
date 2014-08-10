package br.com.gep.spedcontrib.arquivo.registros.blocoC;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C400 - Equipamento ECF - Saída de Mercadoria
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "C400")
})
public class RegC400 {
    
    @Field(at = 1)
    private String codMod;
    
    @Field(at = 2)
    private String ecfMod;
    
    @Field(at = 3)
    private String ecfFab;
    
    @Field(at = 4)
    private String ecfCx;
    
    
    /**
     * Obtém Modelo do Documento Fiscal
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Modelo do Documento Fiscal
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Modelo do equipamento
     */
    public String getEcfMod() {
        return ecfMod;
    }

    /**
     * Seta Modelo do equipamento
     */
    public void setEcfMod(String ecfMod) {
        this.ecfMod = ecfMod;
    }
    
    /**
     * Obtém Número de série de fabricação do ECF
     */
    public String getEcfFab() {
        return ecfFab;
    }

    /**
     * Seta Número de série de fabricação do ECF
     */
    public void setEcfFab(String ecfFab) {
        this.ecfFab = ecfFab;
    }
    
    /**
     * Obtém Número do caixa atribuído ao ECF
     */
    public String getEcfCx() {
        return ecfCx;
    }

    /**
     * Seta Número do caixa atribuído ao ECF
     */
    public void setEcfCx(String ecfCx) {
        this.ecfCx = ecfCx;
    }
    
    
}