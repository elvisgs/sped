package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD;

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
    @Field(at = 1, name = "reg", rid = true, literal = "D161"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegD161 extends Registro {

    /**
     * Tipo de transporte
     * <p>0=Rodoviário;1=Ferroviário;2=Rodo-Ferroviário;3=Aquaviário;4=Dutoviário;5=Aéreo;9=Outros</p>
     */
    @Field(at = 2)
    private String indCarga;

    /**
     * CNPJ ou CPF do contribuinte na coleta
     */
    @Field(at = 3)
    private String cnpjCpfCol;

    /**
     * Inscrição Estadual na coleta
     */
    @Field(at = 4)
    private String ieCol;

    /**
     * Código do município na coleta
     */
    @Field(at = 5)
    private String codMunCol;

    /**
     * CNPJ ou CPF do contribuinte na entrega
     */
    @Field(at = 6)
    private String cnpjCpfEntg;

    /**
     * Inscrição Estadual na entrega
     */
    @Field(at = 7)
    private String ieEntg;

    /**
     * Código do município na entrega
     */
    @Field(at = 8)
    private String codMunEntg;


}
