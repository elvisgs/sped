package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * F100 - Demais Documentos e Operações Geradoras de Contribuição e Créditos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "F100"),
    @Field(at = 20, name = "fimLinha")
})
@Getter
@Setter
public class RegF100 extends Registro {

    /**
     * Indicador do Tipo da Operação
     * <p>0=Operação Representativa de Aquisição, Custos, Despesa ou Encargos, ou Receitas, Sujeita à Incidência de Crédito de PIS/Pasep ou Cofins (CST 50 a 66);1=Operação Representativa de Receita Auferida , Sujeita  ao Pagamento das Contribuição  para o PIS/Pasep e da Cofins;2=Operação Representativa de Receita Auferida NÃO, Sujeita  ao Pagamento das Contribuição  para o PIS/Pasep e da Cofins.</p>
     */
    @Field(at = 2)
    private String indOper;

    /**
     * Código do participante (Campo 02 do Registro 0150)
     */
    @Field(at = 3)
    private String codPart;

    /**
     * Código do item (campo 02 do Registro 0200)
     */
    @Field(at = 4)
    private String codItem;

    /**
     * Data da Operação (ddmmaaaa)
     */
    @Field(at = 5)
    private Date dtOper;

    /**
     * Valor da Operação
     */
    @Field(at = 6)
    private Double vlOper;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3 (IN RFB nº 1.009, de 2010)
     */
    @Field(at = 7)
    private String cstPis;

    /**
     * Base de Cálculo do PIS/PASEP
     */
    @Field(at = 8)
    private Double vlBcPis;

    /**
     * Alíquota do PIS/PASEP
     */
    @Field(at = 9)
    private Double aliqPis;

    /**
     * Valor do PIS/PASEP
     */
    @Field(at = 10)
    private Double vlPis;

    /**
     * Código da Situação Tributária referente a COFINS, conforme a Tabela indicada no item 4.3.4 (IN RFB nº 1.009, de 2010)
     */
    @Field(at = 11)
    private String cstCofins;

    /**
     * Base de Cálculo da COFINS
     */
    @Field(at = 12)
    private Double vlBcCofins;

    /**
     * Alíquota da COFINS
     */
    @Field(at = 13)
    private Double aliqCofins;

    /**
     * Valor da COFINS
     */
    @Field(at = 14)
    private Double vlCofins;

    /**
     * Código da Natureza da Base de Cálculo do Crédito, conforme a Tabela indicada no item 4.3.7 (Lei nº 12.058/09. art. 35).
     * <p>01=Aquisição de bens para revenda;02=Aquisição de bens utilizados como insumo;03=Aquisição de serviços utilizados como insumo;04=Energia elétrica e térmica, inclusive sob a forma de vapor;05=Aluguéis de prédios;06=Aluguéis de máquinas e equipamentos;07=Armazenagem de mercadoria e frete na operação de venda;08=Contraprestações de arrendamento mercantil;09=Máquinas, equipamentos e outros bens incorporados ao ativo imobilizado (crédito sobre encargos de depreciação);10=Máquinas, equipamentos e outros bens incorporados ao ativo imobilizado (crédito com base no valor de aquisição);11=Amortização de edificações e benfeitorias em imóveis;12=Devolução de Vendas Sujeitas à Incidência Não-Cumulativa;13=Outras Operações com Direito a Crédito;14=Atividade de Transporte de Cargas - Subcontratação;17=Atividade de Prestação de Serviços de Limpeza, Conservação e Manutenção - vale-transporte, vale-refeição ou vale-alimentação, fardamento ou uniforme</p>
     */
    @Field(at = 15)
    private String natBcCred;

    /**
     * Indicador da origem do crédito
     * <p>0=Operação no Mercado Interno;1=Operação de Importação</p>
     */
    @Field(at = 16)
    private String indOrigCred;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 17)
    private String codCta;

    /**
     * Código do Centro de Custos
     */
    @Field(at = 18)
    private String codCcus;

    /**
     * Descrição do Documento/Operação
     */
    @Field(at = 19)
    private String descDocOper;


}