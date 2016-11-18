package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Veículo Novo
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C175"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class RegC175 extends Registro {

    /**
     * Tipo de operação com veículo
     * <p>0=Venda para concessionária;1=Faturamento direto;2=Venda direta;3=Venda da concessionária;9=Outros</p>
     */
    @Field(at = 2)
    private String indVeicOper;

    /**
     * CNPJ da Concessionária
     */
    @Field(at = 3)
    private String cnpj;

    /**
     * UF da Concessionária
     */
    @Field(at = 4)
    private String uf;

    /**
     * Chassi do veículo
     */
    @Field(at = 5)
    private String chassiVeic;


}