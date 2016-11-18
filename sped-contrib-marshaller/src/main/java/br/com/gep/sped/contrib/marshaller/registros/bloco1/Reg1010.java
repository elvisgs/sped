package br.com.gep.sped.contrib.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 1010 - Processo Referenciado - Ação Judicial
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1010"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class Reg1010 extends Registro {

    /**
     * Identificação do Numero do Processo Judicial
     */
    @Field(at = 2)
    private String numProc;

    /**
     * Identificação da Seção Judiciária
     */
    @Field(at = 3)
    private String idSecJud;

    /**
     * Identificação da Vara
     */
    @Field(at = 4)
    private String idVara;

    /**
     * Indicador da Natureza da Ação Judicial, impetrada na Justiça Federal:01 - Decisão Judicial Transitada em Julgado, a favor da Pessoa Jurídica.02 - Decisão Judicial Não Transitada em Julgado, a favor da Pessoa Jurídica.03 - Decisão Judicial oriunda de Liminar em Mandado de Segurança.04 - Decisão Judicial oriunda de Liminar em Medida Cautelar.05 - Decisão Judicial oriunda de Antecipação de Tutela. 06 - Decisão Judicial Vinculada a Depósito Administrativo ou Judicial em Montante Integral.07 - Medida Judicial em que a Pessoa Jurídica não é o autor.08 - Sumula Vinculante aprovada pelo STF99 - Outros.
     * <p>01=Decisão Judicial Transitada em Julgado, a favor da Pessoa Jurídica;02=Decisão Judicial Não Transitada em Julgado, a favor da Pessoa Jurídica;03=Decisão Judicial oriunda de Liminar em Mandado de Segurança;04=Decisão Judicial oriunda de Liminar em Medida Cautelar;05=Decisão Judicial oriunda de Antecipação de Tutela;06=Decisão Judicial Vinculada a Depósito Administrativo ou Judicial em Montante Integral;07=Medida Judicial em que a Pessoa Jurídica não é o autor;08=Sumula Vinculante aprovada pelo STF;99=Outros</p>
     */
    @Field(at = 5)
    private String indNatAcao;

    /**
     * Descrição Resumida dos Efeitos Tributários abrangidos pela Decisão Judicial proferida.
     */
    @Field(at = 6)
    private String descDecJud;

    /**
     * Data da Sentença/Decisão Judicial
     */
    @Field(at = 7)
    private Date dtSentJud;


}