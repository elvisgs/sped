package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F525 - Composição da receita escriturada no período - detalhamento da receita recebida pelo regime de caixa
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "F525"),
    @Field(at = 12, name = "fimLinha")
})
@Getter
@Setter
public class RegF525 extends Registro {

    /**
     * Valor total da receita recebida, correspondente ao indicador informado no campo 03 (IND_REC)
     */
    @Field(at = 2)
    private Double vlRec;

    /**
     * Indicador da composição da receita recebida no período (Campo 02)
     * <p>01=Clientes;02=Administradora de cartão de débito/crédito;03=Título de crédito - Duplicata, nota promissória, cheque etc.;04=Documento fiscal;05=Item vendido (produtos e serviços);99=Outros (Detalhar no campo 10 - Informação Complementar)</p>
     */
    @Field(at = 3)
    private String indRec;

    /**
     * CNPJ/CPF do participante (cliente/pessoa física ou jurídica pagadora) ou da administradora de cartões (vendas por cartão de débito ou de crédito), no caso de detalhamento da receita recebida conforme os indicadores “01” ou “02”, respectivamente
     */
    @Field(at = 4)
    private String cnpjCpf;

    /**
     * Número do título de crédito ou do documento fiscal, no caso de detalhamento da receita recebida conforme os indicadores “03” ou “04”, respectivamente
     */
    @Field(at = 5)
    private String numDoc;

    /**
     * Código do item (campo 02 do Registro 0200), no caso de detalhamento da receita recebida por item vendido, conforme o indicador “05”
     */
    @Field(at = 6)
    private String codItem;

    /**
     * Valor da receita detalhada, correspondente ao conteúdo informado no campo 04, 05 ou 06
     */
    @Field(at = 7)
    private Double vlRecDet;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP
     */
    @Field(at = 8)
    private String cstPis;

    /**
     * Código da Situação Tributária referente a COFINS
     */
    @Field(at = 9)
    private String cstCofins;

    /**
     * Informação complementar
     */
    @Field(at = 10)
    private String infoCompl;

    /**
     * Código da conta analítica contábil representativa da receita recebida
     */
    @Field(at = 11)
    private String codCta;


}