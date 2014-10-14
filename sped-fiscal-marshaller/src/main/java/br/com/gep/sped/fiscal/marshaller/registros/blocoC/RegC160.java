package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Vol. Transportado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C160"),
    @Field(at = 8, name = "fimLinha", literal = "")
})
public class RegC160 extends Registro {
    
    @Field(at = 2)
    private String codPart;
    
    @Field(at = 3)
    private String veicId;
    
    @Field(at = 4)
    private Integer qtdVol;
    
    @Field(at = 5)
    private Double pesoBrt;
    
    @Field(at = 6)
    private Double pesoLiq;
    
    @Field(at = 7)
    private String ufId;
    
    /**
     * Obtém Código do participante
     */
    public String getCodPart() {
        return codPart;
    }

    /**
     * Seta Código do participante
     */
    public void setCodPart(String codPart) {
        this.codPart = codPart;
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
     * Obtém Quantidade de volumes
     */
    public Integer getQtdVol() {
        return qtdVol;
    }

    /**
     * Seta Quantidade de volumes
     */
    public void setQtdVol(Integer qtdVol) {
        this.qtdVol = qtdVol;
    }
    
    /**
     * Obtém Peso bruto
     */
    public Double getPesoBrt() {
        return pesoBrt;
    }

    /**
     * Seta Peso bruto
     */
    public void setPesoBrt(Double pesoBrt) {
        this.pesoBrt = pesoBrt;
    }
    
    /**
     * Obtém Peso líquido
     */
    public Double getPesoLiq() {
        return pesoLiq;
    }

    /**
     * Seta Peso líquido
     */
    public void setPesoLiq(Double pesoLiq) {
        this.pesoLiq = pesoLiq;
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