package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoG;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Identificação do documento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "G130"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegG130 extends Registro {

    /**
     * Emitente
     * <p>0=Emissão própria;1=Terceiros</p>
     */
    @Field(at = 2)
    private String indEmit;

    /**
     * Código do participante
     */
    @Field(at = 3)
    private String codPart;

    /**
     * Código do modelo do documento
     * <p>01=Nota Fiscal;1B=Nota Fiscal Avulsa;04=Nota Fiscal de Produtor;07=Nota Fiscal de Serviço de Transporte;08=Conhecimento de Transporte Rodoviário de Cargas;8B=Conhecimento de Transporte de Cargas Avulso;09=Conhecimento de Transporte Aquaviário de Cargas;10=Conhecimento Aéreo;26=Conhecimento de Transporte Multimodal de Cargas;27=Nota Fiscal de Transporte Ferroviário de Cargas;55=Nota Fiscal Eletrônica;57=Conhecimento de Transporte Eletrônico - CT-e</p>
     */
    @Field(at = 4)
    private String codMod;

    /**
     * Série
     */
    @Field(at = 5)
    private String serie;

    /**
     * Número do documento
     */
    @Field(at = 6)
    private String numDoc;

    /**
     * Chave da NFe/CTe
     */
    @Field(at = 7)
    private String chvNfeCte;

    /**
     * Data da emissão
     */
    @Field(at = 10)
    private Date dtDoc;


}
