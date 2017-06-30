package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Terminal Faturado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D530"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class RegD530 extends Registro {

    /**
     * Tipo de serviço prestado
     * <p>0=Telefonia;1=Comunicação de dados;2=TV por assinatura;3=Provimento de acesso à Internet;4=Multimídia;9=Outros</p>
     */
    @Field(at = 2)
    private String indServ;

    /**
     * Data de inicio da prestação
     */
    @Field(at = 3)
    private Date dtIniServ;

    /**
     * Data final da prestação
     */
    @Field(at = 4)
    private Date dtFinServ;

    /**
     * Período fiscal da prestação (MMAAAA)
     */
    @Field(at = 5)
    private String perFiscal;

    /**
     * Código de área do terminal
     */
    @Field(at = 6)
    private String codArea;

    /**
     * Identificação do terminal
     */
    @Field(at = 7)
    private Integer terminal;


}
