package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Complemento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D120"),
    @Field(at = 6, name = "fimLinha")
})
public class RegD120 extends Registro {
    
    @Field(at = 2)
    private String codMunOrig;
    
    @Field(at = 3)
    private String codMunDest;
    
    @Field(at = 4)
    private String veicId;
    
    @Field(at = 5)
    private String ufId;
    
    /**
     * Obtém Código do município de origem
     */
    public String getCodMunOrig() {
        return codMunOrig;
    }

    /**
     * Seta Código do município de origem
     */
    public void setCodMunOrig(String codMunOrig) {
        this.codMunOrig = codMunOrig;
    }
    
    /**
     * Obtém Código do município de destino
     */
    public String getCodMunDest() {
        return codMunDest;
    }

    /**
     * Seta Código do município de destino
     */
    public void setCodMunDest(String codMunDest) {
        this.codMunDest = codMunDest;
    }
    
    /**
     * Obtém Placa do veículo
     */
    public String getVeicId() {
        return veicId;
    }

    /**
     * Seta Placa do veículo
     */
    public void setVeicId(String veicId) {
        this.veicId = veicId;
    }
    
    /**
     * Obtém Sigla da UF da placa do veículo
     */
    public String getUfId() {
        return ufId;
    }

    /**
     * Seta Sigla da UF da placa do veículo
     */
    public void setUfId(String ufId) {
        this.ufId = ufId;
    }
    
}