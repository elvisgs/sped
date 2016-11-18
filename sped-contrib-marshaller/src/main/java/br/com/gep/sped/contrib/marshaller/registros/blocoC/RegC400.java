package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C400 - Equipamento ECF - Saída de Mercadoria
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C400"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class RegC400 extends Registro {

    /**
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     * <p>02=C400 - Nota Fiscal de Venda a Consumidor;2D=C400 - Cupom Fiscal emitido por ECF</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Modelo do equipamento
     */
    @Field(at = 3)
    private String ecfMod;

    /**
     * Número de série de fabricação do ECF
     */
    @Field(at = 4)
    private String ecfFab;

    /**
     * Número do caixa atribuído ao ECF
     */
    @Field(at = 5)
    private String ecfCx;


}