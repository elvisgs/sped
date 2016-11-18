package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M605 - Detalhamento por Código de Receita (Visão DCTF)
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "M605"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class RegM605 extends Registro {

    /**
     * Informar o número do campo do registro M600
     * <p>08=Valor da contribuição não-cumulativa a recolher;12=Valor da contribuição cumulativa a recolher</p>
     */
    @Field(at = 2)
    private String numCampo;

    /**
     * Informar o Código da Receita referente à contribuição a recolher, detalhada neste registro
     */
    @Field(at = 3)
    private String codRec;

    /**
     * Valor do Débito correspondente à contribuição a recolher, detalhada neste registro
     */
    @Field(at = 4)
    private Double vlDebito;


}