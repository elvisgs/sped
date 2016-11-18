package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Plano de Contas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0500"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class Reg0500 extends Registro {

    /**
     * Data da inclusão/alteração
     */
    @Field(at = 2)
    private Date dtAlt;

    /**
     * Código da natureza da conta
     * <p>01=Contas de ativo;02=Contas de passivo;03=Patrimônio líquido;04=Contas de resultado;05=Contas de compensação;09=Outras</p>
     */
    @Field(at = 3)
    private String codNatCc;

    /**
     * Indicador do tipo de conta
     * <p>S=Sintética (grupo de contas);A=Analítica (conta)</p>
     */
    @Field(at = 4)
    private String indCta;

    /**
     * Nível da conta
     */
    @Field(at = 5)
    private String nivel;

    /**
     * Código da conta
     */
    @Field(at = 6)
    private String codCta;

    /**
     * Nome da conta
     */
    @Field(at = 7)
    private String nomeCta;


}