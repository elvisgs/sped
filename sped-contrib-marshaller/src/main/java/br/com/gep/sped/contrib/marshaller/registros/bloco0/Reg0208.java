package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 0208 - Grupos por Marca Comercial - REFRI
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0208"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class Reg0208 extends Registro {

    /**
     * Código indicador da Tabela de Incidência, conforme Anexo III do Decreto nº 6.707/08
     * <p>01=Tabela I;02=Tabela II;03=Tabela IIII;04=Tabela IV;05=Tabela V;06=Tabela VI;07=Tabela VII;08=Tabela VIII;09=Tabela IX;10=Tabela X;11=Tabela XI;12=Tabela XII;13=Tabela XIII</p>
     */
    @Field(at = 2)
    private String codTab;

    /**
     * Código do grupo, conforme Anexo III do Decreto nº 6.707/08
     */
    @Field(at = 3)
    private String codGru;

    /**
     * Marca Comercial
     */
    @Field(at = 4)
    private String marcaCom;


}