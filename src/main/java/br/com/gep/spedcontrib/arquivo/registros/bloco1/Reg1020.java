package br.com.gep.spedcontrib.arquivo.registros.bloco1;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 1020 - Processo Referenciado - Processo  Administrativo
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "1020")
})
public class Reg1020 {
    
    @Field(at = 1)
    private String numProc;
    
    @Field(at = 2)
    private String indNatAcao;
    
    @Field(at = 3)
    private Date dtDecAdm;
    
    
    /**
     * Obtém Identificação do Processo Administrativo ou da Decisão Administrativa
     */
    public String getNumProc() {
        return numProc;
    }

    /**
     * Seta Identificação do Processo Administrativo ou da Decisão Administrativa
     */
    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }
    
    /**
     * Obtém Indicador da Natureza da Ação, decorrente de Processo Administrativo na Secretaria da Receita Federal do Brasil:01 -  Processo Administrativo de Consulta;02 - Despacho Decisório;03 - Ato Declaratório Executivo;04 - Ato Declaratório Interpretativo;05 - Decisão Administrativa de DRJ ou do CARF;06 - Auto de Infração;99 - Outros
     */
    public String getIndNatAcao() {
        return indNatAcao;
    }

    /**
     * Seta Indicador da Natureza da Ação, decorrente de Processo Administrativo na Secretaria da Receita Federal do Brasil:01 -  Processo Administrativo de Consulta;02 - Despacho Decisório;03 - Ato Declaratório Executivo;04 - Ato Declaratório Interpretativo;05 - Decisão Administrativa de DRJ ou do CARF;06 - Auto de Infração;99 - Outros
     */
    public void setIndNatAcao(String indNatAcao) {
        this.indNatAcao = indNatAcao;
    }
    
    /**
     * Obtém Data do Despacho/Decisão Administrativa
     */
    public Date getDtDecAdm() {
        return dtDecAdm;
    }

    /**
     * Seta Data do Despacho/Decisão Administrativa
     */
    public void setDtDecAdm(Date dtDecAdm) {
        this.dtDecAdm = dtDecAdm;
    }
    
    
}