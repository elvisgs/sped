package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F700 - Deduções Diversas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "F700"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegF700 extends Registro {

    /**
     * Indicador de Origem de Deduções Diversas
     * <p>01=Créditos Presumidos - Medicamentos;02=Créditos Admitidos no Regime Cumulativo - Bebidas Frias;03=Contribuição Paga pelo Substituto Tributário - ZFM;04=Substituição Tributária - Não Ocorrência do Fato Gerador Presumido;99=Outras Deduções</p>
     */
    @Field(at = 2)
    private String indOriDed;

    /**
     * Indicador da Natureza da Dedução
     * <p>0=Dedução de Natureza Não Cumulativa;1=Dedução de Natureza Cumulativa</p>
     */
    @Field(at = 3)
    private String indNatDed;

    /**
     * Valor a Deduzir - PIS/Pasep
     */
    @Field(at = 4)
    private Double vlDedPis;

    /**
     * Valor a Deduzir - COFINS
     */
    @Field(at = 5)
    private Double vlDedCofins;

    /**
     * Valor da Base de Cálculo da Operação
     */
    @Field(at = 6)
    private Double vlBcOper;

    /**
     * CNPJ da Pessoa Jurídica relacionada à Operação
     */
    @Field(at = 7)
    private String cnpj;

    /**
     * Informações Complementares do Documento/Operação
     */
    @Field(at = 8)
    private String infComp;


}