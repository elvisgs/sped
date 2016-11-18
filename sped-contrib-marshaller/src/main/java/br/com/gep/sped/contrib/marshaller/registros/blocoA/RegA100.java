package br.com.gep.sped.contrib.marshaller.registros.blocoA;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * A100 - NF de Serviços
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "A100"),
    @Field(at = 22, name = "fimLinha")
})
@Getter
@Setter
public class RegA100 extends Registro {

    /**
     * Indicador do tipo de operação
     * <p>0=Serviço Contratado pelo Estabelecimento;1=Serviço Prestado pelo Estabelecimento</p>
     */
    @Field(at = 2)
    private String indOper;

    /**
     * Indicador do emitente do documento fiscal
     * <p>0=Emissão própria;1=Emissão de Terceiros</p>
     */
    @Field(at = 3)
    private String indEmit;

    /**
     * Código do participante (campo 02 do Registro 0150): emitente do documento, no caso de emissão de terceiros; adquirente, no caso de serviços prestados
     */
    @Field(at = 4)
    private String codPart;

    /**
     * Código da situação do documento fiscal
     * <p>00=Documento regular;02=Documento cancelado</p>
     */
    @Field(at = 5)
    private String codSit;

    /**
     * Série do documento fiscal
     */
    @Field(at = 6)
    private String ser;

    /**
     * Subsérie do documento fiscal
     */
    @Field(at = 7)
    private String sub;

    /**
     * Número do documento fiscal ou documento internacional equivalente
     */
    @Field(at = 8)
    private String numDoc;

    /**
     * Chave da nota fiscal de serviço eletronica
     */
    @Field(at = 9)
    private String chvNfse;

    /**
     * Data da emissão do documento fiscal
     */
    @Field(at = 10)
    private Date dtDoc;

    /**
     * Data de Execução / Conclusão do Serviço
     */
    @Field(at = 11)
    private Date dtExeServ;

    /**
     * Valor total do documento
     */
    @Field(at = 12)
    private Double vlDoc;

    /**
     * Indicador do tipo de pagamento
     * <p>0=À vista;1=A prazo;9=Sem pagamento</p>
     */
    @Field(at = 13)
    private String indPgto;

    /**
     * Valor total do desconto
     */
    @Field(at = 14)
    private Double vlDesc;

    /**
     * Valor da base de cálculo do PIS/PASEP
     */
    @Field(at = 15)
    private Double vlBcPis;

    /**
     * Valor total do PIS
     */
    @Field(at = 16)
    private Double vlPis;

    /**
     * Valor da base de cálculo da COFINS
     */
    @Field(at = 17)
    private Double vlBcCofins;

    /**
     * Valor total da COFINS
     */
    @Field(at = 18)
    private Double vlCofins;

    /**
     * Valor total do PIS retido na fonte
     */
    @Field(at = 19)
    private Double vlPisRet;

    /**
     * Valor total da COFINS retido na fonte
     */
    @Field(at = 20)
    private Double vlCofinsRet;

    /**
     * Valor do ISS
     */
    @Field(at = 21)
    private Double vlIss;


}