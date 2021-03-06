package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Controle de Produção de Usina
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1390"),
    @Field(at = 3, name = "fimLinha")
})
@Getter
@Setter
public class Reg1390 extends Registro {

    /**
     * Código do produto: 01 – Álcool Etílico Hidratado Carburante; 02 - Álcool Etílico Anidro Carburante; 03 – Açúcar
     * <p>01=Álcool Etílico Hidratado Carburante;02=Álcool Etílico Anidro Carburante;03=Açúcar</p>
     */
    @Field(at = 2)
    private String codProd;


}
