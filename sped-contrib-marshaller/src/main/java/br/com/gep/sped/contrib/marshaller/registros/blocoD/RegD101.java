package br.com.gep.sped.contrib.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * D101 - Complemento do Documento PIS/PASEP
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D101"),
    @Field(at = 10, name = "fimLinha")
})
@Getter
@Setter
public class RegD101 extends Registro {

    /**
     * Indicador da Natureza do Frete
     * <p>0=Operações de vendas, com ônus suportado pelo estabelecimento vendedor;1=Operações de vendas, com ônus suportado pelo adquirente;2=Operações de compras (bens para revenda, matérias-prima e outros produtos, geradores de crédito);3=Operações de compras (bens para revenda, matérias-prima e outros produtos, não geradores de crédito);4=Transferência de produtos acabados entre estabelecimentos da pessoa jurídica;5=Transferência de produtos em elaboração entre estabelecimentos da pessoa jurídica;9=Outras</p>
     */
    @Field(at = 2)
    private String indNatFrt;

    /**
     * Valor total dos itens
     */
    @Field(at = 3)
    private Double vlItem;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP
     */
    @Field(at = 4)
    private String cstPis;

    /**
     * Código da Natureza da Base de Cálculo do Crédito, conforme a Tabela indicada no item 4.3.7
     * <p>01=Aquisição de bens para revenda;02=Aquisição de bens utilizados como insumo;03=Aquisição de serviços utilizados como insumo;07=Armazenagem de mercadoria e frete na operação de venda;13=Outras Operações com Direito a Crédito;14=Atividade de Transporte de Cargas - Subcontratação</p>
     */
    @Field(at = 5)
    private String natBcCred;

    /**
     * Valor da base de cálculo do PIS/PASEP
     */
    @Field(at = 6)
    private Double vlBcPis;

    /**
     * Alíquota do PIS/PASEP (em percentual)
     */
    @Field(at = 7)
    private Double aliqPis;

    /**
     * Valor do PIS/PASEP
     */
    @Field(at = 8)
    private Double vlPis;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 9)
    private String codCta;


}