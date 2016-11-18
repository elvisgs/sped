package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Local Coleta/Entrega
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C115"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class RegC115 extends Registro {

    /**
     * Tipo de carga
     * <p>0=Rodoviário;1=Ferroviário;2=Rodo-Ferroviário;3=Aquaviário;4=Dutoviário;5=Aéreo;9=Outros</p>
     */
    @Field(at = 2)
    private String indCarga;

    /**
     * CNPJ (coleta)
     */
    @Field(at = 3)
    private String cnpjCol;

    /**
     * IE (coleta)
     */
    @Field(at = 4)
    private String ieCol;

    /**
     * CPF (coleta)
     */
    @Field(at = 5)
    private String cpfCol;

    /**
     * Código do Município (coleta)
     */
    @Field(at = 6)
    private String codMunCol;

    /**
     * CNPJ (entrega)
     */
    @Field(at = 7)
    private String cnpjEntg;

    /**
     * IE (entrega)
     */
    @Field(at = 8)
    private String ieEntg;

    /**
     * CPF (entrega)
     */
    @Field(at = 9)
    private String cpfEntg;

    /**
     * Código do Município (entrega)
     */
    @Field(at = 10)
    private String codMunEntg;


}