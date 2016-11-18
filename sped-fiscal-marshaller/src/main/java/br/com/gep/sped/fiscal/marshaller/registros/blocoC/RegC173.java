package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
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
@Getter
@Setter
public class RegC173 extends Registro {

    /**
     * Número do lote de fabricação
     */
    @Field(at = 2)
    private String loteMed;

    /**
     * Quantidade de item por lote
     */
    @Field(at = 3)
    private Double qtdItem;

    /**
     * Data de fabricação
     */
    @Field(at = 4)
    private Date dtFab;

    /**
     * Data de expiração
     */
    @Field(at = 5)
    private Date dtVal;

    /**
     * Referência base cálculo ICMS ST
     * <p>0=Base de cálculo referente ao preço tabelado ou preço máximo sugerido;1=Base cálculo – Margem de valor agregado;2=Base de cálculo referente à Lista Negativa;3=Base de cálculo referente à Lista Positiva;4=Base de cálculo referente à Lista Neutra</p>
     */
    @Field(at = 6)
    private String indMed;

    /**
     * Tipo de produto
     * <p>0=Similar;1=Genérico;2=Ético ou de marca</p>
     */
    @Field(at = 7)
    private String tpProd;

    /**
     * Preço tabelado ou máximo
     */
    @Field(at = 8)
    private Double vlTabMax;


}