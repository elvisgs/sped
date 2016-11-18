package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F130 - Bens Incorporados ao Ativo Imobilizado - Operações Geradoras de Créditos - Valor de Aquisição
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "F130"),
    @Field(at = 22, name = "fimLinha")
})
@Getter
@Setter
public class RegF130 extends Registro {

    /**
     * Texto fixo contendo 10 Código da Base de Cálculo do Crédito sobre Bens Incorporados ao Ativo Imobilizado, conforme a Tabela indicada no item 4.3.7.
     * <p>10=Máquinas, equipamentos e outros bens incorporados ao ativo imobilizado (crédito com base no valor de aquisição)</p>
     */
    @Field(at = 2)
    private String natBcCred;

    /**
     * Identificação dos Bens Incorporados ao Ativo Imobilizado: 01 = Edificações e Benfeitorias; 03 = Instalações; 04 = Máquinas; 05 = Equipamentos; 06 = Veículos; 99 = Outras Situações
     * <p>01=Edificações e Benfeitorias;03=Instalações;04=Máquinas;05=Equipamentos;06=Veículos;99=Outras Situações</p>
     */
    @Field(at = 3)
    private String identBemImob;

    /**
     * Indicador da origem do bem incorporado ao ativo imobilizado, gerador de crédito: 0 - Aquisição no Mercado Interno 1 - Aquisição no Mercado Externo (Importação)
     * <p>0=Aquisição no Mercado Interno;1=Aquisição no Mercado Externo (Importação)</p>
     */
    @Field(at = 4)
    private String indOrigCred;

    /**
     * Indicador da Utilização dos Bens Incorporados ao Ativo Imobilizado: 1 - Produção de Bens Destinados a Venda; 2 - Prestação de Serviços; 3 - Locação a Terceiros; 9 - Outros.
     * <p>1=Produção de Bens Destinados a Venda;2=Prestação de Serviços;3=Locação a Terceiros;9=Outros</p>
     */
    @Field(at = 5)
    private String indUtilBemImob;

    /**
     * Mês/Ano de Aquisição dos Bens Incorporados ao Ativo Imobilizado, com apuração de crédito com base no valor de aquisição.
     */
    @Field(at = 6)
    private String mesOperAquis;

    /**
     * Valor de Aquisição dos Bens Incorporados ao Ativo Imobilizado - Crédito com base no valor de aquisição.
     */
    @Field(at = 7)
    private Double vlOperAquis;

    /**
     * Parcela do Valor de Aquisição a excluir da base de cálculo de Crédito
     */
    @Field(at = 8)
    private Double parcOperNaoBcCred;

    /**
     * Valor da Base de Cálculo do Crédito sobre Bens Incorporados ao Ativo Imobilizado (07 - 08)
     */
    @Field(at = 9)
    private Double vlBcCred;

    /**
     * Indicador do Número de Parcelas a serem apropriadas (Crédito sobre Valor de Aquisição): 1 - Integral (Mês de Aquisição); 2 - 12 Meses; 3 - 24 Meses; 4 - 48 Meses; 5 - Outra periodicidade definida em Lei.
     * <p>1=Integral (Mês de Aquisição);2=12 Meses;3=24 Meses;4=48 Meses;5=6 Meses (Embalagens de bebidas frias);9=Outra periodicidade definida em Lei</p>
     */
    @Field(at = 10)
    private String indNrParc;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3
     */
    @Field(at = 11)
    private String cstPis;

    /**
     * Base de cálculo Mensal do Crédito de PIS/PASEP, conforme indicador informado no campo 10.
     */
    @Field(at = 12)
    private Double vlBcPis;

    /**
     * Alíquota do PIS/PASEP
     */
    @Field(at = 13)
    private Double aliqPis;

    /**
     * Valor do Crédito de PIS/PASEP
     */
    @Field(at = 14)
    private Double vlPis;

    /**
     * Código da Situação Tributária referente a COFINS, conforme a Tabela indicada no item 4.3.4
     */
    @Field(at = 15)
    private String cstCofins;

    /**
     * Base de Cálculo Mensal do Crédito da COFINS, conforme indicador informado no campo 10.
     */
    @Field(at = 16)
    private Double vlBcCofins;

    /**
     * Alíquota da COFINS
     */
    @Field(at = 17)
    private Double aliqCofins;

    /**
     * Valor do crédito da COFINS
     */
    @Field(at = 18)
    private Double vlCofins;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 19)
    private String codCta;

    /**
     * Código do Centro de Custos
     */
    @Field(at = 20)
    private String codCcus;

    /**
     * Descrição complementar do bem ou grupo de bens, com crédito apurado com base no valor de aquisição.
     */
    @Field(at = 21)
    private String descBemImob;


}