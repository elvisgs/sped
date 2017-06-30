package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Energia Elétrica/Gás - NF em Via Única (Convênio ICMS 115/03)
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C700"),
    @Field(at = 10, name = "fimLinha")
})
@Getter
@Setter
public class RegC700 extends Registro {

    /**
     * Código do modelo do documento
     * <p>06=Nota Fiscal/Conta de Energia Elétrica;28=Nota Fiscal/Conta de Fornecimento de Gás Canalizado</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Série do documento fiscal
     */
    @Field(at = 3)
    private String ser;

    /**
     * Número de ordem inicial
     */
    @Field(at = 4)
    private String nroOrdIni;

    /**
     * Número de ordem final
     */
    @Field(at = 5)
    private String nroOrdFin;

    /**
     * Data de emissão inicial
     */
    @Field(at = 6)
    private Date dtDocIni;

    /**
     * Data de emissão final
     */
    @Field(at = 7)
    private Date dtDocFin;

    /**
     * Nome do arquivo mestre
     */
    @Field(at = 8)
    private String nomMest;

    /**
     * Chave de codificação
     */
    @Field(at = 9)
    private String chvCodDig;


}
