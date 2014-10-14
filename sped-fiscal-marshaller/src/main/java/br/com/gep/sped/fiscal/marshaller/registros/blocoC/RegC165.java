package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Ope. Combustível
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C165"),
    @Field(at = 14, name = "fimLinha", literal = "")
})
public class RegC165 extends Registro {
    
    @Field(at = 2)
    private String codPart;
    
    @Field(at = 3)
    private String veicId;
    
    @Field(at = 4)
    private String codAut;
    
    @Field(at = 5)
    private String nrPasse;
    
    @Field(at = 6)
    private String hora;
    
    @Field(at = 7)
    private Double temper;
    
    @Field(at = 8)
    private Integer qtdVol;
    
    @Field(at = 9)
    private Double pesoBrt;
    
    @Field(at = 10)
    private Double pesoLiq;
    
    @Field(at = 11)
    private String nomMot;
    
    @Field(at = 12)
    private String cpf;
    
    @Field(at = 13)
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
     * Obtém Código da autorização/SEFAZ
     */
    public String getCodAut() {
        return codAut;
    }

    /**
     * Seta Código da autorização/SEFAZ
     */
    public void setCodAut(String codAut) {
        this.codAut = codAut;
    }
    
    /**
     * Obtém Número do Passe Fiscal
     */
    public String getNrPasse() {
        return nrPasse;
    }

    /**
     * Seta Número do Passe Fiscal
     */
    public void setNrPasse(String nrPasse) {
        this.nrPasse = nrPasse;
    }
    
    /**
     * Obtém Hora da saída
     */
    public String getHora() {
        return hora;
    }

    /**
     * Seta Hora da saída
     */
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    /**
     * Obtém Temperatura em graus Celsius
     */
    public Double getTemper() {
        return temper;
    }

    /**
     * Seta Temperatura em graus Celsius
     */
    public void setTemper(Double temper) {
        this.temper = temper;
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
     * Obtém Nome do motorista
     */
    public String getNomMot() {
        return nomMot;
    }

    /**
     * Seta Nome do motorista
     */
    public void setNomMot(String nomMot) {
        this.nomMot = nomMot;
    }
    
    /**
     * Obtém CPF do motorista
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Seta CPF do motorista
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
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