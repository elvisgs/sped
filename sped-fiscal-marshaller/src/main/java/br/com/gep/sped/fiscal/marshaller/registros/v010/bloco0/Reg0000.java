package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Identificação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0000"),
    @Field(at = 16, name = "fimLinha")
})
@Getter
@Setter
public class Reg0000 extends Registro {

    /**
     * Código da versão do leiaute
     */
    @Field(at = 2)
    private String codVer;

    /**
     * Código da finalidade
     * <p>0=Remessa do arquivo original;1=Remessa do arquivo substituto</p>
     */
    @Field(at = 3)
    private String codFin;

    /**
     * Data inicial
     */
    @Field(at = 4)
    private Date dtIni;

    /**
     * Data final
     */
    @Field(at = 5)
    private Date dtFin;

    /**
     * Nome empresarial
     */
    @Field(at = 6)
    private String nome;

    /**
     * CNPJ
     */
    @Field(at = 7)
    private String cnpj;

    /**
     * CPF
     */
    @Field(at = 8)
    private String cpf;

    /**
     * UF
     */
    @Field(at = 9)
    private String uf;

    /**
     * Inscrição Estadual
     */
    @Field(at = 10)
    private String ie;

    /**
     * Código do município
     */
    @Field(at = 11)
    private String codMun;

    /**
     * Inscrição Municipal
     */
    @Field(at = 12)
    private String im;

    /**
     * Inscrição na SUFRAMA
     */
    @Field(at = 13)
    private String suframa;

    /**
     * Perfil do arquivo fiscal
     * <p>A=Perfil A;B=Perfil B;C=Perfil C</p>
     */
    @Field(at = 14)
    private String indPerfil;

    /**
     * Tipo de atividade
     * <p>0=Industrial ou equiparado a industrial;1=Outras</p>
     */
    @Field(at = 15)
    private String indAtiv;


}
