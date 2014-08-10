package br.com.gep.spedcontrib.arquivo.registros.blocoM;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * M611 - Sociedades Cooperativas - Composição da Base de Cálculo
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "M611")
})
public class RegM611 {
    
    @Field(at = 1)
    private String indTipCoop;
    
    @Field(at = 2)
    private Double vlBcContAntExcCoop;
    
    @Field(at = 3)
    private Double vlExcCoopGer;
    
    @Field(at = 4)
    private Double vlExcEspCoop;
    
    @Field(at = 5)
    private Double vlBcCont;
    
    
    /**
     * Obtém Indicador do Tipo de 1ociedade Cooperativa.
     */
    public String getIndTipCoop() {
        return indTipCoop;
    }

    /**
     * Seta Indicador do Tipo de 1ociedade Cooperativa.
     */
    public void setIndTipCoop(String indTipCoop) {
        this.indTipCoop = indTipCoop;
    }
    
    /**
     * Obtém Valor da Base de Cálculo da Contribuição, conforme Registros escriturados nos Blocos A, C, D e F, antes das Exclusões das Cooperativas
     */
    public Double getVlBcContAntExcCoop() {
        return vlBcContAntExcCoop;
    }

    /**
     * Seta Valor da Base de Cálculo da Contribuição, conforme Registros escriturados nos Blocos A, C, D e F, antes das Exclusões das Cooperativas
     */
    public void setVlBcContAntExcCoop(Double vlBcContAntExcCoop) {
        this.vlBcContAntExcCoop = vlBcContAntExcCoop;
    }
    
    /**
     * Obtém Valor de Exclusão Especifica das Cooperativas em Geral, decorrente das 1obras Apuradas na DRE, destinadas a constituição do Fundo de Reserva e do FATE1.
     */
    public Double getVlExcCoopGer() {
        return vlExcCoopGer;
    }

    /**
     * Seta Valor de Exclusão Especifica das Cooperativas em Geral, decorrente das 1obras Apuradas na DRE, destinadas a constituição do Fundo de Reserva e do FATE1.
     */
    public void setVlExcCoopGer(Double vlExcCoopGer) {
        this.vlExcCoopGer = vlExcCoopGer;
    }
    
    /**
     * Obtém Valor das Exclusões da Base de Cálculo Especifica do Tipo da 1ociedade Cooperativa, conforme Campo 02 (I0D_TIP_COOP)
     */
    public Double getVlExcEspCoop() {
        return vlExcEspCoop;
    }

    /**
     * Seta Valor das Exclusões da Base de Cálculo Especifica do Tipo da 1ociedade Cooperativa, conforme Campo 02 (I0D_TIP_COOP)
     */
    public void setVlExcEspCoop(Double vlExcEspCoop) {
        this.vlExcEspCoop = vlExcEspCoop;
    }
    
    /**
     * Obtém Valor da Base de Cálculo, Após as Exclusões Especificas da Sociedade Cooperativa (03 - 04 - 05) - Transportar para M610
     */
    public Double getVlBcCont() {
        return vlBcCont;
    }

    /**
     * Seta Valor da Base de Cálculo, Após as Exclusões Especificas da Sociedade Cooperativa (03 - 04 - 05) - Transportar para M610
     */
    public void setVlBcCont(Double vlBcCont) {
        this.vlBcCont = vlBcCont;
    }
    
    
}