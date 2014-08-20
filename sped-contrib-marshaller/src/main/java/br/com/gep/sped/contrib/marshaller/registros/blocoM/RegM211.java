package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M211 - Sociedades Cooperativas - Composição Da Base De Calculo
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "M211"),
    @Field(at = 7, name = "fimLinha", literal = "")
})
public class RegM211 extends Registro {
    
    @Field(at = 2)
    private String indTipCoop;
    
    @Field(at = 3)
    private Double vlBcContAntExcCoop;
    
    @Field(at = 4)
    private Double vlExcCoopGer;
    
    @Field(at = 5)
    private Double vlExcEspCoop;
    
    @Field(at = 6)
    private Double vlBcCont;
    
    
    /**
     * Obtém Indicador do Tipo de Sociedade Cooperativa.
     */
    public String getIndTipCoop() {
        return indTipCoop;
    }

    /**
     * Seta Indicador do Tipo de Sociedade Cooperativa.
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
     * Obtém Valor de Exclusão Especifica das Cooperativas em Geral, decorrente das Sobras Apuradas na DRE, destinadas a constituição do Fundo de Reserva e do FATES.
     */
    public Double getVlExcCoopGer() {
        return vlExcCoopGer;
    }

    /**
     * Seta Valor de Exclusão Especifica das Cooperativas em Geral, decorrente das Sobras Apuradas na DRE, destinadas a constituição do Fundo de Reserva e do FATES.
     */
    public void setVlExcCoopGer(Double vlExcCoopGer) {
        this.vlExcCoopGer = vlExcCoopGer;
    }
    
    /**
     * Obtém Valor das Exclusões da Base de Cálculo Especifica do Tipo da Sociedade Cooperativa, conforme Campo 02 (IND_TIP_COOP)
     */
    public Double getVlExcEspCoop() {
        return vlExcEspCoop;
    }

    /**
     * Seta Valor das Exclusões da Base de Cálculo Especifica do Tipo da Sociedade Cooperativa, conforme Campo 02 (IND_TIP_COOP)
     */
    public void setVlExcEspCoop(Double vlExcEspCoop) {
        this.vlExcEspCoop = vlExcEspCoop;
    }
    
    /**
     * Obtém Valor da Base de Cálculo, após as Exclusões Especificas da Sociedade Cooperativa (03 - 04 - 05) - Transportar para M210
     */
    public Double getVlBcCont() {
        return vlBcCont;
    }

    /**
     * Seta Valor da Base de Cálculo, após as Exclusões Especificas da Sociedade Cooperativa (03 - 04 - 05) - Transportar para M210
     */
    public void setVlBcCont(Double vlBcCont) {
        this.vlBcCont = vlBcCont;
    }
    
    
}