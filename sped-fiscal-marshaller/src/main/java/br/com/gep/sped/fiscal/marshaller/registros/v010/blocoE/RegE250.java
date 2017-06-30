package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Obrigações do ICMS recolhido ou a recolher - Substituição Tributária
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E250"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class RegE250 extends Registro {

    /**
     * Código do ICMS ST recolhido ou a recolher
     */
    @Field(at = 2)
    private String codOr;

    /**
     * Valor do ICMS ST a recolher
     */
    @Field(at = 3)
    private Double vlOr;

    /**
     * Data de vencimento
     */
    @Field(at = 4)
    private Date dtVcto;

    /**
     * Código de receita
     */
    @Field(at = 5)
    private String codRec;

    /**
     * Número do processo
     */
    @Field(at = 6)
    private String numProc;

    /**
     * Origem do processo
     * <p>0=Sefaz;1=Justiça Federal;2=Justiça Estadual;9=Outros</p>
     */
    @Field(at = 7)
    private String indProc;

    /**
     * Descrição resumida do processo
     */
    @Field(at = 8)
    private String proc;

    /**
     * Descrição complementar
     */
    @Field(at = 9)
    private String txtCompl;

    /**
     * Mês de referência
     */
    @Field(at = 10)
    private String mesRef;


}
