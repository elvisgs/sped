package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C180 - Consolidação de NF-e Emitidas - Operações de Venda
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C180"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegC180 extends Registro {

    /**
     * Texto fixo contendo “55” - Código da Nota Fiscal Eletrônica, modelo 55
     * <p>55=C180 - Nota Fiscal Eletrônica;65=C180 - Nota Fiscal do Consumidor Eletrônica</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Data de Emissão Inicial dos Documentos
     */
    @Field(at = 3)
    private Date dtDocIni;

    /**
     * Data de Emissão Final dos Documentos
     */
    @Field(at = 4)
    private Date dtDocFin;

    /**
     * Código do item (campo 02 do Registro 0200)
     */
    @Field(at = 5)
    private String codItem;

    /**
     * Código da Nomenclatura Comum do Mercosul
     */
    @Field(at = 6)
    private String codNcm;

    /**
     * Código EX, conforme a TIPI
     */
    @Field(at = 7)
    private String exIpi;

    /**
     * Valor Total do Item
     */
    @Field(at = 8)
    private Double vlTotItem;


}