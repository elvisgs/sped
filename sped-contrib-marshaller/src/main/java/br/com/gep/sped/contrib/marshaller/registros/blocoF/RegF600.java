package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * F600 - Contribuição Retida na Fonte
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "F600"),
    @Field(at = 12, name = "fimLinha")
})
@Getter
@Setter
public class RegF600 extends Registro {

    /**
     * Indicador de Natureza da Retenção na Fonte: 01 - Retenção por Órgãos, Autarquias e Fundações Federais; 02 - Retenção por outras Entidades da Adm. Pública Federal; 03 - Retenção por Pessoas Jurídicas de Direito Privado; 04 - Retenção por Sociedade Cooperativa; 05 - Retenção por Fabricante de Máquinas e Veículos; 99 - Outras Retenções
     * <p>01=Retenção por Órgãos, Autarquias e Fundações Federais;02=Retenção por outras Entidades da Adm. Pública Federal;03=Retenção por Pessoas Jurídicas de Direito Privado;04=Retenção por Sociedade Cooperativa;05=Retenção por Fabricante de Máquinas e Veículos;99=Outras Retenções</p>
     */
    @Field(at = 2)
    private String indNatRet;

    /**
     * Data da Retenção
     */
    @Field(at = 3)
    private Date dtRet;

    /**
     * Valor da base de cálculo da retenção ou do recolhimento (sociedade cooperativa)
     */
    @Field(at = 4)
    private Double vlBcRet;

    /**
     * Valor Total Retido na Fonte / Recolhido (sociedade cooperativa)
     */
    @Field(at = 5)
    private Double vlRet;

    /**
     * Código da Receita
     */
    @Field(at = 6)
    private String codRec;

    /**
     * Indicador da Natureza da Receita: 0 - Receita de Natureza Não Cumulativa; 1 - Receita de Natureza Cumulativa
     * <p>0=Receita de Natureza Não Cumulativa;1=Receita de Natureza Cumulativa</p>
     */
    @Field(at = 7)
    private String indNatRec;

    /**
     * CNPJ da Fonte Pagadora ou Beneficiária da Retenção / Recolhimento
     */
    @Field(at = 8)
    private String cnpj;

    /**
     * Valor Retido na Fonte - Parcela Referente ao PIS/Pasep
     */
    @Field(at = 9)
    private Double vlRetPis;

    /**
     * Valor Retido na Fonte - Parcela Referente a COFINS
     */
    @Field(at = 10)
    private Double vlRetCofins;

    /**
     * Indicador da Condição da Pessoa Jurídica Declarante
     * <p>0=Beneficiária da Retenção / Recolhimento;1=Responsável pela Retenção / Recolhimento</p>
     */
    @Field(at = 11)
    private String indDec;


}