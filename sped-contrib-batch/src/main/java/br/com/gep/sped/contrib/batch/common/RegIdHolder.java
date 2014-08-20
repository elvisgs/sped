package br.com.gep.sped.contrib.batch.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Armazena o último id de cada registro lido
 */
@Component
public class RegIdHolder {

    private Map<Class<?>, Integer> ids = new HashMap<Class<?>, Integer>();

    /**
     * Obtém último id do registro representado pela classe
     * @param regClass Classe que representa o registro
     * @return Id do registro
     */
    public Integer getId(Class<?> regClass) {
        if (ids.containsKey(regClass))
            return ids.get(regClass);

        return 0;
    }

    /**
     * Seta id do registro representado pela classe
     * @param regClass Classe que representa o registro
     * @param id Id a ser armazenado
     */
    public void setId(Class<?> regClass, Integer id) {
        ids.put(regClass, id);
    }
}
