package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.marshaller.common.Registro;
import org.springframework.batch.item.ItemStreamWriter;

/**
 * Strategy interface a ser implementada por qualquer classe cujo objetivo
 * seja criar {@link org.springframework.batch.item.ItemStreamWriter}'s para os
 * registros do SPED.
 */
public interface ItemWriterFactory {

    /**
     * Cria um {@link org.springframework.batch.item.ItemStreamWriter} para um registro que possui registro pai.
     * @param regClass Classe do registro
     * @param parentRegClass Classe do registro pai
     * @return {@link org.springframework.batch.item.ItemStreamWriter} do registro
     * @throws Exception
     */
    <R extends Registro, P extends Registro> ItemStreamWriter<R> create(Class<R> regClass, Class<P> parentRegClass);

    /**
     * Cria um {@link ItemStreamWriter} para um registro.
     * @param regClass Classe do registro
     * @return {@link ItemStreamWriter} do registro
     * @throws Exception
     */
    <R extends Registro> ItemStreamWriter<R> create(Class<R> regClass);
}
