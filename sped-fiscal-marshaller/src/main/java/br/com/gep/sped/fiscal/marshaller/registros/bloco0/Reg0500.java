package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Plano de Contas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0500"),
    @Field(at = 8, name = "fimLinha")
})
public class Reg0500 extends Registro {
    
    @Field(at = 2)
    private Date dtAlt;
    
    @Field(at = 3)
    private String codNatCc;
    
    @Field(at = 4)
    private String indCta;
    
    @Field(at = 5)
    private String nivel;
    
    @Field(at = 6)
    private String codCta;
    
    @Field(at = 7)
    private String nomeCta;
    
    /**
     * Obtém Data da inclusão/alteração
     */
    public Date getDtAlt() {
        return dtAlt;
    }

    /**
     * Seta Data da inclusão/alteração
     */
    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }
    
    /**
     * Obtém Código da natureza da conta
     */
    public String getCodNatCc() {
        return codNatCc;
    }

    /**
     * Seta Código da natureza da conta
     * <p>01=Contas de ativo;02=Contas de passivo;03=Patrimônio líquido;04=Contas de resultado;05=Contas de compensação;09=Outras</p>
     */
    public void setCodNatCc(String codNatCc) {
        this.codNatCc = codNatCc;
    }
    
    /**
     * Obtém Indicador do tipo de conta
     */
    public String getIndCta() {
        return indCta;
    }

    /**
     * Seta Indicador do tipo de conta
     * <p>S=Sintética (grupo de contas);A=Analítica (conta)</p>
     */
    public void setIndCta(String indCta) {
        this.indCta = indCta;
    }
    
    /**
     * Obtém Nível da conta
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * Seta Nível da conta
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    /**
     * Obtém Código da conta
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Código da conta
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
    /**
     * Obtém Nome da conta
     */
    public String getNomeCta() {
        return nomeCta;
    }

    /**
     * Seta Nome da conta
     */
    public void setNomeCta(String nomeCta) {
        this.nomeCta = nomeCta;
    }
    
}