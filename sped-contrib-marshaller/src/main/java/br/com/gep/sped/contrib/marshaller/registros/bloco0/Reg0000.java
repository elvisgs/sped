package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 0000 - Identificação da Pessoa Jurídica
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0000"),
    @Field(at = 15, name = "fimLinha")
})
@Getter
@Setter
public class Reg0000 extends Registro {

    /**
     * Código da versão do leiaute conforme a tabela 3.1.1
     */
    @Field(at = 2)
    private String codVer;

    /**
     * Tipo de escrituração
     * <p>0=Original;1=Retificadora</p>
     */
    @Field(at = 3)
    private String tipoEscrit;

    /**
     * Indicador de situação especial
     * <p>0=Abertura;1=Cisão;2=Fusão;3=Incorporação;4=Encerramento</p>
     */
    @Field(at = 4)
    private String indSitEsp;

    /**
     * Número do Recibo da Escrituração Anterior, a ser Retificada. Utilizado para escrituração retificadora
     */
    @Field(at = 5)
    private String numRecAnterior;

    /**
     * Data inicial das informações contidas no arquivo
     */
    @Field(at = 6)
    private Date dtIni;

    /**
     * Data final das informações contidas no arquivo
     */
    @Field(at = 7)
    private Date dtFin;

    /**
     * Nome empresarial da pessoa jurídica
     */
    @Field(at = 8)
    private String nome;

    /**
     * Número de inscrição do estabelecimento matriz da pessoa jurídica no CNPJ
     */
    @Field(at = 9)
    private String cnpj;

    /**
     * Sigla da unidade da federação da pessoa jurídica
     */
    @Field(at = 10)
    private String uf;

    /**
     * Código do município do domicílio fiscal da pessoa jurídica, conforme a tabela IBGE
     */
    @Field(at = 11)
    private String codMun;

    /**
     * Inscrição da pessoa jurídica na Suframa
     */
    @Field(at = 12)
    private String suframa;

    /**
     * Indicador da natureza da pessoa jurídica
     * <p>00=Pessoa jurídica em geral não participante de SCP como sócia ostensiva;01=Sociedade cooperativa não participante de SCP como sócia ostensiva;02=Entidade sujeita ao PIS/Pasep exclusivamente com base na Folha de Salários;03=Pessoa jurídica em geral participante de SCP como sócia ostensiva;04=Sociedade cooperativa participante de SCP como sócia ostensiva;05=Sociedade em Conta de Participação - SCP</p>
     */
    @Field(at = 13)
    private String indNatPj;

    /**
     * Indicador de tipo de atividade preponderante
     * <p>0=Industrial ou equiparado a industrial;1=Prestador de serviços;2=Atividade de comércio;3=Pessoas jurídicas referidas nos §§ 6º, 8º e 9º do art. 3º da Lei nº 9.718, de 1998;4=Atividade imobiliária;9=Outros</p>
     */
    @Field(at = 14)
    private String indAtiv;


}