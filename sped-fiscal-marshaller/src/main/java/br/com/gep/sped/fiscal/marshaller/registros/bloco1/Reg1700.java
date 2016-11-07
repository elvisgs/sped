package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * DOCUMENTOS FISCAIS UTILIZADOS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1700"),
    @Field(at = 9, name = "fimLinha")
})
public class Reg1700 extends Registro {
    
    @Field(at = 2)
    private String codDisp;
    
    @Field(at = 3)
    private String codMod;
    
    @Field(at = 4)
    private String ser;
    
    @Field(at = 5)
    private String sub;
    
    @Field(at = 6)
    private String numDocIni;
    
    @Field(at = 7)
    private String numDocFin;
    
    @Field(at = 8)
    private String numAut;
    
    /**
     * Obtém Código dispositivo autorizado
     */
    public String getCodDisp() {
        return codDisp;
    }

    /**
     * Seta Código dispositivo autorizado
     * <p>00=Formulário de Segurança - impressor autônomo;01=FS-DA – Formulário de Segurança para Impressão de DANFE;02=Formulário de segurança - NF-e;03=Formulário Contínuo;04=Blocos;05=Jogos Soltos</p>
     */
    public void setCodDisp(String codDisp) {
        this.codDisp = codDisp;
    }
    
    /**
     * Obtém Código do modelo do documento fiscal
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo do documento fiscal
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Série
     */
    public String getSer() {
        return ser;
    }

    /**
     * Seta Série
     */
    public void setSer(String ser) {
        this.ser = ser;
    }
    
    /**
     * Obtém Subsérie
     */
    public String getSub() {
        return sub;
    }

    /**
     * Seta Subsérie
     */
    public void setSub(String sub) {
        this.sub = sub;
    }
    
    /**
     * Obtém Documento fiscal inicial
     */
    public String getNumDocIni() {
        return numDocIni;
    }

    /**
     * Seta Documento fiscal inicial
     */
    public void setNumDocIni(String numDocIni) {
        this.numDocIni = numDocIni;
    }
    
    /**
     * Obtém Documento fiscal final
     */
    public String getNumDocFin() {
        return numDocFin;
    }

    /**
     * Seta Documento fiscal final
     */
    public void setNumDocFin(String numDocFin) {
        this.numDocFin = numDocFin;
    }
    
    /**
     * Obtém Número da autorização
     */
    public String getNumAut() {
        return numAut;
    }

    /**
     * Seta Número da autorização
     */
    public void setNumAut(String numAut) {
        this.numAut = numAut;
    }
    
}