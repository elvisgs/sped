package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * M510 - Ajustes do Crédito de COFINS Apurado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "M510"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class RegM510 extends Registro {

    /**
     * Indicador do tipo de ajuste.
     * <p>0=Ajuste de redução;1=Ajuste de acréscimo</p>
     */
    @Field(at = 2)
    private String indAj;

    /**
     * Valor do ajuste
     */
    @Field(at = 3)
    private Double vlAj;

    /**
     * Código do ajuste, conforme a Tabela indicada no item 4.3.8.
     */
    @Field(at = 4)
    private String codAj;

    /**
     * Número do documento / processo / declaração ao qual o ajuste está vinculado, se houver
     */
    @Field(at = 5)
    private String numDoc;

    /**
     * Descrição resumida do ajuste.
     */
    @Field(at = 6)
    private String descrAj;

    /**
     * Data de referência do ajuste (ddmmaaaa)
     */
    @Field(at = 7)
    private Date dtRef;


}