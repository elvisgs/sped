package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Volume de Vendas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1320"),
    @Field(at = 12, name = "fimLinha")
})
public class Reg1320 extends Registro {
    
    @Field(at = 2)
    private Integer numBico;
    
    @Field(at = 3)
    private Integer nrInterv;
    
    @Field(at = 4)
    private String motInterv;
    
    @Field(at = 5)
    private String nomInterv;
    
    @Field(at = 6)
    private String cnpjInterv;
    
    @Field(at = 7)
    private String cpfInterv;
    
    @Field(at = 8)
    private Double valFecha;
    
    @Field(at = 9)
    private Double valAbert;
    
    @Field(at = 10)
    private Double volAferi;
    
    @Field(at = 11)
    private Double volVendas;
    
    /**
     * Obtém Bico ligado à bomba
     */
    public Integer getNumBico() {
        return numBico;
    }

    /**
     * Seta Bico ligado à bomba
     */
    public void setNumBico(Integer numBico) {
        this.numBico = numBico;
    }
    
    /**
     * Obtém Número da intervenção
     */
    public Integer getNrInterv() {
        return nrInterv;
    }

    /**
     * Seta Número da intervenção
     */
    public void setNrInterv(Integer nrInterv) {
        this.nrInterv = nrInterv;
    }
    
    /**
     * Obtém Motivo da intervenção
     */
    public String getMotInterv() {
        return motInterv;
    }

    /**
     * Seta Motivo da intervenção
     */
    public void setMotInterv(String motInterv) {
        this.motInterv = motInterv;
    }
    
    /**
     * Obtém Nome do interventor
     */
    public String getNomInterv() {
        return nomInterv;
    }

    /**
     * Seta Nome do interventor
     */
    public void setNomInterv(String nomInterv) {
        this.nomInterv = nomInterv;
    }
    
    /**
     * Obtém CNPJ da empresa responsável pela intervenção
     */
    public String getCnpjInterv() {
        return cnpjInterv;
    }

    /**
     * Seta CNPJ da empresa responsável pela intervenção
     */
    public void setCnpjInterv(String cnpjInterv) {
        this.cnpjInterv = cnpjInterv;
    }
    
    /**
     * Obtém CPF do técnico responsável pela intervenção
     */
    public String getCpfInterv() {
        return cpfInterv;
    }

    /**
     * Seta CPF do técnico responsável pela intervenção
     */
    public void setCpfInterv(String cpfInterv) {
        this.cpfInterv = cpfInterv;
    }
    
    /**
     * Obtém Valor da leitura final do contador, no fechamento do bico
     */
    public Double getValFecha() {
        return valFecha;
    }

    /**
     * Seta Valor da leitura final do contador, no fechamento do bico
     */
    public void setValFecha(Double valFecha) {
        this.valFecha = valFecha;
    }
    
    /**
     * Obtém Valor da leitura inicial do contador, na abertura do bico
     */
    public Double getValAbert() {
        return valAbert;
    }

    /**
     * Seta Valor da leitura inicial do contador, na abertura do bico
     */
    public void setValAbert(Double valAbert) {
        this.valAbert = valAbert;
    }
    
    /**
     * Obtém Aferição da bomba, em litros
     */
    public Double getVolAferi() {
        return volAferi;
    }

    /**
     * Seta Aferição da bomba, em litros
     */
    public void setVolAferi(Double volAferi) {
        this.volAferi = volAferi;
    }
    
    /**
     * Obtém Venda (08 - 09 - 10) do bico, em litros
     */
    public Double getVolVendas() {
        return volVendas;
    }

    /**
     * Seta Venda (08 - 09 - 10) do bico, em litros
     */
    public void setVolVendas(Double volVendas) {
        this.volVendas = volVendas;
    }
    
}