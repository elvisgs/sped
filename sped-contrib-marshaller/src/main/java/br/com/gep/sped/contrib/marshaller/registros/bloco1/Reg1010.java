package br.com.gep.sped.contrib.marshaller.registros.bloco1;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 1010 - Processo Referenciado - Ação Judicial
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "1010"),
    @Field(at = 8, name = "fimLinha", literal = "")
})
public class Reg1010 extends Registro {
    
    @Field(at = 2)
    private String numProc;
    
    @Field(at = 3)
    private String idSecJud;
    
    @Field(at = 4)
    private String idVara;
    
    @Field(at = 5)
    private String indNatAcao;
    
    @Field(at = 6)
    private String descDecJud;
    
    @Field(at = 7)
    private Date dtSentJud;
    
    
    /**
     * Obtém Identificação do Numero do Processo Judicial
     */
    public String getNumProc() {
        return numProc;
    }

    /**
     * Seta Identificação do Numero do Processo Judicial
     */
    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }
    
    /**
     * Obtém Identificação da Seção Judiciária
     */
    public String getIdSecJud() {
        return idSecJud;
    }

    /**
     * Seta Identificação da Seção Judiciária
     */
    public void setIdSecJud(String idSecJud) {
        this.idSecJud = idSecJud;
    }
    
    /**
     * Obtém Identificação da Vara
     */
    public String getIdVara() {
        return idVara;
    }

    /**
     * Seta Identificação da Vara
     */
    public void setIdVara(String idVara) {
        this.idVara = idVara;
    }
    
    /**
     * Obtém Indicador da Natureza da Ação Judicial, impetrada na Justiça Federal:01 - Decisão Judicial Transitada em Julgado, a favor da Pessoa Jurídica.02 - Decisão Judicial Não Transitada em Julgado, a favor da Pessoa Jurídica.03 - Decisão Judicial oriunda de Liminar em Mandado de Segurança.04 - Decisão Judicial oriunda de Liminar em Medida Cautelar.05 - Decisão Judicial oriunda de Antecipação de Tutela. 06 - Decisão Judicial Vinculada a Depósito Administrativo ou Judicial em Montante Integral.07 - Medida Judicial em que a Pessoa Jurídica não é o autor.08 - Sumula Vinculante aprovada pelo STF99 - Outros.
     */
    public String getIndNatAcao() {
        return indNatAcao;
    }

    /**
     * Seta Indicador da Natureza da Ação Judicial, impetrada na Justiça Federal:01 - Decisão Judicial Transitada em Julgado, a favor da Pessoa Jurídica.02 - Decisão Judicial Não Transitada em Julgado, a favor da Pessoa Jurídica.03 - Decisão Judicial oriunda de Liminar em Mandado de Segurança.04 - Decisão Judicial oriunda de Liminar em Medida Cautelar.05 - Decisão Judicial oriunda de Antecipação de Tutela. 06 - Decisão Judicial Vinculada a Depósito Administrativo ou Judicial em Montante Integral.07 - Medida Judicial em que a Pessoa Jurídica não é o autor.08 - Sumula Vinculante aprovada pelo STF99 - Outros.
     */
    public void setIndNatAcao(String indNatAcao) {
        this.indNatAcao = indNatAcao;
    }
    
    /**
     * Obtém Descrição Resumida dos Efeitos Tributários abrangidos pela Decisão Judicial proferida.
     */
    public String getDescDecJud() {
        return descDecJud;
    }

    /**
     * Seta Descrição Resumida dos Efeitos Tributários abrangidos pela Decisão Judicial proferida.
     */
    public void setDescDecJud(String descDecJud) {
        this.descDecJud = descDecJud;
    }
    
    /**
     * Obtém Data da Sentença/Decisão Judicial
     */
    public Date getDtSentJud() {
        return dtSentJud;
    }

    /**
     * Seta Data da Sentença/Decisão Judicial
     */
    public void setDtSentJud(Date dtSentJud) {
        this.dtSentJud = dtSentJud;
    }
    
    
}