package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * DOCUMENTOS FISCAIS UTILIZADOS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1700"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class Reg1700 extends Registro {

    /**
     * Código dispositivo autorizado
     * <p>00=Formulário de Segurança - impressor autônomo;01=FS-DA – Formulário de Segurança para Impressão de DANFE;02=Formulário de segurança - NF-e;03=Formulário Contínuo;04=Blocos;05=Jogos Soltos</p>
     */
    @Field(at = 2)
    private String codDisp;

    /**
     * Código do modelo do documento fiscal
     */
    @Field(at = 3)
    private String codMod;

    /**
     * Série
     */
    @Field(at = 4)
    private String ser;

    /**
     * Subsérie
     */
    @Field(at = 5)
    private String sub;

    /**
     * Documento fiscal inicial
     */
    @Field(at = 6)
    private String numDocIni;

    /**
     * Documento fiscal final
     */
    @Field(at = 7)
    private String numDocFin;

    /**
     * Número da autorização
     */
    @Field(at = 8)
    private String numAut;


}