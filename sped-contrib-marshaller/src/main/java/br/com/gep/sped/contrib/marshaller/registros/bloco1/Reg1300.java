package br.com.gep.sped.contrib.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 1300 - Controle dos Valores Retidos na Fonte - PIS/PASEP
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1300"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class Reg1300 extends Registro {

    /**
     * Indicador de Natureza da Retenção na Fonte
     * <p>01=Retenção por Órgãos, Autarquias e Fundações Federais;02=Retenção por outras Entidades da Administração Pública Federal;03=Retenção por Pessoas Jurídicas de Direito Privado;04=Recolhimento por Sociedade Cooperativa;05=Retenção por Fabricante de Máquinas e Veículos;99=Outras Retenções;51=Retenção por Órgãos, Autarquias e Fundações Federais;52=Retenção por outras Entidades da Administração Pública Federal;53=Retenção por Pessoas Jurídicas de Direito Privado;54=Recolhimento por Sociedade Cooperativa;55=Retenção por Fabricante de Máquinas e Veículos;59=Outras Retenções - Rendimentos sujeitos à regra específica de incidência cumulativa (art. 8º da Lei nº 10.637/2002 e art. 10 da Lei nº 10.833/2003)</p>
     */
    @Field(at = 2)
    private String indNatRet;

    /**
     * Período do Recebimento e da Retenção(MM/AAAA)
     */
    @Field(at = 3)
    private String prRecRet;

    /**
     * Valor Total da Retenção
     */
    @Field(at = 4)
    private Double vlRetApu;

    /**
     * Valor da Retenção deduzida da Contribuição Devida
     */
    @Field(at = 5)
    private Double vlRetDed;

    /**
     * Valor da Retenção utilizada mediante Pedido de Ressarcimento.
     */
    @Field(at = 6)
    private Double vlRetPer;

    /**
     * Valor da Retenção utilizada mediante Declaração de Compensação.
     */
    @Field(at = 7)
    private Double vlRetDcomp;

    /**
     * Saldo de Retenção a utilizar em períodos de apuração futuros.
     */
    @Field(at = 8)
    private Double sldRet;


}