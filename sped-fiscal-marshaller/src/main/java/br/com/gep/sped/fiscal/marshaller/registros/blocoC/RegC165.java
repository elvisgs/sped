package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Ope. Combustível
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C165"),
    @Field(at = 14, name = "fimLinha")
})
@Getter
@Setter
public class RegC165 extends Registro {

    /**
     * Código do participante
     */
    @Field(at = 2)
    private String codPart;

    /**
     * Placa do veículo
     */
    @Field(at = 3)
    private String veicId;

    /**
     * Código da autorização/SEFAZ
     */
    @Field(at = 4)
    private String codAut;

    /**
     * Número do Passe Fiscal
     */
    @Field(at = 5)
    private String nrPasse;

    /**
     * Hora da saída
     */
    @Field(at = 6)
    private String hora;

    /**
     * Temperatura em graus Celsius
     */
    @Field(at = 7)
    private Double temper;

    /**
     * Quantidade de volumes
     */
    @Field(at = 8)
    private Integer qtdVol;

    /**
     * Peso bruto
     */
    @Field(at = 9)
    private Double pesoBrt;

    /**
     * Peso líquido
     */
    @Field(at = 10)
    private Double pesoLiq;

    /**
     * Nome do motorista
     */
    @Field(at = 11)
    private String nomMot;

    /**
     * CPF do motorista
     */
    @Field(at = 12)
    private String cpf;

    /**
     * Sigla da UF da placa do veículo
     */
    @Field(at = 13)
    private String ufId;


}