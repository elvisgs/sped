package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C490 - Consolidação de Documentos Emitidos por ECF - Saída de Mercadoria
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C490"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class RegC490 extends Registro {

    /**
     * Data de Emissão Inicial dos Documentos
     */
    @Field(at = 2)
    private Date dtDocIni;

    /**
     * Data de Emissão Final dos Documentos
     */
    @Field(at = 3)
    private Date dtDocFin;

    /**
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     * <p>02=C490 - Nota Fiscal de Venda a Consumidor;2D=C490 - Cupom Fiscal emitido por ECF;59=C490 - Cupom Fiscal Eletrônico</p>
     */
    @Field(at = 4)
    private String codMod;


}