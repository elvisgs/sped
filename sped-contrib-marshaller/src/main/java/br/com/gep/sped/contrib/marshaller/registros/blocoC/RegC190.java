package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C190 - Consolidação das NF-E - Operações de Aquisição com Direito a Crédito, e Operações de Devolução de Compras e Devolução de Vendas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C190"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegC190 extends Registro {

    /**
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1 (Código 55 - Nota Fiscal Eletrônica)
     * <p>55=C190 - Nota Fiscal Eletrônica</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Data Inicial de Referencia da Consolidação
     */
    @Field(at = 3)
    private Date dtRefIni;

    /**
     * Data Final de Referencia da Consolidação
     */
    @Field(at = 4)
    private Date dtRefFin;

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