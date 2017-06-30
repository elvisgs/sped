package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * NF Comunicação e Telecomunicação Consolidada - Convênio 115
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D695"),
    @Field(at = 10, name = "fimLinha")
})
@Getter
@Setter
public class RegD695 extends Registro {

    /**
     * Código do modelo do documento
     * <p>21=Nota Fiscal de Serviço de Comunicação;22=Nota Fiscal de Serviço de Telecomunicação</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Série do documento fiscal
     */
    @Field(at = 3)
    private String ser;

    /**
     * Documento fiscal inicial
     */
    @Field(at = 4)
    private Integer nroOrdIni;

    /**
     * Documento fiscal final
     */
    @Field(at = 5)
    private Integer nroOrdFin;

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
     * Chave de codificação digital
     */
    @Field(at = 9)
    private String chvCodDig;


}
