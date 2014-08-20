package br.com.gep.sped.contrib.batch.factory;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.springframework.batch.item.ItemStreamReader;

/**
 * Strategy interface a ser implementada por qualquer classe cujo objetivo
 * seja criar {@link ItemStreamReader}'s para os
 * registros do SPED, sobrescrevendo o {@link DefaultItemReaderFactory}.
 */
public interface ItemReaderFactory {

    /**
     * Cria um {@link ItemStreamReader} para um registro que possui registro pai.
     * @param regClass Classe do registro
     * @param parentRegClass Classe do registro pai
     * @return {@link ItemStreamReader} do registro
     * @throws Exception
     */
    <R extends Registro, P extends Registro> ItemStreamReader<R> create(Class<R> regClass, Class<P> parentRegClass);

    /**
     * Cria um {@link ItemStreamReader} para um registro.
     * @param regClass Classe do registro
     * @return {@link ItemStreamReader} do registro
     * @throws Exception
     */
    <R extends Registro> ItemStreamReader<R> create(Class<R> regClass);
}
