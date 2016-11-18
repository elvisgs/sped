package br.com.gep.sped.fiscal.marshaller.registros.blocoG;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Movimentação de bem
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "G125"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class RegG125 extends Registro {

    /**
     * Código do bem
     */
    @Field(at = 2)
    private String codIndBem;

    /**
     * Data da movimentação
     */
    @Field(at = 3)
    private Date dtMov;

    /**
     * Tipo de movimentação
     * <p>SI=Saldo inicial de bens imobilizados;IM=Imobilização de bem individual;IA=Imobilização em Andamento - Componente;CI=Conclusão de Imobilização em Andamento – Bem Resultante;MC=Imobilização oriunda do Ativo Circulante;BA=Baixa do bem - Fim do período de apropriação;AT=Alienação ou Transferência;PE=Perecimento, Extravio ou Deterioração;OT=Outras Saídas do Imobilizado</p>
     */
    @Field(at = 4)
    private String tipoMov;

    /**
     * Valor do ICMS da Operação Própria
     */
    @Field(at = 5)
    private Double vlImobIcmsOp;

    /**
     * Valor do ICMS da Oper. por Sub. Tributária
     */
    @Field(at = 6)
    private Double vlImobIcmsSt;

    /**
     * Valor do ICMS sobre Frete
     */
    @Field(at = 7)
    private Double vlImobIcmsFrt;

    /**
     * Valor do ICMS - Diferencial de Alíquota
     */
    @Field(at = 8)
    private Double vlImobIcmsDif;

    /**
     * Número da parcela
     */
    @Field(at = 9)
    private String numParc;

    /**
     * Valor da parcela de ICMS passível de apropriação
     */
    @Field(at = 10)
    private Double vlParcPass;


}