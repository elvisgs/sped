package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Totalizador Parcial
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D365"),
    @Field(at = 6, name = "fimLinha")
})
public class RegD365 extends Registro {
    
    @Field(at = 2)
    private String codTotPar;
    
    @Field(at = 3)
    private Double vlrAcumTot;
    
    @Field(at = 4)
    private String nrTot;
    
    @Field(at = 5)
    private String descrNrTot;
    
    /**
     * Obtém Código do totalizador
     */
    public String getCodTotPar() {
        return codTotPar;
    }

    /**
     * Seta Código do totalizador
     */
    public void setCodTotPar(String codTotPar) {
        this.codTotPar = codTotPar;
    }
    
    /**
     * Obtém Valor acumulado no totalizador
     */
    public Double getVlrAcumTot() {
        return vlrAcumTot;
    }

    /**
     * Seta Valor acumulado no totalizador
     */
    public void setVlrAcumTot(Double vlrAcumTot) {
        this.vlrAcumTot = vlrAcumTot;
    }
    
    /**
     * Obtém Número do totalizador
     */
    public String getNrTot() {
        return nrTot;
    }

    /**
     * Seta Número do totalizador
     */
    public void setNrTot(String nrTot) {
        this.nrTot = nrTot;
    }
    
    /**
     * Obtém Descrição da situação tributária
     */
    public String getDescrNrTot() {
        return descrNrTot;
    }

    /**
     * Seta Descrição da situação tributária
     */
    public void setDescrNrTot(String descrNrTot) {
        this.descrNrTot = descrNrTot;
    }
    
}