package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * CF-e Emitido por SAT
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C800"),
    @Field(at = 18, name = "fimLinha")
})
@Getter
@Setter
public class RegC800 extends Registro {

    /**
     * Código do modelo de documento fiscal
     * <p>59=Cupom Fiscal Eletrônico - CF-e</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Código da Situação do documento fiscal
     * <p>00=Documento regular;01=Documento regular extemporâneo;02=Documento cancelado;03=Documento cancelado extemporâneo</p>
     */
    @Field(at = 3)
    private String codSit;

    /**
     * Número do cupom fiscal Eletrônico
     */
    @Field(at = 4)
    private String numCfe;

    /**
     * Data da Emissão do cupom fiscal eletrônico
     */
    @Field(at = 5)
    private Date dtDoc;

    /**
     * Valor Total do Cupom Fiscal Eletrônico
     */
    @Field(at = 6)
    private Double vlCfe;

    /**
     * Valor Total do PIS
     */
    @Field(at = 7)
    private Double vlPis;

    /**
     * Valor Total da COFINS
     */
    @Field(at = 8)
    private Double vlCofins;

    /**
     * CNPJ ou CPF do destinatário
     */
    @Field(at = 9)
    private String cnpjCpf;

    /**
     * Número de Série do Equipamento SAT
     */
    @Field(at = 10)
    private String nrSat;

    /**
     * Chave do Cupom Fiscal Eletrônico
     */
    @Field(at = 11)
    private String chvCfe;

    /**
     * Valor total do desconto sobre item
     */
    @Field(at = 12)
    private Double vlDesc;

    /**
     * Valor total das mercadorias e serviços
     */
    @Field(at = 13)
    private Double vlMerc;

    /**
     * Valor de outras desp. acessórias (acréscimo)
     */
    @Field(at = 14)
    private Double vlOutDa;

    /**
     * Valor do ICMS
     */
    @Field(at = 15)
    private Double vlIcms;

    /**
     * Valor total do PIS retido por subs. trib
     */
    @Field(at = 16)
    private Double vlPisSt;

    /**
     * Valor total da COFINS retido por subs. trib
     */
    @Field(at = 17)
    private Double vlCofinsSt;


}