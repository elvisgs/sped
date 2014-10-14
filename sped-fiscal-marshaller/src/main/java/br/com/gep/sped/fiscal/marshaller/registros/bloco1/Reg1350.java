package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Bombas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "1350"),
    @Field(at = 6, name = "fimLinha", literal = "")
})
public class Reg1350 extends Registro {
    
    @Field(at = 2)
    private String serie;
    
    @Field(at = 3)
    private String fabricante;
    
    @Field(at = 4)
    private String modelo;
    
    @Field(at = 5)
    private String tipoMedicao;
    
    /**
     * Obtém Número de série
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Seta Número de série
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    /**
     * Obtém Fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Seta Fabricante
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    /**
     * Obtém Modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Seta Modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /**
     * Obtém Identificador de medição
     */
    public String getTipoMedicao() {
        return tipoMedicao;
    }

    /**
     * Seta Identificador de medição
     * <p>0=Analógico;1=Digital</p>
     */
    public void setTipoMedicao(String tipoMedicao) {
        this.tipoMedicao = tipoMedicao;
    }
    
}