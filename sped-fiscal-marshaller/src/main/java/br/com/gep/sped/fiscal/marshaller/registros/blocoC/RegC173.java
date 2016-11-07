package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Medicamento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C173"),
    @Field(at = 9, name = "fimLinha")
})
public class RegC173 extends Registro {
    
    @Field(at = 2)
    private String loteMed;
    
    @Field(at = 3)
    private Double qtdItem;
    
    @Field(at = 4)
    private Date dtFab;
    
    @Field(at = 5)
    private Date dtVal;
    
    @Field(at = 6)
    private String indMed;
    
    @Field(at = 7)
    private String tpProd;
    
    @Field(at = 8)
    private Double vlTabMax;
    
    /**
     * Obtém Número do lote de fabricação
     */
    public String getLoteMed() {
        return loteMed;
    }

    /**
     * Seta Número do lote de fabricação
     */
    public void setLoteMed(String loteMed) {
        this.loteMed = loteMed;
    }
    
    /**
     * Obtém Quantidade de item por lote
     */
    public Double getQtdItem() {
        return qtdItem;
    }

    /**
     * Seta Quantidade de item por lote
     */
    public void setQtdItem(Double qtdItem) {
        this.qtdItem = qtdItem;
    }
    
    /**
     * Obtém Data de fabricação
     */
    public Date getDtFab() {
        return dtFab;
    }

    /**
     * Seta Data de fabricação
     */
    public void setDtFab(Date dtFab) {
        this.dtFab = dtFab;
    }
    
    /**
     * Obtém Data de expiração
     */
    public Date getDtVal() {
        return dtVal;
    }

    /**
     * Seta Data de expiração
     */
    public void setDtVal(Date dtVal) {
        this.dtVal = dtVal;
    }
    
    /**
     * Obtém Referência base cálculo ICMS ST
     */
    public String getIndMed() {
        return indMed;
    }

    /**
     * Seta Referência base cálculo ICMS ST
     * <p>0=Base de cálculo referente ao preço tabelado ou preço máximo sugerido;1=Base cálculo – Margem de valor agregado;2=Base de cálculo referente à Lista Negativa;3=Base de cálculo referente à Lista Positiva;4=Base de cálculo referente à Lista Neutra</p>
     */
    public void setIndMed(String indMed) {
        this.indMed = indMed;
    }
    
    /**
     * Obtém Tipo de produto
     */
    public String getTpProd() {
        return tpProd;
    }

    /**
     * Seta Tipo de produto
     * <p>0=Similar;1=Genérico;2=Ético ou de marca</p>
     */
    public void setTpProd(String tpProd) {
        this.tpProd = tpProd;
    }
    
    /**
     * Obtém Preço tabelado ou máximo
     */
    public Double getVlTabMax() {
        return vlTabMax;
    }

    /**
     * Seta Preço tabelado ou máximo
     */
    public void setVlTabMax(Double vlTabMax) {
        this.vlTabMax = vlTabMax;
    }
    
}