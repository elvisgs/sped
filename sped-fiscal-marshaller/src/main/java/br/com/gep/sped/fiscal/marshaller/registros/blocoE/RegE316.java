package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Obrigações do ICMS recolhido ou a recolher – diferencial de alíquota – UF origem/destino EC 87/15
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E316"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class RegE316 extends Registro {

    /**
     * Código da obrigação a recolher, conforme a tabela 5.4 (tabela de códigos das obrigações de ICMS a recolher)
     */
    @Field(at = 2)
    private String codOr;

    /**
     * Valor da obrigação recolhida ou a recolher - diferencial de alíquota - UF origem/estino EC87/15
     */
    @Field(at = 3)
    private Double vlOr;

    /**
     * Data de vencimento da obrigação
     */
    @Field(at = 4)
    private Date dtVcto;

    /**
     * Código de receita referente à obrigação, próprio da unidade da federação
     */
    @Field(at = 5)
    private String codRec;

    /**
     * Número do processo ou auto de infração ao qual a obrigação está vinculada, se houver
     */
    @Field(at = 6)
    private String numProc;

    /**
     * Indicador da origem do processo
     * <p>0=Sefaz;1=Justiça Federal;2=Justiça Estadual;9=Outros</p>
     */
    @Field(at = 7)
    private String indProc;

    /**
     * Descrição resumida do processo que embasou o lançamento
     */
    @Field(at = 8)
    private String proc;

    /**
     * Descrição complementar das obrigações a recolher
     */
    @Field(at = 9)
    private String txtCompl;

    /**
     * Informe o mês de referência no formato 'mmaaaa'
     */
    @Field(at = 10)
    private String mesRef;


}