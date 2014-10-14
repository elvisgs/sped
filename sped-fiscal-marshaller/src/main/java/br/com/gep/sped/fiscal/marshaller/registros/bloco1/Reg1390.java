package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Controle de Produção de Usina
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "1390"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class Reg1390 extends Registro {
    
    @Field(at = 2)
    private String codProd;
    
    /**
     * Obtém Código do produto: 01 – Álcool Etílico Hidratado Carburante; 02 - Álcool Etílico Anidro Carburante; 03 – Açúcar
     */
    public String getCodProd() {
        return codProd;
    }

    /**
     * Seta Código do produto: 01 – Álcool Etílico Hidratado Carburante; 02 - Álcool Etílico Anidro Carburante; 03 – Açúcar
     * <p>01=Álcool Etílico Hidratado Carburante;02=Álcool Etílico Anidro Carburante;03=Açúcar</p>
     */
    public void setCodProd(String codProd) {
        this.codProd = codProd;
    }
    
}