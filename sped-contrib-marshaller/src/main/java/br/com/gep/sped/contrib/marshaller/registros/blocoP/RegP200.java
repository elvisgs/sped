package br.com.gep.sped.contrib.marshaller.registros.blocoP;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * P200 - Consolidação da Contribuição Previdenciária sobre a Receita Bruta
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "P200"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class RegP200 extends Registro {

    /**
     * Período de referência da escrituração (MMAAAA)
     */
    @Field(at = 2)
    private String perRef;

    /**
     * Valor total apurado da Contribuição Previdenciária sobre a Receita Bruta
     */
    @Field(at = 3)
    private Double vlTotContApu;

    /**
     * Valor total de “Ajustes de redução”
     */
    @Field(at = 4)
    private Double vlTotAjReduc;

    /**
     * Valor total de “Ajustes de acréscimo”
     */
    @Field(at = 5)
    private Double vlTotAjAcres;

    /**
     * Valor total da Contribuição Previdenciária sobre a Receita Bruta a recolher
     */
    @Field(at = 6)
    private Double vlTotContDev;

    /**
     * Código de Receita referente à Contribuição Previdenciária, conforme informado em DCTF
     */
    @Field(at = 7)
    private String codRec;


}