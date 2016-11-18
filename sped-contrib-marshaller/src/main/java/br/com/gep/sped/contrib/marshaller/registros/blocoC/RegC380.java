package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C380 - Consolidação de NF de Venda a Consumidor
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C380"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegC380 extends Registro {

    /**
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     * <p>02=C380 - Nota Fiscal de Venda a Consumidor</p>
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
     * Número do documento fiscal inicial
     */
    @Field(at = 5)
    private String numDocIni;

    /**
     * Número do documento fiscal final
     */
    @Field(at = 6)
    private String numDocFin;

    /**
     * Valor total dos documentos regulares
     */
    @Field(at = 7)
    private Double vlDoc;

    /**
     * Valor total dos documentos cancelados
     */
    @Field(at = 8)
    private Double vlDocCanc;


}