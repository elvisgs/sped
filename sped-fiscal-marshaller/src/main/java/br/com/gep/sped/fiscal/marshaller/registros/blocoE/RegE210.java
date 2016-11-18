package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Valores de Apuração
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E210"),
    @Field(at = 16, name = "fimLinha")
})
@Getter
@Setter
public class RegE210 extends Registro {

    /**
     * Indicador de movimento
     * <p>0=Sem operações com ST;1=Com operações de ST</p>
     */
    @Field(at = 2)
    private String indMovSt;

    /**
     * Saldo credor do período anterior - ST
     */
    @Field(at = 3)
    private Double vlSldCredAntSt;

    /**
     * Valor total ICMS ST devol. mercadoria
     */
    @Field(at = 4)
    private Double vlDevolSt;

    /**
     * Valor total ICMS ST - ressarcimentos
     */
    @Field(at = 5)
    private Double vlRessarcSt;

    /**
     * Valor total - outros créditos ST
     */
    @Field(at = 6)
    private Double vlOutCredSt;

    /**
     * Valor ajustes a crédito ICMS ST (doc fiscal)
     */
    @Field(at = 7)
    private Double vlAjCreditosSt;

    /**
     * Valor total do ICMS retido ST
     */
    @Field(at = 8)
    private Double vlRetencaoSt;

    /**
     * Valor total - outros débitos ST
     */
    @Field(at = 9)
    private Double vlOutDebSt;

    /**
     * Valor ajustes a débito ICMS ST (doc fiscal)
     */
    @Field(at = 10)
    private Double vlAjDebitosSt;

    /**
     * Valor do saldo devedor antes das deduções
     */
    @Field(at = 11)
    private Double vlSldDevAntSt;

    /**
     * Valor total das deduções ST
     */
    @Field(at = 12)
    private Double vlDeducoesSt;

    /**
     * Valor total do ICMS a recolher ST
     */
    @Field(at = 13)
    private Double vlIcmsRecolSt;

    /**
     * Valor do saldo credor do ICMS ST
     */
    @Field(at = 14)
    private Double vlSldCredStTransportar;

    /**
     * Valores recolhidos ou a recolher, extra-apuração
     */
    @Field(at = 15)
    private Double debEspSt;


}