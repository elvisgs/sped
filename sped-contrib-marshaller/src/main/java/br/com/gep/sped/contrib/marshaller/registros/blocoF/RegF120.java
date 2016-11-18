package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F120 - Bens Incorporados ao Ativo Imobilizado - Operações Geradoras de Créditos - Encargos de Depreciação/Amortização
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "F120"),
    @Field(at = 19, name = "fimLinha")
})
@Getter
@Setter
public class RegF120 extends Registro {

    /**
     * Código da Base de Cálculo do Crédito sobre Bens Incorporados ao Ativo Imobilizado, conforme a Tabela indicada no item 4.3.7
     * <p>09=Crédito com Base nos Encargos de Depreciação;11=Crédito com Base nos Encargos de Amortização</p>
     */
    @Field(at = 2)
    private String natBcCred;

    /**
     * Identificação dos Bens Incorporados ao Ativo Imobilizado
     * <p>01=Edificações e Benfeitorias em Imóveis Próprios;02=Edificações e Benfeitorias em Imóveis de Terceiros;03=Instalações;04=Máquinas;05=Equipamentos;06=Veículos;99=Outras Situações</p>
     */
    @Field(at = 3)
    private String identBemImob;

    /**
     * Indicador da origem do bem incorporado ao ativo imobilizado, gerador de crédito
     * <p>0=Aquisição no Mercado Interno;1=Aquisição no Mercado Externo (Importação)</p>
     */
    @Field(at = 4)
    private String indOrigCred;

    /**
     * Indicador da Utilização dos Bens Incorporados ao Ativo Imobilizado
     * <p>1=Produção de Bens Destinados a Venda;2=Prestação de Serviços;3=Locação a Terceiros;9=Outros</p>
     */
    @Field(at = 5)
    private String indUtilBemImob;

    /**
     * Valor do Encargo de Depreciação/Amortização Incorrido no Período
     */
    @Field(at = 6)
    private Double vlOperDep;

    /**
     * Parcela do Valor do Encargo de Depreciação/Amortização a excluir da base de cálculo de Crédito
     */
    @Field(at = 7)
    private Double parcOperNaoBcCred;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3
     */
    @Field(at = 8)
    private String cstPis;

    /**
     * Base de Cálculo do Crédito de PIS/PASEP no período (06 - 07)
     */
    @Field(at = 9)
    private Double vlBcPis;

    /**
     * Alíquota do PIS/PASEP (em percentual)
     */
    @Field(at = 10)
    private Double aliqPis;

    /**
     * Valor do Crédito de PIS/PASEP
     */
    @Field(at = 11)
    private Double vlPis;

    /**
     * Código da Situação Tributária referente a COFINS, conforme a Tabela indicada no item 4.3.4
     */
    @Field(at = 12)
    private String cstCofins;

    /**
     * Base de Cálculo do Crédito da COFINS no período
     */
    @Field(at = 13)
    private Double vlBcCofins;

    /**
     * Alíquota da COFINS (em percentual)
     */
    @Field(at = 14)
    private Double aliqCofins;

    /**
     * Valor do Crédito da COFINS
     */
    @Field(at = 15)
    private Double vlCofins;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 16)
    private String codCta;

    /**
     * Código do Centro de Custos
     */
    @Field(at = 17)
    private String codCcus;

    /**
     * Descrição complementar do bem ou grupo de bens, com crédito apurado com base nos encargos de depreciação ou amortização.
     */
    @Field(at = 18)
    private String descBemImob;


}