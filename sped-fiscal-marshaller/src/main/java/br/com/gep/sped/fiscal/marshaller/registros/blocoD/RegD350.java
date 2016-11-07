package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Equipamento ECF
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D350"),
    @Field(at = 6, name = "fimLinha")
})
public class RegD350 extends Registro {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private String ecfMod;
    
    @Field(at = 4)
    private String ecfFab;
    
    @Field(at = 5)
    private String ecfCx;
    
    /**
     * Obtém Código do modelo
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo
     * <p>2E=Bilhete de Passagem emitido por ECF;13=Bilhete de Passagem Rodoviário;14=Bilhete de Passagem Aquaviário;15=Bilhete de Passagem e Nota de Bagagem;16=Bilhete de Passagem Ferroviário</p>
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
     * Obtém Número série de fabricação
     */
    public String getEcfFab() {
        return ecfFab;
    }

    /**
     * Seta Número série de fabricação
     */
    public void setEcfFab(String ecfFab) {
        this.ecfFab = ecfFab;
    }
    
    /**
     * Obtém Número do caixa
     */
    public String getEcfCx() {
        return ecfCx;
    }

    /**
     * Seta Número do caixa
     */
    public void setEcfCx(String ecfCx) {
        this.ecfCx = ecfCx;
    }
    
}