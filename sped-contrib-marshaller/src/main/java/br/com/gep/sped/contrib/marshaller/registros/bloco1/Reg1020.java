package br.com.gep.sped.contrib.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 1020 - Processo Referenciado - Processo  Administrativo
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1020"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class Reg1020 extends Registro {

    /**
     * Identificação do Processo Administrativo ou da Decisão Administrativa
     */
    @Field(at = 2)
    private String numProc;

    /**
     * Indicador da Natureza da Ação, decorrente de Processo Administrativo na Secretaria da Receita Federal do Brasil:01 -  Processo Administrativo de Consulta;02 - Despacho Decisório;03 - Ato Declaratório Executivo;04 - Ato Declaratório Interpretativo;05 - Decisão Administrativa de DRJ ou do CARF;06 - Auto de Infração;99 - Outros
     * <p>01= Processo Administrativo de Consulta;02=Despacho Decisório;03=Ato Declaratório Executivo;04=Ato Declaratório Interpretativo;05=Decisão Administrativa de DRJ ou do CARF;06=Auto de Infração;99=Outros</p>
     */
    @Field(at = 3)
    private String indNatAcao;

    /**
     * Data do Despacho/Decisão Administrativa
     */
    @Field(at = 4)
    private Date dtDecAdm;


}